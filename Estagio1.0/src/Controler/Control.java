package Controler;


import DAO.Conexao;
import DTO.Paciente;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author samue
 */
public class Control {
    
    Connection conn;
    PreparedStatement smt;
    
//----------------------------------------- CADASTRO ESPECIALIDADE -----------------------------------------
    public void CadEspecialidade(Paciente paci) 
        throws ClassNotFoundException, SQLException{
        
        conn = Conexao.getInstance().getConnection();
        
        String sql ="insert into Especialidades(IDEspecialidade,nomeEspecialidade) values (?,?);";
        
        try{
            smt=conn.prepareCall(sql);
            
            smt.setInt(1, paci.getIdEspecialidade());
            smt.setString(2, paci.getNomeEspecialidade());
            
            smt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Inserido!");
            
        } catch(HeadlessException | SQLException e){
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
    
    }
    
//-----------------------------------------CADASTRO PLANO DE SAUDE -----------------------------------------
    
    public void CadPlano(Paciente paci) throws ClassNotFoundException, SQLException{
        
        conn = Conexao.getInstance().getConnection();
        
        String sql = "insert into PlanosDeSaude(IDPlanosDeSaude,nomePlanosDeSaude) values (?,?);";
        
        try{
            smt = conn.prepareCall(sql);
            
            smt.setInt(1,paci.getIdPlano());
            smt.setString(2,paci.getNomePlano());
            
            smt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Inserido!");
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
    }
    
//-----------------------------------------CADASTRO  FICHA DO PACIENTE-----------------------------------------
    
    public void CadPaciente(Paciente paci) throws ClassNotFoundException, SQLException{
        
        conn = Conexao.getInstance().getConnection();
        
        String sql= "insert into FichaPaciente(nome,nmrCarteiraPlano,f_IDEspecialidade,f_IDPlanosDeSaude) values (?,?,?,?);";
        
        try{
            smt=conn.prepareCall(sql);
            
            smt.setString(1,paci.getNomePaciente());
            smt.setInt(2, paci.getNmrCarteira());
            smt.setInt(3, paci.getIdEspecialidade());
            smt.setInt(4, paci.getIdPlano());
            
            smt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Inserido!");
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
        
    }
 //-----------------------------------------Pesquisa  FICHA DO PACIENTE-----------------------------------------  
    
    public ArrayList<Paciente> Pesquisa() throws ClassNotFoundException, SQLException{
        ArrayList<Paciente> lista = new ArrayList<>();
        
        conn = Conexao.getInstance().getConnection();
        
        String sql = "select *from FichaPaciente";
         
        ResultSet rs;
         
        try{
            
            smt=conn.prepareStatement(sql);
            rs= smt.executeQuery();
            //Percorre todo o comando
            while(rs.next()){

                Paciente paci = new Paciente();
                paci.setIdPaciente(rs.getInt("IDPaciente"));
                paci.setNomePaciente(rs.getString("nome"));
                paci.setNmrCarteira(rs.getInt("nmrCarteiraPlano"));
                paci.setIdEspecialidade(rs.getInt("f_IDEspecialidade"));
                paci.setIdPlano(rs.getInt("f_IDPlanosDeSaude"));

                lista.add(paci);
            
        }
            
        }catch(HeadlessException | SQLException e){
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
        
        return lista;
    }
 //-----------------------------------------Excluir  FICHA DO PACIENTE-----------------------------------------   
    
    public void ExcluiFicha(int idPaciente)throws ClassNotFoundException, SQLException{
        
        conn = Conexao.getInstance().getConnection();
        
        String sql = "delete from FichaPaciente where IDPaciente = ?";
        
        try{
            smt=conn.prepareCall(sql);
            
            smt.setInt(1,idPaciente);
            
            smt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Excluido!");
            
        }catch(HeadlessException | SQLException e){
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
    }
    
    //-----------------------------------------Pesquisa  ESPECIALIDADE-----------------------------------------  
    
    public ResultSet ListarEspecialidade() throws ClassNotFoundException, SQLException{
        
        ResultSet rs;
        conn = Conexao.getInstance().getConnection();
        
        String sql = "select *from Especialidades order by nomeEspecialidade";
        
        try{
            smt=conn.prepareCall(sql);
            
            rs = smt.executeQuery();
            return rs;
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
            return null;
        }
    }
    
    //-----------------------------------------Pesquisa  PLANO DE SAUDE-----------------------------------------  
    
    public ResultSet ListarPlano() throws ClassNotFoundException, SQLException{
            
        ResultSet rs;
        conn = Conexao.getInstance().getConnection();
        
        String sql = "select *from PlanosDeSaude order by nomePlanosDeSaude";
        
        try{
            smt=conn.prepareCall(sql);
            
            rs = smt.executeQuery();
            return rs;
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
            return null;
        }
             
    }
    //-----------------------------------------Atualiza FICHA PACIENTE-----------------------------------------
    public void Atualiza(Paciente paci) throws ClassNotFoundException, SQLException{
        
        conn = Conexao.getInstance().getConnection();
        
        String sql= "update FichaPaciente set nome = ?, nmrCarteiraPlano = ? where IDPaciente = ?;";
        
        try{
            smt=conn.prepareCall(sql);
            
            smt.setString(1,paci.getNomePaciente());
            smt.setInt(2, paci.getNmrCarteira());
            smt.setInt(3, paci.getIdPaciente());
            
            smt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"ATUALIZADO!");
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "Acesso foi negado!"+e.getMessage());
        }
        
    } 
}

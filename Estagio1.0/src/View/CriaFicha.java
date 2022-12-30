package View;

import Controler.Control;
import DTO.Paciente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class CriaFicha extends javax.swing.JFrame {
    
    
    
    public CriaFicha() {
        
        initComponents();
        addComboBoxEspecialidade();
        addComboBoxPlanoDeSaude();
    }
    
    Vector<Integer> idEspecialidade = new Vector<>();
    Vector<Integer> idPlano = new Vector<Integer>();
    
//----------------------------------------- Faz a adição do valores salvos de especialidades para comboBox----------------------------------------- 
    private void addComboBoxEspecialidade(){
        
        ResultSet rs;
        
        try{
            
            Control cont = new Control();
            rs = cont.ListarEspecialidade();
            
            while(rs.next()){
                
                idEspecialidade.addElement(rs.getInt(1));
                CBXEspecialidade.addItem(rs.getString(2));
            }
        } catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(CriaFicha.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
//----------------------------------------- Faz a adição do valores salvos de plano de saude para comboBox----------------------------------------- 
    private void addComboBoxPlanoDeSaude(){
        
        ResultSet rs;
        
        try{
            
            Control cont = new Control();
            rs = cont.ListarPlano();
            
            while(rs.next()){
                
                idPlano.addElement(rs.getInt(1));
                CBXPlanoDeSaude.addItem(rs.getString(2));
            }
        } catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(CriaFicha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LTitulo = new javax.swing.JLabel();
        LNomePaciente = new javax.swing.JLabel();
        TFNomePaciente = new javax.swing.JTextField();
        LNumeroCarteira = new javax.swing.JLabel();
        TFNmrCarteira = new javax.swing.JTextField();
        BCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CBXEspecialidade = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CBXPlanoDeSaude = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LTitulo.setText("CADASTRO FICHA DO PACIENTE");

        LNomePaciente.setText("Nome:");

        LNumeroCarteira.setText("Numero da Carteira:");

        BCadastrar.setText("Cadastrar");
        BCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Especialidade:");

        CBXEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXEspecialidadeActionPerformed(evt);
            }
        });

        jLabel2.setText("Plano de Saude:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNumeroCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CBXPlanoDeSaude, javax.swing.GroupLayout.Alignment.LEADING, 0, 164, Short.MAX_VALUE)
                        .addComponent(CBXEspecialidade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BCadastrar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TFNmrCarteira, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFNomePaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(LTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LNomePaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LNumeroCarteira)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFNmrCarteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBXEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBXPlanoDeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BCadastrar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//----------------------------------------- Encapsula os dados do Paciente e Chama a função para add no banco ----------------------------------------- 
    @SuppressWarnings("unchecked")
    private void BCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastrarActionPerformed
        
        int idEsp, idPl;
        
        //Pega o valor salvo do ID do botao selecionado do combobox e passa para uma variavel para passar para ficha
        idEsp = idEspecialidade.get(CBXEspecialidade.getSelectedIndex());
        idPl = idPlano.get(CBXPlanoDeSaude.getSelectedIndex());
        
        Paciente paci = new Paciente();
        Control con = new Control();
        TelaInicial tl = new TelaInicial();
        
        
        try {
            
            
            boolean conf = confere();
            
            

            if(conf == false){

                JOptionPane.showMessageDialog(null, "Esta especialidade" +(CBXEspecialidade.getSelectedIndex()+1)
                            +"já foi utiliza para o plano "+(CBXPlanoDeSaude.getSelectedIndex()+1)+"\nTente se Registrar novamente!!");
                
                TFNomePaciente.setText("");
                TFNmrCarteira.setText("");
            }
            else if(conf ==  true){

                paci.setNomePaciente(TFNomePaciente.getText());
                paci.setNmrCarteira(Integer.parseInt(TFNmrCarteira.getText()));
                paci.setIdEspecialidade(idEsp);
                paci.setIdPlano(idPl);

                con.CadPaciente(paci);
                
                tl.setVisible(true);
                setVisible(false);
            }  
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CriaFicha.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_BCadastrarActionPerformed

    private void CBXEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBXEspecialidadeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CriaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new CriaFicha().setVisible(true);
            }
        });
        
     
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCadastrar;
    private javax.swing.JComboBox<String> CBXEspecialidade;
    private javax.swing.JComboBox<String> CBXPlanoDeSaude;
    private javax.swing.JLabel LNomePaciente;
    private javax.swing.JLabel LNumeroCarteira;
    private javax.swing.JLabel LTitulo;
    private javax.swing.JTextField TFNmrCarteira;
    private javax.swing.JTextField TFNomePaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    
    
//----------------------------------------- Confere se e valido ou nao a entrada dos valores para criação da ficha----------------------------------------- 
    public boolean confere() throws ClassNotFoundException, SQLException{
        
        int idEsp, idPl;
        
        Control con = new Control();
        
        idEsp = idEspecialidade.get(CBXEspecialidade.getSelectedIndex());
        idPl = idPlano.get(CBXPlanoDeSaude.getSelectedIndex());
        
        ArrayList<Paciente> lista = con.Pesquisa();
        
        for(int i=0;i < lista.size();i++){
               
            if(((lista.get(i).getIdEspecialidade() == idEsp) && (lista.get(i).getIdPlano() == idPl)) &&
                    (Integer.parseInt(TFNmrCarteira.getText()) == lista.get(i).getNmrCarteira())){


                return false;
            }
        
        }
        return true;
    }
}



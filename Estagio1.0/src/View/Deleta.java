package View;

import Controler.Control;
import DTO.Paciente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samue
 */
public class Deleta extends javax.swing.JFrame {

    public Deleta() {
        
        initComponents();
        AddTabela();
        
    }

//----------------------------------------- Faz a adição dos valores salvos na lista e mostra na tabela----------------------------------------- 
    private void AddTabela(){
        
        try{
            Control cont = new Control();
        
            DefaultTableModel model = (DefaultTableModel) TPacientes.getModel();
            model.setNumRows(0);

            ArrayList<Paciente> lista = cont.Pesquisa();
        
        for(int i=0; i <lista.size(); i++){
            
            model.addRow(new Object[]{
                
                lista.get(i).getIdPaciente(),
                lista.get(i).getNomePaciente(),
                lista.get(i).getNmrCarteira(),
                lista.get(i).getIdEspecialidade(),
                lista.get(i).getIdPlano()
            });
            
        }
            
        }catch(ClassNotFoundException | SQLException exe){
            JOptionPane.showMessageDialog(null,exe.getMessage());
        }
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TPacientes = new javax.swing.JTable();
        BAltera = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BExcluir.setText("Excluir");
        BExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirActionPerformed(evt);
            }
        });

        TPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,null, null, null, null},
                {null,null, null, null, null},
                {null,null, null, null, null},
                {null,null, null, null, null}
            },
            new String [] {
                "ID","Nome", "Numero Carteira", "ID Especialidade", "ID Plano de Saude"
            }
        ));
        jScrollPane2.setViewportView(TPacientes);

        BAltera.setText("Altera");
        BAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAlteraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("TABELA PACIENTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BAltera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BExcluir))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BExcluir)
                    .addComponent(BAltera))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
//----------------------------------------- Faz a remoção do item selecionado ----------------------------------------- 
    private void BExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirActionPerformed
       
        Control con = new Control();
        TelaInicial tl = new TelaInicial();
        
        int setar = TPacientes.getSelectedRow();
        String id;
        
        id = TPacientes.getModel().getValueAt(setar, 0).toString();
        
        try {
            con.ExcluiFicha(Integer.parseInt(id));
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        tl.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_BExcluirActionPerformed

    
//----------------------------------------- Faz a seleção de 1 item e o envia para tela de edição----------------------------------------- 
    private void BAlteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAlteraActionPerformed
        
        Altera alt = new Altera();
        
        String nome;
        String nmr;
        String id;
        
        int setar = TPacientes.getSelectedRow();
        
        id = TPacientes.getModel().getValueAt(setar, 0).toString();
        nome = TPacientes.getModel().getValueAt(setar, 1).toString();
        nmr = TPacientes.getModel().getValueAt(setar, 2).toString();
        
        alt.setaValores(nome, nmr, id);
        
        alt.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_BAlteraActionPerformed

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
            java.util.logging.Logger.getLogger(Deleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAltera;
    private javax.swing.JButton BExcluir;
    private javax.swing.JTable TPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

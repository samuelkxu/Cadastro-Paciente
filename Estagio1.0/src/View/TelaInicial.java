package View;

/**
 *
 * @author samue
 */
public class TelaInicial extends javax.swing.JFrame {

    //Inicializa a tela
    public TelaInicial() {
        initComponents();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LTitulo = new javax.swing.JLabel();
        BAddEspecialidade = new javax.swing.JButton();
        BAddPlano = new javax.swing.JButton();
        AddFicha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BAltePacientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LTitulo.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        LTitulo.setText("BEM VINDO");

        BAddEspecialidade.setText("Adicionar Especialidade");
        BAddEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAddEspecialidadeActionPerformed(evt);
            }
        });

        BAddPlano.setText("Adicionar Plano de Saude");
        BAddPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAddPlanoActionPerformed(evt);
            }
        });

        AddFicha.setText("Adicionar Ficha do Paciente");
        AddFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFichaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("AREA PARA CRIAÇÃO DO PACIENTE");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("AREA PARA ADICIONAR COMPLEMENTOS DA FICHA");

        BAltePacientes.setText("Alterações do Paciente");
        BAltePacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAltePacientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BAddEspecialidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BAddPlano, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LTitulo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BAltePacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddFicha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BAltePacientes)
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(BAddEspecialidade)
                .addGap(18, 18, 18)
                .addComponent(BAddPlano)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
//----------------------------------------- Chama a criação de ficha do paciente ----------------------------------------- 
    private void AddFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFichaActionPerformed
        CriaFicha fc = new CriaFicha();
        
        fc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_AddFichaActionPerformed

//----------------------------------------- Chama a criação de especialidade ----------------------------------------- 
    private void BAddEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAddEspecialidadeActionPerformed
        CriaEspecialidade esp = new CriaEspecialidade();
        
        esp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BAddEspecialidadeActionPerformed

    
//----------------------------------------- Chama a criação do plano de saude ----------------------------------------- 
    private void BAddPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAddPlanoActionPerformed
        CriaPlano plan = new CriaPlano();
        
        plan.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BAddPlanoActionPerformed

//----------------------------------------- Chama a aba de alteração da ficha do paciente ----------------------------------------- 
    private void BAltePacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAltePacientesActionPerformed
        
        Deleta del = new Deleta();
        
        del.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_BAltePacientesActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddFicha;
    private javax.swing.JButton BAddEspecialidade;
    private javax.swing.JButton BAddPlano;
    private javax.swing.JButton BAltePacientes;
    private javax.swing.JLabel LTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

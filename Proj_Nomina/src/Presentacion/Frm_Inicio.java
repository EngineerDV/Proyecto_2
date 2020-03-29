/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Frm_Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Frm_Inicio
     */
    public Frm_Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanMenu = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        LblOpcion = new javax.swing.JLabel();
        CmbOpciones = new javax.swing.JComboBox<>();
        BtnAceptar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Nóminas");
        setResizable(false);

        PanMenu.setBackground(new java.awt.Color(0, 30, 60));

        LblTitulo.setFont(new java.awt.Font("Sakkal Majalla", 0, 36)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LblTitulo.setText("Sistema de Nóminas");

        LblOpcion.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        LblOpcion.setForeground(new java.awt.Color(255, 255, 255));
        LblOpcion.setText("Opción:");

        CmbOpciones.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        CmbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mantenimiento Departamento", "Mantenimiento Unidad", "Mantenimiento Empleados", "Mantenimiento Puesto", "Cálculo de Nóminas", "Imprimir Nóminas" }));

        BtnAceptar.setBackground(new java.awt.Color(0, 60, 90));
        BtnAceptar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        BtnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        BtnAceptar.setText("Aceptar");
        BtnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(153, 0, 0));
        BtnSalir.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        BtnSalir.setText("Salir");
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanMenuLayout = new javax.swing.GroupLayout(PanMenu);
        PanMenu.setLayout(PanMenuLayout);
        PanMenuLayout.setHorizontalGroup(
            PanMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanMenuLayout.createSequentialGroup()
                .addGroup(PanMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblTitulo)
                        .addGap(94, 139, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(PanMenuLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(PanMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanMenuLayout.createSequentialGroup()
                        .addComponent(LblOpcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CmbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnAceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanMenuLayout.setVerticalGroup(
            PanMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTitulo)
                .addGap(58, 58, 58)
                .addGroup(PanMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblOpcion)
                    .addComponent(CmbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
       int opcion=0;
       opcion = CmbOpciones.getSelectedIndex()+1;
       switch(opcion)
       {
           case 1:
               Frm_MantDep FMD = new Frm_MantDep();
               FMD.setVisible(true);
               break;
           case 2:
               Frm_MantUnid FMU = new Frm_MantUnid();
               FMU.setVisible(true);
               break;
           case 3:
               Frm_MantEmp FME = new Frm_MantEmp();
               FME.setVisible(true);
               break;
           case 4:
               Frm_MantPuesto FMP = new Frm_MantPuesto();
               FMP.setVisible(true);
               break;
           case 5:
               Frm_CalculoNomina FMCN = new Frm_CalculoNomina();
               FMCN.setVisible(true);
               break;
           case 6:
               break;
       }
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> CmbOpciones;
    private javax.swing.JLabel LblOpcion;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JPanel PanMenu;
    // End of variables declaration//GEN-END:variables
}
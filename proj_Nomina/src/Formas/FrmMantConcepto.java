/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author MOISES
 * 
 */

/*MANTENIMIENTO DE CONCEPTOS DE NOMINA
    POR: MOISÉS FELIPE
    FECHA: 6 DE ABRIL DE 2020*/
public class FrmMantConcepto extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmMantConcepto
     */
    public FrmMantConcepto() {
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

        panelMantPuesto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodCon = new javax.swing.JTextField();
        txtNomCon = new javax.swing.JTextField();
        txtEstadoCon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnGenCod = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnCambio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtBuscaxCod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBuscaxNom = new javax.swing.JTextField();
        btnBuscaxCod = new javax.swing.JButton();
        btnBuscaxNom = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setTitle("Mantenimiento Conceptos");

        panelMantPuesto.setBackground(new java.awt.Color(51, 51, 51));
        panelMantPuesto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código Concepto:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Concepto:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Efecto Concepto");

        txtCodCon.setEditable(false);
        txtCodCon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtNomCon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtEstadoCon.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MANTENIMIENTO CONCEPTOS");

        btnGenCod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnGenCod.setText("Generar Código");
        btnGenCod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenCodActionPerformed(evt);
            }
        });

        btnAlta.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnAlta.setText("Alta");
        btnAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnBaja.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBaja.setText("Baja");
        btnBaja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        btnCambio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCambio.setText("Cambio");
        btnCambio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar por Código:");

        txtBuscaxCod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar por Nombre:");

        txtBuscaxNom.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        btnBuscaxCod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBuscaxCod.setText("Buscar");
        btnBuscaxCod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscaxCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaxCodActionPerformed(evt);
            }
        });

        btnBuscaxNom.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBuscaxNom.setText("Buscar");
        btnBuscaxNom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscaxNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaxNomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMantPuestoLayout = new javax.swing.GroupLayout(panelMantPuesto);
        panelMantPuesto.setLayout(panelMantPuestoLayout);
        panelMantPuestoLayout.setHorizontalGroup(
            panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMantPuestoLayout.createSequentialGroup()
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMantPuestoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(panelMantPuestoLayout.createSequentialGroup()
                                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(47, 47, 47)
                                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEstadoCon, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCodCon, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(txtNomCon))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGenCod))
                            .addGroup(panelMantPuestoLayout.createSequentialGroup()
                                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(47, 47, 47)
                                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBuscaxNom)
                                    .addComponent(txtBuscaxCod, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscaxCod, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscaxNom, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelMantPuestoLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMantPuestoLayout.setVerticalGroup(
            panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMantPuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEstadoCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnBaja)
                    .addComponent(btnCambio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBuscaxCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaxCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBuscaxNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaxNom))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMantPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMantPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenCodActionPerformed
        if(txtNomCon.getText().equals("")){
            JOptionPane.showMessageDialog(null, "INGRESE UN NOMBRE");
        }else{
            ObtenerIniciales(txtNomCon.getText());
            txtCodCon.setText(iTexto.toUpperCase()+iInicial);
        }
    }//GEN-LAST:event_btnGenCodActionPerformed

    private void btnBuscaxCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaxCodActionPerformed
        try{
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            PreparedStatement pst = (PreparedStatement) cn.prepareStatement("select * from concepto where id_concepto = ?");
            pst.setString(1, txtBuscaxCod.getText().trim());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txtCodCon.setText(rs.getString("id_concepto"));
                txtNomCon.setText(rs.getString("nombre_concepto"));
                txtEstadoCon.setText(rs.getString("efecto_concepto"));
            }else{
                JOptionPane.showMessageDialog(null, "Concepto no registrado!");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnBuscaxCodActionPerformed

    private void btnBuscaxNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaxNomActionPerformed
        try{
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            PreparedStatement pst = (PreparedStatement) cn.prepareStatement("select * from concepto where nombre_concepto = ?");
            pst.setString(1, txtBuscaxNom.getText().trim());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txtCodCon.setText(rs.getString("id_concepto"));
                txtNomCon.setText(rs.getString("nombre_concepto"));
                txtEstadoCon.setText(rs.getString("efecto_concepto"));
            }else{
                JOptionPane.showMessageDialog(null, "Concepto no registrado!");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnBuscaxNomActionPerformed

    private void btnCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioActionPerformed
        try{
            String ID = txtCodCon.getText().trim();
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            PreparedStatement pst = (PreparedStatement) cn.prepareStatement("UPDATE concepto SET nombre_concepto=?, efecto_concepto=? WHERE id_concepto='"+ID+"'");
            pst.setString(1, txtNomCon.getText().trim());
            pst.setString(2, txtEstadoCon.getText().trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificación Realizada!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnCambioActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        // TODO add your handling code here:
        try {
             java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            java.sql.PreparedStatement pst = cn.prepareStatement("delete from concepto where id_concepto = ?");
            
            pst.setString(1, txtBuscaxCod.getText().trim());
            pst.executeUpdate();
            
            txtCodCon.setText("");
            txtNomCon.setText("");
            txtEstadoCon.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }    
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
      try{
            java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            java.sql.PreparedStatement pst = cn.prepareStatement("insert into concepto values(?,?,?)");
            pst.setString(1, txtCodCon.getText().trim());
            pst.setString(2, txtNomCon.getText().trim());
            pst.setString(3, txtEstadoCon.getText().trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Realizado!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnAltaActionPerformed
    String iTexto="", iInicial="";
    private void ObtenerIniciales(String texto){
        String efecto;
        efecto = txtEstadoCon.getText();
        for(int i=0; i<3; i++){
            iTexto+=texto.charAt(i);
        }
        iInicial+=efecto.charAt(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnBuscaxCod;
    private javax.swing.JButton btnBuscaxNom;
    private javax.swing.JButton btnCambio;
    private javax.swing.JButton btnGenCod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panelMantPuesto;
    private javax.swing.JTextField txtBuscaxCod;
    private javax.swing.JTextField txtBuscaxNom;
    private javax.swing.JTextField txtCodCon;
    private javax.swing.JTextField txtEstadoCon;
    private javax.swing.JTextField txtNomCon;
    // End of variables declaration//GEN-END:variables
}

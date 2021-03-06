/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasointroduccionjava;

import herencia.Basico;
import herencia.BasicoAdministrativo;
import herencia.BasicoGerente;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Salario extends javax.swing.JFrame {

    Basico basico = new Basico();
    BasicoAdministrativo basicoAdministrativo = new BasicoAdministrativo();
    BasicoGerente basicoGerente = new BasicoGerente();
    
    /**
     * Creates new form Salario
     */
    public Salario() {
        initComponents();
        mostrarCampos(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbempAdministrativo = new javax.swing.JRadioButton();
        rbempNormal = new javax.swing.JRadioButton();
        rbempGerente = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txthorasTrabajadas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtvalorHora = new javax.swing.JTextField();
        btncalcular = new javax.swing.JButton();
        lblresultado = new javax.swing.JLabel();
        btnregresar = new javax.swing.JButton();
        lbltipoEmpleado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText(">> Opción Salario Persona");

        jLabel4.setText("Tipo empleado:");

        rbempAdministrativo.setText("Empleado administrativo");
        rbempAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbempAdministrativoActionPerformed(evt);
            }
        });

        rbempNormal.setText("Empleado normal");
        rbempNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbempNormalActionPerformed(evt);
            }
        });

        rbempGerente.setText("Empleado Gerente");
        rbempGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbempGerenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbempGerente)
                    .addComponent(rbempNormal)
                    .addComponent(rbempAdministrativo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(rbempNormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbempAdministrativo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbempGerente)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel2.setText("Horas trabajadas");

        txthorasTrabajadas.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel3.setText("Valor de la hora");

        txtvalorHora.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        btncalcular.setText("Calcular");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        lblresultado.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblresultado.setText("resultado");

        btnregresar.setText("<< Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        lbltipoEmpleado.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lbltipoEmpleado.setText("TipoCargo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnregresar))
                    .addComponent(lblresultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txthorasTrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtvalorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbltipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txthorasTrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtvalorHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblresultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltipoEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregresar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(215, 215, 215))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        
        if( !rbempNormal.isSelected() && !rbempAdministrativo.isSelected() && !rbempGerente.isSelected() ){
        
            JOptionPane.showMessageDialog(null, 
                    "Debes seleccionar un tipo empleado",
                    "Mensaje de información incompleta",
                    JOptionPane.WARNING_MESSAGE);
        
        }else{
           try{
               
               
           
            if (rbempNormal.isSelected()){
            basico.setHorasTrabajadas(Double.parseDouble(txthorasTrabajadas.getText()));
            basico.setValorHora(Double.parseDouble(txtvalorHora.getText()));
            lblresultado.setText(String.valueOf(basico.calcular()));
            lbltipoEmpleado.setText(basico.realizarFuncion("servir tintos"));
            }else{
                if(rbempAdministrativo.isSelected()){
                    basicoAdministrativo.setHorasTrabajadas(Double.parseDouble(txthorasTrabajadas.getText()));
                    basicoAdministrativo.setValorHora(Double.parseDouble(txtvalorHora.getText()));
                    lblresultado.setText(String.valueOf(basicoAdministrativo.calcular()));    
                    lbltipoEmpleado.setText(basicoAdministrativo.realizarFuncion("Administrativa"));
                }else{
                    basicoGerente.setHorasTrabajadas(Double.parseDouble(txthorasTrabajadas.getText()));
                    basicoGerente.setValorHora(Double.parseDouble(txtvalorHora.getText()));
                    lblresultado.setText(String.valueOf(basicoGerente.calcular()));  
                    lbltipoEmpleado.setText(basicoGerente.realizarFuncion("Mandar"));
                }            
            }
            mostrarCampos(true);
           
           }catch(NumberFormatException exception){
               JOptionPane.showMessageDialog(null, 
                       "No puedes dejar los campos vacíos o formato incorrecto. " + exception.getMessage(),
                       "Mensaje de información incompleta",
                       JOptionPane.ERROR_MESSAGE);
               txthorasTrabajadas.requestFocus();
           
           }catch(Exception exception){
                JOptionPane.showMessageDialog(null, 
                       "Información errónea. " + exception.getMessage(),
                       "Mensaje de información incompleta",
                       JOptionPane.ERROR_MESSAGE);
               txthorasTrabajadas.setText("");
               txtvalorHora.setText("");
               txthorasTrabajadas.requestFocus();
           }  
        }  
    }//GEN-LAST:event_btncalcularActionPerformed
    
    private void rbempNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbempNormalActionPerformed
        rbempNormal.setSelected(true);
        rbempAdministrativo.setSelected(false);
        rbempGerente.setSelected(false);
    }//GEN-LAST:event_rbempNormalActionPerformed

    private void rbempAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbempAdministrativoActionPerformed
        rbempNormal.setSelected(false);
        rbempAdministrativo.setSelected(true);
        rbempGerente.setSelected(false);
    }//GEN-LAST:event_rbempAdministrativoActionPerformed

    private void rbempGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbempGerenteActionPerformed
        rbempNormal.setSelected(false);
        rbempAdministrativo.setSelected(false);
        rbempGerente.setSelected(true);
    }//GEN-LAST:event_rbempGerenteActionPerformed

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
            java.util.logging.Logger.getLogger(Salario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salario().setVisible(true);
            }
        });
    }

    private void mostrarCampos(Boolean opcion){
        this.lblresultado.setVisible(opcion);
        this.lbltipoEmpleado.setVisible(opcion);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btnregresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblresultado;
    private javax.swing.JLabel lbltipoEmpleado;
    private javax.swing.JRadioButton rbempAdministrativo;
    private javax.swing.JRadioButton rbempGerente;
    private javax.swing.JRadioButton rbempNormal;
    private javax.swing.JTextField txthorasTrabajadas;
    private javax.swing.JTextField txtvalorHora;
    // End of variables declaration//GEN-END:variables
}



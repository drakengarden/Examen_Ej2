/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolucionunidad2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labc205
 */
public class Ejercicio2 extends javax.swing.JFrame {
    
    ArrayList<Integer> myNumbers = new ArrayList<>();

    /**
     * Creates new form Ejercicio2
     */
    public Ejercicio2() {
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

        pInciso1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfNum1 = new javax.swing.JTextField();
        jbValidar = new javax.swing.JButton();
        jbImpares = new javax.swing.JButton();
        jbPares = new javax.swing.JButton();
        pInciso2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfEmpleado = new javax.swing.JTextField();
        jcbCargo = new javax.swing.JComboBox<>();
        jtfNum2 = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jbAumentar10 = new javax.swing.JButton();
        jbAumentar7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese un #:");

        jbValidar.setText("Agregar");
        jbValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbValidarActionPerformed(evt);
            }
        });

        jbImpares.setText("Mostrar # Impares");

        jbPares.setText("Mostrar # Pares");
        jbPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbParesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pInciso1Layout = new javax.swing.GroupLayout(pInciso1);
        pInciso1.setLayout(pInciso1Layout);
        pInciso1Layout.setHorizontalGroup(
            pInciso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInciso1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pInciso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pInciso1Layout.createSequentialGroup()
                        .addComponent(jbPares, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbImpares, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pInciso1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbValidar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pInciso1Layout.setVerticalGroup(
            pInciso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInciso1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pInciso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbValidar))
                .addGap(18, 18, 18)
                .addGroup(pInciso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbImpares)
                    .addComponent(jbPares))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel2.setText("Empleado:");

        jLabel3.setText("Cargo:");

        jLabel4.setText("Salario:");

        jcbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jtfNum2.setText("0.00");

        jbAgregar.setText("Agregar");

        jbAumentar10.setText("Aumentar los salarios de los Programadores en un 10%");

        jbAumentar7.setText("Aumentar en un 7% los salarios de los empleado que no sean Programador");
        jbAumentar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAumentar7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pInciso2Layout = new javax.swing.GroupLayout(pInciso2);
        pInciso2.setLayout(pInciso2Layout);
        pInciso2Layout.setHorizontalGroup(
            pInciso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInciso2Layout.createSequentialGroup()
                .addGroup(pInciso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInciso2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(pInciso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(pInciso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInciso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfEmpleado)
                                .addComponent(jcbCargo, 0, 215, Short.MAX_VALUE))
                            .addComponent(jtfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pInciso2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pInciso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbAumentar10)
                            .addComponent(jbAgregar)
                            .addComponent(jbAumentar7))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pInciso2Layout.setVerticalGroup(
            pInciso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInciso2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pInciso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pInciso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pInciso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbAumentar10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbAumentar7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pInciso2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pInciso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pInciso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pInciso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pInciso1.getAccessibleContext().setAccessibleName("Inciso 1");
        pInciso2.getAccessibleContext().setAccessibleName("Inciso 2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAumentar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAumentar7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAumentar7ActionPerformed

    private void jbValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbValidarActionPerformed
        // TODO add your handling code here:
        int num1 = Integer.parseInt(jtfNum1.getText()); 
        MyNumbers.add(num1);
    }//GEN-LAST:event_jbValidarActionPerformed

    private void jbParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbParesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbParesActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbAumentar10;
    private javax.swing.JButton jbAumentar7;
    private javax.swing.JButton jbImpares;
    private javax.swing.JButton jbPares;
    private javax.swing.JButton jbValidar;
    private javax.swing.JComboBox<String> jcbCargo;
    private javax.swing.JTextField jtfEmpleado;
    private javax.swing.JTextField jtfNum1;
    private javax.swing.JTextField jtfNum2;
    private javax.swing.JPanel pInciso1;
    private javax.swing.JPanel pInciso2;
    // End of variables declaration//GEN-END:variables
}

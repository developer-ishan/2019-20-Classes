/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

/**
 *
 * @author aks
 */
public class StudentHandler extends javax.swing.JFrame {

    /** Creates new form StudentHandler */
    public StudentHandler() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEnterStudDetails = new javax.swing.JButton();
        btnDelStudDetails = new javax.swing.JButton();
        btnViewStudDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEnterStudDetails.setText("Enter Student Details");
        btnEnterStudDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterStudDetailsActionPerformed(evt);
            }
        });

        btnDelStudDetails.setText("Delete Students");
        btnDelStudDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelStudDetailsActionPerformed(evt);
            }
        });

        btnViewStudDetails.setText("View All Students");
        btnViewStudDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudDetailsActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Registrations");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btnEnterStudDetails)
                .addGap(85, 85, 85)
                .addComponent(btnDelStudDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btnViewStudDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnterStudDetails)
                    .addComponent(btnDelStudDetails)
                    .addComponent(btnViewStudDetails))
                .addGap(271, 271, 271))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDelStudDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelStudDetailsActionPerformed
      DeleteStudent deleteStudent = new DeleteStudent();
      deleteStudent.setVisible(true);
    }//GEN-LAST:event_btnDelStudDetailsActionPerformed

    private void btnViewStudDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudDetailsActionPerformed
      FetchDetails fd = new FetchDetails();
      fd.setVisible(true);
    }//GEN-LAST:event_btnViewStudDetailsActionPerformed

    private void btnEnterStudDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterStudDetailsActionPerformed
       EnterStudDetails enterStudDetails = new EnterStudDetails();
       enterStudDetails.setVisible(true);
    }//GEN-LAST:event_btnEnterStudDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(StudentHandler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentHandler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentHandler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentHandler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentHandler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelStudDetails;
    private javax.swing.JButton btnEnterStudDetails;
    private javax.swing.JButton btnViewStudDetails;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DB.FacadeDB;
import DB.UsersDB;
import User.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ProfileSalesmanUI extends javax.swing.JFrame {

    FacadeDB db;
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    UsersDB userdb;

    public ProfileSalesmanUI() {
        try {
            initComponents();
            userdb = new UsersDB();
            viewSalesmanData();
            Jid.setEditable(false);
        } catch (SQLException ex) {
            Logger.getLogger(ProfileSalesmanUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfileSalesmanUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Creates new form ProfileSalesmanUI
     */
    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Jfirstname = new javax.swing.JTextField();
        Jlastname = new javax.swing.JTextField();
        Jphonenumber = new javax.swing.JTextField();
        Jcountry = new javax.swing.JTextField();
        Jcity = new javax.swing.JTextField();
        Jedit = new javax.swing.JButton();
        Jcancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Jid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Phone Number");

        jLabel4.setText("Country");

        jLabel5.setText("City");

        Jfirstname.setText(" ");
        Jfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JfirstnameActionPerformed(evt);
            }
        });

        Jlastname.setText(" ");

        Jphonenumber.setText(" ");

        Jcountry.setText(" ");
        Jcountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcountryActionPerformed(evt);
            }
        });

        Jcity.setText(" ");

        Jedit.setText("Edit");
        Jedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JeditActionPerformed(evt);
            }
        });

        Jcancel.setText("Cancel");
        Jcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcancelActionPerformed(evt);
            }
        });

        jLabel7.setText("ID");

        Jid.setText(" ");
        Jid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jcity, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(Jcountry)
                            .addComponent(Jphonenumber)
                            .addComponent(Jlastname)
                            .addComponent(Jfirstname)
                            .addComponent(Jid)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(Jedit)
                        .addGap(31, 31, 31)
                        .addComponent(Jcancel)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addComponent(Jid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Jfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Jlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(Jphonenumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Jcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Jcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jedit)
                    .addComponent(Jcancel))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JcountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcountryActionPerformed

    private void JeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JeditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JeditActionPerformed

    private void JfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JfirstnameActionPerformed

    private void JcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_JcancelActionPerformed

    private void JidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JidActionPerformed

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
            java.util.logging.Logger.getLogger(ProfileSalesmanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileSalesmanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileSalesmanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileSalesmanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileSalesmanUI().setVisible(true);
            }
        });
    }

    public void viewSalesmanData() throws SQLException {
        User user = userdb.getSalesman();
        Jid.setText(user.getId());
        Jfirstname.setText(user.getfName());
        Jlastname.setText(user.getlName());
        Jcity.setText(user.getCity());
        Jcountry.setText(user.getCountry());
        Jphonenumber.setText(user.getPhoneNumber());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jcancel;
    private javax.swing.JTextField Jcity;
    private javax.swing.JTextField Jcountry;
    private javax.swing.JButton Jedit;
    private javax.swing.JTextField Jfirstname;
    private javax.swing.JTextField Jid;
    private javax.swing.JTextField Jlastname;
    private javax.swing.JTextField Jphonenumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}

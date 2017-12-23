/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DB.FacadeDB;
import Product.Computer;
import Product.Phone;
import Product.ProductFactory;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class Phones extends javax.swing.JFrame {

    private final String TYPE = "Phone";
    FacadeDB db;

    public Phones() {
        initComponents();
        try {
            db = new FacadeDB();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Phones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        Jprice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Jversion = new javax.swing.JTextField();
        Jtype = new javax.swing.JTextField();
        Jmemorysize = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Jadd = new javax.swing.JButton();
        Jcancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Jid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Jprice.setText(" ");
        Jprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JpriceActionPerformed(evt);
            }
        });

        jLabel1.setText("Type");

        Jversion.setText(" ");
        Jversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JversionActionPerformed(evt);
            }
        });

        Jtype.setText(" ");

        Jmemorysize.setText(" ");
        Jmemorysize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmemorysizeActionPerformed(evt);
            }
        });

        jLabel2.setText("Price");

        jLabel3.setText("Version");

        jLabel4.setText("Memory Size");

        Jadd.setText("Add");
        Jadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JaddActionPerformed(evt);
            }
        });

        Jcancel.setText("Cancel");
        Jcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcancelActionPerformed(evt);
            }
        });

        jLabel6.setText("ID");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Jadd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jtype)
                    .addComponent(Jprice)
                    .addComponent(Jversion)
                    .addComponent(Jmemorysize, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(Jcancel)
                    .addComponent(Jid))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Jid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Jtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Jprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Jversion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Jmemorysize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jcancel)
                    .addComponent(Jadd))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void JtypeActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void JaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JaddActionPerformed
        try {
            db.addPhone(getPhoneData());
            JOptionPane.showMessageDialog(null, "Correct!!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Invalid!!");
        }    }//GEN-LAST:event_JaddActionPerformed

    private void JidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JidActionPerformed


    }//GEN-LAST:event_JidActionPerformed

    private void JmemorysizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmemorysizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JmemorysizeActionPerformed

    private void JversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JversionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JversionActionPerformed

    private void JcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcancelActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_JcancelActionPerformed

    private void JpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JpriceActionPerformed

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
            java.util.logging.Logger.getLogger(Computers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Computers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Computers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Computers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Phones().setVisible(true);
            }
        });
    }

    public Phone getPhoneData() {

        String price = Jprice.getText();
        String version = Jversion.getText();
        String type = Jtype.getText();
        String id = this.getJid().getText();
        String memorySize = Jmemorysize.getText();

        Phone phone = (Phone) ProductFactory.getProduct(TYPE);

        phone.setNo(id);
        phone.setType(type);
        phone.setPrice(price);
        phone.setVersion(version);
        phone.setMemorySize(memorySize);

        return phone;
    }

    public JTextField getJmemorysize() {
        return Jmemorysize;
    }

    public JTextField getJid() {
        return Jid;
    }

    public JTextField getJprice() {
        return Jprice;
    }

    public JTextField getJtype() {
        return Jtype;
    }

    public JTextField getJversion() {
        return Jversion;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jadd;
    private javax.swing.JButton Jcancel;
    private javax.swing.JTextField Jid;
    private javax.swing.JTextField Jmemorysize;
    private javax.swing.JTextField Jprice;
    private javax.swing.JTextField Jtype;
    private javax.swing.JTextField Jversion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}

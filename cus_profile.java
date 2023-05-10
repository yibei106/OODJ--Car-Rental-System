/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import static GUI.Files.readCustomer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yibei
 */
public class cus_profile extends javax.swing.JFrame {

    /**
     * Creates new form cus_profile
     */
    String username;

    public cus_profile() {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
    }

    public cus_profile(String username) throws IOException {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        this.username = username;
        ArrayList<Customer> list = readCustomer();
        for (Customer c : list) {
            if (c.getUsername().equals(this.username)) {
                firstN1.setText(c.getFirstName());
                lastN.setText(c.getLastName());
                adds1.setText(c.getAddress());
                conNum.setText(c.getContactNo());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lastN = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        conNum = new javax.swing.JLabel();
        adds1 = new javax.swing.JLabel();
        firstN1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        returnBT = new javax.swing.JButton();
        editBT = new javax.swing.JButton();
        passwordBT = new javax.swing.JButton();
        logoutBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel2.setText("Contact No:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 510, 210, 60);

        lastN.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        lastN.setForeground(new java.awt.Color(224, 156, 156));
        getContentPane().add(lastN);
        lastN.setBounds(370, 340, 210, 60);

        jLabel4.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel4.setText("Last Name:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 340, 210, 60);

        jLabel5.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel5.setText("Address:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 430, 210, 60);

        jLabel6.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel6.setText("First Name:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 260, 210, 60);

        conNum.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        conNum.setForeground(new java.awt.Color(224, 156, 156));
        getContentPane().add(conNum);
        conNum.setBounds(360, 520, 210, 60);

        adds1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        adds1.setForeground(new java.awt.Color(224, 156, 156));
        getContentPane().add(adds1);
        adds1.setBounds(350, 430, 380, 60);

        firstN1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        firstN1.setForeground(new java.awt.Color(224, 156, 156));
        getContentPane().add(firstN1);
        firstN1.setBounds(370, 260, 210, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/cus_profile.png"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(1338, 768));
        background.setMinimumSize(new java.awt.Dimension(1338, 768));
        background.setPreferredSize(new java.awt.Dimension(1338, 768));
        getContentPane().add(background);
        background.setBounds(0, -10, 1340, 790);

        returnBT.setText("jButton1");
        returnBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTActionPerformed(evt);
            }
        });
        getContentPane().add(returnBT);
        returnBT.setBounds(30, 20, 150, 60);

        editBT.setText("jButton1");
        editBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBTActionPerformed(evt);
            }
        });
        getContentPane().add(editBT);
        editBT.setBounds(230, 650, 140, 60);

        passwordBT.setText("jButton1");
        passwordBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordBTActionPerformed(evt);
            }
        });
        getContentPane().add(passwordBT);
        passwordBT.setBounds(410, 650, 140, 60);

        logoutBT.setText("jButton1");
        logoutBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBT);
        logoutBT.setBounds(1190, 20, 130, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTActionPerformed
        // TODO add your handling code here:
        new Startpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBTActionPerformed

    private void returnBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBTActionPerformed
        try {
            // TODO add your handling code here:
            new Customerpage(this.username).setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(cus_profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_returnBTActionPerformed

    private void editBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTActionPerformed
        try {
            // TODO add your handling code here:
            new cus_edit_profile(this.username).setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(cus_profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editBTActionPerformed

    private void passwordBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordBTActionPerformed
        // TODO add your handling code here:
        new cus_password(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_passwordBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void cus_profile(String username) {
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
            java.util.logging.Logger.getLogger(cus_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cus_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cus_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cus_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cus_profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adds1;
    private javax.swing.JLabel background;
    private javax.swing.JLabel conNum;
    private javax.swing.JButton editBT;
    private javax.swing.JLabel firstN1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lastN;
    private javax.swing.JButton logoutBT;
    private javax.swing.JButton passwordBT;
    private javax.swing.JButton returnBT;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import static GUI.Files.editBooking;
import static GUI.Files.readBooking;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yibei
 */
public class collect_payment extends javax.swing.JFrame {

    /**
     * Creates new form collect_payment
     */
    String username;
    String cusUsername;
    String carID;

    public collect_payment() {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));

    }

    public collect_payment(String username) {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        this.username = username;
    }

    public void displayTable(int s) {
        String status = null;
        if (s == 1) {
            status = "paid";
        } else {
            status = "nopayment";
        }
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            ArrayList<Booking> list = readBooking();
            for (Booking b : list) {
                if (b.getPaymentStatus().equals(status)) {
                    String cusbooking = b.getUsername() + "," + b.getCarID() + "," + b.getCarBrand() + "," + b.getCarName() + ","
                            + b.getCarPlate() + "," + b.getTotalPrice();
                    String[] bookInfo = cusbooking.split(",");
                    model.addRow(bookInfo);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(collect_payment.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        paidBT = new javax.swing.JButton();
        nopaidBT = new javax.swing.JButton();
        cancelBT = new javax.swing.JButton();
        returnBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table.setBackground(new java.awt.Color(100, 139, 131));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "CarID", "Brand", "Name", "Car Plate", "Price"
            }
        ));
        table.setSelectionBackground(new java.awt.Color(0, 102, 102));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 250, 640, 400);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/collect_payment.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 780);

        paidBT.setText("jButton1");
        paidBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidBTActionPerformed(evt);
            }
        });
        getContentPane().add(paidBT);
        paidBT.setBounds(100, 190, 220, 40);

        nopaidBT.setText("jButton2");
        nopaidBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nopaidBTActionPerformed(evt);
            }
        });
        getContentPane().add(nopaidBT);
        nopaidBT.setBounds(370, 190, 270, 40);

        cancelBT.setText("jButton1");
        cancelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBTActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBT);
        cancelBT.setBounds(280, 650, 160, 70);

        returnBT.setText("jButton1");
        returnBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTActionPerformed(evt);
            }
        });
        getContentPane().add(returnBT);
        returnBT.setBounds(20, 10, 140, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paidBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidBTActionPerformed
        // display paid booking
        displayTable(1);
    }//GEN-LAST:event_paidBTActionPerformed

    private void nopaidBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nopaidBTActionPerformed
        // display booking without payment yet
        displayTable(2);
    }//GEN-LAST:event_nopaidBTActionPerformed

    private void cancelBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBTActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        if (table.getSelectedRowCount() == 1) {
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                model.removeRow(table.getSelectedRow());
                ArrayList<String> tempArray = new ArrayList<>();
                try {
                    ArrayList<Booking> list = readBooking();
                    for (Booking b : list) {
                        if (!(b.getCarID().equals(this.carID) && b.getUsername().equals(this.cusUsername))) {
                            tempArray.add(b.toString());
                        }
                    }
                    editBooking(tempArray,"cusbooking.txt");
                } catch (IOException ex) {
                    Logger.getLogger(collect_payment.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                if (table.getSelectedRowCount() == 0) {
                    JOptionPane.showMessageDialog(this, "The Table is empty!!");
                } else {
                    JOptionPane.showMessageDialog(this, "Please select single row everytime!!");
                }
            }
        }
    }//GEN-LAST:event_cancelBTActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        String cusName = model.getValueAt(row, 0).toString();
        String carId = model.getValueAt(row, 1).toString();
        this.cusUsername = cusName;
        this.carID = carId;
    }//GEN-LAST:event_tableMouseClicked

    private void returnBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBTActionPerformed
        // TODO add your handling code here:
        new Adminpage(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void collect_payment(String username) {
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
            java.util.logging.Logger.getLogger(collect_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(collect_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(collect_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(collect_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new collect_payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nopaidBT;
    private javax.swing.JButton paidBT;
    private javax.swing.JButton returnBT;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
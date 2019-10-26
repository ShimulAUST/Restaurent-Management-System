package restaurent.billing.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import static restaurent.billing.system.Management.press;

public class DELETEFOODITEM extends javax.swing.JFrame {

    String item_id = "";
//this method is for back function

    void back() {
        new Management().setVisible(true);
        this.dispose();
        press = 0;
    }
//this method is for delete purpose

    void delete() {
        item_id = ITEMID.getText();

        PreparedStatement pst = null;
        if (item_id.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "PLEASE FILL UP THE FIELD");
        } else {
            try {
                Connection con = ConnectDatabase.ConnectDB();
                if (item_id.charAt(0) == 'S') {
                    String Query = "DELETE FROM Snacks Where Item_Code=?";
                    pst = con.prepareStatement(Query);
                    pst.setString(1, item_id);
                    int i = pst.executeUpdate();
                    if (i == 0) {
                        JOptionPane.showMessageDialog(rootPane, "ID NOT FOUND IN DATABASE");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "DELETED SUCCESSFULLY");
                    }
                } else if (item_id.charAt(0) == 'D') {
                    String Query = "DELETE FROM drinks Where Item_Code=?";
                    pst = con.prepareStatement(Query);
                    pst.setString(1, item_id);
                    int i = pst.executeUpdate();
                    if (i == 0) {
                        JOptionPane.showMessageDialog(rootPane, "ID NOT FOUND IN DATABASE");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "DELETED SUCCESSFULLY");
                    }
                } else if (item_id.charAt(0) == 'L') {
                    String Query = "DELETE FROM lunch Where Item_Code=?";
                    pst = con.prepareStatement(Query);
                    pst.setString(1, item_id);
                    int i = pst.executeUpdate();
                    if (i == 0) {
                        JOptionPane.showMessageDialog(rootPane, "ID NOT FOUND IN DATABASE");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "DELETED SUCCESSFULLY");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Please Fill the Correct Item Code");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "NOT Available");
            }
        }

    }
//all the text field is set to null

    void clear() {
        ITEMID.setText(null);
    }

    public DELETEFOODITEM() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DELETE = new javax.swing.JButton();
        CLEAR = new javax.swing.JButton();
        ITEMID = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Food Item");
        setLocation(new java.awt.Point(250, 50));

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DELETE FOOD ITEM");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 40, 290, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ITEM ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 160, 90, 20);

        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("©ZAS SOFTWARE");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 540, 120, 30);

        DELETE.setBackground(new java.awt.Color(0, 51, 204));
        DELETE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DELETE.setForeground(new java.awt.Color(255, 255, 255));
        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        DELETE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DELETEKeyPressed(evt);
            }
        });
        jPanel1.add(DELETE);
        DELETE.setBounds(120, 300, 140, 80);

        CLEAR.setBackground(new java.awt.Color(0, 51, 204));
        CLEAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CLEAR.setForeground(new java.awt.Color(255, 255, 255));
        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });
        CLEAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CLEARKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CLEARKeyTyped(evt);
            }
        });
        jPanel1.add(CLEAR);
        CLEAR.setBounds(290, 300, 150, 80);

        ITEMID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ITEMID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ITEMIDActionPerformed(evt);
            }
        });
        ITEMID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ITEMIDKeyPressed(evt);
            }
        });
        jPanel1.add(ITEMID);
        ITEMID.setBounds(280, 160, 230, 30);

        Back.setBackground(new java.awt.Color(0, 51, 204));
        Back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        Back.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BackKeyPressed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(470, 300, 150, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ITEMIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ITEMIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ITEMIDActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
try{
        delete();}
catch(Exception e)
{
    System.out.println("Exception for delete button");
}
    }//GEN-LAST:event_DELETEActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
try{
        clear();}
catch(Exception e)
{
    System.out.println("Exception for clear button");
}
    }//GEN-LAST:event_CLEARActionPerformed

    private void CLEARKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CLEARKeyPressed
        try {
            if (evt.getKeyChar() == '\n') {
                clear();
            }
        } catch (Exception e) {
            System.out.println("Exception for clear button");
        }
    }//GEN-LAST:event_CLEARKeyPressed

    private void DELETEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DELETEKeyPressed
        try {
            if (evt.getKeyChar() == '\n') {
                delete();
            }
        } catch (Exception e) {
            System.out.println("Exception for delete button");
        }
    }//GEN-LAST:event_DELETEKeyPressed

    private void CLEARKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CLEARKeyTyped


    }//GEN-LAST:event_CLEARKeyTyped

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        back();
    }//GEN-LAST:event_BackActionPerformed

    private void BackKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BackKeyPressed
        try {
            if (evt.getKeyChar() == '\n') {
                back();
            }
        } catch (Exception e) {

            System.out.println("Exception for back button");
        }
    }//GEN-LAST:event_BackKeyPressed

    private void ITEMIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ITEMIDKeyPressed
        try {
            if (evt.getKeyChar() == '\n') {
                delete();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_ITEMIDKeyPressed

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
            java.util.logging.Logger.getLogger(DELETEFOODITEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DELETEFOODITEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DELETEFOODITEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DELETEFOODITEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DELETEFOODITEM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton CLEAR;
    private javax.swing.JButton DELETE;
    private javax.swing.JTextField ITEMID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
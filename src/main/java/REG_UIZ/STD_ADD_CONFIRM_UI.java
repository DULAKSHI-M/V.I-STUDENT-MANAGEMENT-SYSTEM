
package REG_UIZ;

import DB_connection.DB_login;
import REG_MODELS.Student;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;



public class STD_ADD_CONFIRM_UI extends javax.swing.JFrame {
    
    public STD_ADD_CONFIRM_UI() {
        initComponents();
    }
    
    public STD_ADD_CONFIRM_UI(Student std) {
        initComponents();
    
   
    lblid.setText( std.getStd_id());
    lblname.setText(std.getStd_name());
    lblbday.setText(std.getStd_bday());
    lblnumber.setText(std.getStd_contactNumber());
    lbladdress.setText(std.getStd_address());
    lblemail.setText(std.getStd_parentEmail());
    lbldescription.setText(std.getStd_class());
   
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        closebtn = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblname = new javax.swing.JLabel();
        lblbday = new javax.swing.JLabel();
        lblnumber = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lbldescription = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblid1 = new javax.swing.JLabel();
        lblbday1 = new javax.swing.JLabel();
        lblname1 = new javax.swing.JLabel();
        lblnumber1 = new javax.swing.JLabel();
        lbladdress1 = new javax.swing.JLabel();
        lblemail1 = new javax.swing.JLabel();
        lbldescription1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Confirmbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Confrim BOX");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(216, 103, 155));
        jPanel2.setForeground(new java.awt.Color(255, 255, 204));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closebtn.setIcon(new javax.swing.ImageIcon("E:\\ppa_netb\\PPA_Dewmin\\src\\main\\java\\IMG_coustomMade\\Titles_common_icons\\dispose_boxuionly.png")); // NOI18N
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        jPanel2.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 14, 15));

        Title.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Student register confirm box");
        jPanel2.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 15));

        jPanel3.setBackground(new java.awt.Color(238, 227, 232));

        lblname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblbday.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblnumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbladdress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbldescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbldescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblemail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblid1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblid1.setText("Student ID");

        lblbday1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblbday1.setText("Birth day");

        lblname1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblname1.setText("Student Name");

        lblnumber1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblnumber1.setText("Contact Number");

        lbladdress1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbladdress1.setText("Address");

        lblemail1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblemail1.setText("E-mail");

        lbldescription1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbldescription1.setText("Discription / class");
        lbldescription1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel5.setBackground(new java.awt.Color(238, 227, 232));
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 40));

        jPanel4.setBackground(new java.awt.Color(238, 227, 232));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("Confirm");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 20));

        Confirmbtn.setIcon(new javax.swing.ImageIcon("E:\\ppa_netb\\PPA_Dewmin\\src\\main\\java\\IMG_coustomMade\\Stdpane_Icons\\bnt_solid70x25.png")); // NOI18N
        Confirmbtn.setPreferredSize(new java.awt.Dimension(70, 25));
        Confirmbtn.setRolloverIcon(new javax.swing.ImageIcon("E:\\ppa_netb\\PPA_Dewmin\\src\\main\\java\\IMG_coustomMade\\Stdpane_Icons\\bnt_hover70x25.png")); // NOI18N
        Confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmbtnActionPerformed(evt);
            }
        });
        jPanel4.add(Confirmbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblid1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbday1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblbday, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblnumber1)
                        .addGap(165, 165, 165)
                        .addComponent(lbldescription1)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbladdress1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(lblemail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbladdress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblnumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lbldescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(lblid, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(lblid1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lblnumber1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lblnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldescription1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbladdress1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbladdress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblbday1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblbday, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblemail1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lbldescription, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 600, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        dispose();
        
    }//GEN-LAST:event_closebtnActionPerformed

    private void ConfirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmbtnActionPerformed
        try {
            DB_login data =new DB_login();
          
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(data.getUrl(), data.getUser(), data.getPassword());
            
            String sql="INSERT INTO student (std_id,std_name,std_bday,std_address,std_contactNumber,std_parentEmail,std_class) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            
         
            pst.setString(1, lblid.getText());
            pst.setString(2, lblname.getText());
            pst.setString(3, lblbday.getText());
            pst.setString(4, lbladdress.getText());
            pst.setString(5, lblnumber.getText());
            pst.setString(6, lblemail.getText());
            pst.setString(7, lbldescription.getText());
            
            pst.executeUpdate();
            
         
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(STD_ADD_CONFIRM_UI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(STD_ADD_CONFIRM_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConfirmbtnActionPerformed

  
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
            java.util.logging.Logger.getLogger(STD_ADD_CONFIRM_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STD_ADD_CONFIRM_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STD_ADD_CONFIRM_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STD_ADD_CONFIRM_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STD_ADD_CONFIRM_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmbtn;
    private javax.swing.JLabel Title;
    private javax.swing.JButton closebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lbladdress1;
    private javax.swing.JLabel lblbday;
    private javax.swing.JLabel lblbday1;
    private javax.swing.JLabel lbldescription;
    private javax.swing.JLabel lbldescription1;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblemail1;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblid1;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblname1;
    private javax.swing.JLabel lblnumber;
    private javax.swing.JLabel lblnumber1;
    // End of variables declaration//GEN-END:variables
}

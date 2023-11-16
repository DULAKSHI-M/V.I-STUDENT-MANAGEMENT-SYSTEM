
package REG_UIZ;

import DB_connection.DB_login;
import REG_MODELS.Student;
import REG_MODELS.Teacher;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class STD_REG_UI extends javax.swing.JFrame {
    Student std;
    Teacher teach;
    DB_login data = new DB_login();
    

    
    public STD_REG_UI() {
        initComponents();
        ImageIcon icon = new ImageIcon("E:\\ppa_netb\\PPA_Dewmin\\src\\main\\java\\IMG_coustomMade\\Titles_common_icons\\title_bar_icon.png");
        this.setIconImage(icon.getImage());   
    }
   
   //Student 
    public void std_fields_clear(){ //std page ----->with id
        std_id.setText("");
        std_name.setText("");
        std_bday.setText("");
        std_address.setText("");
        std_contactNumber.setText("");
        std_parentEmail.setText("");
        std_class.setText("");
    }
    
   
    public void std_fields_clear2(){ //std page----> ID Field not clr
        std_name.setText("");
        std_bday.setText("");
        std_address.setText("");
        std_contactNumber.setText("");
        std_parentEmail.setText("");
        std_class.setText("");
    }
    
    //Teacher
    public void teach_fields_clear(){ //std page ----->with id
        teach_id.setText("");
        teach_name.setText("");
        teach_address.setText("");
        teach_contactNumber.setText("");
        teach_mail.setText("");
        teach_subject.setText("");
    }
    public void teach_fields_clear2(){ //std page ----->ID Field not clr
        teach_name.setText("");
        teach_address.setText("");
        teach_contactNumber.setText("");
        teach_mail.setText("");
        teach_subject.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basepanel = new javax.swing.JPanel();
        menupanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        studentbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        teacherbtn = new javax.swing.JButton();
        attendancebtn = new javax.swing.JButton();
        paymentbtn = new javax.swing.JButton();
        settingbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        sizefix_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl4 = new javax.swing.JLabel();
        STUDENT_REG_PANNEL = new javax.swing.JPanel();
        std_stage1 = new javax.swing.JPanel();
        std_stage2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        std_id = new javax.swing.JTextField();
        std_address = new javax.swing.JTextField();
        std_name = new javax.swing.JTextField();
        std_contactNumber = new javax.swing.JTextField();
        std_bday = new javax.swing.JTextField();
        std_parentEmail = new javax.swing.JTextField();
        std_class = new javax.swing.JTextField();
        std_stage3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        std_updatebtn = new javax.swing.JButton();
        std_removebtn = new javax.swing.JButton();
        std_addbtn = new javax.swing.JButton();
        TEACHER_REG_PANNEL = new javax.swing.JPanel();
        teach_stage4 = new javax.swing.JPanel();
        teach_stage5 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        teach_id = new javax.swing.JTextField();
        teach_address = new javax.swing.JTextField();
        teach_name = new javax.swing.JTextField();
        teach_contactNumber = new javax.swing.JTextField();
        teach_mail = new javax.swing.JTextField();
        teach_subject = new javax.swing.JTextField();
        teach_stage = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        teach_updatebtn = new javax.swing.JButton();
        teach_removebtn = new javax.swing.JButton();
        teach_addbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Victory");
        setMaximumSize(new java.awt.Dimension(1920, 1080));

        basepanel.setBackground(new java.awt.Color(255, 255, 255));
        basepanel.setMinimumSize(new java.awt.Dimension(0, 0));
        basepanel.setPreferredSize(new java.awt.Dimension(0, 0));
        basepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menupanel.setBackground(new java.awt.Color(209, 94, 157));
        menupanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        menupanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 40, 40));
        menupanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 40, 40));
        menupanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 40, 40));
        menupanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 40, 40));
        menupanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 40, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("                    STUDENT REGISTER");
        menupanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 270, 66));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                    TEACHER REGISTER");
        menupanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 66));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("                     ATTENDANCE");
        menupanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 66));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("                     PAYMENT");
        menupanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 260, 66));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("                     SETTINGS");
        menupanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 260, 66));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("                     LOG OUT");
        menupanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 260, 66));

        studentbtn.setBackground(new java.awt.Color(233, 128, 158));
        studentbtn.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        studentbtn.setForeground(new java.awt.Color(255, 255, 255));
        studentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentbtnActionPerformed(evt);
            }
        });
        menupanel.add(studentbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 260, 66));
        menupanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 40, 40));

        teacherbtn.setBackground(new java.awt.Color(233, 128, 158));
        teacherbtn.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        teacherbtn.setForeground(new java.awt.Color(255, 255, 255));
        teacherbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherbtnActionPerformed(evt);
            }
        });
        menupanel.add(teacherbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 66));

        attendancebtn.setBackground(new java.awt.Color(0, 204, 204));
        attendancebtn.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        attendancebtn.setForeground(new java.awt.Color(255, 255, 255));
        attendancebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendancebtnActionPerformed(evt);
            }
        });
        menupanel.add(attendancebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 66));

        paymentbtn.setBackground(new java.awt.Color(255, 255, 102));
        paymentbtn.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        paymentbtn.setForeground(new java.awt.Color(255, 255, 255));
        paymentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentbtnActionPerformed(evt);
            }
        });
        menupanel.add(paymentbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 260, 66));

        settingbtn.setBackground(new java.awt.Color(0, 204, 204));
        settingbtn.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        settingbtn.setForeground(new java.awt.Color(255, 255, 255));
        settingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingbtnActionPerformed(evt);
            }
        });
        menupanel.add(settingbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 260, 66));

        logoutbtn.setBackground(new java.awt.Color(0, 204, 204));
        logoutbtn.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        menupanel.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 260, 66));

        sizefix_panel.setBackground(new java.awt.Color(209, 94, 157));

        javax.swing.GroupLayout sizefix_panelLayout = new javax.swing.GroupLayout(sizefix_panel);
        sizefix_panel.setLayout(sizefix_panelLayout);
        sizefix_panelLayout.setHorizontalGroup(
            sizefix_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        sizefix_panelLayout.setVerticalGroup(
            sizefix_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        menupanel.add(sizefix_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 557, 250, 20));

        jPanel1.setBackground(new java.awt.Color(209, 94, 157));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        menupanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, 130));

        basepanel.add(menupanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 580));

        STUDENT_REG_PANNEL.setBackground(new java.awt.Color(255, 255, 255));

        std_stage1.setBackground(new java.awt.Color(255, 255, 255));
        std_stage1.setPreferredSize(new java.awt.Dimension(743, 535));

        std_stage2.setBackground(new java.awt.Color(252, 158, 158));

        jLabel6.setBackground(new java.awt.Color(252, 158, 158));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("       STUDENT REGISTER");

        javax.swing.GroupLayout std_stage2Layout = new javax.swing.GroupLayout(std_stage2);
        std_stage2.setLayout(std_stage2Layout);
        std_stage2Layout.setHorizontalGroup(
            std_stage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(std_stage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(std_stage2Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(112, Short.MAX_VALUE)))
        );
        std_stage2Layout.setVerticalGroup(
            std_stage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
            .addGroup(std_stage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(std_stage2Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel7.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel7.setText("Class / Discription");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel8.setText("Address");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel9.setText("E-Mail");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel10.setText("Parent Email");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel11.setText("Contact Number");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel12.setText("Student Name");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel13.setText("Student ID");

        std_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_idActionPerformed(evt);
            }
        });

        std_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_addressActionPerformed(evt);
            }
        });

        std_contactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_contactNumberActionPerformed(evt);
            }
        });

        std_bday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_bdayActionPerformed(evt);
            }
        });

        std_parentEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_parentEmailActionPerformed(evt);
            }
        });

        std_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_classActionPerformed(evt);
            }
        });

        std_stage3.setBackground(new java.awt.Color(255, 255, 255));
        std_stage3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel16.setText("Remove");
        std_stage3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 60, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel15.setText("Update");
        std_stage3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 60, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel14.setText("Register");
        std_stage3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 60, -1));

        std_updatebtn.setText("UPDATE");
        std_updatebtn.setPreferredSize(new java.awt.Dimension(100, 30));
        std_updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_updatebtnActionPerformed(evt);
            }
        });
        std_stage3.add(std_updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 11, 85, -1));

        std_removebtn.setText("REMOVE");
        std_removebtn.setPreferredSize(new java.awt.Dimension(100, 30));
        std_removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_removebtnActionPerformed(evt);
            }
        });
        std_stage3.add(std_removebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 11, 85, -1));

        std_addbtn.setText("ADD");
        std_addbtn.setPreferredSize(new java.awt.Dimension(100, 30));
        std_addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_addbtnActionPerformed(evt);
            }
        });
        std_stage3.add(std_addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 11, 85, -1));

        javax.swing.GroupLayout std_stage1Layout = new javax.swing.GroupLayout(std_stage1);
        std_stage1.setLayout(std_stage1Layout);
        std_stage1Layout.setHorizontalGroup(
            std_stage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(std_stage1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(std_stage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(std_stage1Layout.createSequentialGroup()
                        .addGroup(std_stage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(std_stage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(std_address, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(std_name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(std_stage1Layout.createSequentialGroup()
                                .addComponent(std_parentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(std_stage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(std_contactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(std_stage1Layout.createSequentialGroup()
                                .addGroup(std_stage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(std_id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(std_bday, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(118, 118, 118)
                                .addComponent(jLabel7)
                                .addGap(41, 41, 41)
                                .addComponent(std_class, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(std_stage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        std_stage1Layout.setVerticalGroup(
            std_stage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(std_stage1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(std_stage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(std_stage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(std_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(std_class, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(std_stage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(std_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(std_stage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(std_bday, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(std_stage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(std_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(std_stage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(std_contactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(std_stage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(std_parentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(std_stage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout STUDENT_REG_PANNELLayout = new javax.swing.GroupLayout(STUDENT_REG_PANNEL);
        STUDENT_REG_PANNEL.setLayout(STUDENT_REG_PANNELLayout);
        STUDENT_REG_PANNELLayout.setHorizontalGroup(
            STUDENT_REG_PANNELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(STUDENT_REG_PANNELLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(std_stage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        STUDENT_REG_PANNELLayout.setVerticalGroup(
            STUDENT_REG_PANNELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(STUDENT_REG_PANNELLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(std_stage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        basepanel.add(STUDENT_REG_PANNEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 1010, 578));

        TEACHER_REG_PANNEL.setBackground(new java.awt.Color(255, 255, 255));

        teach_stage4.setBackground(new java.awt.Color(255, 255, 255));
        teach_stage4.setPreferredSize(new java.awt.Dimension(743, 535));

        teach_stage5.setBackground(new java.awt.Color(243, 180, 178));

        jLabel28.setBackground(new java.awt.Color(243, 180, 178));
        jLabel28.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("       TEACHER REGISTER");

        javax.swing.GroupLayout teach_stage5Layout = new javax.swing.GroupLayout(teach_stage5);
        teach_stage5.setLayout(teach_stage5Layout);
        teach_stage5Layout.setHorizontalGroup(
            teach_stage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(teach_stage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(teach_stage5Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(112, Short.MAX_VALUE)))
        );
        teach_stage5Layout.setVerticalGroup(
            teach_stage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
            .addGroup(teach_stage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(teach_stage5Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel35.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel35.setText("Subjects Teaching");

        jLabel36.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel36.setText("Address");

        jLabel37.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel37.setText("E-Mail");

        jLabel39.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel39.setText("Contact Number");

        jLabel40.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel40.setText("Teacher Name");

        jLabel41.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel41.setText("Teacher ID");

        teach_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teach_idActionPerformed(evt);
            }
        });

        teach_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teach_addressActionPerformed(evt);
            }
        });

        teach_contactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teach_contactNumberActionPerformed(evt);
            }
        });

        teach_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teach_mailActionPerformed(evt);
            }
        });

        teach_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teach_subjectActionPerformed(evt);
            }
        });

        teach_stage.setBackground(new java.awt.Color(255, 255, 255));
        teach_stage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel42.setText("Remove");
        teach_stage.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 60, -1));

        jLabel43.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel43.setText("Update");
        teach_stage.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 60, -1));

        jLabel44.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel44.setText("Register");
        teach_stage.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 60, -1));

        teach_updatebtn.setText("UPDATE");
        teach_updatebtn.setPreferredSize(new java.awt.Dimension(100, 30));
        teach_updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teach_updatebtnActionPerformed(evt);
            }
        });
        teach_stage.add(teach_updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 11, 85, -1));

        teach_removebtn.setText("REMOVE");
        teach_removebtn.setPreferredSize(new java.awt.Dimension(100, 30));
        teach_removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teach_removebtnActionPerformed(evt);
            }
        });
        teach_stage.add(teach_removebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 11, 85, -1));

        teach_addbtn.setText("ADD");
        teach_addbtn.setPreferredSize(new java.awt.Dimension(100, 30));
        teach_addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teach_addbtnActionPerformed(evt);
            }
        });
        teach_stage.add(teach_addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 11, 85, -1));

        javax.swing.GroupLayout teach_stage4Layout = new javax.swing.GroupLayout(teach_stage4);
        teach_stage4.setLayout(teach_stage4Layout);
        teach_stage4Layout.setHorizontalGroup(
            teach_stage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teach_stage4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(teach_stage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teach_stage4Layout.createSequentialGroup()
                        .addGroup(teach_stage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(teach_stage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teach_address, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teach_name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(teach_stage4Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(teach_stage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(teach_contactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(teach_stage4Layout.createSequentialGroup()
                                .addGroup(teach_stage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teach_id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teach_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(118, 118, 118)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(teach_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(teach_stage5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        teach_stage4Layout.setVerticalGroup(
            teach_stage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teach_stage4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(teach_stage5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(teach_stage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teach_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teach_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(teach_stage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teach_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(teach_stage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teach_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(teach_stage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teach_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(teach_stage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teach_contactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(teach_stage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout TEACHER_REG_PANNELLayout = new javax.swing.GroupLayout(TEACHER_REG_PANNEL);
        TEACHER_REG_PANNEL.setLayout(TEACHER_REG_PANNELLayout);
        TEACHER_REG_PANNELLayout.setHorizontalGroup(
            TEACHER_REG_PANNELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEACHER_REG_PANNELLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(teach_stage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TEACHER_REG_PANNELLayout.setVerticalGroup(
            TEACHER_REG_PANNELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TEACHER_REG_PANNELLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(teach_stage4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        basepanel.add(TEACHER_REG_PANNEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 1010, 578));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void std_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_idActionPerformed
        
        
    }//GEN-LAST:event_std_idActionPerformed

    private void std_bdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_bdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_std_bdayActionPerformed

    private void std_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_std_addressActionPerformed

    private void std_contactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_contactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_std_contactNumberActionPerformed

    private void std_parentEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_parentEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_std_parentEmailActionPerformed

    private void std_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_classActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_std_classActionPerformed

    private void std_addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_addbtnActionPerformed
 
      String id = std_id.getText();
      String name = std_name.getText();
      String bday = std_bday.getText();
      String address =std_address.getText();
      String contactNumber =std_contactNumber.getText(); 
      String parentEmail = std_parentEmail.getText();
      String clz= std_class.getText();
      
      std = new Student(id, name, bday, address, contactNumber, parentEmail, clz);
      std_fields_clear();
      
      STD_ADD_CONFIRM_UI std_ui01 =new STD_ADD_CONFIRM_UI(std);
      std_ui01.setVisible(true);
   
    }//GEN-LAST:event_std_addbtnActionPerformed

    private void std_updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_updatebtnActionPerformed
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(data.getUrl(), data.getUser(), data.getPassword());
            String sql="UPDATE student SET std_id=?, std_name=? , std_bday=? , std_address=? , std_contactNumber=? , std_parentEmail=? , std_class=?  WHERE std_id=?";
            
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            
            pst.setString(1, std_id.getText());
            pst.setString(2, std_name.getText());
            pst.setString(3, std_bday.getText());
            pst.setString(4, std_address.getText());
            pst.setString(5, std_contactNumber.getText());
            pst.setString(6, std_parentEmail.getText());
            pst.setString(7, std_class.getText());
            pst.setString(8, std_id.getText());
            
            int row =pst.executeUpdate();
            if(row>0)
            {
               std_id.setText("UPDATED") ;
            }else{std_id.setText("ID NOT EXIST");}
            std_fields_clear2();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(STD_REG_UI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(STD_REG_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_std_updatebtnActionPerformed

    private void std_removebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_removebtnActionPerformed
        String sql="DELETE FROM student WHERE std_id=" +  std_id.getText();
        
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection(data.getUrl(),data.getUser(), data.getPassword());
            Statement st = con.createStatement();
            int row =st.executeUpdate(sql);
            if(row >0)
            {
                std_id.setText("REMOVED");
            }
            else{std_id.setText("ID NOT EXIST");}
            std_fields_clear2();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(STD_REG_UI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(STD_REG_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_std_removebtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void settingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settingbtnActionPerformed

    private void paymentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentbtnActionPerformed

    private void attendancebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendancebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attendancebtnActionPerformed

    private void teacherbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherbtnActionPerformed
       STUDENT_REG_PANNEL.setVisible(false);
       TEACHER_REG_PANNEL.setVisible(true);
       
    }//GEN-LAST:event_teacherbtnActionPerformed

    private void studentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentbtnActionPerformed
        STUDENT_REG_PANNEL.setVisible(true);
    }//GEN-LAST:event_studentbtnActionPerformed

    private void teach_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teach_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teach_idActionPerformed

    private void teach_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teach_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teach_addressActionPerformed

    private void teach_contactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teach_contactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teach_contactNumberActionPerformed

    private void teach_subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teach_subjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teach_subjectActionPerformed

    private void teach_updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teach_updatebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teach_updatebtnActionPerformed

    private void teach_removebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teach_removebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teach_removebtnActionPerformed

    private void teach_addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teach_addbtnActionPerformed
      String id = teach_id.getText();
      String name = teach_name.getText();
      String address = teach_address.getText();
      String email =teach_mail.getText();
      String contactNumber =teach_contactNumber.getText();
      String subject= teach_subject.getText();
      
      teach = new Teacher(id, name, address, email, contactNumber, subject);
      teach_fields_clear();
      
      TEACH_ADD_CONFIRM_UI teach_ui = new TEACH_ADD_CONFIRM_UI(teach);
      teach_ui.setVisible(true);
      
    }//GEN-LAST:event_teach_addbtnActionPerformed

    private void teach_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teach_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teach_mailActionPerformed

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
            java.util.logging.Logger.getLogger(STD_REG_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STD_REG_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STD_REG_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STD_REG_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STD_REG_UI().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel STUDENT_REG_PANNEL;
    private javax.swing.JPanel TEACHER_REG_PANNEL;
    private javax.swing.JButton attendancebtn;
    private javax.swing.JPanel basepanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl4;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JPanel menupanel;
    private javax.swing.JButton paymentbtn;
    private javax.swing.JButton settingbtn;
    private javax.swing.JPanel sizefix_panel;
    private javax.swing.JButton std_addbtn;
    private javax.swing.JTextField std_address;
    private javax.swing.JTextField std_bday;
    private javax.swing.JTextField std_class;
    private javax.swing.JTextField std_contactNumber;
    private javax.swing.JTextField std_id;
    private javax.swing.JTextField std_name;
    private javax.swing.JTextField std_parentEmail;
    private javax.swing.JButton std_removebtn;
    private javax.swing.JPanel std_stage1;
    private javax.swing.JPanel std_stage2;
    private javax.swing.JPanel std_stage3;
    private javax.swing.JButton std_updatebtn;
    private javax.swing.JButton studentbtn;
    private javax.swing.JButton teach_addbtn;
    private javax.swing.JTextField teach_address;
    private javax.swing.JTextField teach_contactNumber;
    private javax.swing.JTextField teach_id;
    private javax.swing.JTextField teach_mail;
    private javax.swing.JTextField teach_name;
    private javax.swing.JButton teach_removebtn;
    private javax.swing.JPanel teach_stage;
    private javax.swing.JPanel teach_stage4;
    private javax.swing.JPanel teach_stage5;
    private javax.swing.JTextField teach_subject;
    private javax.swing.JButton teach_updatebtn;
    private javax.swing.JButton teacherbtn;
    // End of variables declaration//GEN-END:variables
}

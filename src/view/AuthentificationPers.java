/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.AuthentificationDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modele.AdminModele;

/**
 *
 * @author Ramih
 */
public class AuthentificationPers extends javax.swing.JFrame {

    /**
     * Creates new form AuthentificationPers
     */
    public AuthentificationPers() {
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

        html = new javax.swing.JPanel();
        left_side_bar = new javax.swing.JPanel();
        logo_texte = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        closeBtn = new javax.swing.JLabel();
        minus = new javax.swing.JLabel();
        separator = new javax.swing.JPanel();
        main = new javax.swing.JPanel();
        register = new javax.swing.JPanel();
        logo_texte2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        edtUsername = new javax.swing.JTextField();
        btnConnecter = new javax.swing.JButton();
        edtPassword = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        html.setBackground(new java.awt.Color(255, 255, 255));
        html.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        left_side_bar.setBackground(new java.awt.Color(0, 51, 51));
        left_side_bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                left_side_barMouseDragged(evt);
            }
        });
        left_side_bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                left_side_barMousePressed(evt);
            }
        });
        left_side_bar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo_texte.setBackground(new java.awt.Color(255, 255, 255));
        logo_texte.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        logo_texte.setForeground(new java.awt.Color(255, 255, 255));
        logo_texte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_texte.setText("DRSP Vakinankaratra");
        left_side_bar.add(logo_texte, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 360, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/titre.JPG"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GESTION DU");

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(" PERSONNEL ET");

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CANDIDAT");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        left_side_bar.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 300, 100));

        html.add(left_side_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 650));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        closeBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(204, 0, 51));
        closeBtn.setText("X");
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OnClick(evt);
            }
        });

        minus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minus.setForeground(new java.awt.Color(0, 51, 51));
        minus.setText("-");
        minus.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        minus.setAlignmentY(0.3F);
        minus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minusOnClick(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 1058, Short.MAX_VALUE)
                .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(closeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        html.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 30));

        separator.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout separatorLayout = new javax.swing.GroupLayout(separator);
        separator.setLayout(separatorLayout);
        separatorLayout.setHorizontalGroup(
            separatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        separatorLayout.setVerticalGroup(
            separatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        html.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 650, 10));

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        register.setBackground(new java.awt.Color(255, 255, 255));

        logo_texte2.setBackground(new java.awt.Color(255, 255, 255));
        logo_texte2.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        logo_texte2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_texte2.setText("Modifier");

        jTextField2.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPasswordField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Valider");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerLayout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo_texte2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registerLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(logo_texte2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        main.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 550));

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edtUsername.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        edtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtUsername.setToolTipText("");
        edtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtUsernameActionPerformed(evt);
            }
        });
        login.add(edtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 194, 370, 50));

        btnConnecter.setBackground(new java.awt.Color(0, 51, 51));
        btnConnecter.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnConnecter.setForeground(new java.awt.Color(255, 255, 255));
        btnConnecter.setText("se connecter");
        btnConnecter.setBorder(null);
        btnConnecter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnecterActionPerformed(evt);
            }
        });
        login.add(btnConnecter, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 374, 136, 44));

        edtPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        edtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtPassword.setToolTipText("");
        edtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPasswordActionPerformed(evt);
            }
        });
        login.add(edtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 287, 370, 50));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        login.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 650, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logUser.png"))); // NOI18N
        login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 50, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pass.png"))); // NOI18N
        login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 60, 50));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/log4.png"))); // NOI18N
        login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 90, 90));

        main.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 550));

        html.add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 650, 580));

        footer.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("| Contact");

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("| 2022 Code by @lovaRamih");

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addContainerGap(392, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        html.add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 620, 650, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(html, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(html, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int x;
    int y;
    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void left_side_barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_left_side_barMouseDragged
        // TODO add your handling code here:
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx - x, yy - y);
    }//GEN-LAST:event_left_side_barMouseDragged

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx - x, yy - y);
    }//GEN-LAST:event_headerMouseDragged

    private void left_side_barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_left_side_barMousePressed
        // TODO add your handling code here:
          x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_left_side_barMousePressed

    private void OnClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnClick
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_OnClick

    private void minusOnClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusOnClick
        // TODO add your handling code here:
        setState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_minusOnClick

    private void edtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPasswordActionPerformed

    private void edtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtUsernameActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try
        {
            main.removeAll();
            main.repaint();
            main.revalidate();
            
            main.add(login);
            main.repaint();
            main.revalidate();
        }catch(Exception e){
        }
    }//GEN-LAST:event_formWindowOpened
   
    private void btnConnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnecterActionPerformed
        String login = edtUsername.getText();
        String pass = edtPassword.getText();
        AuthentificationDao authDao = new AuthentificationDao();
        AdminModele admin = new AdminModele();
        admin.setUserName(login);
        admin.setPassword(pass);
        boolean validation = false;
        try {
             validation = authDao.verificationUser(admin);
        } 
        catch (SQLException e) 
        {
                e.printStackTrace();
        }
        if(validation == false)
        {
                JOptionPane.showMessageDialog(null, "Erreur du mdp ou login","Authentification failed",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
                this.setVisible(false);
                 Home home = new Home();
                 home.setVisible(true);
                 home.setVisible(true);
                 home.setTitle("Authentification");
                 home.setLocationRelativeTo(null);
        }
        try{
     
        }catch(Exception e){
        }
    }//GEN-LAST:event_btnConnecterActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnecter;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPasswordField edtPassword;
    private javax.swing.JTextField edtUsername;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JPanel html;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel left_side_bar;
    private javax.swing.JPanel login;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo_texte;
    private javax.swing.JLabel logo_texte2;
    private javax.swing.JPanel main;
    private javax.swing.JLabel minus;
    private javax.swing.JPanel register;
    private javax.swing.JPanel separator;
    // End of variables declaration//GEN-END:variables
}
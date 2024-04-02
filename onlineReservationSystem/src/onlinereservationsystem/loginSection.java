package onlinereservationsystem;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class loginSection extends JFrame
{

    public loginSection()
    {
        initComponents();
        Connect();
    }

    Connection connect;
    PreparedStatement selectSt;
    String databaseUrl = "jdbc:mysql://localhost/trainreservation";
    
    public void Connect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(databaseUrl, "root", "");
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(reservationScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(reservationScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameInput = new javax.swing.JTextField();
        passwordInput = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(51, 51, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        usernameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameInputActionPerformed(evt);
            }
        });

        passwordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameInput)
                    .addComponent(passwordInput, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        loginBtn.setText("Login");
        loginBtn.setFocusable(false);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.setFocusable(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitBtn))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(exitBtn))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameInputActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        
        String userName = usernameInput.getText();
        
        char[] passwordChars = passwordInput.getPassword();
        String password = new String(passwordChars);
        
        if(!(userName.equals("") && password.equals("")))
        {
            try 
            {
                selectSt = connect.prepareStatement("SELECT * FROM logindetails WHERE username = ? AND password = ?");

                selectSt.setString(1, userName);
                selectSt.setString(2, password);
                
                ResultSet result_set = selectSt.executeQuery();
                
                if (result_set.next())
                {
                    JOptionPane.showMessageDialog(this, "Login Successfull!");
                    
                    reservationScreen main = new reservationScreen();
                    
                    dispose();
                    
                    main.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Login Unsuccessfull! - Invalid username or password");
                }
                
            }
            catch (SQLException ex)
            {
                Logger.getLogger(loginSection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Enter Username or password");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void passwordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(() -> {
            new loginSection().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JTextField usernameInput;
    // End of variables declaration//GEN-END:variables
}
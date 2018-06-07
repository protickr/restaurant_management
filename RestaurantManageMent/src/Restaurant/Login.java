package Restaurant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.Component;


public class Login extends javax.swing.JFrame {
    Connection conn=DBConnect.connect(); 
    String query=null;
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userName = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        passField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));
        setMinimumSize(new java.awt.Dimension(380, 280));
        getContentPane().setLayout(null);

        userName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userName.setText("User Name");
        getContentPane().add(userName);
        userName.setBounds(67, 96, 63, 17);

        password.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        password.setText("Password");
        password.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(password);
        password.setBounds(67, 132, 63, 17);
        getContentPane().add(nameField);
        nameField.setBounds(148, 84, 151, 29);

        loginButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton);
        loginButton.setBounds(160, 174, 81, 25);

        passField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passFieldKeyPressed(evt);
            }
        });
        getContentPane().add(passField);
        passField.setBounds(148, 127, 151, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Welcome To Java Restuarant!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 20, 280, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarafat Apu\\Downloads\\canberra_hero_image - Copy.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 380, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        int i;
        String sql="select * from user where user_name=? and password=?";
        try{
            ResultSet rs;
            PreparedStatement pst =conn.prepareStatement(sql);
            pst.setString(1,nameField.getText());
            pst.setString(2,passField.getText());
            rs=pst.executeQuery();
            if(rs.next()){ //if any row exists after executing the query
                i=rs.getInt(5);
                if(i==1){
                    this.dispose();
                    new AEDSform().setVisible(true);
                }
                else{
                    this.dispose();
                    new ShopForm().setVisible(true);
                    }
            }
            else{
                JOptionPane.showMessageDialog(null, "user name and password not matched");
                nameField.setEditable(true);
                nameField.setText("");
                passField.setEditable(true);
                passField.setText("");
                
            }
                
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "user name and password not matched");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void passFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER) {
                    int i;
        String sql="select * from user where user_name=? and password=?";
        try{
            ResultSet rs;
            PreparedStatement pst =conn.prepareStatement(sql);
            pst.setString(1,nameField.getText());
            pst.setString(2,passField.getText());
            rs=pst.executeQuery();
            if(rs.next()){ //if any row exists after executing the query
                i=rs.getInt(5);
                if(i==1){
                    this.dispose();
                    new AEDSform().setVisible(true);
                }
                else{
                    this.dispose();
                    new ShopForm().setVisible(true);
                    }
            }
            else{
                JOptionPane.showMessageDialog(null, "user name and password not matched");
                nameField.setEditable(true);
                nameField.setText("");
                passField.setEditable(true);
                passField.setText("");
                
            }
                
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "user name and password not matched");
        }

            
        }
    }//GEN-LAST:event_passFieldKeyPressed

        // TODO Auto-generated method stub
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel password;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables

}

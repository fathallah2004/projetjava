package Pack ;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

import static Pack.LoginAdmin.verifEmail;
import static Pack.LoginAdmin.verifPassword;

public class LoginUser extends JFrame  implements ActionListener {
    JLabel email =new JLabel("email") ;
    JLabel password =new JLabel("Password");
    JTextField emailTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();
    JButton loginb = new JButton("login");
    JButton gobackb = new JButton("goback");
    JButton signupb = new JButton("signup");
    

    public LoginUser(){
        super("User Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,250);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        email.setBounds(50, 50, 100, 30);
        email.setFont(new  Font("Arial", Font.BOLD, 14) );
        add(email);

        emailTextField.setBounds(160, 50, 180, 30);
        emailTextField.setFont(new  Font("Arial", Font.BOLD, 14) );
        add(emailTextField);
        
        password.setBounds(50, 100, 100, 30);
        password.setFont(new  Font("Arial", Font.BOLD, 14) );
        add(password);

        passwordTextField.setBounds(160, 100, 180, 30);
        passwordTextField.setFont(new  Font("Arial", Font.BOLD, 14) );
        add(passwordTextField);

        loginb.setBounds(280, 175, 90, 30);
        signupb.setBounds(190, 175, 80, 30);
        gobackb.setBounds(10, 175, 90, 30);
        loginb.addActionListener(this);
        signupb.addActionListener(this);
        gobackb.addActionListener(this);
        add(loginb);
        add(signupb);
        add(gobackb);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==loginb){
            String emailS = emailTextField.getText();
            String pwdS = passwordTextField.getText();
            if((!verifEmail(emailS)) || (!verifPassword(pwdS))){
                JOptionPane.showMessageDialog(this, "Invalid email or password");
                emailTextField.setText("");
                passwordTextField.setText("");
            }
            else{
                try {
                    Class.forName("org.sqlite.JDBC");
                    Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Users/idris/OneDrive/Documents/GitHub/projetjava/Project/src/sqliteDataBaseDependencies/carRental.db");
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT email,password FROM Users where role='Client'");
                    boolean enter = false;
                    while (rs.next() && !enter) {
                        String email = rs.getString("email");
                        String password = rs.getString("password");
                        if(email.equals(emailS) && password.equals(pwdS)){
                            JOptionPane.showMessageDialog(this, "Welcome User");
                            enter = true;
                            dispose();
                        }
                    }
                    if(!enter){
                        JOptionPane.showMessageDialog(this, "User doesnt exist");
                        emailTextField.setText("");
                        passwordTextField.setText("");
                    }
                } catch (SQLException | ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        else if(e.getSource()==signupb){
            new UserSignup() ;
            dispose();
        }
        else if(e.getSource()==gobackb){
            new App() ;
            dispose();
        }

    }

}
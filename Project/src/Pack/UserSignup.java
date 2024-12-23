package Pack; 

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;
import javax.swing.*;
public class UserSignup extends JFrame implements ActionListener {
    JPanel p = new JPanel() ;
    JLabel name = new JLabel("name") ;
    JLabel governement = new JLabel("governement") ;
    JLabel email = new JLabel("email") ;
    JLabel password = new JLabel("password") ;
    GridBagConstraints gbc =new GridBagConstraints() ; 
    JTextField nameField = new JTextField(20);
    JTextField governementField = new JTextField(20);
    JTextField emailField = new JTextField(20);
    JTextField passwordField = new JTextField(20);


    public UserSignup() {
        super("user sign up") ;
        setSize(500,250);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        setResizable(false);
        setLocationRelativeTo(null);
        p.setLayout(new GridBagLayout());


        gbc.gridx = 2;
        gbc.gridy = 0;
        p.add(name,gbc) ;
        nameField.setFont(new Font("SansSerif", Font.PLAIN, 18));
        gbc.gridx = 2;
        gbc.gridy = 1;
        p.add(nameField, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        p.add(governement,gbc) ;
        governementField.setFont(new Font("SansSerif", Font.PLAIN, 18));
        gbc.gridx = 2;
        gbc.gridy = 4;
        p.add(governementField, gbc);

        gbc.gridx = 2;
        gbc.gridy = 5;
        p.add(email,gbc) ;
        emailField.setFont(new Font("SansSerif", Font.PLAIN, 18));
        gbc.gridx = 2;
        gbc.gridy = 6;
        p.add(emailField, gbc);

        gbc.gridx = 2;
        gbc.gridy = 7;
        p.add(password,gbc) ;
        passwordField.setFont(new Font("SansSerif", Font.PLAIN, 18));
        gbc.gridx = 2;
        gbc.gridy = 8;
        p.add(passwordField, gbc);

        setContentPane(p) ;
        setVisible(true);
        name.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        governement.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        email.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
        password.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));

      
       



        
        





    }

    public void actionPerformed(ActionEvent e) {
        
    }
}


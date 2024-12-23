package Pack; 

import java.awt.event.*;
import javax.swing.*;
public class UserSignup extends JFrame implements ActionListener {
    JPanel p = new JPanel() ;
    JLabel name = new JLabel("name") ;
    JLabel governement = new JLabel("governement") ;
    JLabel email = new JLabel("email") ;
    JLabel password = new JLabel("password") ;



    public UserSignup() {
        super("user sign up") ;
        setSize(500,250);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        setResizable(false);
        setLocationRelativeTo(null);
        
        p.add(name) ;
        p.add(governement) ;
        p.add(email) ;
        p.add(password) ;
        setContentPane(p) ;
        setVisible(true);



        
        





    }

    public void actionPerformed(ActionEvent e) {
        
    }
}


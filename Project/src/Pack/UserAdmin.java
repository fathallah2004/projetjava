package Pack ;
import javax.swing.*;

public class UserAdmin extends JFrame{
    JButton admin = new JButton ("ADMIN") ;
    JButton user = new JButton ("USER") ;
    public UserAdmin (){
        super("project");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300) ;
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        admin.setBounds(100, 60, 200, 60); 
        user.setBounds(100, 140, 200, 60);
        add(admin);
        add(user);



        setVisible(true);

    }

}

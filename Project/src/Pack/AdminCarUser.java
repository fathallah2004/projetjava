package Pack ;
import javax.swing.*;

public class AdminCarUser extends JFrame{
    JButton addcar = new JButton ("add car") ;
    JButton user = new JButton ("check user") ;
     JButton goback = new JButton("goback");


    public AdminCarUser (){
        super("AdminCarUser");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300) ;
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null); 

        addcar.setBounds(100, 60, 200, 50); 
        user.setBounds(100, 140, 200, 50);
        goback.setBounds(10, 225, 90, 30);
        add(goback);
        add(addcar);
        add(user);
        
       



        setVisible(true);

    }

}

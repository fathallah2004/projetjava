package Pack ;
import javax.swing.*;

public class AdminCarUser extends JFrame{
    JButton addcarb = new JButton ("add car") ;
    JButton userb = new JButton ("check user") ;
     JButton gobackb = new JButton("goback");


    public AdminCarUser (){
        super("Admin Car User Check");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300) ;
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null); 

        addcarb.setBounds(100, 60, 200, 50);
        userb.setBounds(100, 140, 200, 50);
        gobackb.setBounds(10, 225, 90, 30);
        add(gobackb);
        add(addcarb);
        add(userb);
        setVisible(true);

    }

}

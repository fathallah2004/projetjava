package Pack ;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminCarUser extends JFrame implements ActionListener{
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
        addcarb.addActionListener(this);
        userb.addActionListener(this);
        gobackb.addActionListener(this);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==addcarb){
            new addCar() ;
        }
        else if(e.getSource()==userb){
            System.out.println("check user");
        }
        else if(e.getSource()==gobackb){
            new App();
        }
        dispose();
    }

}

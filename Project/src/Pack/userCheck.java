package Pack ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class userCheck extends JFrame implements ActionListener {
    JButton modify = new JButton ("Modify your acount") ;
    JButton car = new JButton ("Find you car") ;
    JButton goBackButton = new JButton("Go Back");
    public userCheck(){
        super("user choice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300) ;
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        modify.setBounds(100, 60, 200, 60);
        modify.addActionListener(this);
        car.setBounds(100, 140, 200, 60);
        car.addActionListener(this);
        goBackButton.setBounds(10, 225, 100, 30);
        goBackButton.addActionListener(this);
        add(modify);
        add(goBackButton);
        add(car);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==modify){
            new LoginUser() ;
        }
        else if(e.getSource()==goBackButton){
            new LoginUser() ;
        }
        else if(e.getSource()==car){
            new LoginUser() ;
        }
        dispose();
    }

}

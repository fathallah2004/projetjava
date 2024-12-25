package Pack ;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame implements ActionListener {
    JButton adminb = new JButton ("ADMIN") ;
    JButton userb = new JButton ("USER") ;
    public App(){
        super("Cars Retail");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300) ;
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        adminb.setBounds(100, 60, 200, 60);
        adminb.addActionListener(this);
        userb.setBounds(100, 140, 200, 60);
        userb.addActionListener(this);
        add(adminb);
        add(userb);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==adminb){
            new LoginAdmin() ;
        }
        else if(e.getSource()==userb){
            new LoginUser() ;
        }
        dispose();
    }

}

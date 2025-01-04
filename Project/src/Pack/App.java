package Pack ;
import Pack.Admin.LoginAdmin;
import Pack.User.LoginUser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

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
        /*update cars,rents
        * set status='avaialc
        * where cars.mat=rent.car and cars.status="Rented" and rents.returndate>=currentdate
        *
        * delete rents*/
        if(e.getSource()==adminb){
            try {
                new LoginAdmin() ;
            } catch (SQLException | ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
        else if(e.getSource()==userb){
            new LoginUser() ;
        }
        dispose();
    }

}

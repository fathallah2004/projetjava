package Pack;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AdminCarUser extends JFrame implements ActionListener {
    JButton addcarb = new JButton("Add Car");
    JButton userb = new JButton("Check User");
    JButton checkcarb = new JButton("Check Car");
    JButton gobackb = new JButton("Go Back");

    public AdminCarUser() {
        super("Admin Car User Check");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400); // Augmenter la taille pour inclure le nouveau bouton
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        addcarb.setBounds(100, 60, 200, 50);
        userb.setBounds(100, 140, 200, 50);
        checkcarb.setBounds(100, 220, 200, 50); // Position du nouveau bouton
        gobackb.setBounds(10, 325, 90, 30); // Ajuster pour la nouvelle taille
        add(addcarb);
        add(userb);
        add(checkcarb); // Ajouter le nouveau bouton
        add(gobackb);

        addcarb.addActionListener(this);
        userb.addActionListener(this);
        checkcarb.addActionListener(this); // Ajouter un écouteur pour le nouveau bouton
        gobackb.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addcarb) {
            new addCar(); // Corrigé pour appeler la classe AddCar
        } else if (e.getSource() == userb) {
            System.out.println("Check User");
        } else if (e.getSource() == checkcarb) {
            System.out.println("Check Car"); // Action pour le bouton Check Car
        } else if (e.getSource() == gobackb) {
            new App();
        }
        dispose();
    }
}

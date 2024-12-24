package Pack;

import java.awt.Font;
import javax.swing.*;

public class addCar extends JFrame {
    JLabel marque = new JLabel("Marque");
    JLabel model = new JLabel("Model");
    JLabel prix = new JLabel("Prix");
    JLabel etat = new JLabel("etat");
    JLabel couleur = new JLabel("Couleur");
    JLabel matricule = new JLabel("Matricule");
    JLabel tunis = new JLabel("تونس");
    
    JTextField marqueField = new JTextField(20);
    JTextField modelField = new JTextField(20);
    JTextField prixField = new JTextField(20);
    JTextField etatField = new JTextField(20);
    JTextField couleurField = new JTextField(20);
    JTextField matriculeField1 = new JTextField(20);
    JTextField matriculeField2 = new JTextField(20);
    
    
    
    
    
   
    JButton addcar = new JButton("Add Car");
    JButton goback = new JButton("goback");



    public addCar() {
        super("add Car");
        setSize(500, 435);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        marque.setBounds(50, 30, 100, 30);
        marque.setFont(new Font("Arial", Font.BOLD, 14));
        add(marque);

        marqueField.setBounds(180, 30, 210, 30);
        marqueField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(marqueField);

        model.setBounds(50, 80, 100, 30);
        model.setFont(new Font("Arial", Font.BOLD, 14));
        add(model);

        modelField.setBounds(180, 80, 210, 30);
        modelField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(modelField);

        prix.setBounds(50, 130, 100, 30);
        prix.setFont(new Font("Arial", Font.BOLD, 14));
        add(prix);

        prixField.setBounds(180, 130, 210, 30);
        prixField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(prixField);

        etat.setBounds(50, 180, 100, 30);
        etat.setFont(new Font("Arial", Font.BOLD, 14));
        add(etat);

        etatField.setBounds(180, 180, 210, 30);
        etatField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(etatField);

        couleur.setBounds(50, 230, 100, 30);
        couleur.setFont(new Font("Arial", Font.BOLD, 14));
        add(couleur);

        couleurField.setBounds(180, 230, 210, 30);
        couleurField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(couleurField);

        matricule.setBounds(50, 280, 120, 30);
        matricule.setFont(new Font("Arial", Font.BOLD, 14));
        add(matricule);

        matriculeField1.setBounds(180, 280, 80, 30);
        matriculeField1.setFont(new Font("Arial", Font.PLAIN, 14));
        add(matriculeField1);
        
        tunis.setBounds(270, 280, 60, 30);;
        tunis.setFont(new Font("Arial", Font.BOLD, 14));
        add(tunis);

        

        matriculeField2.setBounds(310, 280, 80, 30);
        matriculeField2.setFont(new Font("Arial", Font.PLAIN, 14));
        add(matriculeField2);

       


        addcar.setBounds(370, 350, 100, 30);
        goback.setBounds(20, 350, 100, 30);

        add(addcar);
        add(goback);
        



        setVisible(true);
    }

    public static void main(String[] args) {
        new UserSignup();
    }
}

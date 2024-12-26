package Pack;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class addCar extends JFrame implements ActionListener{
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

        addcar.addActionListener(this);
        goback.addActionListener(this); 



        add(addcar);
        add(goback);
        
        



        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == addcar) {
        
        String marqueS = marqueField.getText();
        String modelS = modelField.getText();
        String prixS = prixField.getText();
        String etatS = etatField.getText();
        String couleurS = couleurField.getText();
        String matricule1S = matriculeField1.getText();
        String matricule2S = matriculeField2.getText();

        
        if (marqueS.isEmpty() || modelS.isEmpty() || prixS.isEmpty() || etatS.isEmpty() || couleurS.isEmpty() || matricule1S.isEmpty() || matricule2S.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Check your information, please.");
        } 
        
        else if (!verifmarticule(matricule1S, matricule2S)) {
            matriculeField1.setText("");
            matriculeField2.setText("");
            JOptionPane.showMessageDialog(this, "Check matriculation number, please.");
        } 
        
        else if (!isNumber(prixS)) {
            prixField.setText("");
            JOptionPane.showMessageDialog(this, "Check your price, please.");
        } 
        else {
            try {
                Class.forName("org.sqlite.JDBC");
                Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Users/idris/OneDrive/Documents/GitHub/projetjava/Project/src/sqliteDataBaseDependencies/carRental.db");
                Statement stmt = con.createStatement();
                int nb=stmt.executeUpdate("INSERT INTO Cars (brand, model, price, status, color, mat) VALUES ('" + marqueS + "','" + modelS + "','" + prixS + "','" + etatS + "','" + couleurS + "','" + matricule1S + matricule2S +"')");
                JOptionPane.showMessageDialog(this, "Car added successfully.");
                marqueField.setText("");
                modelField.setText("");
                prixField.setText("");
                etatField.setText("");
                couleurField.setText("");
                matriculeField1.setText("");
                matriculeField2.setText("");
            } catch (ClassNotFoundException | SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
            
    }
    else if(e.getSource()==goback){
            new AdminCarUser() ;
            dispose();
        }
}


public static boolean isNumber(String input) {
    try {
        Double.parseDouble(input);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}


public boolean verifmarticule(String input1, String input2) {
    int matricule1 = -1;
    int matricule2 = -1;
    try {
        matricule1 = Integer.parseInt(input1);
        matricule2 = Integer.parseInt(input2);
    } catch (NumberFormatException ex) {
        return false; 
    }

    if (matricule1 < 0 || matricule1 > 400 || matricule2 < 0 || matricule2 >= 10000) {
        return false; 
    }
    return true; 
}
}

package Pack;

import static Pack.LoginAdmin.verifEmail;
import static Pack.addCar.isNumber;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class checkUser extends JFrame implements ActionListener {

    JLabel name = new JLabel("Name");
    JLabel surname = new JLabel("Surname");
    JLabel country = new JLabel("Country");
    JLabel phone = new JLabel("Phone Number");
    JLabel email = new JLabel("Email");
    JLabel login = new JLabel("Login");
    JLabel gender = new JLabel("Gender");

    JTextField nameField = new JTextField(20);
    JTextField surnameField = new JTextField(20);
    JTextField countryField = new JTextField(20);
    JTextField phoneField = new JTextField(20);
    JTextField emailField = new JTextField(20);
    JTextField loginField = new JTextField(20);
    JRadioButton maleRadio = new JRadioButton("Male");
    JRadioButton femaleRadio = new JRadioButton("Female");
    ButtonGroup genderGroup = new ButtonGroup();
    JButton searchb = new JButton("Search");
    JButton gobackb = new JButton("Go Back");

    public checkUser() {
        super("User Sign Up");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        name.setBounds(50, 50, 100, 30);
        nameField.setBounds(180, 50, 200, 30);
        add(name);
        add(nameField);

        surname.setBounds(50, 100, 100, 30);
        surnameField.setBounds(180, 100, 200, 30);
        add(surname);
        add(surnameField);

        country.setBounds(50, 150, 100, 30);
        countryField.setBounds(180, 150, 200, 30);
        add(country);
        add(countryField);

        phone.setBounds(50, 200, 120, 30);
        phoneField.setBounds(180, 200, 200, 30);
        add(phone);
        add(phoneField);

        email.setBounds(50, 250, 100, 30);
        emailField.setBounds(180, 250, 200, 30);
        add(email);
        add(emailField);

        login.setBounds(50, 300, 100, 30);
        loginField.setBounds(180, 300, 200, 30);
        add(login);
        add(loginField);

        gender.setBounds(50, 350, 100, 30);
        maleRadio.setBounds(180, 350, 80, 30);
        femaleRadio.setBounds(280, 350, 80, 30);
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        add(gender);
        add(maleRadio);
        add(femaleRadio);

        searchb.setBounds(370 ,400, 100, 30);
        gobackb.setBounds(15, 400, 100, 30);
        add(searchb);
        add(gobackb);

        searchb.addActionListener(this);
        gobackb.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == searchb) {
            String emailS = emailField.getText();
            String loginS = loginField.getText();
            String nameS = nameField.getText();
            String surnameS = surnameField.getText();
            String telS = phoneField.getText();
            String g = "M";
            if (femaleRadio.isSelected()) {
                g = "F";
            }

            if (!verifEmail(emailS) || loginS.isEmpty() || nameS.isEmpty() || surnameS.isEmpty() || !isNumber(telS) || telS.length() != 8) {
                JOptionPane.showMessageDialog(this, "Check your informations please.");
            } else if (!maleRadio.isSelected() && !femaleRadio.isSelected()) {
                JOptionPane.showMessageDialog(this, "Select the gender");
            } else {
                try {
                    Class.forName("org.sqlite.JDBC");
                    Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Users/idris/OneDrive/Documents/GitHub/projetjava/Project/src/sqliteDataBaseDependencies/carRental.db");
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate("INSERT INTO Users (name, surname, email, password, phone, country, sex, role) " +
                            "VALUES ('" + nameS + "','" + surnameS + "','" + emailS + "','" + telS + "','Tunisia','" + g + "','Client')");
                } catch (SQLException | ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                JOptionPane.showMessageDialog(this, "Sign up successful");
                dispose();
                new LoginUser();
            }
        } else if (e.getSource() == gobackb) {
            new LoginUser();
            dispose();
        }
    }
}

package Pack;

import java.awt.Font;
import javax.swing.*;

public class UserSignup extends JFrame {
    JLabel name = new JLabel("Name");
    JLabel surname = new JLabel("Surname");
    JLabel nationality = new JLabel("Nationality");
    JLabel country = new JLabel("Country");
    JLabel address = new JLabel("Address");
    JLabel phone = new JLabel("Phone Number");
    JLabel email = new JLabel("Email");
    JLabel password = new JLabel("Password");
    JLabel verifyPassword = new JLabel("Verify Password");
    JLabel robotCheck = new JLabel("I am not a robot");
    JLabel gender = new JLabel("Gender");

    JTextField nameField = new JTextField(20);
    JTextField surnameField = new JTextField(20);
    JTextField nationalityField = new JTextField(20);
    JTextField countryField = new JTextField(20);
    JTextField addressField = new JTextField(20);
    JTextField phoneField = new JTextField(20);
    JTextField emailField = new JTextField(20);
    JPasswordField passwordField = new JPasswordField(20);
    JPasswordField verifyPasswordField = new JPasswordField(20);
    JCheckBox robotCheckBox = new JCheckBox();
    JRadioButton maleRadio = new JRadioButton("Male");
    JRadioButton femaleRadio = new JRadioButton("Female");
    ButtonGroup genderGroup = new ButtonGroup();
    JButton signup = new JButton("signup");
    JButton goback = new JButton("goback");



    public UserSignup() {
        super("User Sign Up");
        setSize(500, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        name.setBounds(50, 30, 100, 30);
        name.setFont(new Font("Arial", Font.BOLD, 14));
        add(name);

        nameField.setBounds(180, 30, 200, 30);
        nameField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(nameField);

        surname.setBounds(50, 80, 100, 30);
        surname.setFont(new Font("Arial", Font.BOLD, 14));
        add(surname);

        surnameField.setBounds(180, 80, 200, 30);
        surnameField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(surnameField);

        nationality.setBounds(50, 130, 100, 30);
        nationality.setFont(new Font("Arial", Font.BOLD, 14));
        add(nationality);

        nationalityField.setBounds(180, 130, 200, 30);
        nationalityField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(nationalityField);

        country.setBounds(50, 180, 100, 30);
        country.setFont(new Font("Arial", Font.BOLD, 14));
        add(country);

        countryField.setBounds(180, 180, 200, 30);
        countryField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(countryField);

        address.setBounds(50, 230, 100, 30);
        address.setFont(new Font("Arial", Font.BOLD, 14));
        add(address);

        addressField.setBounds(180, 230, 200, 30);
        addressField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(addressField);

        phone.setBounds(50, 280, 120, 30);
        phone.setFont(new Font("Arial", Font.BOLD, 14));
        add(phone);

        phoneField.setBounds(180, 280, 200, 30);
        phoneField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(phoneField);

        email.setBounds(50, 330, 100, 30);
        email.setFont(new Font("Arial", Font.BOLD, 14));
        add(email);

        emailField.setBounds(180, 330, 200, 30);
        emailField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(emailField);

        password.setBounds(50, 380, 100, 30);
        password.setFont(new Font("Arial", Font.BOLD, 14));
        add(password);

        passwordField.setBounds(180, 380, 200, 30);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(passwordField);

        verifyPassword.setBounds(50, 430, 150, 30);
        verifyPassword.setFont(new Font("Arial", Font.BOLD, 14));
        add(verifyPassword);

        verifyPasswordField.setBounds(180, 430, 200, 30);
        verifyPasswordField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(verifyPasswordField);

        robotCheck.setBounds(50, 530, 200, 30);
        robotCheck.setFont(new Font("Arial", Font.PLAIN, 14));
        add(robotCheck);

        robotCheckBox.setBounds(180, 530, 20, 20);
        add(robotCheckBox);
        
        gender.setBounds(50, 480, 100, 30);
        gender.setFont(new Font("Arial", Font.BOLD, 14));
        add(gender);

        maleRadio.setBounds(160, 480, 80, 30);
        maleRadio.setFont(new Font("Arial", Font.PLAIN, 14));
        genderGroup.add(maleRadio);
        add(maleRadio);

        femaleRadio.setBounds(250, 480, 80, 30);
        femaleRadio.setFont(new Font("Arial", Font.PLAIN, 14));
        genderGroup.add(femaleRadio);
        add(femaleRadio);


        signup.setBounds(320, 560, 100, 30);
        goback.setBounds(80, 560, 100, 30);

        add(signup);
        add(goback);
        



        setVisible(true);
    }

    public static void main(String[] args) {
        new UserSignup();
    }
}

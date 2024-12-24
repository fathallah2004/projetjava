package Pack ;
import java.awt.Font;
import javax.swing.*; 
public class Login extends JFrame {
    JLabel email =new JLabel("email") ;
    JLabel password =new JLabel("Password");
    JTextField emailTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();
    JButton login = new JButton("login");
    JButton goback = new JButton("goback");
    JButton signup = new JButton("signup");
    

    public Login (){
        super("login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,250);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        email.setBounds(50, 50, 100, 30);
        email.setFont(new  Font("Arial", Font.BOLD, 14) );
        add(email);

        emailTextField.setBounds(160, 50, 180, 30);
        emailTextField.setFont(new  Font("Arial", Font.BOLD, 14) );
        add(emailTextField);
        
        password.setBounds(50, 100, 100, 30);
        password.setFont(new  Font("Arial", Font.BOLD, 14) );
        add(password);

        passwordTextField.setBounds(160, 100, 180, 30);
        passwordTextField.setFont(new  Font("Arial", Font.BOLD, 14) );
        add(passwordTextField);

        login.setBounds(280, 175, 90, 30);
        signup.setBounds(190, 175, 80, 30);
        goback.setBounds(10, 175, 90, 30);

        add(login);
        add(signup);
        add(goback);



        setVisible(true);

    }


}
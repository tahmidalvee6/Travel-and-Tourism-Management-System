package travel.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame {
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton, signUpButton, forgotPasswordButton;

    Login() {
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(350, 200, 900, 400);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(131, 193, 233));
        panel.setBounds(0, 0, 400, 400);
        panel.setLayout(null);
        add(panel);

        // ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/login(1).png"));
        // Image image = icon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        // JLabel label = new JLabel(new ImageIcon(image));
        // label.setBounds(100, 120, 200, 200);
        // panel.add(label);

        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(450, 20, 100, 25);
        add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(550, 20, 150, 25);
        add(usernameField);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(450, 60, 100, 25);
        add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(550, 60, 150, 25);
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(550, 110, 100, 25);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        
        add(loginButton);

        signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(660, 110, 100, 25);
        signUpButton.setBackground(Color.BLACK);
        signUpButton.setForeground(Color.WHITE);
        
        add(signUpButton);

        forgotPasswordButton = new JButton("Forgot Password");
        forgotPasswordButton.setBounds(550, 150, 210, 25);
        forgotPasswordButton.setBackground(Color.BLACK);
        forgotPasswordButton.setForeground(Color.WHITE);
        
        add(forgotPasswordButton);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == loginButton) {
            
            
        } else if (ae.getSource() == signUpButton) {
            setVisible(false);
            //new SignUp();
        } else if (ae.getSource() == forgotPasswordButton) {
            setVisible(false);
            //new ForgotPassword();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}










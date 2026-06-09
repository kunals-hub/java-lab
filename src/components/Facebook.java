package components;

import java.awt.*;
import javax.swing.*;

public class Facebook extends JFrame{
    private JLabel emailLabel;
    private JTextField email;
    private JLabel passwordLabel;
    private JTextField password;
    private JButton logIn;
    private JButton forgotPassword;
    private JButton createNewAccount;

    public  Facebook() {
        setLayout(new FlowLayout());

        emailLabel = new JLabel("Email or mobile number");
        email = new JTextField(20);
        passwordLabel = new JLabel("Password");
        password = new JTextField(20);

        logIn = new JButton("Log in");
        forgotPassword = new JButton("Forgot Password");
        createNewAccount = new JButton("Create Account");

        // add compnonents to JFrame
        add(emailLabel);
        add(email);
        add(passwordLabel);
        add(password);
        add(logIn);
        add(forgotPassword);
        add(createNewAccount);

        setTitle("Log into Facebook");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Facebook();
    }

}

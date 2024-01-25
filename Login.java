import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
public class Login extends JFrame{
    Login(){
        setSize(350, 450);
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setLayout(null);

        JPanel top=new JPanel();
        top.setBounds(0,0,350,60);
        top.setBackground(new Color(36,36,36));
        top.setLayout(null);
        add(top);

        JLabel heading= new JLabel("USER LOGIN");
        heading.setBounds(110,20,200,20);
        heading.setForeground(Color.white);
        heading.setFont(new Font("raleway", Font.BOLD, 18));
        top.add(heading); 

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("images/user.jpeg"));
        Image i2= i.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel i4= new JLabel(i3);
        i4.setBounds(125,60, 80,80);
        add(i4);

        JLabel user_name =new JLabel("Username");
        user_name.setBounds(40, 140, 100, 16);
        user_name.setFont(new Font("raleway", Font.BOLD, 16));
        add(user_name);

        JLabel password =new JLabel("Password");
        password.setBounds(40, 220, 100, 16);
        password.setFont(new Font("raleway", Font.BOLD, 16));
        add(password);

        JTextField userField =new JTextField();
        userField.setBounds(40, 170, 250, 30);
        add(userField);

        JPasswordField passField =new JPasswordField();
        passField.setBounds(40, 250, 250, 30);
        add(passField);

        JButton login = new JButton("Login");
        login.setBounds(40, 310, 100, 30);
        login.setBackground(new Color(36,36,36));
        login.setForeground(Color.white);
        add(login);

        JButton signup = new JButton("Sign Up");
        signup.setBounds(190, 310, 100, 30);
        signup.setBackground(new Color(36,36,36));
        signup.setForeground(Color.white);
        add(signup);

        JButton forgot = new JButton("Forgot Password ?");
        forgot.setBounds(90, 360, 150, 30);
        forgot.setBackground(new Color(36,36,36));
        forgot.setForeground(Color.white);
        add(forgot);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
}

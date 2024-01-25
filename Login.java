// import java.awt.Color;
// import java.awt.Font;
// import java.awt.Image;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;
public class Login extends JFrame implements ActionListener{
    JButton login, signup, forgot;
    JTextField userField;
    JPasswordField passField;
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

        userField =new JTextField();
        userField.setBounds(40, 170, 250, 30);
        add(userField);

        passField =new JPasswordField();
        passField.setBounds(40, 250, 250, 30);
        add(passField);

        login = new JButton("Login");
        login.setBounds(40, 310, 100, 30);
        login.setBackground(new Color(36,36,36));
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        signup = new JButton("Sign Up");
        signup.setBounds(190, 310, 100, 30);
        signup.setBackground(new Color(36,36,36));
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);

        forgot = new JButton("Forgot Password ?");
        forgot.setBounds(90, 360, 150, 30);
        forgot.setBackground(new Color(36,36,36));
        forgot.setForeground(Color.white);
        forgot.addActionListener(this);
        add(forgot);

        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login){
            if(userField.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please anter name and Password");
            }else{
                Conn c= new Conn();
                try {
                    ResultSet r= c.s.executeQuery("select * from sign where username = '"+userField.getText()+"' AND password = '"+passField.getText()+"'");
                    if (r.next()) {
                        JOptionPane.showMessageDialog(null, "Login sussessful");
                        setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(null, "Name or Password wrong");
                    }
                } catch (Exception f) {
                    System.out.println(f);
                }
            }
        }else if(e.getSource()==signup){
            setVisible(false);
            new Signup();
        }else{
            setVisible(false);
            new Forgot();
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}

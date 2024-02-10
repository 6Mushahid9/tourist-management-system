import java.awt.*;

import javax.swing.*;
public class Dashboard extends JFrame{
    JButton logout, profile, hotel, payment, notepad, calc;
    Dashboard(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("images/main.jpg"));
        Image i2= i.getImage().getScaledInstance((int)width-20,(int)height-65, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4  =new JLabel(i3);
        i4.setBounds(0,80,(int)width,(int)height-150);
        add(i4);

        JPanel p1= new JPanel();
        p1.setBounds(0,0, (int)width,80);
        p1.setLayout(null);
        p1.setBackground(new Color(71,196,202));
        add(p1);

        ImageIcon l = new ImageIcon(ClassLoader.getSystemResource("images/logo.png"));
        Image l2= l.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
        ImageIcon l3 = new ImageIcon(l2);
        JLabel l4  =new JLabel(l3);
        l4.setBounds(20,5,70,70);
        p1.add(l4);

        JLabel logo= new JLabel("Mushahid");
        logo.setBounds(110,30,100,20);
        logo.setFont(new Font("Raleway", Font.BOLD, 20));
        logo.setForeground(new Color(228,111,68));
        p1.add(logo);

        JLabel name= new JLabel("TRAVEL MANAGEMENT SYSTEMS");
        name.setBounds(400,30,500,30);
        name.setFont(new Font("raleway", Font.BOLD, 30));
        name.setForeground(Color.white);
        p1.add(name);

        logout = new JButton("Logout");
        logout.setBounds(1170,25,100,30);
        logout.setBackground(new Color(71,196,202));
        logout.setForeground(Color.black);
        // logout.setForeground(new Color(228,111,68));
        logout.setFont(new Font("raleway", Font.PLAIN, 20));
        p1.add(logout);

        profile = new JButton("Acount");
        profile.setBounds(30,20,160,50);
        profile.setBackground(Color.green);
        profile.setForeground(Color.red);
        i4.add(profile);

        hotel = new JButton("hotel");
        hotel.setBounds(30,90,160,50);
        profile.setBackground(Color.green);
        profile.setForeground(Color.red);
        i4.add(hotel);

        notepad = new JButton("notepad");
        notepad.setBounds(30,160,160,50);
        profile.setBackground(Color.green);
        profile.setForeground(Color.red);
        i4.add(notepad);

        calc = new JButton("Calculator");
        calc.setBounds(30,230,160,50);
        profile.setBackground(Color.green);
        profile.setForeground(Color.red);
        i4.add(calc);

        payment = new JButton("Payment");
        payment.setBounds(30,300,160,50);
        profile.setBackground(Color.green);
        profile.setForeground(Color.red);
        i4.add(payment);

        notepad = new JButton("notepad");
        notepad.setBounds(30,370,160,50);
        profile.setBackground(Color.green);
        profile.setForeground(Color.red);
        i4.add(notepad);

        calc = new JButton("Calculator");
        calc.setBounds(30,440,160,50);
        profile.setBackground(Color.green);
        profile.setForeground(Color.red);
        i4.add(calc);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Dashboard();
    }
}

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener{
    JButton logout, profile, editProfile, hotel, packages, destination, payment, notepad, calc, about, remove;
    String username;
    Dashboard(String username){
        this.username= username;
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

        JLabel logo= new JLabel("By Mushahid");
        logo.setBounds(110,30,200,20);
        logo.setFont(new Font("Raleway", Font.BOLD, 20));
        logo.setForeground(new Color(228,111,68));
        p1.add(logo);

        JLabel  appname= new JLabel("TRAVEL MANAGEMENT SYSTEMS");
        appname.setBounds(400,30,500,30);
        appname.setFont(new Font("raleway", Font.BOLD, 30));
        appname.setForeground(Color.white);
        p1.add(appname);

        JLabel name= new JLabel(username);
        name.setBounds(1130,15,150,20);
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setForeground(new Color(228,111,68));
        p1.add(name);

        logout = new JButton("Logout");
        logout.setBounds(1170,40,100,30);
        logout.setBackground(new Color(71,196,202));
        logout.setForeground(Color.black);
        // logout.setForeground(new Color(228,111,68));
        logout.setFont(new Font("raleway", Font.PLAIN, 20));
        logout.addActionListener(this);
        p1.add(logout);

// *********************************************************

        editProfile = new JButton("Edit Details");
        editProfile.setBounds(30,20,160,50);
        editProfile.setBackground(new Color(168, 50, 87));
        editProfile.setForeground(Color.white);
        editProfile.addActionListener(this);
        i4.add(editProfile);

        profile = new JButton("User Details");
        profile.setBounds(200,20,160,50);
        profile.setBackground(new Color(168, 50, 87));
        profile.setForeground(Color.white);
        profile.addActionListener(this);
        i4.add(profile);

        packages = new JButton("Packages");
        packages.setBounds(30,90,160,50);
        packages.setBackground(new Color(168, 50, 87));
        packages.setForeground(Color.white);
        packages.addActionListener(this);
        i4.add(packages);

        hotel = new JButton("Hotels");
        hotel.setBounds(30,160,160,50);
        hotel.setBackground(new Color(168, 50, 87));
        hotel.setForeground(Color.white);
        hotel.addActionListener(this);
        i4.add(hotel);

        destination = new JButton("Destinations");
        destination.setBounds(30,230,160,50);
        destination.setBackground(new Color(168, 50, 87));
        destination.setForeground(Color.white);
        destination.addActionListener(this);
        i4.add(destination);

        payment = new JButton("Payment");
        payment.setBounds(30,300,160,50);
        payment.setBackground(new Color(168, 50, 87));
        payment.setForeground(Color.white);
        payment.addActionListener(this);
        i4.add(payment);

        notepad = new JButton("notepad");
        notepad.setBounds(30,370,160,50);
        notepad.setBackground(new Color(168, 50, 87));
        notepad.setForeground(Color.white);
        notepad.addActionListener(this);
        i4.add(notepad);

        calc = new JButton("Calculator");
        calc.setBounds(30,440,160,50);
        calc.setBackground(new Color(168, 50, 87));
        calc.setForeground(Color.white);
        calc.addActionListener(this);
        i4.add(calc);

        about = new JButton("About");
        about.setBounds(30,510,160,50);
        about.setBackground(new Color(168, 50, 87));
        about.setForeground(Color.white);
        about.addActionListener(this);
        i4.add(about);

        remove = new JButton("Delete Account");
        remove.setBounds(1100,510,160,50);
        remove.setBackground(new Color(168, 50, 87));
        remove.setForeground(Color.white);
        remove.addActionListener(this);
        i4.add(remove);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==logout){
            setVisible(false);
            new Login();
        }else if(e.getSource()==editProfile){
            new EditProfile(username);
        }else if(e.getSource()==profile){
            new Profile(username);
        }else if(e.getSource()==hotel){
            
        }else if(e.getSource()==packages){
            new Packages();
        }else if(e.getSource()==destination){
            
        }else if(e.getSource()==payment){
            new Payment();
        }else if(e.getSource()==notepad){
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }else if(e.getSource()==calc){
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }else if(e.getSource()==about){
            new About();
        }else if(e.getSource()==remove){
            new Remove(username);
        }
    }

    public static void main(String[] args) {
        new Dashboard("Shamikh");
    }
}

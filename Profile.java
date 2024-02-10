import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;

public class Profile extends JFrame implements ActionListener{
    JButton back;
    String username;
    Profile(String username){
        this.username= username;
        setSize(650, 500);
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setLayout(null);

        ImageIcon i= new ImageIcon(ClassLoader.getSystemResource("images/detail.jpeg"));
        Image i2 = i.getImage().getScaledInstance(250, 330, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel i4= new JLabel(i3);
        i4.setBounds(370,50,250,330);
        add(i4);

        JLabel userName= new JLabel("User Name : ");
        userName.setBounds(50, 10, 100,30);
        add(userName);
        JLabel nameData= new JLabel();
        nameData.setBounds(150, 10, 100,30);
        add(nameData);

        JLabel id= new JLabel("ID : ");
        id.setBounds(50, 60, 100,30);
        add(id);
        JLabel idData= new JLabel();
        idData.setBounds(150, 60, 100,30);
        add(idData);

        JLabel number= new JLabel("Number : ");
        number.setBounds(50, 110, 100,30);
        add(number);
        JLabel numberData= new JLabel();
        numberData.setBounds(150, 110, 100,30);
        add(numberData);

        JLabel gender= new JLabel("Gender : ");
        gender.setBounds(50, 160, 100,30);
        add(gender);
        JLabel genderData= new JLabel();
        genderData.setBounds(150, 160, 100,30);
        add(genderData);

        JLabel country= new JLabel("Country : ");
        country.setBounds(50, 210, 100,30);
        add(country);
        JLabel countryData= new JLabel();
        countryData.setBounds(150, 210, 100,30);
        add(countryData);

        JLabel address= new JLabel("Address : ");
        address.setBounds(50, 260, 100,30);
        add(address);
        JLabel addressData= new JLabel();
        addressData.setBounds(150, 260, 200,30);
        add(addressData);

        JLabel phone= new JLabel("Phone : ");
        phone.setBounds(50, 310, 100,30);
        add(phone);
        JLabel phoneData= new JLabel();
        phoneData.setBounds(150, 310, 100,30);
        add(phoneData);

        JLabel email= new JLabel("E-mial : ");
        email.setBounds(50, 360, 100,30);
        add(email);
        JLabel emailData= new JLabel();
        emailData.setBounds(150, 360, 200,30);
        add(emailData);

        back = new JButton("Back");
        back.setBounds(200, 420, 100, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        Conn c= new Conn();
        String query= "select * from userDetail where username = '"+username+"'";
        try{
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                nameData.setText(rs.getString("username"));
                idData.setText(rs.getString("id"));
                numberData.setText(rs.getString("number"));
                genderData.setText(rs.getString("gender"));
                countryData.setText(rs.getString("country"));
                addressData.setText(rs.getString("address"));
                phoneData.setText(rs.getString("phone"));
                emailData.setText(rs.getString("email"));
            }
        }catch (Exception f){
            System.out.println(f);
        }
        setVisible(true);
    }
    public static void main(String[] args) {
        new Profile("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }
}

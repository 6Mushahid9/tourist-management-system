import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EditProfile extends JFrame implements ActionListener{
    JRadioButton male, female;
    JTextField numberField, countryField, addressField, phoneField, emailField;
    JComboBox ids;
    JButton done, back;
    String username;
    EditProfile(String username){
        this.username=username;
        setSize(650, 500);
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setLayout(null);

        ImageIcon i= new ImageIcon(ClassLoader.getSystemResource("images/account.png"));
        Image i2 = i.getImage().getScaledInstance(180, 330, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel i4= new JLabel(i3);
        i4.setBounds(370,50,180,330);
        add(i4);

        JLabel userName= new JLabel("User Name : ");
        userName.setBounds(50, 10, 100,30);
        add(userName);
        JLabel user= new JLabel(username);
        user.setBounds(150, 10, 100,30);
        add(user);

        JLabel id= new JLabel("ID : ");
        id.setBounds(50, 60, 100,30);
        add(id);
        ids = new JComboBox<>(new String[] {"Adhaar Card", "Passport", "PAN number"});
        ids.setBounds(150, 60, 200, 25);
        ids.setBackground(Color.white);
        add(ids);

        JLabel number= new JLabel("Number : ");
        number.setBounds(50, 110, 100,30);
        add(number);
        numberField = new JTextField();
        numberField.setBounds(150, 110, 200, 25);
        add(numberField);

        JLabel gender= new JLabel("Gender : ");
        gender.setBounds(50, 160, 100,30);
        add(gender);
        male= new JRadioButton("Male");
        male.setBounds(150, 160, 100, 25);
        male.setBackground(Color.white);
        add(male);
        female= new JRadioButton("Female");
        female.setBounds(260, 160, 100, 25);
        female.setBackground(Color.white);
        add(female);
        ButtonGroup bg= new ButtonGroup();
        bg.add(male);
        bg.add(female);

        JLabel country= new JLabel("Country : ");
        country.setBounds(50, 210, 100,30);
        add(country);
        countryField = new JTextField();
        countryField.setBounds(150, 210, 200, 25);
        add(countryField);

        JLabel address= new JLabel("Address : ");
        address.setBounds(50, 260, 100,30);
        add(address);
        addressField = new JTextField();
        addressField.setBounds(150, 260, 200, 25);
        add(addressField);

        JLabel phone= new JLabel("Phone : ");
        phone.setBounds(50, 310, 100,30);
        add(phone);
        phoneField = new JTextField();
        phoneField.setBounds(150, 310, 200, 25);
        add(phoneField);

        JLabel email= new JLabel("E-mial : ");
        email.setBounds(50, 360, 100,30);
        add(email);
        emailField = new JTextField();
        emailField.setBounds(150, 360, 200, 25);
        add(emailField);
        
        done = new JButton("Done");
        done.setBounds(60, 420, 100, 30);
        done.setBackground(Color.black);
        done.setForeground(Color.white);
        done.addActionListener(this);
        add(done);

        back = new JButton("Back");
        back.setBounds(200, 420, 100, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== back){
            setVisible(false);
            new Dashboard(username);
        }else{
            String id= (String) ids.getSelectedItem();
            String number= numberField.getText();
            String gender= null;
            if(male.isSelected())   gender= "Male";
            else    gender="Female";
            String country= countryField.getText();
            String address= addressField.getText();
            String phone= phoneField.getText();
            String email= emailField.getText();
            
            Conn c = new Conn();
            if(number.isEmpty() || country.isEmpty() || address.isEmpty() || phone.isEmpty() || email.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter all details to continue.");
            }else{
                String query= "insert into userDetail values('"+username+"', '"+id+"', '"+number+"', '"+gender+"', '"+country+"', '"+address+"', '"+phone+"', '"+email+"')"; 
                try {
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Details added sucessfuly");
                    setVisible(false);
                }catch (Exception f) {
                    System.out.println(f);
                }
            }           
        }
    }
    public static void main(String[] args) {
        new EditProfile("");
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Signup extends JFrame implements ActionListener{

    JButton create, back;
    JTextField namefield, passwordfield, answerfield;
    Choice sequrity;
    Signup(){
        setSize(650, 300);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(36,36,36));
        setLayout(null);

        JLabel name =new JLabel("Username");
        name.setBounds(40, 25, 200, 20);
        name.setForeground(Color.white);
        add(name);
        namefield = new JTextField();
        namefield.setBounds(160, 25, 200, 25);
        add(namefield);

        JLabel password =new JLabel("Password");
        password.setBounds(40, 70, 200, 20);
        password.setForeground(Color.white);
        add(password);
        passwordfield = new JTextField();
        passwordfield.setBounds(160, 70, 200, 25);
        add(passwordfield);

        JLabel question =new JLabel("Security Question");
        question.setBounds(40, 120, 110, 20);
        question.setForeground(Color.white);
        question.setBackground(Color.red);
        add(question);
        sequrity = new Choice();
        sequrity.add("Favourite food");
        sequrity.add("Pet name");
        sequrity.add("Formal Education");
        sequrity.add("Lucky number");
        sequrity.setBounds(160, 120, 200, 25);
        add(sequrity);

        JLabel answer =new JLabel("Answer");
        answer.setBounds(40, 165, 200, 20);
        answer.setForeground(Color.white);
        add(answer);
        answerfield = new JTextField();
        answerfield.setBounds(160, 165, 200, 25);
        add(answerfield);

        create = new JButton("Create");
        create.setBackground(Color.white);
        create.setBounds(100,220, 80,25);
        create.addActionListener(this);
        add(create);

        back = new JButton("Back");
        back.setBackground(Color.white);
        back.setBounds(215,220, 80,25);
        back.addActionListener(this);
        add(back);

        JPanel p= new JPanel();
        p.setBounds(400, 0, 240,265);
        p.setBackground(Color.white);
        p.setLayout(null);
        add(p);

        ImageIcon i= new ImageIcon(ClassLoader.getSystemResource("images/signup.png"));
        Image i2 = i.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT) ;
        ImageIcon i3 =new ImageIcon(i2);
        JLabel i4= new JLabel(i3);
        i4.setBounds(20, 20, 200,200);
        p.add(i4);

        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==create){
            String name = namefield.getText();
            String password = passwordfield.getText();
            String question= sequrity.getSelectedItem();
            String answer = answerfield.getText();

            if(namefield.getText().isEmpty() || passwordfield.getText().isEmpty() || answerfield.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter all details");
            }else{
                String query= "insert into sign values('"+name+"','"+password+"','"+question+"','"+answer+"')";
                try{
                    Conn c = new Conn();
                    ResultSet r= c.s.executeQuery("select * from sign where username = '"+name+"'");
                    if(r.next()){
                        JOptionPane.showMessageDialog(null, "Name already taken");
                    }else{
                        c.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "Account created successfully");
                        setVisible(false);
                        new Login();
                    }         
                }catch(Exception f){
                    System.out.println(f);
                }
            }
        }else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Signup();
    }
}

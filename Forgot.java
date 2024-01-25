import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Forgot extends JFrame implements ActionListener{
    JButton search, enter, back;
    JTextField namefield, questionfield, answerfield, passwordfield;
    Forgot(){
        setSize(360,480);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(36, 36, 36));

        JPanel p= new JPanel();
        p.setBounds(0,0,350,100);
        p.setBackground(Color.white);
        p.setLayout(null);
        add(p);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("images/forgot.png"));
        Image i2 = i.getImage().getScaledInstance(95, 95, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel i4=new JLabel(i3);
        i4.setBounds(120,2,95,95);
        p.add(i4);

        JLabel name= new JLabel("Username");
        name.setBounds(20,120, 100, 15);
        name.setFont(new Font("raleway", Font.BOLD, 13));
        name.setForeground(Color.white);
        add(name);
        namefield = new JTextField();
        namefield.setBounds(20,140, 200, 25);
        namefield.setFont(new Font("raleway", Font.PLAIN, 14));
        namefield.setBorder(BorderFactory.createEmptyBorder());
        add(namefield);
        search = new JButton("Search");
        search.setBounds(250,142, 80, 20);
        search.setBackground(Color.white);
        search.setForeground(new Color(36,36,36));
        search.addActionListener(this);
        add(search);

        JLabel question= new JLabel("Question");
        question.setBounds(20,190, 100, 15);
        question.setFont(new Font("raleway", Font.BOLD, 13));
        question.setForeground(Color.white);
        add(question);
        questionfield = new JTextField();
        questionfield.setBounds(20,210, 200, 25);
        questionfield.setFont(new Font("raleway", Font.PLAIN, 14));
        questionfield.setBorder(BorderFactory.createEmptyBorder());
        add(questionfield);

        JLabel answer= new JLabel("Answer");
        answer.setBounds(20,260, 100, 15);
        answer.setFont(new Font("raleway", Font.BOLD, 13));
        answer.setForeground(Color.white);
        add(answer);
        answerfield = new JTextField();
        answerfield.setBounds(20,280, 200, 25);
        answerfield.setFont(new Font("raleway", Font.PLAIN, 14));
        answerfield.setBorder(BorderFactory.createEmptyBorder());
        add(answerfield);
        enter = new JButton("Enter");
        enter.setBounds(250,282, 80, 20);
        enter.setBackground(Color.white);
        enter.setForeground(new Color(36,36,36));
        enter.addActionListener(this);
        add(enter);

        JLabel password= new JLabel("Password :");
        password.setBounds(35,345, 100, 15);
        password.setFont(new Font("raleway", Font.BOLD, 13));
        password.setForeground(Color.white);
        add(password);
        passwordfield = new JTextField();
        passwordfield.setBounds(110,340, 200, 25);
        passwordfield.setFont(new Font("raleway", Font.BOLD, 14));
        passwordfield.setBorder(BorderFactory.createEmptyBorder());
        add(passwordfield);

        back = new JButton("Back");
        back.setBounds(135,395, 80, 25);
        back.setBackground(new Color(36,36,36));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==search){
            if (namefield.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter name please");
            }else{
                Conn c= new Conn();
                try{
                    ResultSet r=  c.s.executeQuery("select * from sign where username = '"+namefield.getText()+"'");
                    if(r.next()){
                        questionfield.setText(r.getString("question"));
                    }else{
                        JOptionPane.showMessageDialog(null, "No such user present\n Check spelling, data is case sensitive");
                        namefield.setText("");
                    }
                }catch(Exception f){
                    System.out.println(f);
                }
            }           
        }else if(e.getSource()==enter){
            if(answerfield.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter answer");
            }else{
                Conn c= new Conn();
                try{
                    ResultSet r=  c.s.executeQuery("select * from sign where username = '"+namefield.getText()+"' AND answer = '"+answerfield.getText()+"'");
                    if(r.next()){
                        passwordfield.setText(r.getString("password"));
                    }else{
                        JOptionPane.showMessageDialog(null, "Wrong answer");
                        answerfield.setText("");
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
        new Forgot();
    }
}
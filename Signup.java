import javax.swing.*;
import java.awt.*;
public class Signup extends JFrame {
    Signup(){
        setSize(650, 300);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(36,36,36));
        setLayout(null);

        JLabel name =new JLabel("Username");
        name.setBounds(40, 25, 200, 20);
        name.setForeground(Color.white);
        add(name);
        JTextField namefield = new JTextField();
        namefield.setBounds(160, 25, 200, 25);
        add(namefield);

        JLabel password =new JLabel("Password");
        password.setBounds(40, 70, 200, 20);
        password.setForeground(Color.white);
        add(password);
        JTextField passwordfield = new JTextField();
        passwordfield.setBounds(160, 70, 200, 25);
        add(passwordfield);

        JLabel question =new JLabel("Security Question");
        question.setBounds(40, 120, 110, 20);
        question.setForeground(Color.white);
        question.setBackground(Color.red);
        add(question);
        Choice sequrity = new Choice();
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
        JTextField answerfield = new JTextField();
        answerfield.setBounds(160, 165, 200, 25);
        add(answerfield);

        JButton create = new JButton("Create");
        create.setBackground(Color.white);
        create.setBounds(100,220, 80,25);
        add(create);

        JButton back = new JButton("Back");
        back.setBackground(Color.white);
        back.setBounds(215,220, 80,25);
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
    public static void main(String[] args) {
        new Signup();
    }
}

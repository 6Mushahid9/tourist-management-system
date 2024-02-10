import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Remove extends JFrame implements ActionListener{
    JButton yes, back;
    String username;
    Remove(String username){
        this.username= username;
        setSize(500,150);
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setLayout(null);
        setUndecorated(true);

        JLabel warning= new JLabel("Are you sure you want to delete this account ?");
        warning.setBounds(10,30, 500, 30);
        warning.setFont(new Font("tahoma", Font.BOLD, 20));
        add(warning);

        yes = new JButton("YES");
        yes.setBounds(100, 90, 100, 25);
        yes.addActionListener(this);
        add(yes);
        
        back = new JButton("BACK");
        back.setBounds(280, 90, 100, 25);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== back){
            setVisible(false);
        }else{
            String query1= "delete from userDetail where username = '"+username+"';";
            String query2= "delete from sign where username = '"+username+"';";
            Conn c= new Conn();
            try{
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                JOptionPane.showMessageDialog(null, "Acount removed!");
                System.exit(0);
            }catch (Exception f){
                System.out.println(f);
            }
        }
    }
    public static void main(String[] args) {
        new Remove("");
    }

    
}

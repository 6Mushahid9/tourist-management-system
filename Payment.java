import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Payment extends JFrame implements ActionListener{
    JButton pay, back;

    Payment(){
        setSize(300,300);
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setLayout(null);
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("images/paytm.png"));
        Image i2= i.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel i4= new JLabel(i3);
        i4.setBounds(40,0, 200,200);
        add(i4);

        pay= new JButton("PAY");
        pay.setBounds(40, 220, 80,25);
        pay.addActionListener(this);
        add(pay);

        back= new JButton("BACK");
        back.setBounds(160, 220, 80,25);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== back){
            setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Payment successful");
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Payment();
    }
    
}

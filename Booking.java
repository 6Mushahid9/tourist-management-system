import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Booking extends JFrame implements ActionListener{
JButton book, back;
    Booking(){
        setSize(650, 500);
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setLayout(null);
        setUndecorated(true);

        book = new JButton("Book Now");
        book.setBounds(150,300,100,30);
        book.setBackground(Color.black);
        book.setForeground(Color.white);
        book.addActionListener(this);
        add(book);
        
        back = new JButton("Cancel");
        back.setBounds(250,300,100,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== book){
            
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Booking();
    } 
}

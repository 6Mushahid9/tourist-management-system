import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Packages extends JFrame implements ActionListener{
    JButton book, back;
    Packages(){
        setSize(650, 500);
        setLocationRelativeTo(null);
        setUndecorated(true);

        JTabbedPane tab = new JTabbedPane(); //to create tabs 

        // tabs are made of panels, so we will make panels and add them to 'tab' object 
        JPanel p1 = create();
        JPanel p2 = create();
        JPanel p3 = create();

        tab.addTab("Package 1", null, p1);
        tab.addTab("Package 2", null, p2);
        tab.addTab("Package 3", null, p3);
        
        // now v will add this tab to frame
        add(tab);

        setVisible(true);
    }

    JPanel create(){
        JPanel p = new JPanel();
        p.setLayout(null);

        JLabel one =new JLabel("bvliahwevcihebw");
        one.setBounds(100,100,100,20);
        p.add(one);

        book = new JButton("Book");
        book.setBounds(150,300,100,30);
        book.setBackground(Color.black);
        book.setForeground(Color.white);
        book.addActionListener(this);
        p.add(book);
        
        back = new JButton("Back");
        back.setBounds(250,300,100,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        p.add(back);
        return p;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== book){
            new Booking();
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Packages();
    } 
}

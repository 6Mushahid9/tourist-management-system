import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.*;

public class About extends JFrame implements ActionListener{
    JButton back;

    About(){
        setSize(500,450);
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setLayout(null);
        setUndecorated(true);

        JLabel heading= new JLabel("ABOUT");
        heading.setBounds(200, 20, 200, 40);
        heading.setFont(new Font("tahoma", Font.BOLD, 30));
        heading.setForeground(Color.red);
        add(heading);

        String desc = "Language and Frameworks:\r\n" + //
                        "   Uses Java, with Java Swing for desktop based applications.\r\n" + //
                        "\r\n" + //
                        "Core Functionalities:\r\n" + //
                        "   Features user registration/login, flight and hotel bookings, and secure payment processing.\r\n" + //
                        "\r\n" + //
                        "Database Integration:\r\n" + //
                        "   Utilizes MySQL with JDBC for database connectivity.\r\n" + //
                        "\r\n" + //
                        "Customization and Scalability:\r\n" + //
                        "   Designed to be modular and scalable, allowing for future enhancements.\r\n" + //
                        "\r\n" + //
                        "User Interface:\r\n" + //
                        "   Focuses on an intuitive and responsive design for ease of use across devices.\r\n" + //
                        "\r\n" + //
                        "Testing and Maintenance:\r\n" + //
                        "   Includes testing and regular updates for performance and security.";
        TextArea text = new TextArea(desc, 20,20);
        text.setEditable(false);
        text.setBounds(20, 70, 460,300);
        add(text);

        back= new JButton("Back");
        back.setBounds(200,400, 100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }
    public static void main(String[] args) {
        new About();
    }   
}

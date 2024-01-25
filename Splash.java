import javax.swing.*;  //for frame class
import java.awt.*;  //for image class


// to use concept ot thread Runnable class in implemented then run() is overriden. now we can use run() with help of object of thread
// sleep method is used to stop some operation from happening
public class Splash extends JFrame implements Runnable{
    Thread thread;
    Splash(){
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("images/opening.jpg"));
        Image i2 = i.getImage().getScaledInstance(700, 350, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        add(new JLabel(i3));

        thread= new Thread(this);
        thread.start();

        setUndecorated(true);
    }
    @Override
    public void run() {
        try{
            Thread.sleep(8*1000);
            setVisible(false);
            new Login();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Splash frame= new Splash();    
        for(int i=1; i<=350; i++){
            frame.setVisible(true);
            frame.setSize(i*2,i);
            frame.setLocationRelativeTo(null);
            try{
                Thread.sleep(2);  
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
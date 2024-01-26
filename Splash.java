
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class Splash extends JFrame{
    Splash(){
            setLayout(null);
            
            setSize(1170,649);
            setLocation(200,50);
            setVisible(true);
            getContentPane().setBackground((Color.MAGENTA));


            JLabel heading= new JLabel("Bake For Fun");
            add(heading);
            heading.setBounds(80,60,1200,90);
            heading.setFont(new Font("serif",Font.BOLD,40));

            heading.setForeground(Color.white);
           
            ImageIcon i1=new ImageIcon("two.jpg");
            Image i2=i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel image=new JLabel(i3);
            image.setBounds(100,100,100,100);
            add(image);

            // JFrame frame = new JFrame("Image Label Example");
            // frame.setSize(400, 400);
            // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // JLabel label = new JLabel();
            // ImageIcon icon = new ImageIcon("one.jpg"); // replace with the actual path to your image file
            // label.setIcon(icon);
            // frame.add(label);
            // frame.setVisible(true);

            JButton clickButton=new JButton("Click Here to Explore");
            image.add(clickButton);
            clickButton.setBounds(100,320,200,50);
            
    }
    
    public static void main(String args[]){
        new Splash();
    }
}

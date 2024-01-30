package BakeryManagementSystem;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;

public class login extends JFrame {
    public static void main(String[] args) {
        new login();
    }
     login(){

            setLayout(null);

            setSize(1170,649);
            setLocation(200,50);
            setVisible(true);
            getContentPane().setBackground((Color.orange));
   
            JLabel mama=new JLabel("Username");
            mama.setBounds(40,20,100,30);
            add(mama);

            JTextField mama1=new JTextField();
            mama1.setBounds(150,20,100,30);
            add(mama1);

            JLabel mama2=new JLabel("Password");
            mama2.setBounds(40,70,100,30);
            add(mama2);

             JTextField mama3=new JTextField();
            mama3.setBounds(150,70,100,30);
            add(mama3);

            JButton mama4=new JButton("Login");
            mama4.setBounds(40, 170, 90, 27);
            mama4.setBackground(Color.BLACK);
            mama4.setForeground(Color.WHITE);
            add(mama4);

     }
}

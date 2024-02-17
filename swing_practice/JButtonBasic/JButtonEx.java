package swing_practice.JButtonBasic;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonEx extends JFrame implements ActionListener {
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JLabel l1;
    JButtonEx(){
        ImageIcon zoro= new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\zoro.jpg");
        ImageIcon robin= new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\robin.jpg");
        ImageIcon boa= new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\boa.jpg");
        ImageIcon luffy= new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\luffy.jpg");
        l1= new JLabel();
        l1.setBounds(0,0,1200,300);
        l1.setFont(new Font("Algerian", Font.BOLD, 20));
        l1.setVisible(true);
        this.add(l1);

        b1= new JButton();
        b1.setBounds(500,500,200,200);
        b1.addActionListener(this);
        b1.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        b1.setIcon(zoro);

        b2= new JButton();
        b2.setBounds(250,500,200,200);
        b2.addActionListener(this);
        b2.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        b2.setIcon(robin);
        b3= new JButton();
        b3.setBounds(500,250,200,200);
        b3.addActionListener(this);
        b3.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        b3.setIcon(boa);
        b4= new JButton();
        b4.setBounds(250,250,200,200);
        b4.addActionListener(this);
        b4.setBorder(BorderFactory.createLineBorder(Color.BLACK,4));
        b4.setIcon(luffy);

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);

        this.setLayout(null);
        this.setSize(795,795);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            l1.setText("This is Pirate Hunter zoro , Bounty: Beli 1,111,000,000");
        }
        if(e.getSource()==b2){
            l1.setText("This is Demon Child Nico Robin, Bounty: Beli 930,000,000");
        }
        if(e.getSource()==b3){
            l1.setText("this is Pirate Empress Boa Hancock, Bounty :Beli 1,659,000,00");
        }
        if(e.getSource()==b4){
            l1.setText("this is Monkey D Luffy,kaizoku ni ore wa naru,Bounty: Beli 3,000,000,00");
        }



    }
}

package swing_practice.MouseListenerBasics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerEx extends JFrame implements MouseListener {
    ImageIcon ico1= new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\images\\im1.png");

    ImageIcon ico2= new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\images\\im2.png");
    ImageIcon ico3= new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\images\\im2.png");
    ImageIcon ico4= new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\images\\im4.webp");
    ImageIcon ico5= new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\images\\im5.png");
    ImageIcon ico6 = new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\images\\im6.png");
    JLabel l1;


    MouseListenerEx(){


        l1= new JLabel();
        l1.setBounds(0,0,1000,800);
        l1.setIcon(ico4);
        setLayout(null);
        this.add(l1);
        setResizable(false);
        setSize(1000,1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l1.setIcon(ico1);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        l1.setIcon(ico2);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l1.setIcon(ico3);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l1.setIcon(ico5);


    }

    @Override
    public void mouseExited(MouseEvent e) {
        l1.setIcon(ico6);


    }
}

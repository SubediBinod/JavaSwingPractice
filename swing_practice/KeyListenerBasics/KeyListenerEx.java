package swing_practice.KeyListenerBasics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerEx extends JFrame implements KeyListener {

    JLabel l1 ;
    JPanel p1;


    KeyListenerEx()
    {
        ImageIcon ico = new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\images\\ship.png");
        l1 = new JLabel();
        p1= new JPanel();
        p1.setBounds(0,0,600,600);

        l1.setBounds(0,50,200,200);
        Image img = ico.getImage();
        Image modiImg= img.getScaledInstance(200,200, Image.SCALE_SMOOTH);
        ico= new ImageIcon(modiImg);
        l1.setIcon(ico);


        addKeyListener(this);

        p1.add(l1);
        p1.setBackground(Color.LIGHT_GRAY);
        p1.setLayout(null);
        setLayout(null);
        this.add(p1);
        setResizable(false);
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //left out blank
        //invoked when key is typed but i can do with key pressed too

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==37){
            l1.setLocation(l1.getX()-10,l1.getY());
        }
        if(e.getKeyCode()==39){
            l1.setLocation(l1.getX()+10,l1.getY());
        }
        if(e.getKeyCode()==38){
            l1.setLocation(l1.getX(),l1.getY()-10);
        }
        if(e.getKeyCode()==40){
            l1.setLocation(l1.getX(),l1.getY()+10);
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key code: " + e.getKeyCode());
        System.out.println("Key char: " + e.getKeyChar());
    }

}

package swing_practice.JLayeredPaneBasics;

import javax.swing.*;
import java.awt.*;

public class JLayeredPaneEx extends JFrame {
    JLayeredPaneEx(){
        JButton p1= new JButton("first");
        JButton p2= new JButton("second");
        JButton p3= new JButton("third");
        JButton p4= new JButton("fourth");
        JButton p5= new JButton("fifth");
        p1.setFocusable(false);
        p2.setFocusable(false);
        p3.setFocusable(false);
        p4.setFocusable(false);
        p5.setFocusable(false);
        p1.setBounds(0,0,200,200);
        p2.setBounds(100,100,200,200);
        p3.setBounds(200,200,200,200);
        p4.setBounds(300,300,200,200);
        p5.setBounds(400,400,200,200);
        p1.setBackground(Color.RED);
        p2.setBackground(new Color(9999999));
        p3.setBackground(Color.darkGray);
        p4.setBackground(Color.GREEN);
        p5.setBackground(Color.red);
        JLayeredPane lp = new JLayeredPane();
        lp.setBounds(0,0,600,600);
        lp.add(p1);
        lp.add(p2);
        lp.add(p3);
        lp.add(p4);
        lp.add(p5);


        this.setSize(750,750);
        this.add(lp);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

package swing_practice.GridLayoutBasics;

import javax.swing.*;
import java.awt.*;

public class GridLAyoutEx extends JFrame  {
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;
    JPanel p5;
    JPanel p6;
    JPanel p7;
    JPanel p8;
    JPanel p9;
    GridLAyoutEx(){
        p1= new JPanel();
        p2= new JPanel();
        p3= new JPanel();
        p4= new JPanel();
        p5= new JPanel();
        p6= new JPanel();
        p7= new JPanel();
        p8= new JPanel();
        p9= new JPanel();
        p1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
        p2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
        p3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
        p4.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
        p5.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
        p6.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
        p7.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
        p8.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));
        p9.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,5));

        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
        this.add(p6);
        this.add(p7);
        this.add(p8);
        this.add(p9);

        this.setSize(750,750);
        this.setVisible(true);
        this.setLayout(new GridLayout(4,4,10,10));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }




}

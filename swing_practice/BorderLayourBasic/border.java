package swing_practice.BorderLayourBasic;

import javax.swing.*;
import java.awt.*;

public class border extends JFrame {
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;
    JPanel p5;
    border(){
        this.setLayout(new BorderLayout(10,10));
        p1= new JPanel();
        p2= new JPanel();
        p3= new JPanel();
        p4= new JPanel();
        p5= new JPanel();

       JPanel p6= new JPanel();
       JPanel p7= new JPanel();
       JPanel p8= new JPanel();
       JPanel p9= new JPanel();
       JPanel p10= new JPanel();

        JPanel p11= new JPanel();
        JPanel p12= new JPanel();
        JPanel p13= new JPanel();
        JPanel p14= new JPanel();
        JPanel p15= new JPanel();

        p1.setPreferredSize(new Dimension(100,100));
        p2.setPreferredSize(new Dimension(100,100));
        p3.setPreferredSize(new Dimension(100,100));
        p4.setPreferredSize(new Dimension(100,100));
        p5.setPreferredSize(new Dimension(100,100));

        p6.setPreferredSize(new Dimension(50,50));
        p7.setPreferredSize(new Dimension(50,50));
        p8.setPreferredSize(new Dimension(50,50));
        p9.setPreferredSize(new Dimension(50,50));
        p10.setPreferredSize(new Dimension(50,50));

        p11.setPreferredSize(new Dimension(50,50));
        p12.setPreferredSize(new Dimension(50,50));
        p13.setPreferredSize(new Dimension(50,50));
        p14.setPreferredSize(new Dimension(50,50));
        p15.setPreferredSize(new Dimension(50,50));


        p11.setBackground(Color.cyan);
        p12.setBackground(Color.RED);
        p13.setBackground(Color.DARK_GRAY);
        p14.setBackground(Color.CYAN);
        p15.setBackground(Color.LIGHT_GRAY);


         p10.setLayout(new BorderLayout(3,3));
        p10.add(p11,BorderLayout.EAST);
        p10.add(p12,BorderLayout.NORTH);
        p10.add(p13,BorderLayout.SOUTH);
        p10.add(p14,BorderLayout.WEST);
        p10.add(p15,BorderLayout.CENTER);


        p6.setBackground(Color.cyan);
        p7.setBackground(Color.RED);
        p8.setBackground(Color.DARK_GRAY);
        p9.setBackground(Color.CYAN);
        p10.setBackground(Color.LIGHT_GRAY);

        p5.setLayout(new BorderLayout(5,5));

        p5.add(p6,BorderLayout.EAST);
        p5.add(p7,BorderLayout.NORTH);
        p5.add(p8,BorderLayout.SOUTH);
        p5.add(p9,BorderLayout.WEST);
        p5.add(p10,BorderLayout.CENTER);



        p1.setBackground(Color.cyan);
        p2.setBackground(Color.RED);
        p3.setBackground(Color.DARK_GRAY);
        p4.setBackground(Color.CYAN);
        p5.setBackground(Color.LIGHT_GRAY);


        this.add(p1,BorderLayout.EAST);
        this.add(p2,BorderLayout.NORTH);
        this.add(p3,BorderLayout.SOUTH);
        this.add(p4,BorderLayout.WEST);
        this.add(p5,BorderLayout.CENTER);

        this.setTitle("this is BorderLayout ");


        this.setSize(500,500);
        this.setVisible(true);
    }

}

package JLabelBasic;

import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.*;


public class JLabelex extends JFrame {
    JLabel l;
    JLabelex()  {
        l = new JLabel();
        l.setText("hell YEah");
        l.setHorizontalTextPosition(JLabel.CENTER);
        l.setVerticalTextPosition(JLabel.BOTTOM);
        ImageIcon image = new ImageIcon("cartoon-mountain-landscape-png-favpng-AyYsi0qUuWnELfYxT3S9jJHqi.png");
        l.setIcon(image);
        l.setIconTextGap(20);
        l.setBounds(100,100,1000,1000);
        l.setIconTextGap(100);
        l.setOpaque(true);
        l.setBackground(new Color(0x999999));
        l.setForeground(Color.CYAN);//label ko text lai kolor garx
        Border b =  BorderFactory.createLineBorder(Color.RED,10);
        l.setBorder(b);
        //Using an alignment
        l.setVerticalAlignment(JLabel.TOP);
        l.setHorizontalAlignment(JLabel.CENTER);





        this.add(l);
        this.setSize(1000,1000);
        this.setVisible(true);
        this.setLayout(null);
        ImageIcon images = new ImageIcon("peakpx.jpg");
        this.setIconImage(images.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
    }

}

package PanelEx;

import javax.swing.*;
import java.awt.*;

public class PanelEx extends JFrame {
    PanelEx(){
        JPanel p1= new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        p1.setBounds(0,0,200,200);
        p2.setBounds(200,0,200,200);
        p3.setBounds(0,200,200,200);
        p4.setBounds(200,200,200,200);
        p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        p2.setBorder(BorderFactory.createLoweredBevelBorder());
        p3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        p4.setBorder(BorderFactory.createLoweredBevelBorder());
        p1.setBackground(new Color(98765432));
        p2.setBackground(Color.cyan);
        p3.setBackground(Color.DARK_GRAY);
        p4.setBackground(new Color(99,99,99));

        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.setLayout(null);
        this.setSize(400,440);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

package JFrameBasic;

import javax.swing.*;
import java.awt.*;

public class Frameclass extends JFrame{
    Frameclass(){
        this.setTitle("this is my first frame class");
        this.getContentPane().setBackground(new Color(0x123456));
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        ImageIcon image= new ImageIcon("peakpx.jpg");
        this.setIconImage(image.getImage());
        this.setSize(200,500);
        this.setVisible(true);
    }


}

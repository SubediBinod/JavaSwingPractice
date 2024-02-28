package swing_practice.ProgressBarBasics;

import javax.swing.*;
import java.awt.*;

public class ProgressBarEx extends JFrame {

    JProgressBar bar = new JProgressBar();;
    ProgressBarEx(){
        bar.setValue(100);
        bar.setBounds(10,50,500,50);
        bar.setStringPainted(true);
        bar.setForeground(Color.RED);
        bar.setBackground(Color.cyan);



        this.add(bar);
        this.setLayout(null);
        this.setSize(550,550);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fill();

    }

    private void fill() {
        int counter=0;
        while(counter<=100) {
            bar.setValue(counter);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter+=20;


        }
        bar.setString("Thanks for your patience");


    }

}

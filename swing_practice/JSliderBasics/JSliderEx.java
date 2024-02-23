package swing_practice.JSliderBasics;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderEx extends JFrame implements ChangeListener {
    JSlider js;
    JLabel l1;
    JLabel l2;
    JSliderEx(){

        l1= new JLabel();
        l2= new JLabel();
        l1.setBounds(20,0,400,100);
        l1.setText("Select the temperature: ");
        l2.setBounds(200, 50, 100, 50);
        js= new JSlider(0,100,40);
        js.setBounds(50,120,150,300);
        js.setOrientation(SwingConstants.VERTICAL);
        js.setMinorTickSpacing(2);
        js.setMajorTickSpacing(20);
        js.setPaintTicks(true);
        js.setPaintTrack(true);
        js.setPaintLabels(true);
        js.setFont(new Font("MV Boli",Font.ITALIC,10));

        this.add(js);
        this.add(l1);
        this.add(l2);
        js.addChangeListener(this);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    @Override
    public void stateChanged(ChangeEvent e) {
        l2.setText(String.valueOf(js.getValue()));

    }
}

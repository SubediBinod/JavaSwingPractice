package swing_practice.CheckBoxBasics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxEx extends JFrame implements ActionListener {
    JCheckBox box;
    JCheckBox box1;
     JLabel l1;
     ButtonGroup bg;
    CheckBoxEx(){
        box= new JCheckBox("I am robot?");
        box.setBounds(50,50,200,20);
        box.setBorder(BorderFactory.createLoweredBevelBorder());
        box.setFocusable(false);
        box1 = new JCheckBox(("I am human bro!!!"));
        box1.setBounds(100,100,200,20);
        box1.setBorder(BorderFactory.createLoweredBevelBorder());
        box.setFocusable(false);



        bg = new ButtonGroup();
        bg.add(box);
        bg.add(box1);

        box.addActionListener(this);
        box1.addActionListener(this);

        l1= new JLabel();
        l1.setBounds(10,0,300,30);

        this.add(l1);
        this.add(box);
        this.add(box1);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(500,500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(box.isSelected()){
            l1.setText("oh !! You're a robot");
        }
        if(box1.isSelected()){
            l1.setText("Oh sorry for mistaking , hello human");
        }

    }
}

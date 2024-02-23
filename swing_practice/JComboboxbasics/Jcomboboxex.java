package swing_practice.JComboboxbasics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jcomboboxex extends JFrame implements ActionListener {
    JComboBox combo;
    JLabel lb1;
    JLabel lb2;
    Jcomboboxex(){
        lb1= new JLabel();
        lb1.setBounds(200,200,500,100);
        lb2= new JLabel();
        lb2.setBounds(0,0,500,100);
        lb2.setText("Select your city");
        lb2.setForeground(Color.GREEN);
        lb2.setHorizontalAlignment(SwingConstants.CENTER);
        lb2.setOpaque(true);


        String []places={"Butwal","Bhairahawa","pharsatikar","kathmandu","Pokhara"};

        combo= new JComboBox(places);
        combo.setBounds(100,100,100,20);

        combo.addActionListener(this);


        this.add(combo);
        this.add(lb1);
        this.add(lb2);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

           String a= "So you live in "+(String) combo.getSelectedItem();
            lb1.setText(a);
    }
}

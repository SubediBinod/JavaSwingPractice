package swing_practice.JTextFieldBasics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldEx extends JFrame implements ActionListener {
    JTextField tf;
    JButton b1;
    TextFieldEx(){
    tf = new JTextField();
    tf.setPreferredSize(new Dimension(50,50));
    tf.addActionListener(this);
    b1=new JButton("Submit");
    b1.addActionListener(this);
    b1.setBounds(30,30,40,40);

    this.add(b1);
    this.add(tf);
    this.pack();
    this.setLayout(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

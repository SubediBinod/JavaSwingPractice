package swing_practice.FlowLayoutBasic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Flow extends JFrame implements ActionListener {

    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JLabel l1;
    JPanel p1;
    Flow(){
        p1= new JPanel();
        p1.setBounds(50,50,500,200);
        p1.setBorder(BorderFactory.createLineBorder(Color.CYAN,5));
        p1.setBackground(Color.CYAN);

        b3= new JButton("8");
        b3.addActionListener(this);
        b2= new JButton("7");
        b2.addActionListener(this);
        b4= new JButton("6");
        b4.addActionListener(this);
        b5= new JButton("5");
        b5.addActionListener(this);
        b6= new JButton("4");
        b6.addActionListener(this);
        b7= new JButton("3");
        b7.addActionListener(this);
        b8= new JButton("2");
        b8.addActionListener(this);
        b1= new JButton("1");
        b1.addActionListener(this);
        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);
        b5.setFocusable(false);
        b6.setFocusable(false);
        b7.setFocusable(false);
        b8.setFocusable(false);
        l1= new JLabel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(l1);
        this.add(p1);



        p1.setLayout(new FlowLayout( FlowLayout.CENTER,5,5));
        this.setLayout(null);
        this.setSize(700,500);
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            l1.setText("I  do nothing");
            l1.setFont(new Font("ALGERIAN", Font.ITALIC,20));

        }
        else if(e.getSource()==b2){
            l1.setText("I also do nothing");
            l1.setFont(new Font("ALGERIAN", Font.ITALIC,20));

        }
        else if(e.getSource()==b3){
            l1.setText("Hey there Have a nice day");
            l1.setFont(new Font("ALGERIAN", Font.ITALIC,20));

        }
        else if(e.getSource()==b4){
            l1.setText("kaizoku ni ore wa naru");
            l1.setFont(new Font("ALGERIAN", Font.ITALIC,20));

        }
        else if(e.getSource()==b5){
            l1.setText("You should watch one piece, its awesome");
            l1.setFont(new Font("ALGERIAN", Font.ITALIC,20));

        }
        else if(e.getSource()==b6){
            l1.setText("hey there how was your day?");
            l1.setFont(new Font("ALGERIAN", Font.ITALIC,20));

        }
        if(e.getSource()==b7){
            l1.setText("i do nothing");
            l1.setFont(new Font("ALGERIAN", Font.ITALIC,20));

        }
        if(e.getSource()==b8){
            l1.setText("I dont do anything");
            l1.setFont(new Font("ALGERIAN", Font.ITALIC,20));

        }

    }


}

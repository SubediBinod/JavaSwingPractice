package swing_practice.SimpleCalculator_using_JTextFieldBasics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldEx implements ActionListener {
    JFrame f= new JFrame();
    JTextField f1;
    JTextField f2;
    JTextField f3;
    JPanel p1;
    JButton b2;
    JButton b1;
    JButton b3;
    JButton b4;
    JTextFieldEx(){
        f1 = new JTextField();
        f2 = new JTextField();
        f3 = new JTextField();
        p1= new JPanel();


        p1.setBackground(Color.cyan);

        JLabel l2=new JLabel(" ==  ");
        l2.setBounds(2,200,50,20);


        JLabel l1= new JLabel("This is Simple Calculator capable of performing 4 operations");
        l1.setBounds(15,0,500,20);
        l1.setForeground(Color.red);
        l1.setVerticalAlignment(JLabel.TOP);
        p1.add(l1);



        b1= new JButton();
        b2= new JButton();
        b3= new JButton();
        b4 = new JButton();

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        b1.setText("+");
        b2.setText("-");
        b3.setText("*");
        b4.setText("/");
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font( "Arial",Font.ITALIC,14));
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font( "Arial",Font.ITALIC,14));
        b3.setForeground(Color.BLACK);
        b3.setFont(new Font( "Arial",Font.ITALIC,14));
        b4.setForeground(Color.BLACK);
        b4.setFont(new Font( "Arial",Font.ITALIC,14));


        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);

        b1.setBounds(50,150,50,20);
        b2.setBounds(110,150,50,20);
        b3.setBounds(170,150,50,20);
        b4.setBounds(230,150,50,20);


        p1.setBounds(50,100,300,300);


        f1.setBounds(50, 50, 230, 30);
        f2.setBounds(50, 100, 230, 30);
        f3.setBounds(50, 200, 230, 30);
        f3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,3));
        f3.setEditable(false);

        f1.setCaretColor(Color.RED);
        f1.setBackground(Color.LIGHT_GRAY);
        f1.setForeground(Color.BLACK);

        f2.setCaretColor(Color.DARK_GRAY);
        f2.setBackground(Color.LIGHT_GRAY);
        f2.setForeground(Color.BLACK);



        p1.add(f1);
        p1.add(f2);
        p1.add(f3);
        p1.add(l2);

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);


        f.add(p1);

        p1.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String s1= f1.getText();
        String s2= f2.getText();
        int a= Integer.parseInt(s1);
        int b= Integer.parseInt(s2);
        if(e.getSource()==b1){
            f3.setText(String.valueOf(a+b));
        }
        if(e.getSource()==b2){
            f3.setText(String.valueOf(a-b));

        }
        if(e.getSource()==b3){
            f3.setText(String.valueOf(a*b));

        }
        if(e.getSource()==b4){
            f3.setText(String.valueOf(a/b));

        }
    }
}

package swing_practice.JOptionPaneBasics;

import javax.swing.*;

public class JOptionPaneEx {
    JOptionPaneEx(){


        //for displaying only

        JOptionPane.showMessageDialog(null,"this is just a plain text",null,JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"this is Error Message",null,JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"this is Information message",null,JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"this is Warning message",null,JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"this is Question Message",null,JOptionPane.QUESTION_MESSAGE);


        //confirmDialog
        JOptionPane.showConfirmDialog(null,"this is my mesage","this is title",JOptionPane.YES_NO_CANCEL_OPTION);


       //inputs
        String o=(JOptionPane.showInputDialog("how you're feeling today?"));
        JOptionPane.showMessageDialog(null,o);


    }

}

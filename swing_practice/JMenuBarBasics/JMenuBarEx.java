package swing_practice.JMenuBarBasics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class JMenuBarEx extends JFrame implements ActionListener {
    JMenuBar bar= new JMenuBar();
    JMenu FileMenu;
    JMenu EditMenu;
    JMenu HelpMenu;
    JMenuItem openItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    JMenuBarEx(){
        this.setJMenuBar(bar);
        this.setVisible(true);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());



        FileMenu= new JMenu("File");
        EditMenu= new JMenu("Edit");
        HelpMenu= new JMenu("Help");

        bar.add(FileMenu);
        bar.add(EditMenu);
        bar.add(HelpMenu);

        openItem= new JMenuItem("open");
        saveItem = new JMenuItem("save");
        exitItem= new JMenuItem("exit");

        FileMenu.add(openItem);
        FileMenu.add(saveItem);
        FileMenu.add(exitItem);

        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);





    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==openItem){
            JFileChooser filechoose= new JFileChooser();
            int response= filechoose.showOpenDialog(null);//returns 0 for choose
            if(response== filechoose.APPROVE_OPTION)
            {
                File file= new File(filechoose.getSelectedFile().getAbsolutePath());
                System.out.println("your file is"+file);
            }

            System.out.println("Item opened!!!!!!!");

        }
        if(e.getSource()==saveItem){
            JFileChooser filechoose= new JFileChooser();
            int response= filechoose.showSaveDialog(null);//returns 0 for choose
            if(response== filechoose.APPROVE_OPTION)
            {
                File file= new File(filechoose.getSelectedFile().getAbsolutePath());
                System.out.println("your file is"+file);
            }
            System.out.println("file has been saved");
        }
        if(e.getSource()==exitItem){
            System.exit(0);
        }


    }
}

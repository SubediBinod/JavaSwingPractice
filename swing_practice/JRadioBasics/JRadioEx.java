package swing_practice.JRadioBasics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioEx extends JFrame implements ActionListener {

    private JLabel label;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;

    private JRadioButton windowsButton;
    private JRadioButton macButton;
    private JRadioButton linuxButton;
    private JRadioButton pizzaButton;
    private JRadioButton momoButton;
    private JRadioButton burgerButton;
    private JRadioButton beerButton;
    private JRadioButton wineButton;
    private JRadioButton sodaButton;

    JRadioEx() {
        // Set up the panels
        panel1 = new JPanel(new GridLayout(1, 3));
        panel2 = new JPanel(new GridLayout(1, 3));
        panel3 = new JPanel(new GridLayout(1, 3));

        label = new JLabel("Select an option from each:", SwingConstants.CENTER);

        // Load and scale images
        ImageIcon pizzaIcon = new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\images\\pizza.png");
        Image pizzaImage = pizzaIcon.getImage();
        Image scaledPizzaImage = pizzaImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        pizzaIcon = new ImageIcon(scaledPizzaImage);

        ImageIcon burgerIcon = new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\images\\hamburger.png");
        Image burgerImage = burgerIcon.getImage();
        Image scaledBurgerImage = burgerImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        burgerIcon = new ImageIcon(scaledBurgerImage);

        ImageIcon momoIcon = new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\images\\momo.png");
        Image momoImage = momoIcon.getImage();
        Image scaledMomoImage = momoImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        momoIcon = new ImageIcon(scaledMomoImage);

        ImageIcon wineIcon = new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\images\\icons8-wine-64.png");
        Image wineImage = wineIcon.getImage();
        Image scaledWineImage = wineImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        wineIcon = new ImageIcon(scaledWineImage);

        ImageIcon beerIcon = new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\images\\beer.png");
        Image beerImage = beerIcon.getImage();
        Image scaledBeerImage = beerImage.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        beerIcon = new ImageIcon(scaledBeerImage);

        ImageIcon sodaIcon = new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\images\\soda.png");
        Image sodaImage = sodaIcon.getImage();
        Image scaledSodaImage = sodaImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        sodaIcon = new ImageIcon(scaledSodaImage);


        ImageIcon tickIcon = new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\JRadioBasics\\tick.png");

        ImageIcon windowsIcon = new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\images\\icons8-windows-48.png");
        ImageIcon macIcon = new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\images\\icons8-mac-os-64.png");
        ImageIcon linuxIcon = new ImageIcon("C:\\Users\\Binod Subedi\\Desktop\\swing\\swing_practice\\images\\icons8-linux-24.png");
        Image Linuxx = linuxIcon.getImage();
        Image scaledLinuxImage = Linuxx.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        linuxIcon = new ImageIcon(scaledLinuxImage);

        windowsButton = new JRadioButton();
        windowsButton.setIcon(windowsIcon);
        windowsButton.setSelectedIcon(macIcon);
        macButton = new JRadioButton();
        macButton.setIcon(macIcon);
        linuxButton = new JRadioButton();
        linuxButton.setIcon(linuxIcon);
        pizzaButton = new JRadioButton();
        pizzaButton.setIcon(pizzaIcon);
        momoButton = new JRadioButton();
        momoButton.setIcon(momoIcon);
        burgerButton = new JRadioButton();
        burgerButton.setIcon(burgerIcon);
        beerButton = new JRadioButton();
        beerButton.setIcon(beerIcon);
        wineButton = new JRadioButton();
        wineButton.setIcon(wineIcon);
        sodaButton = new JRadioButton();
        sodaButton.setIcon(sodaIcon);

        // Group the radio buttons
        ButtonGroup osGroup = new ButtonGroup();
        osGroup.add(windowsButton);
        osGroup.add(macButton);
        osGroup.add(linuxButton);

        ButtonGroup foodGroup = new ButtonGroup();
        foodGroup.add(pizzaButton);
        foodGroup.add(momoButton);
        foodGroup.add(burgerButton);

        ButtonGroup drinkGroup = new ButtonGroup();
        drinkGroup.add(beerButton);
        drinkGroup.add(wineButton);
        drinkGroup.add(sodaButton);

        // Add action listener to the radio buttons
        windowsButton.addActionListener(this);
        macButton.addActionListener(this);
        linuxButton.addActionListener(this);
        pizzaButton.addActionListener(this);
        momoButton.addActionListener(this);
        burgerButton.addActionListener(this);
        beerButton.addActionListener(this);
        wineButton.addActionListener(this);
        sodaButton.addActionListener(this);


        windowsButton.setSelectedIcon(tickIcon);
        macButton.setSelectedIcon(tickIcon);
        linuxButton.setSelectedIcon(tickIcon);
        pizzaButton.setSelectedIcon(tickIcon);
        momoButton.setSelectedIcon(tickIcon);
        burgerButton.setSelectedIcon(tickIcon);
        beerButton.setSelectedIcon(tickIcon);
        wineButton.setSelectedIcon(tickIcon);
        sodaButton.setSelectedIcon(tickIcon);

        // Add components to panels
        panel1.add(windowsButton);
        panel1.add(macButton);
        panel1.add(linuxButton);
        panel2.add(pizzaButton);
        panel2.add(momoButton);
        panel2.add(burgerButton);
        panel3.add(beerButton);
        panel3.add(wineButton);
        panel3.add(sodaButton);

        // Add borders to panels
        panel1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        panel3.setBorder(BorderFactory.createLineBorder(Color.darkGray, 3));

        // Set layout for the frame
        this.setLayout(new GridLayout(4,4,10,10));
        this.add(label);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        label.setBackground(Color.lightGray);
        label.setForeground(Color.darkGray);
        label.setOpaque(true);



        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==windowsButton){
            label.setText("Oh you like windows kid");
        }
        if(e.getSource()==linuxButton){
            label.setText("Oh you are great");
        }
        if(e.getSource()==macButton){
            label.setText("You maybe rich right");
        }
        if(e.getSource()==pizzaButton){
            label.setText("you  love pizza , that will cost you 100$");
        }
        if(e.getSource()==momoButton){
            label.setText("You and I are same same but different");
        }
        if(e.getSource()==burgerButton){
            label.setText("Oh you prefer Burger");
        }
        if(e.getSource()==sodaButton){
            label.setText("you are stucked on a soda drink");
        }
        if(e.getSource()==beerButton){
            label.setText("I too love Beer");
        }
        if(e.getSource()==wineButton){
            label.setText("I love  wine");
        }

    }


}
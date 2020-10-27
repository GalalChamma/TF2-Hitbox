/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tf2.spyhitbox;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author JayPC
 */
public class TF2SpyHitBox implements ActionListener, MouseListener {

    public static void main(String[] args) {
        TF2SpyHitBox program = new TF2SpyHitBox();
        program.start();
    }

    // Global variable that holds the name of the chosen class at the time
    public String classChosen = "";

    // main frame
    JFrame frame = new JFrame();

    // Label that will display the images 
    JLabel classLabel = new JLabel();

    // Label that will show the userers their choice validity (if they found the hitbox or not)
    JLabel answerLabel = new JLabel();

    // Array that holds the class selection buttons
    ArrayList<ButtonTF2> classButtonArray = new ArrayList<ButtonTF2>();
    // Array that holds all the images
    ArrayList<ImageTF2> imageArray = new ArrayList<ImageTF2>();
    // Array that holds the 3 different view buttons (POV)
    ArrayList<JButton> viewButtonArray = new ArrayList<JButton>();
    // Array that holds the hitboxes buttons
    ArrayList<JButton> hitboxArray = new ArrayList<JButton>();

    // Green check mark image
    ImageIcon checkMark = new ImageIcon(new ImageIcon((getClass().getResource("/check-mark.png"))).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
    // Red X image
    ImageIcon xMark = new ImageIcon(new ImageIcon((getClass().getResource("/x-mark.png"))).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

    // Panels 
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();

    // POV buttons
    JButton frontViewButton = new JButton("Front");
    JButton sideViewButton = new JButton("Side");
    JButton rearViewButton = new JButton("Back");

    // Head Buttons to be clicked
    JButton scoutHead_f = new JButton("scout_f");
    JButton scoutHead_s = new JButton("scout_s");
    JButton scoutHead_b = new JButton("scout_b");
    JButton soldierHead_f = new JButton("soldier_f");
    JButton soldierHead_s = new JButton("soldier_s");
    JButton soldierHead_b = new JButton("soldier_b");
    JButton pyroHead_f = new JButton("pyro_f");
    JButton pyroHead_s = new JButton("pyro_s");
    JButton pyroHead_b = new JButton("pyro_b");
    JButton demoHead_f = new JButton("demo_f");
    JButton demoHead_s = new JButton("demo_s");
    JButton demoHead_b = new JButton("demo_b");
    JButton heavyHead_f = new JButton("heavy_f");
    JButton heavyHead_s = new JButton("heavy_s");
    JButton heavyHead_b = new JButton("heavy_b");
    JButton engineerHead_f = new JButton("engineer_f");
    JButton engineerHead_s = new JButton("engineer_s");
    JButton engineerHead_b = new JButton("engineer_b");
    JButton medicHead_f = new JButton("medic_f");
    JButton medicHead_s = new JButton("medic_s");
    JButton medicHead_b = new JButton("medic_b");
    JButton sniperHead_f = new JButton("sniper_f");
    JButton sniperHead_s = new JButton("sniper_s");
    JButton sniperHead_b = new JButton("sniper_b");
    JButton spyHead_f = new JButton("spy_f");
    JButton spyHead_s = new JButton("spy_s");
    JButton spyHead_b = new JButton("spy_b");

    // Class Selection buttons
    JButton scoutButton = new JButton("scout");
    JButton soldierButton = new JButton("soldier");
    JButton pyroButton = new JButton("pyro");
    JButton heavyButton = new JButton("heavy");
    JButton demoButton = new JButton("demo");
    JButton engineerButton = new JButton("engineer");
    JButton medicButton = new JButton("medic");
    JButton sniperButton = new JButton("sniper");
    JButton spyButton = new JButton("spy");

    // Creating ButtonTF2 objects for each "class selection" button and adding it to an array
    public void addClassButtons() {
        classButtonArray.add(new ButtonTF2(scoutButton, "scout"));
        classButtonArray.add(new ButtonTF2(soldierButton, "soldier"));
        classButtonArray.add(new ButtonTF2(pyroButton, "pyro"));
        classButtonArray.add(new ButtonTF2(demoButton, "demo"));
        classButtonArray.add(new ButtonTF2(heavyButton, "heavy"));
        classButtonArray.add(new ButtonTF2(engineerButton, "engineer"));
        classButtonArray.add(new ButtonTF2(medicButton, "medic"));
        classButtonArray.add(new ButtonTF2(sniperButton, "sniper"));
        classButtonArray.add(new ButtonTF2(spyButton, "spy"));
    }

    // Creating ImageTF2 objects for each image and adding it to an array
    public void addImages() {
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/scout_f.jpg"))), "scout", "scout_f"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/scout_s.jpg"))), "scout", "scout_s"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/scout_b.jpg"))), "scout", "scout_b"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/soldier_f.jpg"))), "soldier", "soldier_f"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/soldier_s.jpg"))), "soldier", "soldier_s"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/soldier_b.jpg"))), "soldier", "soldier_b"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/pyro_f.jpg"))), "pyro", "pyro_f"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/pyro_s.jpg"))), "pyro", "pyro_s"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/pyro_b.jpg"))), "pyro", "pyro_b"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/demo_f.jpg"))), "demo", "demo_f"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/demo_s.jpg"))), "demo", "demo_s"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/demo_b.jpg"))), "demo", "demo_b"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/engineer_f.jpg"))), "engineer", "engineer_f"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/engineer_s.jpg"))), "engineer", "engineer_s"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/engineer_b.jpg"))), "engineer", "engineer_b"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/heavy_f.jpg"))), "heavy", "heavy_f"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/heavy_s.jpg"))), "heavy", "heavy_s"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/heavy_b.jpg"))), "heavy", "heavy_b"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/medic_f.jpg"))), "medic", "medic_f"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/medic_s.jpg"))), "medic", "medic_s"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/medic_b.jpg"))), "medic", "medic_b"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/sniper_f.jpg"))), "sniper", "sniper_f"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/sniper_s.jpg"))), "sniper", "sniper_s"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/sniper_b.jpg"))), "sniper", "sniper_b"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/spy_f.jpg"))), "spy", "spy_f"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/spy_s.jpg"))), "spy", "spy_s"));
        imageArray.add(new ImageTF2(new ImageIcon((getClass().getResource("/spy_b.jpg"))), "spy", "spy_b"));
    }

    public void initButtons() {

        // Setting the toolbar icon image for the program
        Toolkit.getDefaultToolkit().getImage("/Leaderboard_class_spy.png");

        // spy "class button" icon
        spyButton.setIcon(new ImageIcon(new ImageIcon((getClass().getResource("/Leaderboard_class_spy.png"))).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));

        for (ButtonTF2 button : classButtonArray) {
            // adding a listner for each button so it's detected when clicked
            button.getButton().addActionListener(this);
            // diabling annoying outline around button text when clicked
            button.getButton().setFocusable(false);
            // adding buttons to panel1
            panel1.add(button.getButton());
        }

        viewButtonArray.add(frontViewButton);
        viewButtonArray.add(sideViewButton);
        viewButtonArray.add(rearViewButton);

        for (JButton button : viewButtonArray) {
            // adding a listner for each button so it's detected when clicked
            button.addActionListener(this);
            // diabling annoying outline around button text when clicked
            button.setFocusable(false);
            // Making sure the button is disabled by default
            button.setEnabled(false);
            // Adding the button to panel3
            panel3.add(button);
        }

        // The default is FlowLayout, but it's better to manually set it to avoid future problems
        classLabel.setLayout(new FlowLayout());

        // Adding mouse listner to the classLabel (which will become an image later) to detect incorrect hitbox guesses
        classLabel.addMouseListener(this);
    }

    public void createHitboxes() {
        // Setting the location for each Head box
        scoutHead_f.setBounds(533, 190, 35, 35);
        scoutHead_s.setBounds(565, 190, 35, 35);
        scoutHead_b.setBounds(563, 190, 35, 35);

        soldierHead_f.setBounds(585, 215, 35, 35);
        soldierHead_s.setBounds(580, 215, 35, 35);
        soldierHead_b.setBounds(625, 177, 35, 35);

        pyroHead_f.setBounds(583, 240, 35, 35);
        pyroHead_s.setBounds(618, 240, 35, 35);
        pyroHead_b.setBounds(611, 239, 35, 35);

        demoHead_f.setBounds(580, 231, 35, 35);
        demoHead_s.setBounds(577, 231, 35, 35);
        demoHead_b.setBounds(615, 230, 35, 35);

        heavyHead_f.setBounds(560, 243, 35, 35);
        heavyHead_s.setBounds(595, 240, 35, 35);
        heavyHead_b.setBounds(595, 240, 35, 35);

        engineerHead_f.setBounds(575, 255, 33, 33);
        engineerHead_s.setBounds(606, 256, 33, 33);
        engineerHead_b.setBounds(606, 255, 33, 33);

        medicHead_f.setBounds(565, 235, 35, 35);
        medicHead_s.setBounds(565, 235, 35, 35);
        medicHead_b.setBounds(603, 230, 33, 33);

        sniperHead_f.setBounds(566, 240, 35, 35);
        sniperHead_s.setBounds(602, 238, 35, 35);
        sniperHead_b.setBounds(600, 240, 35, 35);

        spyHead_f.setBounds(557, 190, 36, 36);
        spyHead_s.setBounds(553, 187, 36, 36);
        spyHead_b.setBounds(592, 180, 36, 36);

        hitboxArray.add(scoutHead_f);
        hitboxArray.add(scoutHead_s);
        hitboxArray.add(scoutHead_b);
        hitboxArray.add(soldierHead_f);
        hitboxArray.add(soldierHead_s);
        hitboxArray.add(soldierHead_b);
        hitboxArray.add(pyroHead_f);
        hitboxArray.add(pyroHead_s);
        hitboxArray.add(pyroHead_b);
        hitboxArray.add(demoHead_f);
        hitboxArray.add(demoHead_s);
        hitboxArray.add(demoHead_b);
        hitboxArray.add(heavyHead_f);
        hitboxArray.add(heavyHead_s);
        hitboxArray.add(heavyHead_b);
        hitboxArray.add(engineerHead_f);
        hitboxArray.add(engineerHead_s);
        hitboxArray.add(engineerHead_b);
        hitboxArray.add(medicHead_f);
        hitboxArray.add(medicHead_s);
        hitboxArray.add(medicHead_b);
        hitboxArray.add(sniperHead_f);
        hitboxArray.add(sniperHead_s);
        hitboxArray.add(sniperHead_b);
        hitboxArray.add(spyHead_f);
        hitboxArray.add(spyHead_s);
        hitboxArray.add(spyHead_b);

        for (JButton button : hitboxArray) {
            button.setOpaque(false);
            button.setEnabled(false);
            button.setVisible(false);
            button.setContentAreaFilled(false);
            button.setBorderPainted(false);
            button.setFocusable(false);
            // fancy hitbox border
            button.setBorder(BorderFactory.createBevelBorder(1, Color.GREEN, Color.ORANGE, Color.RED, Color.BLUE));
            /* THIS WAS CAUSING THE BOXES TO NOT REGISTER? WHY? ITS JUST TEXT  ---------> button.setText(""); */
            button.setFont(new Font("Times New Roman", Font.PLAIN, 0));
            button.setForeground(Color.BLACK);
            button.addActionListener(this);
            frame.add(button);
        }
    }

    // "className" is the class name, "viewType" is either | _f | _s | _b |
    public void showHitbox(String className, String viewType) {
        for (JButton button : hitboxArray) {
            if (button.getText().equals(className + viewType)) {
                // maybe setEnabled isnt neccessary..
                button.setEnabled(true);
                button.setVisible(true);
                button.setBorderPainted(false);

            } else {
                // maybe setEnabled isnt neccessary..
                button.setVisible(false);
                button.setEnabled(false);
                button.setBorderPainted(false);
            }
        }
    }

    public void start() {
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(1050, 800);
        frame.setTitle("Cheetaz Super Cool Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon((getClass().getResource("/Leaderboard_class_spy.png"))).getImage());

        // Creating objects images and adding them to an array
        addImages();
        // Creating objects of "class buttons" and adding them to an array
        addClassButtons();
        // Creating buttons for hitboxes and adding them to an array
        createHitboxes();

        // Class selection panel
        panel1.setBounds(20, 100, 200, 500);
        panel1.setBackground(new Color(170, 170, 170));
        panel1.setLayout(new GridLayout(9, 1, 5, 5));
        initButtons();

        // Picture panel
        panel2.setBounds(260, 100, 700, 500);
        panel2.setBackground(new Color(150, 150, 150));
        panel2.add(classLabel);
        classLabel.setText("Choose a class to begin");

        // POV Buttons panel
        panel3.setBounds(260, 600, 700, 50);
        panel3.setBackground(new Color(150, 150, 150));

        // Bottom Panel
        panel4.setBounds(260, 650, 700, 100);
        panel4.setBackground(new Color(150, 150, 150));
        panel4.add(answerLabel);

        // Adding all the panels to the JFrame
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        frame.getContentPane().setBackground(new Color(150, 150, 150));
        frame.setBackground(Color.yellow);
        frame.setVisible(true);
        //panel.setVisible(true);
    }
    
    
    // If any button gets clicked
    @Override
    public void actionPerformed(ActionEvent e) {

        // check if the button clicked was a class selection button (panel1 buttons)
        for (ButtonTF2 b : classButtonArray) {
            if (e.getSource() == b.getButton()) {
                // Enabling the three differnet view buttons
                for (JButton button : viewButtonArray) {
                    button.setEnabled(true);
                }
                // Resetting a few values
                answerLabel.setIcon(null);
                answerLabel.setText("");
                classLabel.setText("");
                // Set the global value: classChosen
                classChosen = b.getClassName();
                // Use correct hitbox 
                showHitbox(classChosen, "_f");
                // Display the image 
                for (ImageTF2 img : imageArray) {
                    // if ImageTF2 object's getViewType field is equal to CLASSNAME_f then use that object's ImageIcon field
                    if (img.getViewType().equals(b.getClassName() + "_f")) {
                        classLabel.setIcon(img.getImage());
                    }
                }
            }
        }
        /* Check if button clicked was one of the panel3 POV buttons */
        //if "front" button was clicked
        if (e.getSource() == frontViewButton) { 
            answerLabel.setIcon(null);
            classLabel.setIcon(new ImageIcon((getClass().getResource("/" + classChosen + "_f.jpg"))));
            showHitbox(classChosen, "_f");
            answerLabel.setText("");
        } 
        // if "side" button was clicked
        else if (e.getSource() == sideViewButton) { 
            answerLabel.setIcon(null);
            classLabel.setIcon(new ImageIcon((getClass().getResource("/" + classChosen + "_s.jpg"))));
            showHitbox(classChosen, "_s");
            answerLabel.setText("");
        }
        // if "back" button was clicked
        else if (e.getSource() == rearViewButton) {  
            answerLabel.setIcon(null);
            showHitbox(classChosen, "_b");
            answerLabel.setText("");
            classLabel.setIcon(new ImageIcon((getClass().getResource("/" + classChosen + "_b.jpg"))));
        } else {
            // check if the button clicked was a hitbox button 
            for (JButton button : hitboxArray) {
                if (e.getSource() == button) {
                    // show border of the button
                    button.setBorderPainted(true);
                    // set answerLabel text and icon 
                    answerLabel.setText("CORRECT!");
                    answerLabel.setIcon(checkMark);
                }
            }
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == classLabel) {
            answerLabel.setText("WRONG!");
            answerLabel.setIcon(xMark);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released; # of clicks: " + e.getClickCount() + " " + e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered" + e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited" + e);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked (# of clicks: "
                + e.getClickCount() + ")" + e);
    }
}

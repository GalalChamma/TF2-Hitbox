/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spyhitbox;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author JayPC
 */
public class ProgramTF2 implements ActionListener, MouseListener {

    public static void main(String[] args) {
        ProgramTF2 program = new ProgramTF2();
        program.start();
    }
    boolean classLabelClickable = false;

    // Global variable that holds the name of the chosen class at the time
    public String classChosen = "";
    Border border = BorderFactory.createLineBorder(Color.green, 3);
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
    ImageIcon happyFace = new ImageIcon(new ImageIcon((getClass().getResource("/happy_face.png"))).getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
    // Red X image
    ImageIcon normalFace = new ImageIcon(new ImageIcon((getClass().getResource("/nope.png"))).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

    // Panels 
    JPanel panel0 = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();

    // POV buttons
    JButton frontViewButton = new JButton("FRONT");
    JButton sideViewButton = new JButton("SIDE");
    JButton rearViewButton = new JButton("BACK");

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
    JButton scoutButton = new JButton("SCOUT");
    JButton soldierButton = new JButton("SOLDIER");
    JButton pyroButton = new JButton("PYRO");
    JButton heavyButton = new JButton("HEAVY");
    JButton demoButton = new JButton("DEMO");
    JButton engineerButton = new JButton("ENGINEER");
    JButton medicButton = new JButton("MEDIC");
    JButton sniperButton = new JButton("SNIPER");
    JButton spyButton = new JButton("SPY");

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

    public void start() {
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(1050, 800);
        frame.setTitle("Cheetaz Spy Hitbox Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon((getClass().getResource("/spy_icon.png"))).getImage());
        // puts the frame in the middle of the screen
        frame.setLocationRelativeTo(null);

        // Creating objects images and adding them to an array
        addImages();
        // Creating objects of "class buttons" and adding them to an array
        addClassButtons();
        // Creating buttons for hitboxes and adding them to an array
        createHitboxes();
        // Setting properties for buttons upon launch
        initButtons();

        classLabel.setText("Choose a class to begin");
        classLabel.setFont(new Font("Comic Sans", Font.BOLD, 25));
        //classLabel.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        classLabel.setHorizontalAlignment(JLabel.CENTER);
        classLabel.setVerticalAlignment(JLabel.CENTER);
        // Adding mouse listner to classLabel to detect incorrect clicks
        classLabel.addMouseListener(this);
        
        // Main program header
        JLabel header = new JLabel("Spy Hitbox Tutorial");
        header.setFont(new Font("Comic Sans", Font.BOLD, 50));
        header.setBounds(0, 0, 850, 90);
        header.setVerticalAlignment(JLabel.CENTER);
        header.setHorizontalAlignment(JLabel.CENTER);

        panel0.setBounds(100, 0, 850, 90);
        panel0.setLayout(null);
        panel0.add(header);

        // panels bounds
        panel1.setBounds(20, 100, 200, 500);
        panel2.setBounds(260, 100, 700, 500);
        panel3.setBounds(260, 600, 700, 50);
        panel4.setBounds(260, 650, 700, 100);

        panel1.setLayout(new GridLayout(9, 1, 5, 5));
        panel2.setLayout(new BorderLayout());

        // Adding the label to hold the images as its icon in Panel2
        panel2.add(classLabel, BorderLayout.CENTER);
        panel2.setBorder(BorderFactory.createLineBorder(Color.black, 3));

        // Adding bottom answer label
        answerLabel.setFont(new Font("Comic Sans", Font.BOLD, 23));

        panel4.add(answerLabel);

        // Setting background color for panels
        panel0.setBackground(new Color(150, 150, 150));
        panel1.setBackground(new Color(150, 150, 150));
        panel2.setBackground(new Color(150, 150, 150));
        panel3.setBackground(new Color(150, 150, 150));
        panel4.setBackground(new Color(150, 150, 150));

        // Adding all the panels to the JFrame
        frame.add(panel0);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        // Setting the color of the entire frame
        frame.getContentPane().setBackground(new Color(150, 150, 150));
        frame.setVisible(true);
    }

    public void initButtons() {
        // Adding default properties for class buttons upon launch
        for (ButtonTF2 button : classButtonArray) {
            // adding an ACTION listner for each button so it's detected when clicked
            button.getButton().addActionListener(this);
            // Adding MOUSE listner in order to apply mouse hover effect
            button.getButton().addMouseListener(this);
            // diabling annoying outline around button text when clicked
            button.getButton().setFocusable(false);
            // font and color of the button
            button.getButton().setForeground(Color.orange);
            button.getButton().setBackground(Color.darkGray);
            button.getButton().setFont(new Font("Comic Sans", Font.BOLD, 23));
            // border for button
            button.getButton().setBorder(BorderFactory.createLineBorder(Color.black, 2));
            // adding buttons to panel1
            panel1.add(button.getButton());
        }

        // adding POV buttons to their array
        viewButtonArray.add(frontViewButton);
        viewButtonArray.add(sideViewButton);
        viewButtonArray.add(rearViewButton);

        // Adding default properties for POV buttons upon launch
        for (JButton button : viewButtonArray) {
            // adding a listner for each button so it's detected when clicked
            button.addActionListener(this);
            // diabling annoying outline around button text when clicked
            button.setFocusable(false);
            // Making sure the button is disabled by default
            button.setEnabled(false);
            // font and color of the POV button
            button.setForeground(Color.orange);
            button.setBackground(Color.darkGray);
            button.setFont(new Font("Comic Sans", Font.BOLD, 15));
            // Setting perferred size of buttons
            button.setPreferredSize(new Dimension(70, 25));  // this fixed the issue of the buttons shrinking after adding a border
            // border for button
            button.setBorder(BorderFactory.createLineBorder(Color.black, 2));
            // Adding the button to panel3
            panel3.add(button);
        }

        // spy "class button" icon
        scoutButton.setIcon(new ImageIcon(new ImageIcon((getClass().getResource("/scout_icon.png")))
                .getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));
        soldierButton.setIcon(new ImageIcon(new ImageIcon((getClass().getResource("/soldier_icon.png")))
                .getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));
        pyroButton.setIcon(new ImageIcon(new ImageIcon((getClass().getResource("/pyro_icon.png")))
                .getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));
        demoButton.setIcon(new ImageIcon(new ImageIcon((getClass().getResource("/demo_icon.png")))
                .getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));
        heavyButton.setIcon(new ImageIcon(new ImageIcon((getClass().getResource("/heavy_icon.png")))
                .getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));
        engineerButton.setIcon(new ImageIcon(new ImageIcon((getClass().getResource("/engineer_icon.png")))
                .getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));
        medicButton.setIcon(new ImageIcon(new ImageIcon((getClass().getResource("/medic_icon.png")))
                .getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));
        sniperButton.setIcon(new ImageIcon(new ImageIcon((getClass().getResource("/sniper_icon.png")))
                .getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));
        spyButton.setIcon(new ImageIcon(new ImageIcon((getClass().getResource("/spy_icon.png")))
                .getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));
    }

    public void createHitboxes() {
        // Setting the location for each Head box
        scoutHead_f.setBounds(533, 185, 35, 35);
        scoutHead_s.setBounds(565, 185, 35, 35);
        scoutHead_b.setBounds(563, 185, 35, 35);

        soldierHead_f.setBounds(585, 210, 35, 35);
        soldierHead_s.setBounds(580, 210, 35, 35);
        soldierHead_b.setBounds(625, 172, 35, 35);

        pyroHead_f.setBounds(583, 235, 35, 35);
        pyroHead_s.setBounds(618, 235, 35, 35);
        pyroHead_b.setBounds(611, 234, 35, 35);

        demoHead_f.setBounds(580, 227, 35, 35);
        demoHead_s.setBounds(577, 227, 35, 35);
        demoHead_b.setBounds(610, 225, 35, 35);

        heavyHead_f.setBounds(560, 236, 35, 35);
        heavyHead_s.setBounds(595, 235, 35, 35);
        heavyHead_b.setBounds(593, 235, 35, 35);

        engineerHead_f.setBounds(575, 250, 33, 33);
        engineerHead_s.setBounds(606, 251, 33, 33);
        engineerHead_b.setBounds(603, 250, 33, 33);

        medicHead_f.setBounds(565, 230, 35, 35);
        medicHead_s.setBounds(565, 230, 35, 35);
        medicHead_b.setBounds(603, 225, 33, 33);

        sniperHead_f.setBounds(566, 235, 35, 35);
        sniperHead_s.setBounds(602, 233, 35, 35);
        sniperHead_b.setBounds(595, 232, 35, 35);

        spyHead_f.setBounds(557, 185, 36, 36);
        spyHead_s.setBounds(553, 182, 36, 36);
        spyHead_b.setBounds(592, 175, 36, 36);

        // Adding all the hitboxes to their array, "hitboxArray"
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
                // If hitbox text value matches the parameter
                button.setEnabled(true);
                button.setVisible(true);
                button.setBorderPainted(false);

            } else {
                // If hitbox button does not match the entered parameter
                button.setVisible(false);
                button.setEnabled(false); // maybe setEnabled(false) isnt neccessary since setVisible(false) will disable the button. 
                button.setBorderPainted(false);
            }
        }
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
                classLabelClickable = true;
                // Resetting a few values to an empty state
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
            classLabelClickable = true;
            answerLabel.setIcon(null);
            classLabel.setIcon(new ImageIcon((getClass().getResource("/" + classChosen + "_f.jpg"))));
            showHitbox(classChosen, "_f");
            answerLabel.setText("");
        } // if "side" button was clicked
        else if (e.getSource() == sideViewButton) {
            classLabelClickable = true;
            answerLabel.setIcon(null);
            classLabel.setIcon(new ImageIcon((getClass().getResource("/" + classChosen + "_s.jpg"))));
            showHitbox(classChosen, "_s");
            answerLabel.setText("");
        } // if "back" button was clicked
        else if (e.getSource() == rearViewButton) {
            classLabelClickable = true;
            answerLabel.setIcon(null);
            classLabel.setIcon(new ImageIcon((getClass().getResource("/" + classChosen + "_b.jpg"))));
            showHitbox(classChosen, "_b");
            answerLabel.setText("");

        } else {
            // check if the button clicked was a hitbox button 
            for (JButton button : hitboxArray) {
                if (e.getSource() == button) {
                    // show border of the button
                    button.setBorderPainted(true);
                    // set answerLabel text and icon 
                    answerLabel.setText("Nice");
                    answerLabel.setIcon(happyFace);
                    answerLabel.setForeground(Color.white);
                    answerLabel.setIconTextGap(5);
                    classLabelClickable = false;
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == classLabel) {
            if (classLabelClickable == true) {
                answerLabel.setText("Nope");
                answerLabel.setIcon(normalFace);
                answerLabel.setForeground(Color.white);
                answerLabel.setIconTextGap(-10);
            }
        }
        for (ButtonTF2 button : classButtonArray) {
            if (e.getSource() == button.getButton()) {
                button.getButton().setBackground(new Color(130, 130, 130));
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        System.out.println("Mouse released; # of clicks: " + e.getClickCount() + " " + e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        for (ButtonTF2 button : classButtonArray) {
            if (e.getSource() == button.getButton()) {
                button.getButton().setBackground(new Color(130, 130, 130));
            }
        }
//        System.out.println("Mouse entered" + e);

    }

    @Override
    public void mouseExited(MouseEvent e) {
//        System.out.println("Mouse exited" + e);
        for (ButtonTF2 button : classButtonArray) {
            if (e.getSource() == button.getButton()) {
                button.getButton().setBackground(Color.darkGray);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        System.out.println("Mouse clicked (# of clicks: "+ e.getClickCount() + ")" + e);

    }

}

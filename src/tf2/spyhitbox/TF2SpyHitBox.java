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
import java.util.HashSet;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicLabelUI;
import sun.swing.SwingUtilities2;

/**
 *
 * @author JayPC
 */
public class TF2SpyHitBox implements ActionListener, MouseListener {

    public String classChosen = "";

    // hashtable 
    HashSet h = new HashSet();
    // ArrayLists
    ArrayList<ButtonTF2> classSelectionButtonArray = new ArrayList<ButtonTF2>();
    ArrayList<ImageTF2> imageArray = new ArrayList<ImageTF2>();
    ArrayList<JButton> classButtonArray = new ArrayList<JButton>();
    ArrayList<JButton> viewButtonArray = new ArrayList<JButton>();
    ArrayList<JButton> hitboxArray = new ArrayList<JButton>();

    JFrame frame = new JFrame();

    //ImageIcon scoutPic1 = new ImageIcon(new ImageIcon((getClass().getResource("/scout1.png"))).getImage().getScaledInstance(300, 500, Image.SCALE_DEFAULT));
    //ImageIcon scoutPic2 = new ImageIcon(new ImageIcon((getClass().getResource("/scout2.png"))).getImage().getScaledInstance(300, 500, Image.SCALE_DEFAULT));
    ImageIcon checkMark = new ImageIcon(new ImageIcon((getClass().getResource("/check-mark.png"))).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
    ImageIcon xMark = new ImageIcon(new ImageIcon((getClass().getResource("/x-mark.png"))).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

    //ImageIcon scout_f = new ImageIcon((getClass().getResource("/scout_f.jpg")));
    //  Creating ImageTF2 objects for each image and adding it to imageArray
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

    /*
    ImageIcon scout_f = new ImageIcon((getClass().getResource("/scout_f.jpg")));
    ImageIcon scout_s = new ImageIcon((getClass().getResource("/scout_s.jpg")));
    ImageIcon scout_b = new ImageIcon((getClass().getResource("/scout_b.jpg")));
    ImageIcon soldier_f = new ImageIcon((getClass().getResource("/soldier_f.jpg")));
    ImageIcon soldier_s = new ImageIcon((getClass().getResource("/soldier_s.jpg")));
    ImageIcon soldier_b = new ImageIcon((getClass().getResource("/soldier_b.jpg")));
    ImageIcon pyro_f = new ImageIcon((getClass().getResource("/pyro_f.jpg")));
    ImageIcon pyro_s = new ImageIcon((getClass().getResource("/pyro_s.jpg")));
    ImageIcon pyro_b = new ImageIcon((getClass().getResource("/pyro_b.jpg")));
    ImageIcon demo_f = new ImageIcon((getClass().getResource("/demo_f.jpg")));
    ImageIcon demo_s = new ImageIcon((getClass().getResource("/demo_s.jpg")));
    ImageIcon demo_b = new ImageIcon((getClass().getResource("/demo_b.jpg")));
    ImageIcon heavy_f = new ImageIcon((getClass().getResource("/heavy_f.jpg")));
    ImageIcon heavy_s = new ImageIcon((getClass().getResource("/heavy_s.jpg")));
    ImageIcon heavy_b = new ImageIcon((getClass().getResource("/heavy_b.jpg")));
    ImageIcon engineer_f = new ImageIcon((getClass().getResource("/engineer_f.jpg")));
    ImageIcon engineer_s = new ImageIcon((getClass().getResource("/engineer_s.jpg")));
    ImageIcon engineer_b = new ImageIcon((getClass().getResource("/engineer_b.jpg")));
    ImageIcon medic_f = new ImageIcon((getClass().getResource("/medic_f.jpg")));
    ImageIcon medic_s = new ImageIcon((getClass().getResource("/medic_s.jpg")));
    ImageIcon medic_b = new ImageIcon((getClass().getResource("/medic_b.jpg")));
    ImageIcon sniper_f = new ImageIcon((getClass().getResource("/sniper_f.jpg")));
    ImageIcon sniper_s = new ImageIcon((getClass().getResource("/sniper_s.jpg")));
    ImageIcon sniper_b = new ImageIcon((getClass().getResource("/sniper_b.jpg")));
    ImageIcon spy_f = new ImageIcon((getClass().getResource("/spy_f.jpg")));
    ImageIcon spy_s = new ImageIcon((getClass().getResource("/spy_s.jpg")));
    ImageIcon spy_b = new ImageIcon((getClass().getResource("/spy_b.jpg")));
     */
    // FOR TESTING PURPOSES: SPY SHOWN IN PHOTOS
    /*ImageIcon scout_f = new ImageIcon((getClass().getResource("/scout_f_spy.jpg")));
    ImageIcon scout_s = new ImageIcon((getClass().getResource("/scout_s_spy.jpg")));
    ImageIcon scout_b = new ImageIcon((getClass().getResource("/scout_b_spy.jpg")));
    ImageIcon soldier_f = new ImageIcon((getClass().getResource("/soldier_f_spy.jpg")));
    ImageIcon soldier_s = new ImageIcon((getClass().getResource("/soldier_s_spy.jpg")));
    ImageIcon soldier_b = new ImageIcon((getClass().getResource("/soldier_b_spy.jpg")));
    ImageIcon pyro_f = new ImageIcon((getClass().getResource("/pyro_f_spy.jpg")));
    ImageIcon pyro_s = new ImageIcon((getClass().getResource("/pyro_s_spy.jpg")));
    ImageIcon pyro_b = new ImageIcon((getClass().getResource("/pyro_b_spy.jpg")));
    ImageIcon demo_f = new ImageIcon((getClass().getResource("/demo_f_spy.jpg")));
    ImageIcon demo_s = new ImageIcon((getClass().getResource("/demo_s_spy.jpg")));
    ImageIcon demo_b = new ImageIcon((getClass().getResource("/demo_b_spy.jpg")));
    ImageIcon heavy_f = new ImageIcon((getClass().getResource("/heavy_f_spy.jpg")));
    ImageIcon heavy_s = new ImageIcon((getClass().getResource("/heavy_s_spy.jpg")));
    ImageIcon heavy_b = new ImageIcon((getClass().getResource("/heavy_b_spy.jpg")));
    ImageIcon engineer_f = new ImageIcon((getClass().getResource("/engineer_f_spy.jpg")));
    ImageIcon engineer_s = new ImageIcon((getClass().getResource("/engineer_s_spy.jpg")));
    ImageIcon engineer_b = new ImageIcon((getClass().getResource("/engineer_b_spy.jpg")));
    ImageIcon medic_f = new ImageIcon((getClass().getResource("/medic_f_spy.jpg")));
    ImageIcon medic_s = new ImageIcon((getClass().getResource("/medic_s_spy.jpg")));
    ImageIcon medic_b = new ImageIcon((getClass().getResource("/medic_b_spy.jpg")));
    ImageIcon sniper_f = new ImageIcon((getClass().getResource("/sniper_f_spy.jpg")));
    ImageIcon sniper_s = new ImageIcon((getClass().getResource("/sniper_s_spy.jpg")));
    ImageIcon sniper_b = new ImageIcon((getClass().getResource("/sniper_b_spy.jpg")));
    ImageIcon spy_f = new ImageIcon((getClass().getResource("/spy_f.jpg")));
    ImageIcon spy_s = new ImageIcon((getClass().getResource("/spy_s.jpg")));
    ImageIcon spy_b = new ImageIcon((getClass().getResource("/spy_b.jpg")));
     */
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

    public void addClassButtons() {
        classSelectionButtonArray.add(new ButtonTF2(scoutButton, "scout"));
        classSelectionButtonArray.add(new ButtonTF2(soldierButton, "soldier"));
        classSelectionButtonArray.add(new ButtonTF2(pyroButton, "pyro"));
        classSelectionButtonArray.add(new ButtonTF2(demoButton, "demo"));
        classSelectionButtonArray.add(new ButtonTF2(heavyButton, "heavy"));
        classSelectionButtonArray.add(new ButtonTF2(engineerButton, "engineer"));
        classSelectionButtonArray.add(new ButtonTF2(medicButton, "medic"));
        classSelectionButtonArray.add(new ButtonTF2(sniperButton, "sniper"));
        classSelectionButtonArray.add(new ButtonTF2(spyButton, "spy"));
    }

    // Label to be used by images for the classes
    JLabel classLabel = new JLabel();

    // Label for showing the user if the correct spot has been clicked on
    JLabel answerLabel = new JLabel();

    public static void main(String[] args) {
        // for doing GUI
//        testYourSelf t = new testYourSelf();
//        t.setVisible(true);

        // manual
        TF2SpyHitBox program = new TF2SpyHitBox();

        program.start();

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

    public void initButtons() {

        addImages();
        addClassButtons();

        Toolkit.getDefaultToolkit().getImage("/Leaderboard_class_spy.png");
        classButtonArray.add(scoutButton);
        classButtonArray.add(soldierButton);
        classButtonArray.add(pyroButton);
        classButtonArray.add(demoButton);
        classButtonArray.add(heavyButton);
        classButtonArray.add(engineerButton);
        classButtonArray.add(medicButton);
        classButtonArray.add(sniperButton);
        classButtonArray.add(spyButton);
        spyButton.setIcon(new ImageIcon(new ImageIcon((getClass().getResource("/Leaderboard_class_spy.png"))).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)));

        for (JButton button : classButtonArray) {
            // adding a listner for each button so it's detected when clicked
            button.addActionListener(this);
            // diabling annoying outline around button text when clicked
            button.setFocusable(false);
            // adding buttons to panel1
            panel1.add(button);
        }

        viewButtonArray.add(frontViewButton);
        viewButtonArray.add(sideViewButton);
        viewButtonArray.add(rearViewButton);

        for (JButton button : viewButtonArray) {
            button.addActionListener(this);
            button.setFocusable(false);
            button.setEnabled(false);
            panel3.add(button);
        }

        // see
        classLabel.setLayout(new FlowLayout());
        classLabel.addMouseListener(this);

        System.out.println(this.toString());

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

        //classLabel.setIcon(spy_b);
        //frame.add(spyHead_b);
        scoutHead_f.setOpaque(false);

        for (JButton button : hitboxArray) {
            button.setEnabled(false);
            button.setVisible(false);
            button.setContentAreaFilled(false);
            button.setBorderPainted(false);
            button.setFocusable(false);
            button.setBorder(BorderFactory.createBevelBorder(1, Color.GREEN, Color.ORANGE, Color.RED, Color.BLUE));

            // THIS WAS CAUSING THE BOXES TO NOT REGISTER? WHY? ITS JUST TEXT
            //button.setText("");
            button.setFont(new Font("Times New Roman", Font.PLAIN, 0));
            //button.setUI(new OpacityLabelUI());
            frame.add(button);
            button.setForeground(Color.BLACK);
            button.addActionListener(this);
        }

        // what is this command for
        //frame.getContentPane().setBackground(Color.RED);
    }

    // if "scout" is passed --> scout_hf     , scout_hs, scout_hb
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

        frame.setResizable(false);
        frame.setTitle("Cheetaz Super Cool Program");
        frame.setIconImage(new ImageIcon((getClass().getResource("/Leaderboard_class_spy.png"))).getImage());
        frame.setSize(1050, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Class selection panel
        panel1.setBounds(20, 100, 200, 500);
        panel1.setBackground(new Color(170, 170, 170));
        panel1.setLayout(new GridLayout(9, 1, 5, 5));
        initButtons();
        /*panel1.setLayout(new FlowLayout(4,4,4));*/

        // Picture panel
        panel2.setBounds(260, 100, 700, 500);
        panel2.setBackground(new Color(150, 150, 150));

        //panel2.adda
        // POV Buttons panel
        panel3.setBounds(260, 600, 700, 50);
        panel3.setBackground(new Color(150, 150, 150));

        // Bottom Panel
        panel4.setBounds(260, 650, 700, 100);
        panel4.setBackground(new Color(150, 150, 150));
        panel4.add(answerLabel);
        //picLabel.setText("");
        //answerLabel.setText("Answer will be shown here");

        panel2.add(classLabel);
        classLabel.setText("Choose a class to begin");
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        frame.getContentPane().setBackground(new Color(150, 150, 150));
        frame.setBackground(Color.yellow);
        frame.setVisible(true);
        //panel.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // add a for each loop here with the correct calls
        for (ButtonTF2 b : classSelectionButtonArray) {
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
        if (e.getSource() == frontViewButton) {
            answerLabel.setIcon(null);
            classLabel.setIcon(new ImageIcon((getClass().getResource("/" + classChosen + "_f.jpg"))));
            showHitbox(classChosen, "_f");
            answerLabel.setText("");
        } else if (e.getSource() == sideViewButton) {
            answerLabel.setIcon(null);
            classLabel.setIcon(new ImageIcon((getClass().getResource("/" + classChosen + "_s.jpg"))));
            showHitbox(classChosen, "_s");
            answerLabel.setText("");
        } else if (e.getSource() == rearViewButton) {
            answerLabel.setIcon(null);
            showHitbox(classChosen, "_b");
            answerLabel.setText("");
            classLabel.setIcon(new ImageIcon((getClass().getResource("/" + classChosen + "_b.jpg"))));
        } else {
            for (JButton button : hitboxArray) {
                if (e.getSource() == button) {
                    button.setBorderPainted(true);
                    System.out.println("CORRECT");
                    answerLabel.setText("CORRECT!");
                    answerLabel.setIcon(checkMark);
                }
            }
        }

        /*
        if (e.getSource() == scoutButton) {
            for (JButton button : viewButtonArray) {
                button.setEnabled(true);
            }
            answerLabel.setIcon(null);
            showHitbox("scout", "_f");
            classChosen = "scout";
            classLabel.setIcon(scout_f);
            answerLabel.setText("");
            classLabel.setText("");
        } else if (e.getSource() == soldierButton) {
            for (JButton button : viewButtonArray) {
                button.setEnabled(true);
            }
            answerLabel.setIcon(null);
            showHitbox("soldier", "_f");
            classChosen = "soldier";
            classLabel.setIcon(soldier_f);
            answerLabel.setText("");
            classLabel.setText("");
        } else if (e.getSource() == pyroButton) {
            for (JButton button : viewButtonArray) {
                button.setEnabled(true);
            }
            answerLabel.setIcon(null);
            showHitbox("pyro", "_f");
            classLabel.setIcon(pyro_f);
            classChosen = "pyro";
            answerLabel.setText("");
            classLabel.setText("");
        } else if (e.getSource() == demoButton) {
            for (JButton button : viewButtonArray) {
                button.setEnabled(true);
            }
            answerLabel.setIcon(null);
            showHitbox("demo", "_f");
            classLabel.setIcon(demo_f);
            classChosen = "demo";
            answerLabel.setText("");
            classLabel.setText("");
        } else if (e.getSource() == heavyButton) {
            for (JButton button : viewButtonArray) {
                button.setEnabled(true);
            }
            answerLabel.setIcon(null);
            showHitbox("heavy", "_f");
            classLabel.setIcon(heavy_f);
            classChosen = "heavy";
            answerLabel.setText("");
            classLabel.setText("");
        } else if (e.getSource() == engineerButton) {
            for (JButton button : viewButtonArray) {
                button.setEnabled(true);
            }
            answerLabel.setIcon(null);
            showHitbox("engineer", "_f");
            classLabel.setIcon(engineer_f);
            classChosen = "engineer";
            answerLabel.setText("");
            classLabel.setText("");
        } else if (e.getSource() == medicButton) {
            for (JButton button : viewButtonArray) {
                button.setEnabled(true);
            }
            answerLabel.setIcon(null);
            showHitbox("medic", "_f");
            classLabel.setIcon(medic_f);
            classChosen = "medic";
            answerLabel.setText("");
            classLabel.setText("");
        } else if (e.getSource() == sniperButton) {
            for (JButton button : viewButtonArray) {
                button.setEnabled(true);
            }
            answerLabel.setIcon(null);
            showHitbox("sniper", "_f");
            classLabel.setIcon(sniper_f);
            classChosen = "sniper";
            answerLabel.setText("");
            classLabel.setText("");
        } else if (e.getSource() == spyButton) {
            for (JButton button : viewButtonArray) {
                button.setEnabled(true);
            }
            answerLabel.setIcon(null);
            showHitbox("spy", "_f");
            classLabel.setIcon(spy_f);
            classChosen = "spy";
            answerLabel.setText("");
            classLabel.setText("");

        } else */
    }
}

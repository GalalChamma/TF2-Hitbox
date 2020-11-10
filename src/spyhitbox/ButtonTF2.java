/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spyhitbox;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author JayPC
 */
public class ButtonTF2 {
    
    private JButton button;
    private String className;
    
    public ButtonTF2 (JButton button, String className) {
        this.button = button;
        this.className = className;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    
}

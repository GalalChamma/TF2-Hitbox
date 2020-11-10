/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spyhitbox;

import javax.swing.ImageIcon;

/**
 *
 * @author JayPC
 */
public class ImageTF2 {
    
    private ImageIcon image;
    private String className;
    private String viewType;

    public ImageTF2(ImageIcon image, String className, String viewType) {
        this.image = image;
        this.className = className;
        this.viewType = viewType;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
    }
    
    
    

}

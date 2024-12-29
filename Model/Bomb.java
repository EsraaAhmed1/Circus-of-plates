/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/**
 *
 * @author Esraa
 */
public class Bomb extends ImageObject {
    private boolean isLeft;
    public Bomb(int x, int y, String path) {
        super(x, y, path);
        
    }

    public boolean isIsLeft() {
        return isLeft;
    }

    public void setIsLeft(boolean isLeft) {
        this.isLeft = isLeft;
    }

    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;
import javax.swing.ImageIcon;

/**
 *
 * @author hp
 */
public class Brick extends Sprite{
    private boolean destroyed;
    public Brick(int x , int y){
        initBrick(x,y);
    }
    
    private void initBrick(int x, int y){
        this.x = x;
        this.y = y ;
        destroyed = false;
        loadImage();
        getImageDimensions();
    }
    
    private void loadImage() {
        var ii = new ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\BreakOutGame\\src\\resources\\brick.png");
        image = ii.getImage();
    }
    
    boolean isDestroyed() {
        return destroyed;
    }
    
    void setDestroyed(boolean val){
        destroyed = val;
    }
}

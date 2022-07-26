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
public class Ball extends Sprite{
    private int xdir ;
    private int ydir;
    public Ball() {
        initBall();
       
    }
    
    private void initBall(){
        xdir = 1;
        ydir = -1;
        loadImage();
        getImageDimensions();
        resetState();
    }
    private void loadImage(){
        var ii = new ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\BreakOutGame\\src\\resources\\ball.png");
        image = ii.getImage();
    }
    
    void move() {
        x += xdir;
        y += ydir;
        if (x == 0){
            setXDir(1);
        }
        
        if(Commons.WIDTH - imageWidth == x){
            setXDir(-1);
        } 
        
        if(y == 0){
            setYDir(1);
        }
    }
    
    private void resetState() {
        x = Commons.INIT_BALL_X;
        y = Commons.INIT_BALL_Y;
    }
    void setXDir(int x){
        xdir = x;
    }
    
    void setYDir(int y){
        ydir = y;
    }
    
    int gYDir () {
        return ydir;
    }
}

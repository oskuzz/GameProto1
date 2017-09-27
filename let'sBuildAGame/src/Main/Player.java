/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author osku0
 */
public class Player extends GameObject {
    
    Handler handler;
    
    public Player(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
    }

    public void tick() {
        x += velX;
        y += velY;

        x = Game.clamp(x, 0, Game.WIDTH - 37);
        y = Game.clamp(y, 0, Game.HEIGHT - 60);
        
        handler.addObject(new Trail(x, y, ID.Trail, Color.white, 32, 32, 0.05f, handler)); 
        
        collision();

    }
    
    public void collision(){
        for(int i = 0; i < handler.object.size();i++) {
            
            GameObject tempObject = handler.object.get(i);
            
            if(tempObject.getID() == ID.BasicEnemy || tempObject.getID() == ID.FastEnemy) {
                if(getBounds().intersects(tempObject.getBounds())){
                    HUD.HEALTH -= 2;
                }
            }
        }
    }
    
    public void render(Graphics g) {

        g.setColor(Color.white);
        g.fillRect(x, y, 32, 32);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }

}

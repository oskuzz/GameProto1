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
public class EnemyBoss extends GameObject {

    private Handler handler;
    private int timer = 80;
    private int timer2 = 80;
    public EnemyBoss(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 0;
        velY = 2;

    }

    public void tick() {
        x += velX;
        y += velY;
        
        if(timer <= 0) {
            velY = 0;
        } else {
            timer--;
        }
        
        /*if (y <= 0 || y >= Game.HEIGHT - 32) {
            velY *= -1;
        }
        if (x <= 0 || x >= Game.WIDTH - 16) {
            velX *= -1;
        }*/

        //handler.addObject(new Trail(x, y, ID.Trail, Color.red, 96, 96, 0.008f, handler));
    }

    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect((int) x, (int) y, 96, 96);
    }

    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, 96, 96);
    }

}

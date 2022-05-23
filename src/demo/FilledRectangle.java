/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author mazen
 */
public class FilledRectangle extends Rectangle {
    
    public FilledRectangle(Rectangle r, Color color) {
        super(r.getX1(),r.getX2(),r.getY1(),r.getY2(), color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        if (x1 < x2 && y1 < y2) {
            g.fillRect(x1, y1, x2 - x1, y2 - y1);
        } else if (x1 > x2 && y1 > y2) {
            g.fillRect(x2, y2, Math.abs(x2 - x1), Math.abs(y2 - y1));
        } else if (x1 < x2 && y1 > y2) {
            g.fillRect(x1, y2, Math.abs(x2 - x1), Math.abs(y2 - y1));
        } else if (x1 > x2 && y1 < y2) {
            g.fillRect(x2, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
        }
    }
    
    
}

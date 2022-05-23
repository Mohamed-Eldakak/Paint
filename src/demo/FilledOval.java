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
public class FilledOval extends Oval {
    
    public FilledOval(Oval o, Color color) {
        super(o.getX1(),o.getX2(),o.getY1(),o.getY2(), color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        if (x1 < x2 && y1 < y2) {
            g.fillOval(x1, y1, x2 - x1, y2 - y1);
        } else if (x1 > x2 && y1 > y2) {
            g.fillOval(x2, y2, Math.abs(x2 - x1), Math.abs(y2 - y1));
        } else if (x1 < x2 && y1 > y2) {
            g.fillOval(x1, y2, Math.abs(x2 - x1), Math.abs(y2 - y1));
        } else if (x1 > x2 && y1 < y2) {
            g.fillOval(x2, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
        }
    }
    
}

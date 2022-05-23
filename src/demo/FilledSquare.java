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
public class FilledSquare extends Square {

    public FilledSquare(Square s, Color color) {
        super(s.getX1(),s.getX2(),s.getY1(),s.getY2(), color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        if (x1 < x2 && y1 < y2) {
            g.fillRect(x1, y1, x2 - x1, x2 - x1);
        } else if (x1 > x2 && y1 > y2) {
            g.fillRect(x2, y2, Math.abs(x2 - x1), Math.abs(x2 - x1));
        } else if (x1 < x2 && y1 > y2) {
            g.fillRect(x1, y2, Math.abs(x2 - x1), Math.abs(x2 - x1));
        } else if (x1 > x2 && y1 < y2) {
            g.fillRect(x2, y1, Math.abs(x2 - x1), Math.abs(x2 - x1));
        }
    }

}

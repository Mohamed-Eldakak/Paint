package demo;

import java.awt.Color;
import java.awt.Graphics;
public class Square extends Rectangle {
        public Square(int x1, int x2, int y1, int y2, Color color) {
        super(x1, x2, y1, y2, color);
        this.y2=this.x2-this.x1+this.y1;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        if (x1 < x2 && y1 < y2) {
            g.drawRect(x1, y1, y2-y1, y2-y1);
        } else if (x1 > x2 && y1 > y2) {
            g.drawRect(x2, y2, Math.abs(x2 - x1), Math.abs(x2 - x1));
        } else if (x1 < x2 && y1 > y2) {
            g.drawRect(x1, y2, Math.abs(x2 - x1), Math.abs(x2 - x1));
        } else if (x1 > x2 && y1 < y2) {
            g.drawRect(x2, y1, Math.abs(x2 - x1), Math.abs(x2 - x1));
        }
    }



}

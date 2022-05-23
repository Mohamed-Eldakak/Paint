package demo;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Oval {

    public Circle(int x1, int x2, int y1, int y2, Color color) {
        super(x1, x2, y1, y2, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        if (x1 < x2 && y1 < y2) {
            g.drawOval(x1, y1, x2 - x1, x2 - x1);
            y2=x2-x1+y1;
        } else if (x1 > x2 && y1 > y2) {
            g.drawOval(x2, y2, Math.abs(x2 - x1), Math.abs(x2 - x1));
            y2=x2-x1+y1;
        } else if (x1 < x2 && y1 > y2) {
            g.drawOval(x1, y2, Math.abs(x2 - x1), Math.abs(x2 - x1));
            y2=x2-x1+y1;
        } else if (x1 > x2 && y1 < y2) {
            g.drawOval(x2, y1, Math.abs(x2 - x1), Math.abs(x2 - x1));
            y2=x2-x1+y1;
        }
    }

}

package demo;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends Shape {

    public Oval(int x1, int x2, int y1, int y2, Color color) {
        super(color, x1, y1, x2, y2);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        if (x1 < x2 && y1 < y2) {
            g.drawOval(x1, y1, x2 - x1, y2 - y1);
        } else if (x1 > x2 && y1 > y2) {
            g.drawOval(x2, y2, Math.abs(x2 - x1), Math.abs(y2 - y1));
        } else if (x1 < x2 && y1 > y2) {
            g.drawOval(x1, y2, Math.abs(x2 - x1), Math.abs(y2 - y1));
        } else if (x1 > x2 && y1 < y2) {
            g.drawOval(x2, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
        }
    }

    @Override
    public boolean contains(int X, int Y) {
        int w = x2 - x1;
        int h = y2 - y1;
        float cx = (x1 + x2) / 2;
        float cy = (y1 + y2) / 2;
        float dx = Math.abs(X - cx);
        float dy = Math.abs(Y - cy);
        return (dx * dx) / (w * w) + (dy * dy) / (h * h) <= 0.25;
    }

    @Override
    public boolean Equals(Shape s) {
        boolean cast = s instanceof Oval;
        if (s == null || !cast) {
            return false;
        }
        Oval r = (Oval) s;
        boolean equals = false;
        if (r.getX1() == this.x1 && r.getX2() == this.x2 && r.getY1() == this.y1 && r.getY2() == this.y2) {
            equals = true;
        }
        return equals;
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        return (Oval) super.clone();
    }

}

package demo;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

    public Rectangle(int x1, int x2, int y1, int y2, Color color) {
        super(color, x1, y1, x2, y2);

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        if (x1 < x2 && y1 < y2) {
            g.drawRect(x1, y1, x2 - x1, y2 - y1);
        } else if (x1 > x2 && y1 > y2) {
            g.drawRect(x2, y2, Math.abs(x2 - x1), Math.abs(y2 - y1));
        } else if (x1 < x2 && y1 > y2) {
            g.drawRect(x1, y2, Math.abs(x2 - x1), Math.abs(y2 - y1));
        } else if (x1 > x2 && y1 < y2) {
            g.drawRect(x2, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
        }
    }

    @Override
    public boolean contains(int X, int Y) {
        double w = Math.abs(x2 - x1);
        double h = Math.abs(y2 - y1);
        double a = w * h;
        double a1, a2, a3, a4;
        a1 = Triangle.calculateTriangleArea(X, Y, x2, y2, x1, y1);
        a2 = Triangle.calculateTriangleArea(x1, x2, y1, X, y2, Y);
        a3 = Triangle.calculateTriangleArea(X, Y, x1, y1, x2, y2);
        a4 = Triangle.calculateTriangleArea(x2, X, y1, x1, y2, Y);
        if ((a1 + a2 + a3 + a4) <= a) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean Equals(Shape s) {
        boolean cast = s instanceof Rectangle;
        if (s == null || !cast) {
            return false;
        }
        Rectangle r = (Rectangle) s;
        boolean equals = false;
        if (r.getX1() == this.x1 && r.getX2() == this.x2 && r.getY1() == this.y1 && r.getY2() == this.y2) {
            equals = true;
        }
        return equals;
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }

}

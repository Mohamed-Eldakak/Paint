package demo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Line extends Shape {

    public Line(int x1, int y1, int x2, int y2, Color color) {
        super(color, x1, y1, x2, y2);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColor());
        g2.setStroke(new BasicStroke(4));
        g2.drawLine(x1, y1, x2, y2);
    }

    @Override
    public boolean contains(int X, int Y) {
        java.awt.Rectangle r = new java.awt.Rectangle(this.x1,this.y1,Math.abs(this.x1-this.x2),Math.abs(this.y1-this.y2));
        return r.contains(X, Y);
    }

    @Override
    public boolean Equals(Shape s) {
        boolean cast = s instanceof Line;
        if (s == null || !cast) {
            return false;
        }
        Line l = (Line) s;
        return l.getX1() == this.x1 && l.getX2() == this.x2 && l.getY1() == this.y1 && l.getY2() == this.y2;

    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        return (Line) super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

}

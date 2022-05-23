package demo;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements Cloneable{

    protected Color color;
    protected int x1;
    protected int x2;
    protected int y1;
    protected int y2;

    public Shape(Color color) {
        this.color = color;
    }

    public Shape(Color color, int x1, int y1, int x2, int y2) {
        super();
        this.color = color;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public abstract void draw(Graphics g);

    public abstract boolean contains(int X, int Y);//checks if point in shape or not
    
    public abstract boolean Equals(Shape s);

    
}

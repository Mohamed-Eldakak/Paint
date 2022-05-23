package demo;

import java.awt.Color;
import java.awt.Graphics;

public class FilledTriangle extends Triangle {

    public FilledTriangle(Triangle t, Color color) {
        super(t.getArrX()[0], t.getArrX()[1], t.getArrY()[0], t.getArrY()[1], color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillPolygon(getArrX(), getArrY(), 3);
    }

    public Shape clone() throws CloneNotSupportedException {
        FilledTriangle t = new FilledTriangle(this, this.color);
        return t;
    }

}

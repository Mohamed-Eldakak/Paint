/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.Color;

/**
 *
 * @author melda_000
 */
public class ShapeFactory {

    private static ShapeFactory f = null;

    private ShapeFactory() {

    }

    public static ShapeFactory getInstance() {
        if (f == null) {
            f = new ShapeFactory();
        }
        return f;
    }

    public Shape createShape(String shapeType, int x1, int x2, int y1, int y2, Color Color) {

        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle(x1, x2, y1, y2, Color);
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square(x1, x2, y1, y2, Color);
        } else if (shapeType.equalsIgnoreCase("Oval")) {
            return new Oval(x1, x2, y1, y2, Color);
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle(x1, x2, y1, y2, Color);
        } else if (shapeType.equalsIgnoreCase("Triangle")) {
            return new Triangle(x1, x2, y1, y2, Color);
        } else if (shapeType.equalsIgnoreCase("line")) {
            return new Line(x1, y1, x2, y2, Color);
        } else {
            return null;
        }
    }

    public Shape createClone(Shape s) throws CloneNotSupportedException {
        if (s instanceof Rectangle) {
            Rectangle r = (Rectangle) s;
            return r.clone();
        } else if (s instanceof Triangle) {
            Triangle t = (Triangle) s;
            return t.clone();
        } else if (s instanceof Oval) {
            Oval ov = (Oval) s;
            return ov.clone();
        } else if (s instanceof Line) {
            Line l = (Line) s;
            return l.clone();
        }
        return s;
    }
}

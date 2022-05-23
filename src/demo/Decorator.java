package demo;

import java.awt.Color;

public class Decorator {
        public Shape fillShape(Shape s, Color c) {
        if (s instanceof Square) {
            FilledSquare fs = new FilledSquare((Square) s, c);
            return fs;
        } else if (s instanceof Rectangle) {
            FilledRectangle fr = new FilledRectangle((Rectangle) s, c);
            return fr;
        } else if (s instanceof Circle) {
            FilledCircle fc = new FilledCircle((Circle) s, c);
            return fc;
        } else if (s instanceof Oval) {
            FilledOval fo = new FilledOval((Oval) s, c);
            return fo;
        } else if (s instanceof Triangle) {
            FilledTriangle ft = new FilledTriangle((Triangle) s, c);
            return ft;
        } else {
            return null;
        }
    }
}

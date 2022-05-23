package demo;

public class ShapesRelations {
//facade design pattern
    public boolean shapeContains(Shape s, int x, int y) {
        if (s instanceof Rectangle) {
            Rectangle r = (Rectangle) s;
            return r.contains(x, y);
        } else if (s instanceof Square) {
            Square sq = (Square) s;
            return sq.contains(x, y);
        } else if (s instanceof Oval) {
            Oval o = (Oval) s;
            return o.contains(x, y);
        } else if (s instanceof Circle) {
            Circle c = (Circle) s;
            return c.contains(x, y);
        } else if (s instanceof Triangle) {
            Triangle t = (Triangle) s;
            return t.contains(x, y);
        } else if (s instanceof Line) {
            Line l = (Line) s;
            return l.contains(x, y);
        } else {
            return false;
        }
    }

    public boolean isShapeInside(Shape s1, Shape s2) { //checks if s1 is inside s2
        boolean inside = false;
        boolean triangleInside = false;
        if (s2 instanceof Triangle) {
            if (s1.contains(((Triangle) s2).getArrX()[0], ((Triangle) s2).getArrY()[0]) && s1.contains(((Triangle) s2).getArrX()[1], ((Triangle) s2).getArrY()[1]) && s1.contains(((Triangle) s2).getArrX()[2], ((Triangle) s2).getArrY()[2])) {
                triangleInside = true;
            }
        } else if (shapeContains(s1, s2.getX1(), s2.getY1()) && shapeContains(s1, s2.getX2(), s2.getY2())) {
            inside = true;
        }
        return inside || triangleInside;
    }
}

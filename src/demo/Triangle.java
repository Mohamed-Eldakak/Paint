package demo;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape {

    protected int[] arrX = {x1, x2, x2 - (2 * (x2 - x1))};
    protected int[] arrY = {y1, y2, y2};

    public Triangle(int x1, int x2, int y1, int y2, Color color) {
        super(color);
        arrX[0] = x1;
        arrX[1] = x2;
        arrX[2] = x2 - (2 * (x2 - x1));
        arrY[0] = y1;
        arrY[1] = y2;
        arrY[2] = y2;
    }

    public int[] getArrX() {
        return arrX;
    }

    public void setArrX(int[] arrX) {
        this.arrX = arrX;
    }

    public int[] getArrY() {
        return arrY;
    }

    public void setArrY(int[] arrY) {
        this.arrY = arrY;
    }

    public void setCoOrditanes(int x1, int x2, int y) {
        arrX[1] = x2;
        arrX[2] = x2 - (2 * (x2 - x1));
        arrY[1] = y;
        arrY[2] = y;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawPolygon(getArrX(), getArrY(), 3);
    }

    public static double calculateTriangleArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0;
        area = 0.5 * (Math.abs(x2 - x3)) * (Math.abs(y2 - y1));
        return area;
    }

    public static double calculateAreaTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0;
        double a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    @Override
    public boolean contains(int X, int Y) {
        boolean found = false;
        if (arrX[1] > arrX[2]) {
            if (arrY[0] < arrY[1]) {
                if (X < arrX[1] && X > arrX[2] && Y > arrY[0] && Y < arrY[2]) {
                    double tArea = calculateTriangleArea(arrX[0], arrY[0], arrX[1], arrY[1], arrX[2], arrY[2]);
                    double a = calculateTriangleArea(X, Y, arrX[1], arrY[2], arrX[2], Y);
                    if (a > tArea) {
                        found = false;
                    } else {
                        found = true;
                    }
                    return found;
                }
            } else {
                if (X < arrX[1] && X > arrX[2] && Y < arrY[0] && Y > arrY[2]) {
                    double tArea = calculateTriangleArea(arrX[0], arrY[0], arrX[1], arrY[1], arrX[2], arrY[2]);
                    double a = calculateTriangleArea(X, Y, arrX[1], arrY[2], arrX[2], Y);
                    if (a > tArea) {
                        found = false;
                    } else {
                        found = true;
                    }
                    return found;
                }
            }
        } else if (arrX[2] > arrX[1]) {
            if (arrY[0] < arrY[1]) {
                if (X < arrX[2] && X > arrX[1] && Y > arrY[0] && Y < arrY[2]) {
                    double tArea = calculateTriangleArea(arrX[0], arrY[0], arrX[1], arrY[1], arrX[2], arrY[2]);
                    double a = calculateTriangleArea(X, Y, arrX[1], arrY[2], arrX[2], Y);
                    if (a > tArea) {
                        found = false;
                    } else {
                        found = true;
                    }
                    return found;
                }
            }else{
               if (X < arrX[2] && X > arrX[1] && Y < arrY[0] && Y > arrY[2]) {
                    double tArea = calculateTriangleArea(arrX[0], arrY[0], arrX[1], arrY[1], arrX[2], arrY[2]);
                    double a = calculateTriangleArea(X, Y, arrX[1], arrY[2], arrX[2], Y);
                    if (a > tArea) {
                        found = false;
                    } else {
                        found = true;
                    }
                    return found;
                } 
            }
        }
        return found;
    }

    @Override
    public boolean Equals(Shape s) {
        boolean cast=s instanceof Triangle;
        if(s==null||!cast){
            return false;
        }
        Triangle t = (Triangle) s;
        boolean equals=false;
        if(t.getArrX()[0]==this.arrX[0]&&t.getArrX()[1]==this.arrX[1]&&t.getArrX()[2]==this.arrX[2]&&t.getArrY()[0]==this.arrY[0]){
            if (t.getArrY()[1]==this.arrY[1]) {
                if (t.getArrY()[2]==this.arrY[2]) {
                    equals=true;
                }
            }
        }
        return equals;
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        Triangle t = new Triangle(this.arrX[0],this.arrX[1],this.arrY[0],this.arrY[1], this.color);
        return t;
    }

    public void setContent(int x1,int x2,int y1,int y2){
        arrX[0] = x1;
        arrX[1] = x2;
        arrX[2] = x2 - (2 * (x2 - x1));;
        arrY[0] = y1;
        arrY[1] = y2;
        arrY[2] = y2;
    }
    
    public void setContent(int X,int Y){
        arrX[1] = X;
        arrX[2] = X-(2*X-(2*arrX[0]));
        arrY[1] = Y;
        arrY[2] = Y;
    }
    
}

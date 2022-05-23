package demo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel implements MouseListener, MouseMotionListener {

    int button = -1; //numbers from 0 to 5 , each number represents a shape
    Color currColor = Color.BLACK; //shape color
    private int x1, y1, x2, y2; //coordinates
    static ArrayList<Shape> shapes = new ArrayList<>();
    ShapeFactory shapeFactory = ShapeFactory.getInstance();
    ShapesRelations shapesRelations = new ShapesRelations();
    Decorator deco = new Decorator();
    int selectedIndex = -1;
    int flag = -1;
    Stack<ArrayList> s1 = new Stack();
    Stack<ArrayList> s2 = new Stack();

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public DrawingBoard() {
        addMouseListener(this);
        addMouseMotionListener(this);
        s1.push(new ArrayList());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).draw(g); //looping over array of shapes to draw each shape
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        int cx = me.getX();
        int cy = me.getY();
        s2.clear();
        switch (button) {
            case 8:
                changeColor(me);
                if (flag == -1) {
                    return;
                }
                repaint();
                try {
                    s1.push(copy(shapes));
                } catch (CloneNotSupportedException ex) {
                    Logger.getLogger(DrawingBoard.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("S1= " + s1);
                System.out.println("S2= " + s2);
                break;
            case 10: {
                Shape sh = select(cx, cy);
                if (sh == null) {
                    return;
                }
                for (int i = 0; i < shapes.size(); i++) {
                    if (shapes.get(i).Equals(sh)) {
                        shapes.remove(i);
                    }
                }
                repaint();
                try {
                    s1.push(copy(shapes));
                } catch (CloneNotSupportedException ex) {
                    Logger.getLogger(DrawingBoard.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
            case 12: {
                Shape sh = select(cx, cy);
                if (sh == null) {
                    return;
                }
                Shape t = null;
                int index = 0;
                for (int i = 0; i < shapes.size(); i++) {
                    if (shapes.get(i).Equals(sh)) {
                        try {
                            t = shapeFactory.createClone(shapes.get(i));
                            index = i;
                        } catch (CloneNotSupportedException ex) {
                            System.out.println("X");
                        }
                    }
                }
                if (t != null) {
                    if (t instanceof Triangle) {
                        Triangle tr = (Triangle) shapes.get(index);
                        int trX1 = tr.getArrX()[0] + 100;
                        int trX2 = tr.getArrX()[1] + 100;
                        int trY1 = tr.getArrY()[0] + 100;
                        int trY2 = tr.getArrY()[1] + 100;
                        Triangle cloned = (Triangle) t;
                        cloned.setContent(trX1, trX2, trY1, trY2);
                        shapes.add(cloned);
                    } else {
                        t.setX1(t.getX1() + 50);
                        t.setX2(t.getX2() + 50);
                        t.setY1(t.getY1() + 50);
                        t.setY2(t.getY2() + 50);
                        shapes.add(t);
                    }
                }
                repaint();
                try {
                    s1.push(copy(shapes));
                } catch (CloneNotSupportedException ex) {
                    Logger.getLogger(DrawingBoard.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
            default:
                break;
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        //getting start point
        x1 = me.getX();
        y1 = me.getY();
        s2.clear();
        switch (button) {
            case 0:
                Shape c = shapeFactory.createShape("Circle", x1, x1, y1, y1, currColor); //draw a point to start drawing
                shapes.add(c);
                repaint();
                break;
            case 1:
                Shape l = shapeFactory.createShape("Line", x1, x1, y1, y1, currColor);//draw a point to start drawing
                shapes.add(l);
                repaint();
                break;
            case 2:
                Shape ov = shapeFactory.createShape("Oval", x1, x1, y1, y1, currColor);//draw a point to start drawing
                shapes.add(ov);
                repaint();
                break;
            case 3:
                Shape r = shapeFactory.createShape("Rectangle", x1, x1, y1, y1, currColor);//draw a point to start drawing
                shapes.add(r);
                repaint();
                break;
            case 4:
                Shape t = shapeFactory.createShape("Triangle", x1, x1, y1, y1, currColor);//draw a point to start drawing
                shapes.add(t);
                repaint();
                break;
            case 5:
                Shape s = shapeFactory.createShape("Square", x1, x1, y1, y1, currColor);//draw a point to start drawing
                shapes.add(s);
                repaint();
                break;
            case 9:
            case 11:
                Shape sh = select(x1, y1);
                for (int i = 0; i < shapes.size(); i++) {
                    System.out.println(shapes.get(i).Equals(sh));
                    if (shapes.get(i).Equals(sh)) {
                        selectedIndex = i;
                    }
                }
                break;
            default:
                break;
        }

    }

    public void undo() throws CloneNotSupportedException {;
        if (s1.size() > 1) {
            s2.push(s1.pop());
            shapes = copy(s1.peek());
            repaint();
        }
    }

    public void redo() throws CloneNotSupportedException {
        if (s2.size() > 0) {
            s1.push(s2.pop());
            shapes = copy(s1.peek());
            repaint();
        }
    }

    private ArrayList<Shape> copy(ArrayList<Shape> x) throws CloneNotSupportedException {
        ArrayList<Shape> ar = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            ar.add(shapeFactory.createClone(x.get(i)));
        }
        return ar;
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        selectedIndex = -1;
        if (button == 8 || button == 10 || button == 12 || flag == -1) {
            return;
        }
        if (button != -1) {
            try {
                s1.push(copy(shapes));
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(DrawingBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("S1= " + s1);
            System.out.println("S2= " + s2);
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

    @Override
    public void mouseDragged(MouseEvent me) {
        //painting shapes with dragging
        switch (button) {
            case 0: {
                x2 = me.getX();
                y2 = me.getY();
                Shape s = shapes.get(shapes.size() - 1);
                if (s instanceof Circle) {
                    Circle c = (Circle) s;
                    c.setX2(x2);
                    c.setY2(y2);
                }
                repaint();
                flag = 0;
                break;
            }
            case 1: {
                x2 = me.getX();
                y2 = me.getY();
                Shape s = shapes.get(shapes.size() - 1);
                if (s instanceof Line) {
                    Line l = (Line) s;
                    l.setX2(x2);
                    l.setY2(y2);
                }
                repaint();
                flag = 0;
                break;
            }
            case 2: {
                x2 = me.getX();
                y2 = me.getY();
                Shape s = shapes.get(shapes.size() - 1);
                if (s instanceof Oval) {
                    Oval ov = (Oval) s;
                    ov.setX2(x2);
                    ov.setY2(y2);
                }
                repaint();
                flag = 0;
                break;
            }
            case 3: {
                x2 = me.getX();
                y2 = me.getY();
                Shape s = shapes.get(shapes.size() - 1);
                if (s instanceof Rectangle) {
                    Rectangle r = (Rectangle) s;
                    r.setX2(x2);
                    r.setY2(y2);
                }
                repaint();
                flag = 0;
                break;
            }
            case 4: {
                x2 = me.getX();
                y2 = me.getY();
                Shape s = shapes.get(shapes.size() - 1);
                if (s instanceof Triangle) {
                    Triangle t = (Triangle) s;
                    t.setCoOrditanes(x1, x2, y2);
                }
                repaint();
                flag = 0;
                break;
            }
            case 5: {
                x2 = me.getX();
                y2 = me.getY();
                Shape s = shapes.get(shapes.size() - 1);
                if (s instanceof Square) {
                    Square sq = (Square) s;
                    sq.setX2(x2);
                    sq.setY2(y2);
                }
                repaint();
                flag = 0;
                break;
            }
            case 9: {
                x2 = me.getX();
                y2 = me.getY();
                moveShape(x2, y2);
                repaint();
                break;
            }
            case 11: {
                x2 = me.getX();
                y2 = me.getY();
                resizeShape(x2, y2);
                repaint();
                break;
            }

            default:
                break;
        }
    }

    @Override
    public void mouseMoved(MouseEvent me) {

    }

    public Shape select(int x, int y) {
        double a = 0;
        double[] arr = new double[100];
        ArrayList<Shape> temp = new ArrayList<>();
        int in = 0;
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).contains(x, y)) {
                if (shapes.get(i) instanceof Triangle) {
                    Triangle t = (Triangle) shapes.get(i);
                    a = Triangle.calculateTriangleArea(x1, y, t.getArrX()[1], y2, t.getArrX()[2], y);
                } else {
                    a = Triangle.calculateTriangleArea(x, y, shapes.get(i).getX2(), shapes.get(i).getY2(), shapes.get(i).getX1(), shapes.get(i).getY2());
                }
                arr[in] = a;
                in++;
                temp.add(shapes.get(i));
            }
        }

        int index = 0;
        double min = arr[0];
        for (int j = 0; j < in; j++) {
            if (arr[j] < min) {
                index = j;
            }
        }
        try {
            return temp.get(index);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public void moveShape(int x, int y) {
        if (selectedIndex == -1) {
            return;
        }
        if (shapes.get(selectedIndex) instanceof Triangle) {
            Triangle tr = (Triangle) shapes.get(selectedIndex);
            int base = (tr.getArrX()[1] - tr.getArrX()[2]) / 2;
            int height = tr.getArrY()[1] - tr.getArrY()[0];
            tr.setContent(x, x + base, y, y + height);
            flag = 0;
        } else {
            int var1 = shapes.get(selectedIndex).getX1();
            int var2 = shapes.get(selectedIndex).getX2();
            int var3 = shapes.get(selectedIndex).getY1();
            int var4 = shapes.get(selectedIndex).getY2();
            shapes.get(selectedIndex).setX1(x);
            shapes.get(selectedIndex).setY1(y);
            shapes.get(selectedIndex).setX2(var2 + (x - var1));
            shapes.get(selectedIndex).setY2(var4 + (y - var3));
            flag = 0;
        }
    }

    public void resizeShape(int x, int y) {
        if (selectedIndex == -1) {
            return;
        }
        if (shapes.get(selectedIndex) instanceof Triangle) {
            Triangle tr = (Triangle) shapes.get(selectedIndex);
            tr.setContent(x, y);
            flag = 0;
        } else {
            shapes.get(selectedIndex).setX2(x2);
            shapes.get(selectedIndex).setY2(y2);
            flag = 0;
        }
    }

    public void changeColor(MouseEvent me) {
        int currX = me.getX();
        int currY = me.getY();
        Shape sh = select(currX, currY);
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).Equals(sh)) {
                shapes.set(i, deco.fillShape(shapes.get(i), currColor));
                flag = 0;
            }
        }
        currColor = MainGUI.ctemp;
    }

}

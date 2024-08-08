// Interface Shape
interface Shape1 {
    void drawshape();
}

// Class Rectangle implements Shape
class Rectangle1 implements Shape1 {
    public void drawshape() {
        System.out.println("Rectangle");
    }
}

// Class Triangle implements Shape
class Triangle1 implements Shape1 {
    public void drawshape() {
        System.out.println("Triangle");
    }
}

// Class Hexagon implements Shape
class Hexagon1 implements Shape1 {
    public void drawshape() {
        System.out.println("Hexagon");
    }
}

// Main class
public class Q_9 {
    public static void main(String[] args) {
        Shape1 r = new Rectangle1();
        Shape1 t = new Triangle1();
        Shape1 h = new Hexagon1();

        r.drawshape();
        t.drawshape();
        h.drawshape();
    }
}

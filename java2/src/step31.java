class Shape {
    public void draw() {
        System.out.println("shape");
    }
}

class Line extends Shape {
    public void draw() {
        System.out.println("line");
    }
}
class Rect extends Shape {
    public void draw() {
        System.out.println("rect");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("circle");
    }
}

public class step31 {
    static void paint(Shape p) {
        p.draw();
    }

    public static void main(String[] args) {
        Line line = new Line();
        paint(line);
        paint(new Line());
        paint(new Shape());
        paint(new Rect());
        paint(new Circle());
    }
}

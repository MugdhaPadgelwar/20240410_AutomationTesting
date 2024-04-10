package aspire;

// Shape class (parent class)
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Circle class (subclass of Shape)
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Rectangle class (subclass of Shape)
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Triangle class (subclass of Shape)
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        // Polymorphism example with shapes
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        for (Shape shape : shapes) {
            shape.draw(); // Calls overridden draw method of each shape
        }
    }
}

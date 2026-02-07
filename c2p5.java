// Abstract class
abstract class Shape {
    // Abstract method (empty body)
    abstract void numberOfSides();
}

// Subclass Rectangle
class Rectangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Number of sides in a Rectangle: 4");
    }
}

// Subclass Triangle
class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Number of sides in a Triangle: 3");
    }
}

// Subclass Hexagon
class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Number of sides in a Hexagon: 6");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Polymorphism: Reference of type Shape, object of type Rectangle/Triangle/Hexagon
        Shape s;

        s = new Rectangle();
        s.numberOfSides();

        s = new Triangle();
        s.numberOfSides();

        s = new Hexagon();
        s.numberOfSides();
    }
}
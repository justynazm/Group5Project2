package project2;

    public class ShapeTester {
        public static void main(String[] args) {
            Circle circle = new Circle(2.5);
            Square square = new Square(6);

            System.out.println("Circle Area: " + circle.calculateArea());
            System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

            System.out.println("Square Area: " + square.calculateArea());
            System.out.println("Square Perimeter: " + square.calculatePerimeter());
        }
    }



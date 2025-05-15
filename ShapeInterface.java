import java.util.Scanner;

public class ShapeInterface {
    interface Shape {
        void area();
    }

    // Rectangle Class implementing Shape
    static class Rectangle implements Shape {
        public double length;
        public double breadth;

        Rectangle(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        @Override
        public void area() {
            double result = length * breadth;
            System.out.println("Area of Rectangle: " + result);
        }
    }

    // Triangle Class implementing Shape
    static class Triangle implements Shape {
        public double base;
        public double height;

        Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public void area() {
            double result = 0.5 * base * height;
            System.out.println("Area of Triangle: " + result);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rectangle input and calculation
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();
        Shape rect = new Rectangle(length, breadth);
        rect.area();

        // Triangle input and calculation
        System.out.print("Enter base of triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = scanner.nextDouble();
        Shape tri = new Triangle(base, height);
        tri.area();

        scanner.close();
    }
}

import java.util.Scanner;

abstract class Shape {
    public double dim1;
    public double dim2;

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}

class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {
    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    double area() {
        return 0.5 * dim1 * dim2;
    }
}

public class AbstactShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        Shape rectangle = new Rectangle(length, width);
        System.out.println("Area of Rectangle: " + rectangle.area());

        // Input for Triangle
        System.out.print("Enter base of triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = scanner.nextDouble();

        Shape triangle = new Triangle(base, height);
        System.out.println("Area of Triangle: " + triangle.area());

        scanner.close();
    }
}

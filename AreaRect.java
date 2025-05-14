
import java.util.Scanner;

public class AreaRect {
    public static void main(String[] args) {
        Area a1 = new Area();
        System.out.print("Enter the length of rectangle: ");
        try (Scanner sc = new Scanner(System.in)) {
            int length = sc.nextInt();
            System.out.print("Enter the breadth of rectangle: ");
            int breadth = sc.nextInt();
            a1.setDim(length, breadth);
            System.err.println(a1.getArea());
        }

    }
}

class Area {
    double length;
    double breadth;

    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}

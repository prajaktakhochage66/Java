
import java.util.Scanner;

public class AraeReact {
    public static void main(String[] args) {
        Area a1 = new Area();
        a1.setDim();
        System.err.println("Area of reactanagle is " + a1.getArea());
    }
}

class Area {
    public double length;
    public double breath;

    public void setDim() {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter length of reactanagle:");
        double length = sc.nextDouble();
        System.err.println("Enter breath of reactanagle:");
        double breath = sc.nextDouble();
        this.length = length;
        this.breath = breath;
    }

    public double getArea() {
        return length * breath;
    }
}

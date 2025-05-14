
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not prime.");
        }

        for (int i = 2; i < i * i;) {
            if (number == 2) {
                System.out.println(number + " is prime.");
                break;
            }

            if (number % i == 0) {
                System.out.println(number + " is not prime.");
            } else {
                System.out.println(number + " is prime.");
            }
            break;
        } sc.close();
    }
}

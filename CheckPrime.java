
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.err.println("Number is not prime");
        }

        for (int i = 2; i < i * i;) {
            if (number == 2) {
                System.err.println("Number is prime");
                break;

            }

            if (number % 2 == 0) {
                System.err.println("Number is not prime.");
            } else {
                System.err.println("Number is prime.");
            }
            break;
        }
        sc.close();
    }
}

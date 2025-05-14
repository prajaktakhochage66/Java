import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] matrix1 = new int[2][2];
            int[][] matrix2 = new int[2][2];
            int[][] result = new int[2][2];

            System.out.println("Enter elements of first 2x2 matrix:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter elements of second 2x2 matrix:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }

            System.out.println("Choose an operation:");
            System.out.println("1.Addition\n2.Multiplication\n3.Transpose of First Matrix");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            result[i][j] = matrix1[i][j] + matrix2[i][j];
                        }
                    }
                    System.out.println("Resultant Matrix after Addition:");
                }
                case 2 -> {
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            result[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j];
                        }
                    }
                    System.out.println("Resultant Matrix after Multiplication:");
                }
                case 3 -> {
                    System.out.println("Transpose of First Matrix:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print(matrix1[j][i] + " ");
                        }
                        System.out.println();
                    }
                    return;
                }
                default -> {
                    System.out.println("Invalid choice!");
                    return;
                }
            }

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
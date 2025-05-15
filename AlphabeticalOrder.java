import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] names = new String[10];

            // Input 10 names
            System.out.println("Enter 10 names:");
            for (int i = 0; i < 10; i++) {
                names[i] = scanner.nextLine();
            }

            // // Sort the names alphabetically
            // Arrays.sort(names);

            // Sorting the names using bubble sort
            for (int i = 0; i < 9; i++) {
                for (int j = i + 1; j < 10; j++) {
                    if (names[i].compareToIgnoreCase(names[j]) > 0) {
                        // Swap names[i] and names[j]
                        String temp = names[i];
                        names[i] = names[j];
                        names[j] = temp;
                    }
                }
            }

            // Display sorted names
            System.out.println("\nNames in alphabetical order:");
            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}

// Enter 10 names:
// Aniket
// Parvej
// Raj
// Ritesh
// Sumit
// Aray
// Ganesh
// Laxman
// Prasad
// Piyush

// Names in alphabetical order:
// Aniket
// Aray
// Ganesh
// Laxman
// Parvej
// Piyush
// Prasad
// Raj
// Ritesh
// Sumit

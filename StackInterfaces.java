import java.util.Scanner;

public class StackInterfaces {

    // Stack Interface
    interface Stack {

        public static int getSize() {
            return size;
        }
        int size = 5;

        void push(int value);
        int pop();
        void display();
        boolean overflow();
        boolean underflow();
    }

    // IntegerStack Class implementing Stack Interface
    static class IntegerStack implements Stack {
        private final int[] stack = new int[size];
        private int top = -1;

        @Override
        public void push(int value) {
            if (overflow()) {
                System.out.println("Stack Overflow! Cannot push " + value);
            } else {
                stack[++top] = value;
                System.out.println("Pushed: " + value);
            }
        }

        @Override
        public int pop() {
            if (underflow()) {
                System.out.println("Stack Underflow! Cannot pop");
                return -1;
            } else {
                int popped = stack[top--];
                System.out.println("Popped: " + popped);
                return popped;
            }
        }

        @Override
        public void display() {
            if (top == -1) {
                System.out.println("Stack is empty");
            } else {
                System.out.print("Stack contents: ");
                for (int i = 0; i <= top; i++) {
                    System.out.print(stack[i] + " ");
                }
                System.out.println();
            }
        }

        @Override
        public boolean overflow() {
            return top == size - 1;
        }

        @Override
        public boolean underflow() {
            return top == -1;
        }
    }

    // Main method with switch-case menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerStack stack = new IntegerStack();
        int choice, value;

        while (true) {
            System.out.println("\n=== Stack Operations Menu ===");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter value to push: ");
                    value = scanner.nextInt();
                    stack.push(value);
                }
                case 2 -> stack.pop();
                case 3 -> stack.display();
                case 4 -> {
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

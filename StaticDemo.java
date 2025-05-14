class StaticDemo {
    // Static variable
    static int count;

    // Static block
    static {
        System.out.println("Static block executed!");
        count = 10;
    }

    // Static method
    static void displayCount() {
        System.out.println("Count: " + count);
    }
    
    public static void main(String[] args) {
        System.out.println("Main method executed!");

        // Accessing static method without creating an object
        StaticDemo.displayCount();
    }
}

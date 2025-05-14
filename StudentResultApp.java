import java.util.Scanner;

public class StudentResultApp {

    // a. Student class
    static class Student {
        protected int rollNo;

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public int getRollNo() {
            return rollNo;
        }
    }

    // b. Test class extends Student
    static class Test extends Student {
        protected int sub1, sub2;

        public void setMarks(int sub1, int sub2) {
            this.sub1 = sub1;
            this.sub2 = sub2;
        }

        public int getSub1() {
            return sub1;
        }

        public int getSub2() {
            return sub2;
        }
    }

    // c. Sports interface
    interface Sports {

        public static int getsMarks() {
            return sMarks;
        }
        int sMarks = 20; // default sports marks

        void set(); // sets sports marks (used in Result)
    }

    // d. Result class inherits Test and implements Sports
    static class Result extends Test implements Sports {
        private int sportsMarks;

        @Override
        public void set() {
            
            this.sportsMarks = sMarks;
        }

        public void displayResult() {
            int total = sub1 + sub2 + sportsMarks;
            System.out.println("\n--- Student Result ---");
            System.out.println("Roll Number: " + rollNo);
            System.out.println("Subject 1 Marks: " + sub1);
            System.out.println("Subject 2 Marks: " + sub2);
            System.out.println("Sports Marks: " + sportsMarks);
            System.out.println("Total Marks: " + total);
        }
    }

    // e. Main method to test functionality
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Result result = new Result();
            
            // Get roll number
            System.out.print("Enter Roll Number: ");
            int rollNo = scanner.nextInt();
            result.setRollNo(rollNo);
            
            // Get subject marks
            System.out.print("Enter marks for Subject 1: ");
            int sub1 = scanner.nextInt();
            System.out.print("Enter marks for Subject 2: ");
            int sub2 = scanner.nextInt();
            result.setMarks(sub1, sub2);
            
            // Set sports marks
            result.set();
            
            // Display result
            result.displayResult();
        }
    }
}

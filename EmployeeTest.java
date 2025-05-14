public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Aniket", "Gawade", -3000);
        Employee employee2 = new Employee("Ritesh", "Patil", 4000);
        Employee employee3 = new Employee("Parvej", "Mulani", 5000);

        System.out.println(employee1.getFirstName() + " " + employee1.getFirstName() + " Yearly Salary: " + employee1.getYearlySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getFirstName() + " Yearly Salary: " + employee2.getYearlySalary());
        System.out.println(employee3.getFirstName() + " " + employee3.getFirstName() + " Yearly Salary: " + employee3.getYearlySalary());

        employee1.giveRaise();
        employee2.giveRaise();
        employee3.giveRaise();

        System.out.println("\nAfter 10% raise:");

        employee1.disPlaydata();
        employee2.disPlaydata();
        employee3.disPlaydata();
    }
}

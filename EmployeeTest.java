public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeClass employee1 = new EmployeeClass("Aniket", "Gawade", 50000);

        EmployeeClass employee2 = new EmployeeClass("Parvej", "Mulani", 60000);

        System.err.println(employee1.getFName() + " Yearly Salary: " + employee1.getYearlySalary());
        System.err.println(employee2.getFName() + " Yearly Salary: " + employee2.getYearlySalary());

        employee1.giveRiseSalary();
        employee2.giveRiseSalary();

        System.err.println("After 10% raise: ");

        employee1.displayData();
        employee2.displayData();
    }
}

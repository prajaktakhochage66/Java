
public class EmployeeClass {
    public String fn;
    public String ln;
    public double msalary;

    public EmployeeClass(String fn, String ln, double msalary) {
        this.fn = fn;
        this.ln = ln;
        if (msalary > 0) {
            this.msalary = msalary;
        } else {
            this.msalary = 0.0;
        }
    }

    public String getFName() {
        return fn;
    }

    public void setFName(String fn) {
        this.fn = fn;
    }

    public String getLName() {
        return ln;
    }

    public void setLName(String ln) {
        this.ln = ln;
    }

    public double getMsalary() {
        return msalary;
    }

    public void setMsalary(double msalary) {
        this.msalary = msalary;
    }

    public double getYearlySalary() {
        return msalary * 12;
    }

    public void giveRiseSalary() {
        msalary += msalary * 0.10;
    }

    public void displayData() {
        System.out.println(getFName() + " " + getLName() + "Yearly Salary: " + getYearlySalary());
    }
}
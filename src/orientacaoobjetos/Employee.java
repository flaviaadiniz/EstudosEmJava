package orientacaoobjetos;

public class Employee {

    String name;
    double grossSalary;
    double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double getNetSalary() {
        return grossSalary * (1 - tax/100);
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage/100;
    }

    public String toString() {
        return "Employee: " + name + " | Net Salary: "  + getNetSalary();
    }

}

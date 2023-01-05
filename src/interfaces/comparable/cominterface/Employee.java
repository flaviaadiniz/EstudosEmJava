package interfaces.comparable.cominterface;

public class Employee implements Comparable<Employee> {

    private String name;
    private Double salary;
    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // Para organizar por ordem de salário, trocar 'name' por 'salary' e 'getName()' por 'getSalary()'
    // Para organizar em ordem decrescente, colocar - na frente de 'name'
    @Override
    public int compareTo(Employee other) {
        return name.compareTo(other.getName());
    }

}

package lists.exercicio1;

public class Employee {

    private Integer id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        setId(id);
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id != null) {
            this.id = id;
        } else {
            System.err.println("O ID deve ser um número!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percentage) {
        salary += salary * percentage/100;
    }

    @Override
    public String toString() {
        return "FUNCIONÁRIO - " +
                "ID: " + id +
                " | NOME: " + name +
                " | SALÁRIO: " + salary;
    }
}

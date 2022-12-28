package orientacaoobjetos;

public class Student {

    public String name;
    public double grade1, grade2, grade3;

    public Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public void getResult() {
        double media = grade1 + grade2 + grade3;
        if (media >= 60) {
            System.out.println("FINAL GRADE = " + media + "\nPASS");
        } else {
            double missing = 60 - media;
            System.out.println("FINAL GRADE = " + media + "\nFAILED \nMISSING " + missing + " POINTS");
        }
    }

}

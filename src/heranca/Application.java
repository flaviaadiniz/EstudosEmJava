package heranca;

public class Application {

    public static void main(String[] args) {

        Account acc1 = new Account(1000, "Flávia", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1001, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1002, "João", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

        //Classe final: não pode ter subclasses
        //Método final: não pode ser sobreposto

    }

}

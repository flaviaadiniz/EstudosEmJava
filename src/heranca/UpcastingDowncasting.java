package heranca;

public class UpcastingDowncasting {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Flávia Diniz", 50000.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria da Silva", 35000.0, 5000.0);

        // UPCASTING - transformar objeto de uma subclasse em objeto da superclasse
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "João da Silva", 3000.0, 200.0 );
        Account acc3 = new SavingsAccount(1004, "Marcelo da Silva", 3000.0, 0.05);


        // DOWNCASTING - transformar objeto da superclasse em objeto de uma subclasse
        // Para transformar um objeto do tipo Account em BusinessAccount, é preciso fazer um cast
        BusinessAccount acc4 = (BusinessAccount) acc1;
        acc4.loan(200.0); //pode ser feito por causa do cast da linha 18


        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        } //não entra neste if pq a acc3 não é instância de BusinessAccount


        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Updated!");
        } //entra neste if pq acc3 é instância de SavingsAccount

    }

}

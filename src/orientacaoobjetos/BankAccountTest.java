package orientacaoobjetos;

import java.util.Scanner;

public class BankAccountTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Let's create your bank account.");

        BankAccount bankAccount;

        System.out.print("Enter account holder: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Is there an initial deposit (y/n)? ");
        char deposit = scanner.next().charAt(0);

        if (deposit == 'y') {
            System.out.print("Enter initial deposit: ");
            double balance = scanner.nextDouble();
            bankAccount = new BankAccount(name, accountNumber, balance);
            System.out.println(bankAccount);
        } else {
            bankAccount = new BankAccount(name, accountNumber);
            System.out.println(bankAccount);
        }


        System.out.print("Enter a deposit value: ");
        double newDeposit = scanner.nextDouble();
        bankAccount.deposit(newDeposit);
        System.out.println(bankAccount);


        System.out.print("Enter a withdraw value: ");
        double newWithdraw = scanner.nextDouble();
        bankAccount.withdraw(newWithdraw);
        System.out.println(bankAccount);

        scanner.close();

    }
}

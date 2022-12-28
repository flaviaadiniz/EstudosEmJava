package orientacaoobjetos;

public class BankAccount {

    private String name;
    private final int accountNumber;
    private double balance;

    public BankAccount(String name, int accountNumber, double initialDeposit) {
        this.name = name;
        this.accountNumber = accountNumber;
        deposit(initialDeposit);
    }

    public BankAccount(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5;
    }

    @Override
    public String toString() {
        return "\n[Account Data]" +
                "\nName: " + name +
                " | Account Number: " + accountNumber +
                " | Balance: " + balance +
                "\n";
    }
}

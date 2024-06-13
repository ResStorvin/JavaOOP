package Day1;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        System.out.println("Account created with initial balance: " + initialBalance);
        displayCurrentBalance();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Successfully Deposited " + amount + " to the account.");
        displayCurrentBalance();
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("successfully Withdrawn " + amount + " to the account.");
            displayCurrentBalance();
        }else {
            System.out.println("Insufficient Funds");
        }
    }

    public void displayCurrentBalance(){
        System.out.println("Current Balance: " + balance);
    }
}
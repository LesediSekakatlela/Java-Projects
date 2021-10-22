package Lesedi;

public class Main {

    public static void main(String[] args) {
        Account leesAccount = new Account("Lee");
        leesAccount.deposit(1000);
        leesAccount.withdraw(500);
        leesAccount.withdraw(-200);
        leesAccount.deposit(-20);
        leesAccount.calculateBalance();
        leesAccount.balance = 5000;

        System.out.println("Balance on account is " + leesAccount.getBalance());
        leesAccount.transactions.add(4500);
        leesAccount.calculateBalance();
    }
}

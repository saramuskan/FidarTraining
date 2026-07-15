package JavaTraining;


class BankAccount {

    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        System.out.println("Balance: " + b.getBalance());

        b.setBalance(2000);

        System.out.println("New Balance: " + b.getBalance());
    }
}
package encapulation;

public class Account {
    private  long accountNumber;
    private String accountHolderName;
    private double balance;

    private static String BANK_NAME = "KBL";

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public long  getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static String  getBANK_NAME() {
        return BANK_NAME;
    }

    static void main(String[] args) {
        // can call static variables without objects
        System.out.println(Account.getBANK_NAME());

        Account a = new Account();
        a.setAccountHolderName("Kunal Chaudhary");
        System.out.println(a.getAccountHolderName());

        a.setAccountNumber(1334523424L);
        System.out.println(a.getAccountNumber());

        a.setBalance(340999909L);
        System.out.println(a.getBalance());
    }
}

// Create a class AC having two methods on and off and two subclass heater and cooler. Use the concept of polymorphism
// take temperature as a input from user, if temperature > 25 turn on cooler, if < 15 turn on heater.

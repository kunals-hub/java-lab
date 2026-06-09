package polymorphism.compiletime;

public class Account {
    void deposit() {
        System.out.println("Account deposit");
    }

    void deposit(double amount) {
        System.out.println("Account deposit amount: " + amount);
    }

    void deposit(long accountNumber, double amount) {
        System.out.println(accountNumber + " deposit amount: " + amount);
    }

    static void main(String[] args) {
        Account a = new Account();
        a.deposit();
        a.deposit(500);
        a.deposit(132434, 10000);
    }
}

// WAP to achieve
// a. simple inheritance
// b. multilevel
// c. muiltiple
// d. herirachial
// e. hybrid
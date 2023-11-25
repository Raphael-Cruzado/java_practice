package BankAccountMethod;

class BankAccount {
    String accountHolderName;
    String accountNumber;
    Double accountBalance;

    void deposit(double amount) {
        accountBalance += amount;

        System.out.printf("Receipt { $%.2f deposited. New balance is $%.2f }\n", amount, accountBalance);
    }

    void withdraw (double amount) {
        accountBalance -= amount;

        System.out.printf("Receipt { $%.2f withdrawn. New balance is $%.2f }\n", amount, accountBalance);
    }
}

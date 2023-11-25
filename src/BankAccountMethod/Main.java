package BankAccountMethod;


class Main {
    public static void main(String[] args) {
        BankAccount account = makeBankAccount("Lance Cruzado", "21-573-6291");

        applyInterest(account, 0.10);
        payBills(account, 400.00, 150.00, 50.00);
        System.out.println();
        depositChecks(account, 1495.72, 500.00);
        System.out.println();

        displayAccountInfo(account);
    }

    public static BankAccount makeBankAccount(String name, String value) {
        BankAccount account = new BankAccount();

        account.accountHolderName = name;
        account.accountNumber = value;
        account.accountBalance = 0.00;

        return account;
    }

    public static void displayAccountInfo (BankAccount account) {
        System.out.println("Account number      : " + account.accountNumber);
        System.out.println("Account holder name : " + account.accountHolderName);
        System.out.printf("Account Balance     : $%.2f%n", account.accountBalance);
    }

    public static void chargeServiceFee(BankAccount account, double fee) {
        account.accountBalance -= fee;
    }

    public static void applyInterest(BankAccount account, double interestRate) {
        account.accountBalance += interestRate * account.accountBalance;
    }

    public static void payBills(BankAccount account, double rent, double utilities, double phone) {
        account.withdraw(rent);
        account.withdraw(utilities);
        account.withdraw(phone);
    }

    public static void depositChecks(BankAccount account, double payCheck, double commission) {
        account.deposit(payCheck);
        account.deposit(commission);
    }

}

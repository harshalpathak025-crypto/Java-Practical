class BankAccount {
    // Private fields
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getter methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit! Amount must be positive.");
        } else {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        }
    }

    // Withdrawal method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal! Amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Withdrawal failed! Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        }
    }

    // Display account details
    public void displayAccount() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("Harshal", "123456789", 5000);

        // Display initial details
        System.out.println("Initial Account Details:");
        account.displayAccount();

        // Valid deposit
        System.out.println("\n--- Testing Deposits ---");
        account.deposit(2000);

        // Invalid deposits
        account.deposit(-500);
        account.deposit(0);

        // Valid withdrawal
        System.out.println("\n--- Testing Withdrawals ---");
        account.withdraw(1000);

        // Invalid withdrawals
        account.withdraw(-200);
        account.withdraw(0);
        account.withdraw(10000);

        // Display final balance
        System.out.println("\n--- Final Account Details ---");
        account.displayAccount();
    }
}

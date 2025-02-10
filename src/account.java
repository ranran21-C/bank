/**
 * Represents a bank account with basic deposit and withdrawal Operations
 */

class account {
    private static int lastId = 0; // Tracks the last assigned ID
    private final String firstName;
    private final int id;
    private final String lastName;
    private double balance;

    /**
     * Constructs an account with a given first name and last name.
     * initial balance set to 0.0.
     * @param lastName it's the last name of the account holder
     * @param firstName is first name of the account holder
     */


    public account(String firstName, String lastName) {
        this.id = ++lastId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.balance=0.0;
    }

    /**
     * The amount must be greater than zero
     * @throws IllegalArgumentException if the amount is less than or equal zero
     */
    public void deposit (double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Invalid amount must be greater than 0");

        }
        this.balance += amount;
    }

    /**
     * withdrawal a specific amount from the account
     * @param amount OF withdrawal
     * @throws IllegalArgumentException if the amount is less than zero or exceeds the balance
     */
    public void withdrawal(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount must be greater than 0");
        }
        if (amount > balance) {
            throw new IllegalArgumentException(String.format(
                    "Invalid amount [%.2f]. It cannot be greater than the account balance [%.2f].", amount, balance
            ));
        }
        balance -= amount; // Deduct the amount only if it's valid
        System.out.println("Withdrawal successful! Current balance: " + balance);
    }






    /**
     * GET THE ACCOUNT BALANCE
     * @return The current balance of the account
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns a spring representation of the account details
     * @return formatted string containing the account holder name and last named balance
     */
    public  String toString() {

        return "ID #" + id + ": " + firstName + " " + lastName + " | Balance: $" + String.format("%.2f", balance);
    }

}












/**
 * Represents a bank account with basic deposit and withdrawal Operations
 */

public class account {
    private static int lastId = 0; // Tracks the last assigned ID
    private final int id;
    private final String lastName;
    private final String firstName;
    private double balance;
    private double amount;

    /**
     * Construts an account with a given first nale and last name.
     * initial balance set to 0.0.
     * @param lastName its the last name of the account holder
     * @param firstName is first name of the account holder
     */

    public account(String lastName, String firstName) {
        this.id = ++lastId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = 0.0;
    }

    /**
     * The amount must be greater than zero
     * @param amount
     * @throws IllegalArgumentException if the amount is less than or equal zero
     */
        public void deposit (double amount){
            if (amount <= 0){
                throw new IllegalArgumentException("Invalid amount must be greater than 0");

        }
        this.balance += amount;
    }

    /**
     * withdrawll a specific amount from the account
     * @param amount OF withdrawll
     * @throws IllegalArgumentException if the amount is less than zero or exceeds thebalance
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
     * Get the first name of the holder of the account
     * @return the first name of the holder of the account
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Get the last name of the account holder
     * @returnthe last nameof the holder of the acount
     */
    public String getlastName(){
    return  lastName;
   }

    /**
     * get the Id num
     * @return id num either 1 2 3 it depend son how many people entered
     */
    public int getId() {
        return id;
    }

    /**
     * GET THE ACOUNT BALANCE
     * @return The current balance of the account
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns a spring representation of the account details
     * @return aformatted string containing the account holder name and last nameand balance
     */
    public  String toString() {

        return "ID #1: " + firstName + " " + lastName+ " | Balance: $" + String.format("%.2f", balance);
    }
}








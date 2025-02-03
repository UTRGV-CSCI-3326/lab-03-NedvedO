public class BankAccount{
    public static void main(String args[]){
        double checkingAccount = 2175.37;


        // Bob's transactions
        checkingAccount -= 302.50;  // Withdraw $302.50
        checkingAccount += 50.03;   // Deposit $50.03
        checkingAccount -= checkingAccount / 2; // Withdraw half of current balance
        checkingAccount += 20.00;   // Deposit $20.00
        checkingAccount -= 1.00;    // Withdraw $1
        checkingAccount *= 2;       // Deposit paycheck (double the balance)
        checkingAccount += 1.00;    // Deposit $1

        // Output the final balance
        System.out.println("Bob's new balance: $" + checkingAccount);
    }
}

public class Main {
    public static void main(String[] args) {
        // object creation for subclass 
        BankAccount savings = new SavingsAccount("Sharanya T", 2000);
         System.out.println("Savings Account Details:");
        savings.deposit(2000);
        savings.withdraw(500);
        savings.displayDetails();
        savings.currentBalance();
    }
}

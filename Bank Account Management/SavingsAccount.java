// Inheritance -->using super keyword calling
class SavingsAccount extends BankAccount {
    public SavingsAccount(String AccountHolderName, double balance) {
        //super keyword used to inherit parentclass functionality to childclass using super keyword
        super(AccountHolderName, balance);
    }

  //  @Override
    // display details
    public void displayDetails() {
        //System.out.println("Savings Account Details:");
        System.out.println("Account Holder Name: " + getAccountHolderName());
        System.out.println("Balance: " + getbalance());
    }
}


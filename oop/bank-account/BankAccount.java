public class BankAccount {


    private double checkingBal;
    private double savingsBal;
    //need to track total amount of accounts
    public static int numOfAccounts = 0;
    //need to track all monies stored in every account
    //static double total;

    public BankAccount(){
        numOfAccounts++;
    }



    public void transaction(String type, String account, int amount){
        if (type == "deposit") {
            if(account == "checking") {
                this.checkingBal += amount;
                System.out.println("You have deposited into your checking account in the amount of $" + amount + ". Your current checking balance is now $" + this.checkingBal);
                System.out.println("---------------------------------------------------------------");
            }
            else if (account == "savings") {
                this.savingsBal += amount;
                System.out.println("You have deposited into your savings account in the amount of $" + amount + ". Your current savings balance is now $" + this.savingsBal);
                System.out.println("---------------------------------------------------------------");
            }
            else {
                System.out.println("Must enter Checking or Savings to make a deposit");
                System.out.println("---------------------------------------------------------------");
            }
        }
        else if(type == "withdrawal") {
            if(account == "checking") {
                if(this.checkingBal < amount) {
                    System.out.println("Not enough money in your account to withdraw!");
                    System.out.println("---------------------------------------------------------------");
                    return;
                }
                this.checkingBal -= amount;
                System.out.println("You have taken $" + amount + " out of your checking account. Your current checking balance is now $" + this.checkingBal);
                System.out.println("---------------------------------------------------------------");
            }
            else if(account == "savings") {
                if(this.savingsBal < amount) {
                    System.out.println("Not enough money in your account to withdraw!");
                    System.out.println("---------------------------------------------------------------");
                    return;
                }
                this.savingsBal -= amount;
                System.out.println("You have taken $" + amount + " out of your savings account. Your current savings balance is now $" + this.savingsBal);
                System.out.println("---------------------------------------------------------------");
            }
            else {
                System.out.println("Must enter Checking or Savings to make a deposit");
                System.out.println("---------------------------------------------------------------");
            }
        }
        else {
            System.out.println("Must enter deposit or withdrawal in order to complete transaction!");
            System.out.println("---------------------------------------------------------------");
        }
    }


    //Method to see both account balances
    public void allBalances() {
        double all = this.checkingBal + this.savingsBal;
        System.out.println("Total balance from both Checking and Savings: " + all);
    }


    //////////////// GETTERS AND SETTERS //////////////////

    //Setter for the checking balance 
    public void SetCheckingBal(double amount) {
        this.checkingBal = amount;
    }
    //Setter for the savings balance
    public void setSavingsBal(double amount) {
        this.savingsBal = amount;
    }


    //Getter for the checking balance
    public double getCheckingBal() {
        System.out.println("Checking account balance: " + this.checkingBal);
        return this.checkingBal;
    }
    //Getter for the savings balance
    public double getSavingsBal() {
        System.out.println("Savings account balance: " + this.savingsBal);
        return this.savingsBal;
    }


}
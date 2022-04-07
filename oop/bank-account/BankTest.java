public class BankTest {
    public static void main(String[] args){
        //System.out.println("hello world");

        BankAccount acc1 = new BankAccount();

        acc1.transaction("deposit", "checking", 700);
        acc1.transaction("deposit", "checking", 700);
        acc1.transaction("deposit", "savings", 200);
        acc1.transaction("withdrawal", "checking", 700);
        acc1.transaction("withdrawal", "savings", 100);
        acc1.transaction("withdrawal", "savings", 200);
        acc1.transaction("withdrawal", "checking", 351);
        acc1.transaction("withdrawal", "savings", 326);
        
        acc1.allBalances();
    }
}

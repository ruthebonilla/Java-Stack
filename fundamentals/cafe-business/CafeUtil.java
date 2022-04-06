import java.util.ArrayList;

public class CafeUtil {

    //sum total of all ints from 1-10
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += i;
        }
        return sum;
    }


    //sum all prices from array and add total
    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }


    //print out each menu item and index from ArrayList
    public void displayMenu(ArrayList<String> menuItems) {
        int i = 0;
        for (String item : menuItems) {
            System.out.println(i + " " + item);
            i++;
        }
    }


    // add customer
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }
}
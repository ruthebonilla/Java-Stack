public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly! ";
        String readyMessage = ", your order is ready! ";
        String displayTotalMessage = " Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 10.99;
        double dripCoffeePrice = 12.29;
        double lattePrice = 50.89;
        double cappuccinoPrice = 7.99;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        //Cindhuri
        System.out.println(generalGreeting + customer1 ); // Displays "Welcome to Cafe Java, Cindhuri"
        if (isReadyOrder1) {
            System.out.println(customer1 + pendingMessage );
        }else{
            System.out.println(customer1 + readyMessage + displayTotalMessage + mochaPrice);
        }

        System.out.println("-------------------------------------------------");

        // Noah
        System.out.println(generalGreeting + customer4 );
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage + displayTotalMessage + cappuccinoPrice);
        }else{
            System.out.println(customer4 + pendingMessage );
        }

        System.out.println("-------------------------------------------------");

        // Sam
        System.out.println(generalGreeting + customer2 + displayTotalMessage + lattePrice*2);
        if (isReadyOrder2) {
            System.out.println(customer2 + pendingMessage );
        }else{
            System.out.println(customer2 + readyMessage);
        }

        System.out.println("-------------------------------------------------");

        // Jimmy
        System.out.println("Sorry about that " + customer3 );
        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));

    }
}
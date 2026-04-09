import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // UC2
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("===================================");

        List<String> passengerBogies = new ArrayList<>();

        // Adding bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // Removing bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing Bogie:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // Checking existence
        System.out.println("\nChecking if Sleeper exists:");
        System.out.println(passengerBogies.contains("Sleeper"));
    }
}
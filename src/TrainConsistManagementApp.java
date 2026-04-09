import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // ================= UC1 =================
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());


        // ================= UC2 =================
        System.out.println("\nUC2 - Add Passenger Bogies to Train");
        System.out.println("===================================");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing Bogie:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        System.out.println("\nChecking if Sleeper exists:");
        System.out.println(passengerBogies.contains("Sleeper"));


        // ================= UC3 =================
        System.out.println("\nUC3 - Track Unique Bogie IDs");
        System.out.println("============================");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate

        System.out.println("\nAfter Adding Bogie IDs:");
        System.out.println("Bogie IDs : " + bogieIds);

        System.out.println("\nNote: Duplicate IDs are automatically removed.");


        // ================= UC4 =================
        System.out.println("\nUC4 - Maintain Ordered Bogie IDs");
        System.out.println("================================");

        LinkedList<String> trainOrder = new LinkedList<>();

        trainOrder.add("Engine");
        trainOrder.add("Sleeper");
        trainOrder.add("AC");
        trainOrder.add("Cargo");
        trainOrder.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println("Train Bogies : " + trainOrder);

        // Insert Pantry Car at position 2
        trainOrder.add(1, "Pantry Car");

        System.out.println("\nAfter Adding Pantry Car:");
        System.out.println("Train Bogies : " + trainOrder);

        // Remove first and last
        trainOrder.removeFirst();
        trainOrder.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println("Train Bogies : " + trainOrder);
    }
}
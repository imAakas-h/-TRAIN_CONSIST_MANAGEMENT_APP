import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

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


        // ================= UC3 =================
        System.out.println("\nUC3 - Track Unique Bogie IDs");
        System.out.println("============================");

        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (with duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("\nAfter Adding Bogie IDs:");
        System.out.println("Bogie IDs : " + bogieIds);

        System.out.println("\nNote: Duplicate IDs are automatically removed.");
    }
}
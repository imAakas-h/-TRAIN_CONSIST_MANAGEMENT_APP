import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize train consist (empty list)
        List<String> trainConsist = new ArrayList<>();

        // Step 3: Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Step 4: Continue program
        System.out.println("Program is ready for further operations...");
    }
}
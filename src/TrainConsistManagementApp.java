import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC18: Linear Search for Bogie ID ===");

        // Array of bogie IDs (unsorted)
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        // Search key (you can change this)
        String searchKey = "BG309";

        System.out.println("Searching for: " + searchKey);

        boolean found = false;

        // 🔍 Linear Search
        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println("Bogie found at index: " + i);
                break; // early termination
            }
        }

        // Result
        if (found) {
            System.out.println("Search Result: BOGIE EXISTS");
        } else {
            System.out.println("Search Result: BOGIE NOT FOUND");
        }
    }
}
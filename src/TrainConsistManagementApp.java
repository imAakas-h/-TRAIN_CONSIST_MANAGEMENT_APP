import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC20: Exception Handling During Search Operations ===");

        // Bogie data (try empty array to test exception)
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309"
        };

        String searchKey = "BG205";

        try {

            // 🔴 Step 1: Validate state before searching
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available. Search operation not allowed.");
            }

            // 🔍 Step 2: Linear search (after validation)
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchKey)) {
                    found = true;
                    break;
                }
            }

            // 🔹 Step 3: Result
            if (found) {
                System.out.println("Search Result: BOGIE EXISTS");
            } else {
                System.out.println("Search Result: BOGIE NOT FOUND");
            }

        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}
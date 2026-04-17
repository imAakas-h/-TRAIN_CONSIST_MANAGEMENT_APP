import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC19: Binary Search for Bogie ID ===");

        // Unsorted input (to show requirement handling)
        String[] bogieIds = {
                "BG309",
                "BG101",
                "BG550",
                "BG205",
                "BG412"
        };

        String searchKey = "BG205";

        // 🔹 Step 1: Sort before Binary Search (mandatory precondition)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Array: " + Arrays.toString(bogieIds));

        // 🔹 Binary Search Initialization
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // 🔍 Binary Search Loop
        while (low <= high) {

            int mid = (low + high) / 2;

            int compareResult = bogieIds[mid].compareTo(searchKey);

            if (compareResult == 0) {
                found = true;
                System.out.println("Bogie found at index: " + mid);
                break;
            }
            else if (compareResult < 0) {
                low = mid + 1; // search right side
            }
            else {
                high = mid - 1; // search left side
            }
        }

        // 🔹 Result
        if (found) {
            System.out.println("Search Result: BOGIE EXISTS");
        } else {
            System.out.println("Search Result: BOGIE NOT FOUND");
        }
    }
}
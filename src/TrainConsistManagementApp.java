import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC17: Sort Bogie Names Using Arrays.sort() ===");

        // Input array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // 🔹 Built-in Sorting
        Arrays.sort(bogieNames);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogieNames));
    }
}
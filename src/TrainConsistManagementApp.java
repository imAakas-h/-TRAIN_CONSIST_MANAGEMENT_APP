import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC16: Sort Passenger Bogies (Bubble Sort) ===");

        // Sample capacities (you can modify or take input)
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        printArray(capacities);

        // 🔁 Bubble Sort Logic
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // 🔄 Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("After Sorting:");
        printArray(capacities);
    }

    // Helper method to print array
    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
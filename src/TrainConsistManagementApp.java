import java.util.*;

public class TrainConsistManagementApp {

    // ===============================
    // 🔴 Custom Exception
    // ===============================
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ===============================
    // 🚆 Passenger Bogie Class
    // ===============================
    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) throws InvalidCapacityException {

            // Fail-Fast Validation
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.type = type;
            this.capacity = capacity;
        }
    }

    // ===============================
    // 🚀 Main Method
    // ===============================
    public static void main(String[] args) {

        System.out.println("=== UC14: Handle Invalid Bogie Capacity ===");

        try {
            // ✅ Valid Bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created Bogie: " + b1.type + " | Capacity: " + b1.capacity);

            // ❌ Invalid Bogie (Uncomment to test)
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}
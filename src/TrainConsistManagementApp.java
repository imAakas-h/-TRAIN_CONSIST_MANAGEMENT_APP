import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    // Simple PassengerBogie (for capacity filtering test)
    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC13: Performance Comparison (Loop vs Stream) ===");

        // Create dataset (large for better measurement)
        List<PassengerBogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new PassengerBogie("Sleeper", (i % 100)));
        }

        // ===============================
        // 🔹 Loop-Based Filtering
        // ===============================
        long loopStart = System.nanoTime();

        List<PassengerBogie> loopResult = new ArrayList<>();
        for (PassengerBogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // ===============================
        // 🔹 Stream-Based Filtering
        // ===============================
        long streamStart = System.nanoTime();

        List<PassengerBogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // ===============================
        // Results
        // ===============================
        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);
    }
}
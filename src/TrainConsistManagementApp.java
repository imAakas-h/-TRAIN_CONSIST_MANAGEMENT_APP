import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    // Simple GoodsBogie class (if not already created earlier)
    static class GoodsBogie {
        String type;   // Cylindrical, Open, Box
        String cargo;  // Petroleum, Coal, Grain

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        // === UC12: Safety Compliance Check ===
        System.out.println("=== UC12: Safety Compliance Check for Goods Bogies ===");

        List<GoodsBogie> bogies = new ArrayList<>();

        // Sample data (you can replace with user input if needed)
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        // Try invalid case:
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Stream + allMatch validation
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Output result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}
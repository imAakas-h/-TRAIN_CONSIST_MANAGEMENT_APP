import java.util.*;

public class TrainConsistManagementApp {

    // ===============================
    // 🔴 Custom Runtime Exception
    // ===============================
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ===============================
    // 🚆 Goods Bogie Class
    // ===============================
    static class GoodsBogie {
        String type;   // Cylindrical / Rectangular
        String cargo;

        GoodsBogie(String type) {
            this.type = type;
        }

        // Cargo Assignment Method
        void assignCargo(String cargo) {
            try {
                // 🚫 Unsafe Rule
                if (type.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Unsafe: Cannot assign Petroleum to Rectangular bogie"
                    );
                }

                // ✅ Safe Assignment
                this.cargo = cargo;
                System.out.println("Cargo assigned: " + cargo + " to " + type + " bogie");

            } catch (CargoSafetyException e) {
                System.out.println("Exception: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed.\n");
            }
        }
    }

    // ===============================
    // 🚀 Main Method
    // ===============================
    public static void main(String[] args) {

        System.out.println("=== UC15: Safe Cargo Assignment ===");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // ✅ Safe Case
        b1.assignCargo("Petroleum");

        // ❌ Unsafe Case (Handled)
        b2.assignCargo("Petroleum");

        // ✅ Another Safe Case
        b2.assignCargo("Coal");

        System.out.println("Program continues safely...");
    }
}
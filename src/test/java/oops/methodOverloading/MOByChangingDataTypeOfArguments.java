package oops.methodOverloading;

public class MOByChangingDataTypeOfArguments {
    // Class Adder contains overloaded methods to add numbers
    static class Adder {
        // Method to add two integers
        static int add(int a, int b) {
            return a + b;
        }

        // Method to add two doubles
        static double add(double a, double b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        // Calling the add method with two integers
        System.out.println(Adder.add(11, 11)); // Output: 22
        // Calling the add method with two doubles
        System.out.println(Adder.add(12.3, 12.6)); // Output: 24.9
    }
}

package oops.methodOverloading;
//Method overloading in Java is the feature that enables defining several methods in a class having the same name but with different parameters lists.

// Class Adder contains overloaded methods to add numbers
public class MOByChangingNoOfArguments {
    // Class Adder contains overloaded methods to add numbers
    static class Adder {
        // Method to add two integers
        static int add(int a, int b) {
            return a + b;
        }

        // Method to add two doubles
        static int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    public static void main(String[] args) {
        // Calling the add method with two integers
        System.out.println(Adder.add(11, 11)); // Output: 22
        // Calling the add method with two doubles
        System.out.println(Adder.add(12, 12, 12)); // Output: 24.9
    }
}
package oops.polymorphism;

/*
In Java, method overloading is used to achieve compile-time polymorphism.
A class can have numerous methods with the same name but distinct parameter lists thanks to method overloading.
The compiler uses the amount and kind of parameters provided to it during compilation to decide which method to call. This choice is made during compilation, which is why it's called "compile-time polymorphism."

The methods in method overloading must have the same name but differ in the quantity or kind of parameters.
Based on the inputs passed in during the method call, the compiler chooses the suitable overloaded method when a method is called.
In the event of a perfect match, that procedure is used. If not, the compiler uses broadening to find the closest match depending on the parameter types.
 */
public class CompileTimePolymorphism {
     static class Calculation {
        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        Calculation calc = new Calculation();
        // Compile-time polymorphism: selecting the appropriate add method based on parameter types
        System.out.println("Sum of integers: " + calc.add(5, 3));
        System.out.println("Sum of doubles: " + calc.add(2.5, 3.7));
    }
}
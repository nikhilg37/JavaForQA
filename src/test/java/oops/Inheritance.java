package oops;

/*
Inheritance in Java enables a class to inherit properties and actions from another class, called a superclass or parent class. A class derived from a superclass is called a subclass or child group. Through inheritance, a subclass can access members of its superclass (fields and methods), enforce reuse rules, and encourage hierarchy.

Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

Why use inheritance?
For Method Overriding (so runtime polymorphism can be achieved).
For Code Reusability.
 */

public class Inheritance {
    protected String brand = "Ford";        // Vehicle attribute

    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Inheritance {
    private String modelName = "Mustang";    // Car attribute

    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}



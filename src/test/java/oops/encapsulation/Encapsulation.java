package oops.encapsulation;
//Encapsulation in Java is a process of wrapping code and data together into a single unit.

public class Encapsulation {
    public static void main(String[] args) {
        // Create an object of the Encapsulation class
        Person data = new Person();

        // Set values using setter methods
        data.setName("John");
        data.setAge(25);

        // Get values using getter methods
        System.out.println("Name: " + data.getName());
        System.out.println("Age: " + data.getAge());
    }
}

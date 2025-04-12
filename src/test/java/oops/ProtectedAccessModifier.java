package oops;
import oops.accessModifiers.Protected;

public class ProtectedAccessModifier extends Protected {
    public void accessProtectedMembers() {
        // Accessing protected members from the Parent class
        System.out.println(message); // Accessing protected variable
        displayMessage();            // Accessing protected method
    }

    public static void main(String[] args) {
        ProtectedAccessModifier child = new ProtectedAccessModifier();
        child.accessProtectedMembers(); // Accessing protected members via the subclass
    }
}

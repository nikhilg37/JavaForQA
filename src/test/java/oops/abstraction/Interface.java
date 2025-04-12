package oops.abstraction;

//Another way to achieve abstraction in Java, is with interfaces.
interface Print {
    void print();
}

//Creating a class that implements Printable
class Printer implements Print {
    public void print() {
        System.out.println("Hello");
    }
}

//Creating a class that creates objects and call methods
public class Interface {
    public static void main(String args[]) {
        Print p = new Printer();
        p.print();
    }
}


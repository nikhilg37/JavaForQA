package oops.abstraction;

//Data abstraction is the process of hiding certain details and showing only essential information to the user.
//Abstraction can be achieved with either abstract classes or interfaces

abstract class Abstraction {
    abstract void draw();

    static class Rectangle extends Abstraction {
        void draw() {
            System.out.println("drawing rectangle");
        }
    }

    static class Circle extends Abstraction {
        void draw() {
            System.out.println("drawing circle");
        }
    }

    public static void main(String[] args) {
        Abstraction nik = new Circle();
        nik.draw();
    }
}




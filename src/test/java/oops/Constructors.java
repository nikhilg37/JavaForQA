package oops;
/*
There are the following rules for defining a constructor:

1. Constructor name must be the same as its class name.
2. A Constructor must have no explicit return type.
3. A Java constructor cannot be abstract, static, final, and synchronized.
*/

public class Constructors {

    int modelYear;
    String modelName;

    public Constructors(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructors myCar = new Constructors(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
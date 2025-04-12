package collections;

import java.util.ArrayList;
import java.util.Iterator;

/*
In Java, an Iterator is one of the Java cursors.
Java Iterator is an interface that is practiced in order to iterate over a collection of Java object components entirety one by one.
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> cityNames = new ArrayList<String>();

        cityNames.add("Delhi");
        cityNames.add("Mumbai");
        cityNames.add("Kolkata");
        cityNames.add("Chandigarh");
        cityNames.add("Noida");

        // Iterator to iterate the cityNames
        Iterator iterator = cityNames.iterator();

        System.out.println("CityNames elements : ");

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
    }
}

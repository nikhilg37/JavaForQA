package oops;
import java.util.Scanner;
/*
A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

Built-in Packages (packages from the Java API)
User-defined Packages (create your own packages)

In the example above, java.util is a package, while Scanner is a class of the java.util package.
*/

class Package {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}

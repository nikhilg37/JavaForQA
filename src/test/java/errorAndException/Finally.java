package errorAndException;
/*
Java finally block is a block used to execute important code such as closing the connection, etc.

Java finally block is always executed whether an exception is handled or not.
Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not.
 */
public class Finally {
    public static void main(String args[]) {
        try {
//below code do not throw any exception
            int data = 25 / 0;
            System.out.println(data);
        }
//catch won't be executed
        catch (ArithmeticException e) {
            System.out.println(e);
        }
//executed regardless of exception occurred or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code...");
    }
}

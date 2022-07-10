// Introducing Execute Around Method Pattern - Venkat Subramaniam
// external resource: database connection, socket, remote server, file
// how do we get rid of the external resource?
// automatic garbage collector?
// Approach 1. finalize(): bad idea! - deprecated in Java 9
// Approach 2. System.gc(): bad idea! - doesn't collect the garbage
// Approach 3. automatic resource management in Java 7: bad idea!
// Approach 4. execute around method pattern in Java 8: good idea!

public class Main {
    public static void main(String[] args) {
        ResourceC.use(resource -> resource.op1().op2());
    }
}
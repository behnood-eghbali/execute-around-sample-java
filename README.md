# execute-around-sample-java
# Introducing Execute Around Method Pattern - Venkat Subramaniam

external resource: database connection, socket, remote server, file

how do we get rid of the external resource?

automatic garbage collector?

:large_blue_diamond: Approach 1. finalize(): bad idea! - deprecated in Java 9 :no_entry:

:large_blue_diamond: Approach 2. System.gc(): bad idea! - doesn't collect the garbage :unamused:

:large_blue_diamond: Approach 3. automatic resource management in Java 7: bad idea! :confused:

:large_blue_diamond: Approach 4. execute around method pattern in Java 8: good idea! :heart_eyes: :bulb:

public class ExceptionHandling {
    public static void main(String[] args) {
        // Exception thrown in below code
        // int number =   Integer.parseInt("Hello");
        try {
            int number =   Integer.parseInt("Hello");
            System.out.println(number);
        } catch (NumberFormatException ne) {
            System.out.println("Cannot parse integer out of string");
        }


        // Theory of Exceptions
        /*
            - Objects
                - Throwable -> for errors
                - Exceptions -> for exceptions
                    - In build Exceptions -> Available in JVM
                        - Checked Exceptions -> throws at compile time
                            - For E.g. ClassNotFound, IOException, FileNotFound etc
                        - Unchecked Exceptions -> throws at run time
                            - NullPointer, NumberFormatException, ArrayIndexOutOfBound
                    - User define exceptions

            try {
                // block of code to monitor for errors
                // the code you think can raise an exception
                // No code runs after the line of code exception occurred in try block
            } catch (ExceptionType1 exOb) {
                // exception handler for ExceptionType1
            } catch (ExceptionType2 exOb) {
                // exception handler for ExceptionType2
            }

            OR catch (ExceptionType1 | ExceptionType2 exOb) {
                // exception handler for ExceptionType1 or ExceptionType2
            }

            // optional but if used it will always get executed
            // even, if there is a return statement in try block
            finally {  // block of code to be executed after try block ends
            }

         */
    }
}

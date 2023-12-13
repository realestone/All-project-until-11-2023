package exception17paskaita.example1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * *Exception JAVA kalboje yra tam tikras ivykis. Eventas.
 * Pagrindiniai eventai arba exceptionai programoje gali nutikti del keletas dalyku :
 * 1.Dinges internetas
 * 2. Invalid input data.
 * 3. Kodo klaidos.
 * 4. Nepakankama atmintis.
 * Exception handling mechanizmas JAVA reikalingas tam, kad galetume nesutrigdyti programos veikimo ir jo testi toliau.
 * Egzistuoja du exceptiono tipai - Unchecked ir Checked.
 * Unchecked exceptions
 * 1.ArithmeticException
 * 2. IndexOutOfBoundsException
 * 3. ClassCastException
 * 4. NullPointerException
 * 5. IllegalArgumentException
 *Unchecked exceptions SHOULD NOT BE HANDLED with try/catch blocks. They should be treated as code bugs and should be fixed.
 * Checked exceptions:
 * 1.FileNotFoundException
 * 2.IOException
 * 3.SQLException
 * These types of exceptions should be handled with try/catch block
 *
 */
public class ExeptionHandlingExampleOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program started..");

        try {
            System.out.println("Doing calculations...");
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            System.out.println("Dividing 10 by " + number);
            int result = 10 / number;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Exception is caught. You can't divide by zero.");
            //ex.printStackTrace(); stack trace isspausdintas.
            //galiu kviesti kitus, galiu daryt ka noriu.
        } catch (InputMismatchException ex) {
            System.out.println("ivedei kazka neto");
        }

        System.out.println("Program proceeding further..");
        System.out.println("Program ENDS.");

    }
}

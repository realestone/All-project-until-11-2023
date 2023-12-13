package exception17paskaita.example3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingExample3 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            readFile();
            System.out.println("Failas yra rastas");
            doSomething();
        } catch (FileNotFoundException e) {
            System.out.println("Failas yra nerastas.");
        } catch (TautvydasJegaException e) {
            System.out.println("Tauvydas nedaro namu darbu");
        }
    }

    private static void readFile() throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(("src/main/resources/products")));

    }
    private static void doSomething() throws TautvydasJegaException {
        throw new TautvydasJegaException("Tautvydas Jega. Bet Nevisada");
    }
}

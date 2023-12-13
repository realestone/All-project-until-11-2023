package exception17paskaita.example3;

public class TautvydasJegaException extends Exception {
    public TautvydasJegaException(String message) {
        super(message);
    }

    private static void doSomething() throws TautvydasJegaException {
        throw new TautvydasJegaException("Tautvydas Jega. Bet Nevisada");
    }
}

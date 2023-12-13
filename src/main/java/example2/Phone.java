package example2;

public class Phone extends Device{
    @Override
    public void work() {
        System.out.println("I am calling people. ");
    }

    public void call(){
        System.out.println("Calling");
    }

    @Override
    public void charge(){
        System.out.println("I am now charging wirelessly");
    }
}

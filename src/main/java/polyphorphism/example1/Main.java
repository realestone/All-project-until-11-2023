package polyphorphism.example1;

public class Main {
    public static void main(String[] args) {

      Bird crow = new Crow();
      crow.fly();

      Bird ostrich = new Ostrich();
      ostrich.fly();

      TautvisBirdSeller tautvis = new TautvisBirdSeller();
      tautvis.sellBird(crow);
      tautvis.sellBird(ostrich);
    }
}

package java_enum.example1_simple;

public class GameLevelMain {
    public static void main(String[] args) {
       // playGame(GameLevel.HARD);
        // playGame(GameLevel.EXPERT);

        playGameUsingSwitch(GameLevel.NORMAL);
        playGameUsingSwitch(GameLevel.SUPER);
    }

    public static void playGameUsingSwitch(GameLevel gameLevel) {
        switch (gameLevel) {
            case EASY:
                System.out.println("You're playing at EASY level. It's a piece of cake!");
                break;
            case NORMAL:
                System.out.println("You're playing at the NORMAL level. Things are getting interesting.");
                break;
            case HARD:
                System.out.println("You're playing at the HARD level. It's quite challenging!");
                break;
            case EXPERT:
                System.out.println("You're playing at the EXPERT level. You're a true master!");
                break;
            default:
                System.out.println("Unknowm game level");


        }
    }

    public static void playGame(GameLevel gameLevel) {
        if (gameLevel == gameLevel.EASY) {
            System.out.println("You're playing at EASY level. It's a piece of cake!");
        } else if (gameLevel == GameLevel.NORMAL) {
            System.out.println("You're playing at the NORMAL level. Things are getting interesting.");
        } else if (gameLevel == gameLevel.HARD) {
            System.out.println("You're playing at the HARD level. It's quite challenging!");
        } else if(gameLevel == gameLevel.EXPERT){
            System.out.println("You're playing at the EXPERT level. You're a true master!");
        } else {
            System.out.println("Unknowm game level");
        }

    }
}


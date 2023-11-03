package testing_without_junit;

public class ExpertInMath {

    public void testTeacherMathSkills() {
        Teacher juozas = new Teacher();
        int result = juozas.doubleTheNumber(10);
        boolean isCorrectResult = (result == 20);
        System.out.println("10 kart 2 yra 20, mokytojas skaiciuoja teisingai -  " + isCorrectResult);
        System.out.println("Mokytojas padvigubines skaiciu 10, gavo - " + result);
    }
}

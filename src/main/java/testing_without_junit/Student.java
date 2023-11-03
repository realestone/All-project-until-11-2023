package testing_without_junit;

public class Student {

    public void doubleNumberToFriends(int numberToDouble) {
        Teacher teacher = new Teacher();
        int result = teacher.doubleTheNumber(numberToDouble);
        System.out.println("Doubled number: " + result);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.doubleNumberToFriends(20);
    }
}

package java_enum.example2_complex;

import static java_enum.example2_complex.Seniority.*;
import static java_enum.example2_complex.UserRole.*;

public class UserMain {
    public static void main(String[] args) {
        User admin = new User("Adminas", ADMIN, JUNIOR);
        User regular = new User("Useris", USER, MID);
        User guest = new User("Svecias", GUEST, SENIOR);

        UserService userService = new UserService();
        userService.displayUserInfo(admin);
        userService.displayUserInfo(regular);
        userService.displayUserInfo(guest);

    }
}

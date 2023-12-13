package java_enum.example2_complex;

import static java.rmi.server.LogStream.log;


public class UserService {

    public void displayUserInfo(User user) {
        System.out.println("Username: " + user.getUserName());
        System.out.println("UserRole: " + user.getUserRole());
        System.out.println("Permission: " + user.getUserRole().getPermission());
        System.out.println("RoleLevel: " + user.getUserRole().getRoleLevel());

    }
}

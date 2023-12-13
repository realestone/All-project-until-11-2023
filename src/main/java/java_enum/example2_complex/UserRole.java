package java_enum.example2_complex;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum UserRole {

    ADMIN("Administrator", "Full access", "admin", 1),
    USER("User", "Basic access", "user", 2),
    GUEST("Guest", "Limited access", "guest", 3),
    MODERATOR("Moderator", "Supervisory access", "moderator", 4);

    private final String roleName;
    private final String permission;
    private final String roleCode;
    private final int roleLevel;

    UserRole(String roleName, String permission, String roleCode, int roleLevel) {
        this.roleName = roleName;
        this.permission = permission;
        this.roleCode = roleCode;
        this.roleLevel = roleLevel;
    }
}

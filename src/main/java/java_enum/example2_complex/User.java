package java_enum.example2_complex;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String userName;
    private UserRole userRole;
    private Seniority seniority;
}


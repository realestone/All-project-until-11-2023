package uzduotislist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProgrammingCourse {

    private String name;
    private int lengthInMonths;
    private  double price;
    private String location;
    private Lecturer lecturer;
    private List<Student> students;


}

package uzduotislist;

import java.util.ArrayList;
import java.util.List;

public class CourseModificationService {

    public Lecturer findMostExperienceLecturer(List<ProgrammingCourse> programmingCourses) {
        Lecturer mostExperienceLecturer = programmingCourses.get(0).getLecturer();
        for (ProgrammingCourse programmingCourse : programmingCourses) {
            if (programmingCourse.getLecturer().getExperience() > mostExperienceLecturer.getExperience()) {
                mostExperienceLecturer = programmingCourse.getLecturer();
            }
        }
        return mostExperienceLecturer;

    }

    void swapLecturersOfGivenTwoGroup(ProgrammingCourse course1, ProgrammingCourse course2) {
        Lecturer lecturer = course1.getLecturer();
        course1.setLecturer(course2.getLecturer());
        course2.setLecturer(lecturer);
    }

    void addStudentToCourse(ProgrammingCourse course, Student student) {
        course.getStudents().add(student);
    }

    void removeStudentFromCourse(ProgrammingCourse course, String name) {
        for (Student student : course.getStudents()) {
            if (student.getName().equalsIgnoreCase(name)) {
                course.getStudents().remove(student);
            }
        }


        }
    }





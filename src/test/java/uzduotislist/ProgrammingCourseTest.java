package uzduotislist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProgrammingCourseTest {


    @Test
    void testIfCourseCreatedCorrectly() {
        List<Student> javaStudents = new ArrayList<>();
        javaStudents.add(new Student("Justas", 26, 6));
        javaStudents.add(new Student("Povilas", 28, 4));
        ProgrammingCourse courseJava = new ProgrammingCourse();
        courseJava.setStudents(javaStudents);
        courseJava.setLecturer(new Lecturer("Edvinas", 8, 2000));
        courseJava.setLengthInMonths(9);
        courseJava.setLocation("Vilnius");
        courseJava.setPrice(2200);
        courseJava.setName("Kodo Kelias");
        List<Student> angularStudents = new ArrayList<>();
        angularStudents.add(new Student("Ugne", 23, 2));
        angularStudents.add(new Student("Gabija", 27, 3));
        ProgrammingCourse courseAngular = new ProgrammingCourse("Angular", 8, 1500,"Kaunas", new Lecturer("Andrius", 5, 1700), angularStudents);

        assertEquals(9, courseJava.getLengthInMonths());
        assertEquals("Justas", javaStudents.get(0).getName());
        assertEquals("Angular", courseAngular.getName());
        assertEquals("Kodo Kelias", courseJava.getName());

    }
    @Test
    void testIfNameGetsRemoved() {
        List<Student> javaStudents = new ArrayList<>();
        javaStudents.add(new Student("Justas", 26, 6));
        javaStudents.add(new Student("Povilas", 28, 4));
        ProgrammingCourse courseJava = new ProgrammingCourse();
        courseJava.setStudents(javaStudents);
        courseJava.setLecturer(new Lecturer("Edvinas", 8, 2000));
        courseJava.setLengthInMonths(9);
        courseJava.setLocation("Vilnius");
        courseJava.setPrice(2200);
        courseJava.setName("Kodo Kelias");
        List<Student> angularStudents = new ArrayList<>();
        angularStudents.add(new Student("Ugne", 23, 2));
        angularStudents.add(new Student("Gabija", 27, 3));
        ProgrammingCourse courseAngular = new ProgrammingCourse("Angular", 8, 1500,"Kaunas", new Lecturer("Andrius", 5, 1700), angularStudents);
        List<ProgrammingCourse> programmingCourses = new ArrayList<>();
        programmingCourses.add(courseAngular);
        programmingCourses.add(courseJava);

        CourseModificationService course = new CourseModificationService();

        course.removeStudentFromCourse(courseAngular, angularStudents.get(0).getName());

        assertEquals(javaStudents.get(1), courseJava);
    }



}
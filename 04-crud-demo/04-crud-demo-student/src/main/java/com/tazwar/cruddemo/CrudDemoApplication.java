package com.tazwar.cruddemo;

import com.tazwar.cruddemo.dao.StudentDAO;
import com.tazwar.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
//            createStudent(studentDAO);
//            createMultipleStudents(studentDAO);
//            readStudent(studentDAO);
//            queryAllStudents(studentDAO);
//            queryStudentsByLastName(studentDAO);
//            updateStudent(studentDAO);
//            deleteStudent(studentDAO);
//            deleteAllStudents(studentDAO);
        };
    }

    private void deleteAllStudents(StudentDAO studentDAO) {
        System.out.println("Deleting all students from DB");
        int rowsDeleted = studentDAO.deleteAll();
        System.out.println("Deleted " + rowsDeleted + " rows from DB");
    }

    private void deleteStudent(StudentDAO studentDAO) {
        int studentId = 2;
        System.out.println("Deleting student with ID = " + studentId);
        studentDAO.delete(studentId);
        System.out.println("Successfully deleted student with ID = " + studentId);
    }

    private void updateStudent(StudentDAO studentDAO) {
        int studentId = 1;
        System.out.println("Getting student with ID = " + studentId);
        Student student = studentDAO.findById(studentId);

        System.out.println("Updating student with ID = " + studentId);
        student.setLastName("Gallagher");
        studentDAO.update(student);

        System.out.println("Student updated: " + student);
    }

    private void queryStudentsByLastName(StudentDAO studentDAO) {
        List<Student> studentList = studentDAO.findByLastName("Mohammed");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    private void queryAllStudents(StudentDAO studentDAO) {

        System.out.println("Finding all students");

        List<Student> studentList = studentDAO.findAll();

        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    private void readStudent(StudentDAO studentDAO) {

        System.out.println("Retrieving student with id = " + 1);

        Student student = studentDAO.findById(1);

        System.out.println("Student retrieved with details => " + student);
    }

    private void createMultipleStudents(StudentDAO studentDAO) {

        System.out.println("Creating 3 students.................");
        Student student1 = new Student("Tazwar", "Mohammad", "tazwarmohammed1998@gmail.com");
        Student student2 = new Student("Mahnoor", "Marium", "mahnoor@gmail.com");
        Student student3 = new Student("Kevin", "De Bruyne", "kdb@gmail.com");

        System.out.println("Saving all the 3 students.....................");
        studentDAO.save(student1);
        studentDAO.save(student2);
        studentDAO.save(student3);
    }

    private void createStudent(StudentDAO studentDAO) {

        System.out.println("Creating new student object..........");
        Student student = new Student("Tazwar", "Mohammed", "tazwarmohammed@yahoo.com");

        System.out.println("Saving the student object...........");
        studentDAO.save(student);

        System.out.println("Saved student!!!! Generated ID " + student.getId());
    }
}

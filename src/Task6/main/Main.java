package Task6.main;

import Task6.service.StudentService;
import Task6.model.Student;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        StudentService studentService = new StudentService();
        Student[] student = studentService.createStudent();


        System.out.println("--------------Print full names of students-----------");
        studentService.printFullName(student);
        System.out.println();

        System.out.println("--------------Print all male students-----------");
        studentService.printAllMaleStudents(student);
        System.out.println();

        System.out.println("--------------Print all female who has mark greater than 50.4-----------");
        studentService.printAllFemaleStudentsMarkGreater50_4(student);
        System.out.println();

        System.out.println("--------------Print student information having the minimal mark-----------");
        studentService.printMinimalMarkStudentInfo(student);
        System.out.println();

        System.out.println("--------------Print biggest male student information-----------");
        studentService.printBiggestMaleInfo(student);
        System.out.println();

        System.out.println("--------------Print students sorted by mark-----------");
        studentService.printStudentSortedByMark(student);
        System.out.println();


        System.out.println("--------------Print female students sorted by year-----------");
        studentService.printFemaleStudentsSortedByYear(student);
        System.out.println();




    }
}


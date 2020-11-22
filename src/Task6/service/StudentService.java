
package Task6.service;

import Task6.model.Student;

import java.io.IOException;

public class StudentService {


    public Student[] createStudent() throws IOException {

        String[] s1 = ReadService.reading();
        Student[] students = new Student[s1.length];

        String firstName;
        String lastName ;
        int year;
        String gender ;
        double mark;

        for (int i = 0; i < s1.length; i++) {

            String[] x = s1[i].split(",");

            firstName = x[0];

            lastName = x[1];

            year = Integer.parseInt(x[2]);

            gender = x[3];

            mark = Double.parseDouble((x[4]));

            students[i] = new Student(firstName, lastName, year, gender, mark);

        }
        return students;


    }

    public void printInfo(Student students) {

        System.out.println(
                "firstName='" + students.getFirstName() + '\'' +
                ", lastName='" + students.getLastName() + '\'' +
                ", year=" + students.getYear() +
                ", gender='" + students.getGender() + '\'' +
                ", mark=" + students.getMark()
                );
    }


    public void printFullName(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getFirstName() + " " + students[i].getLastName());
        }

    }


    public void printAllMaleStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender().equals("m")) {
                printInfo(students[i]);
            }
        }
    }


    public void printAllFemaleStudentsMarkGreater50_4(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender().equals("f") && students[i].getMark() > 50.4) {
                printInfo(students[i]);
            }
        }
    }

    public void printMinimalMarkStudentInfo(Student[] students) {
        double min = students[0].getMark();
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getMark() < min) {
                min = students[i].getMark();
                index = i;
            }
        }
        printInfo(students[index]);
    }

    public void printBiggestMaleInfo(Student[] students) {
        int biggest = students[0].getYear();
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getYear() < biggest) {
                biggest = students[i].getYear();
                index = i;
            }
        }
        printInfo(students[index]);
    }

    public void printStudentSortedByMark(Student[] students) {
        Student temp;
        boolean swaped;
        for (int i = 0; i < students.length - 1; i++) {
            swaped = false;
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].getMark() > students[j + 1].getMark()) {
                    temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swaped = true;

                }
            }
            if (!swaped) {
                break;
            }

        }
        for (int i = 0; i < students.length; i++) {
            printInfo(students[i]);
        }
    }

    public void printFemaleStudentsSortedByYear(Student[] students) {
        Student temp;
        boolean swaped;
        for (int i = 0; i < students.length - 1; i++) {
            swaped = false;
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].getYear() > students[j + 1].getYear()) {
                    temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swaped = true;

                }
            }
            if (!swaped) {
                break;
            }

        }
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender().equals("f")) {
                printInfo(students[i]);
            }

        }
    }
}

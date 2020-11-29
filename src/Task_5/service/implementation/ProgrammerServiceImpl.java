package Task_5.service.implementation;

import Task_5.model.exceptions.InvalidParametersException;
import Task_5.model.programmer.BackEnd;
import Task_5.model.programmer.FrontEnd;
import Task_5.model.programmer.Programmer;
import Task_5.model.programmer.QA;
import Task_5.service.ProgrammerService;
import Task_5.service.validation.GeneralValidation;
import Task_5.service.validation.ProgrammingValidation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

import static Task_5.util.Constants.*;

public class ProgrammerServiceImpl implements ProgrammerService {


    public Programmer createProgrammer() throws InvalidParametersException {

        Programmer programmer = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your id");
        String id = GeneralValidation.id();

        System.out.println("Please enter your working hours");
        int hour = GeneralValidation.hour();

        System.out.println("Please enter your experience");
        int experience = GeneralValidation.experience();

        System.out.println("Please enter your per_Salary");
        double per_Salary = GeneralValidation.per_Salary();

        System.out.println("Please enter true if you are certified employee, otherwise enter false");
        boolean isCertified = GeneralValidation.isCertified();

        System.out.println("Please enter true if you are full time employee, otherwise enter false");
        boolean isFulltime = GeneralValidation.isFulltime();

        System.out.println("Please enter your first name");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name");
        String lastName = scanner.nextLine();

        System.out.println("Please choose your department");
        String department = ProgrammingValidation.department();

        System.out.println("Choose your position");
        String position = ProgrammingValidation.position();

        System.out.println("Choose programming language");
        String language = ProgrammingValidation.language();

        System.out.println("Please enter your programming level");
        String level = ProgrammingValidation.level();

        switch (department) {
            case PROGRAMMING_BACKEND:
                programmer = new BackEnd(id, hour, experience, per_Salary, isCertified, isFulltime, firstName, lastName, department, position, language, level);
            case PROGRAMMING_FRONTEND:
                programmer = new FrontEnd(id, hour, experience, per_Salary, isCertified, isFulltime, firstName, lastName, department, position, language, level);
            case PROGRAMMING_QA:
                programmer = new QA(id, hour, experience, per_Salary, isCertified, isFulltime, firstName, lastName, department, position, language, level);
        }
        return programmer;

    }

    public void printInfo(Programmer programmer) {

        System.out.println("id=" + programmer.getId() +
                ", hours=" + programmer.getHours() +
                ", experience=" + programmer.getExperience() +
                ", per_Salary=" + programmer.getPer_Salary() +
                ", isCertifed=" + programmer.isCertifed() +
                ", isFullTime=" + programmer.isFullTime() +
                ", firstName=" + programmer.getFirtsName() +
                ", LastName=" + programmer.getLastName() +
                ", departmentName=" + programmer.getDepartmentName() +
                ", position=" + programmer.getPosition() +
                ", language=" + programmer.getLanguage() +
                ", level=" + programmer.getLevel()
        );
    }

    private String infoProgrammer(Programmer programmer) {

        return programmer.getId() + "," +
                programmer.getHours() + "," +
                programmer.getExperience() + "," +
                programmer.getPer_Salary() + "," +
                programmer.isCertifed() + "," +
                programmer.isFullTime() + "," +
                programmer.getFirtsName() + "," +
                programmer.getLastName() + "," +
                programmer.getDepartmentName() + "," +
                programmer.getPosition() + "," +
                programmer.getLanguage() + "," +
                programmer.getLevel();
    }


    public void printAllProgramers(Programmer[] programmers) {
        for (Programmer programmer : programmers) {
            printInfo(programmer);
        }
    }

    public void write(Programmer[] programmers) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        new FileOutputStream(path);
        for (int i = 0; i < programmers.length; i++) {
            String s = infoProgrammer(programmers[i]) + "\n";
            Files.write(Paths.get(path), s.getBytes(), StandardOpenOption.APPEND);
        }
    }

    public void write1(Programmer programmer) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter path name");
        String path = scanner.nextLine();
        String s = infoProgrammer(programmer) + "\n";
        Files.write(Paths.get(path), s.getBytes(), StandardOpenOption.APPEND);

    }


    public Programmer[] read(String path) throws IOException {
        String[] data = Files.readAllLines(Paths.get(path)).toArray(new String[0]);
        Programmer[] programmers = new Programmer[data.length];

        for (int i = 0; i < data.length; i++) {

            String[] s = data[i].split(",");

            switch (s[8]) {
                case PROGRAMMING_BACKEND:
                    programmers[i] = new BackEnd(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Double.parseDouble(s[3]), Boolean.parseBoolean(s[4]), Boolean.parseBoolean(s[5]), s[6], s[7], s[8], s[9], s[10], s[11]);
                    break;
                case PROGRAMMING_FRONTEND:
                    programmers[i] = new FrontEnd(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Double.parseDouble(s[3]), Boolean.parseBoolean(s[4]), Boolean.parseBoolean(s[5]), s[6], s[7], s[8], s[9], s[10], s[11]);
                    break;
                case PROGRAMMING_QA:
                    programmers[i] = new QA(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Double.parseDouble(s[3]), Boolean.parseBoolean(s[4]), Boolean.parseBoolean(s[5]), s[6], s[7], s[8], s[9], s[10], s[11]);
                    break;
            }
        }
        return programmers;

    }


    public void printJavaLanguage(Programmer[] programmers) {

        for (int i = 0; i < programmers.length; i++) {
            if (programmers[i].getLanguage().equals("Java")) {
                printInfo(programmers[i]);
            }
        }
    }

    public void seniorLevelBackendProgrammer(Programmer[] programmers) {
        for (Programmer programmer : programmers) {
            if (programmer.getLevel().equals("Senior")) {
                System.out.println(programmer.getFirtsName());
            }
        }
    }

    public void certifiedBackendProgrammersSortedByExperience(Programmer[] programmers) {

        Programmer temp;
        boolean swapped;
        for (int i = 0; i < programmers.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < programmers.length - 1; j++) {
                if (programmers[j].getExperience() > programmers[j + 1].getExperience()) {
                    temp = programmers[j];
                    programmers[j] = programmers[j + 1];
                    programmers[j + 1] = temp;
                    swapped = true;

                }
            }
            if (!swapped) {
                break;
            }
        }
        for (Programmer programmer : programmers) {
            if (programmer.isCertifed()) {
                printInfo(programmer);
            }

        }
    }

    public void cSharpLanguage(Programmer[] programmers) {

        for (Programmer programmer : programmers) {
            if (programmer.getLanguage().equals("C#")) {
                printInfo(programmer);
            }
        }

    }

    public Programmer maxWorkingHour(Programmer[] programmers) {
        Programmer programmer = null;
        int max = 0;

        for (Programmer programmer1 : programmers) {
            if (programmer1.isFullTime() && programmer1.getExperience() > 3) {
                programmer = programmer1;
                max = programmer1.getHours();
                break;
            }
        }

        for (Programmer programmer1 : programmers) {
            if (programmer1.getHours() > max && programmer1.isFullTime() && programmer1.getExperience() > 3) {
                programmer = programmer1;
                max = programmer1.getHours();

            }
        }
        return programmer;

    }


    public void projectComplexity(Programmer programmer, int rate, int day, int hour) {
        int x = programmer.complexityOfCode(rate, day, hour);
        if (x >= 0 && x <= 2) {
            System.out.println("This is project with little complexity");

        } else if (x > 2 && x < 4) {
            System.out.println("This is project with average complexity");

        } else if (x > 4) {
            System.out.println("This is project with high complexity");
        }
    }

}

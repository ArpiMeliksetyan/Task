package Task_5.service.implementation;

import Task_5.model.programmer.BackEnd;
import Task_5.model.programmer.FrontEnd;
import Task_5.model.programmer.Programmer;
import Task_5.model.programmer.QA;
import Task_5.service.ProgrammerService;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ProgrammerServiceImpl implements ProgrammerService {


    public void printInfo(Programmer programmer) {

        System.out.println("id=" + programmer.getId() +
                ", hours=" + programmer.getHours() +
                ", experience=" + programmer.getExperience() +
                ", per_Salary=" + programmer.getPer_Salary() +
                ", isCertifed=" + programmer.isCertifed() +
                ", isFullTime=" + programmer.isFullTime() +
                ", firtsName=" + programmer.getFirtsName() +
                ", LastName=" + programmer.getLastName() +
                ", departmentName='" + programmer.getDepartmentName() +
                ", position=" + programmer.getPosition() +
                ", language=" + programmer.getLanguage() +
                ", level=" + programmer.getLevel()
        );
    }

    public String infoProgrammer(Programmer programmer) {

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


    public Programmer[] read(String path) throws IOException {
        String[] data = Files.readAllLines(Paths.get(path)).toArray(new String[0]);
        Programmer[] programmers = new Programmer[data.length];

        for (int i = 0; i < data.length; i++) {

            String[] s = data[i].split(",");

            switch (s[8]) {
                case "Backend department":
                    programmers[i] = new BackEnd(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Double.parseDouble(s[3]), Boolean.parseBoolean(s[4]), Boolean.parseBoolean(s[5]), s[6], s[7], s[8], s[9], s[10], s[11]);
                    break;
                case "Frontend department":
                    programmers[i] = new FrontEnd(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Double.parseDouble(s[3]), Boolean.parseBoolean(s[4]), Boolean.parseBoolean(s[5]), s[6], s[7], s[8], s[9], s[10], s[11]);
                    break;
                case "QA department":
                    programmers[i] = new QA(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Double.parseDouble(s[3]), Boolean.parseBoolean(s[4]), Boolean.parseBoolean(s[5]), s[6], s[7], s[8], s[9], s[10], s[11]);
                    break;
            }
        } return programmers;

    }


    public void printJavaLanguage(Programmer[] programmers) {

        for (int i = 0; i < programmers.length; i++) {
            if (programmers[i].getLanguage().equals("Java")) {
                printInfo(programmers[i]);
            }
        }
    }

    public void seniorLevelBackendProgrammer(Programmer[] programmers) {
        for (int i = 0; i < programmers.length; i++) {
            if (programmers[i].getLevel().equals("Senior")) {
                System.out.println(programmers[i].getFirtsName());
            }
        }
    }

    public void certifedBackendProgrammersSortedByExperience(Programmer[] programmers) {

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
        for (int i = 0; i < programmers.length; i++) {
            if (programmers[i].isCertifed()) {
                printInfo(programmers[i]);
            }

        }
    }

    public void cSharpLanguage(Programmer[] programmers) {

        for (int i = 0; i < programmers.length; i++) {
            if (programmers[i].getLanguage().equals("C#")) {
                printInfo(programmers[i]);
            }
        }

    }

    public Programmer MaxWorkingHour(Programmer[] programmers) {
        Programmer programmer = null;
        int max = 0;

        for (int i = 0; i < programmers.length; i++) {
            if (programmers[i].isFullTime() && programmers[i].getExperience() > 3) {
                programmer = programmers[i];
                max = programmers[i].getHours();
                break;
            }
        }

        for (int i = 0; i < programmers.length; i++) {
            if (programmers[i].getHours() > max && programmers[i].isFullTime() && programmers[i].getExperience() > 3) {
                programmer = programmers[i];
                max = programmers[i].getHours();

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

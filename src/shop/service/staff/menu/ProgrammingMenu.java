package shop.service.staff.menu;

import shop.exception.InvalidParametersException;
import shop.model.staff.programmer.Programmer;
import shop.service.staff.implementation.ProgrammerServiceImpl;

import java.io.IOException;
import java.util.Scanner;

import static shop.util.constants.Constants.INVALID_NUMBER;


class ProgrammingMenu {
    static void programmingMenu() throws InvalidParametersException {

        System.out.println("Welcome in Programming Menu \n");
        System.out.println("______________________________________________________________________");
        System.out.println("1. Add programmer information in file");
        System.out.println("2. Print all programmers information");
        System.out.println("3. Print those programmers information who know Java language");
        System.out.println("4. Print those programmers information who have Senior level");
        System.out.println("5. Print  programmers information sorted by their experience who are certified");
        System.out.println("6. Print those programmers information who know C# language");
        System.out.println("7. Print programmer information who have worked more, whose working experience bigger than 3 years and work full time");
        System.out.println("8. Calculate project complexity");
        System.out.println("9. If you  want to exit from Programming Menu please enter 0");

        Scanner scanner = new Scanner(System.in);
        ProgrammerServiceImpl programmerService = new ProgrammerServiceImpl();
        System.out.println("\nPlease enter path name of Programmers information ");
        String path = scanner.nextLine();


        boolean t = true;

        while (t) {
            System.out.println("\nPlease enter action number");
            int number = scanner.nextInt();

            switch (number) {

                case 1:
                    Programmer programmer = programmerService.createProgrammer();
                    try {
                        programmerService.write(programmer);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("You saved programmer successfully");
                    break;

                case 2:
                    try {
                        programmerService.printAllProgramers(programmerService.read(path));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    try {
                        programmerService.printJavaLanguage(programmerService.read(path));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    try {
                        programmerService.seniorLevelBackendProgrammer(programmerService.read(path));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    try {
                        programmerService.certifiedBackendProgrammersSortedByExperience(programmerService.read(path));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 6:
                    try {
                        programmerService.cSharpLanguage(programmerService.read(path));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 7:
                    try {
                        programmerService.printInfo(programmerService.maxWorkingHour(programmerService.read(path)));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 8:
                    programmerService.projectComplexity();
                    break;

                case 0:
                    System.out.println("You are exiting from Programming Menu");
                    System.out.println("Welcome in Staff Menu \n");
                    System.out.println("Please choose menu type");
                    System.out.println("1. Accountant Menu");
                    System.out.println("2. Marketing Menu");
                    System.out.println("3. Programmer Menu");
                    System.out.println("4. Sales Manager Menu");
                    System.out.println("5. If you want to exit press 0");
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);

            }

        }
    }
}



package Task_5.service.validation;

import java.util.Scanner;

import static Task_5.util.Constants.*;

public class ProgrammingValidation {

    public static String level() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Junior");
        System.out.println("2. Middle");
        System.out.println("3. Senior");

        boolean t = true;
        String level = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    level = JUNIOR_LEVEL;
                    t = false;
                    break;

                case 2:
                    level = MID_LEVEL;
                    t = false;
                    break;

                case 3:
                    level = SENIOR_LEVEL;
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
        return level;
    }


    public static String language() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Java");
        System.out.println("2. C#");
        System.out.println("3. JS");
        System.out.println("4. Python");
        System.out.println("5. Dart");
        System.out.println("6. CSS");

        boolean t = true;
        String language = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    language = JAVA_LANGUAGE;
                    t = false;
                    break;

                case 2:
                    language = C_SHARP_LANGUAGE;
                    t = false;
                    break;

                case 3:
                    language = JS_LANGUAGE;
                    t = false;
                    break;

                case 4:
                    language = PYTHON_LANGUAGE;
                    t = false;
                    break;

                case 5:
                    language = DART_LANGUAGE;
                    t = false;
                    break;

                case 6:
                    language = CSS_LANGUAGE;
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
        return language;
    }

    public static String position() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. TeamLead");
        System.out.println("2. Software Engineer 1");
        System.out.println("3. Software Engineer 2");
        System.out.println("4. Software Engineer 3");
        System.out.println("5. Architect developer");

        boolean t = true;
        String position = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    position = TEAM_LEAD_PROGRAMMER;
                    t = false;
                    break;
                case 2:
                    position = SOFTWARE_ENGINEER_LEVEL_1;
                    t = false;
                    break;

                case 3:
                    position = SOFTWARE_ENGINEER_LEVEL_2;
                    t = false;
                    break;

                case 4:
                    position = SOFTWARE_ENGINEER_LEVEL_3;
                    t = false;
                    break;

                case 5:
                    position = ARCHITECT_DEVELOPER;
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);

            }
        }
        return position;
    }

    public static String department() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Backend department");
        System.out.println("2. Frontend department");
        System.out.println("3. QA department");

        boolean t = true;
        String department = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    department = PROGRAMMING_BACKEND;
                    t = false;
                    break;
                case 2:
                    department = PROGRAMMING_FRONTEND;
                    t = false;
                    break;

                case 3:
                    department = PROGRAMMING_QA;
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);

            }
        }
        return department;

    }

}

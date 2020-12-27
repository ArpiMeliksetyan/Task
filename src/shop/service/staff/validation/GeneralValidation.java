package shop.service.staff.validation;



import shop.exception.InvalidParametersException;

import java.util.Scanner;

import static shop.util.constants.Constants.*;


public class GeneralValidation {

    public static String id() throws InvalidParametersException {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();

        try {
            InvalidParametersException.check(id.length() != 9, INVALID_PARAMETER);
        } catch (InvalidParametersException e) {
            e.printStackTrace();
            throw new InvalidParametersException(INVALID_ID_PARAMETER);

        }

        return id;
    }

    public static boolean isFulltime() {

        System.out.println("____________________________________");
        System.out.println("1. True");
        System.out.println("2. False");

        Scanner scanner = new Scanner(System.in);
        boolean isFulltime = false;
        boolean t = true;
        while (t) {
            int y = scanner.nextInt();
            switch (y) {
                case 1:
                    isFulltime = true;
                    t = false;
                    break;

                case 2:
                    isFulltime = false;
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
        return isFulltime;
    }

    public static boolean isCertified() {

        System.out.println("____________________________________");
        System.out.println("1. True");
        System.out.println("2. False");

        Scanner scanner = new Scanner(System.in);
        boolean isCertified = false;
        boolean t = true;
        while (t) {
            int y = scanner.nextInt();
            switch (y) {
                case 1:
                    isCertified = true;
                    t = false;
                    break;

                case 2:
                    isCertified = false;
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
        return isCertified;
    }

    public static int hour() throws InvalidParametersException {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();

        try {
            InvalidParametersException.check(hour <= 0, INVALID_PARAMETER);
        } catch (InvalidParametersException e) {
            e.printStackTrace();
            throw new InvalidParametersException(INVALID_HOUR_PARAMETER);

        }

        return hour;
    }

    public static int experience() throws InvalidParametersException {
        Scanner scanner = new Scanner(System.in);
        int experience = scanner.nextInt();
        try {
            InvalidParametersException.check(experience <= 0, INVALID_PARAMETER);
        } catch (InvalidParametersException e) {
            e.printStackTrace();
            throw new InvalidParametersException(INVALID_EXPERIENCE_PARAMETER);
        }

        return experience;
    }

    public static double per_Salary() throws InvalidParametersException {
        Scanner scanner = new Scanner(System.in);
        double per_Salary = scanner.nextDouble();
        try {
            InvalidParametersException.check(per_Salary <= 0, INVALID_PARAMETER);
        } catch (InvalidParametersException e) {
            e.printStackTrace();
            throw new InvalidParametersException(INVALID_PER_SALARY_PARAMETER);

        }

        return per_Salary;
    }
}

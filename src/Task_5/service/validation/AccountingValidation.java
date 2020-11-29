package Task_5.service.validation;

import java.util.Scanner;

import static Task_5.util.Constants.*;

public class AccountingValidation {

    public static boolean knoledgeOfTaxCode() {
        System.out.println("____________________________________");
        System.out.println("1. True");
        System.out.println("2. False");

        Scanner scanner = new Scanner(System.in);
        boolean knowledge = false;
        boolean t = true;
        while (t) {
            int y = scanner.nextInt();
            switch (y) {
                case 1:
                    knowledge = true;
                    t = false;
                    break;

                case 2:
                    knowledge = false;
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
        return knowledge;
    }

    public static String position() {

        System.out.println("___________________________");
        System.out.println("1. Financial accountant");
        System.out.println("2. Chief Accountant");
        System.out.println("3. Accountant");

        Scanner scanner = new Scanner(System.in);
        String position = null;
        boolean t1 = true;
        while (t1) {
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    position = FINANCIAL_ACCOUNTANT;
                    t1 = false;
                    break;

                case 2:
                    position = CHIEF_ACCOUNTANT;
                    t1 = false;
                    break;

                case 3:
                    position = ACCOUNTANT;
                    t1 = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
                    break;
            }
        }
        return position;
    }

    public static String department() {

        System.out.println("____________________________________");
        System.out.println("1. Accounting department");

        Scanner scanner = new Scanner(System.in);
        String department = null;
        boolean t = true;
        while (t) {
            int y = scanner.nextInt();
            if (y == 1) {
                department = ACCOUNTING;
                t = false;
            } else {
                System.out.println(INVALID_NUMBER);
            }
        }
        return department;
    }

}

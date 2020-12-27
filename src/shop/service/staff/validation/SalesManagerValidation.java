package shop.service.staff.validation;

import java.util.Scanner;

import static shop.util.constants.Constants.*;


public class SalesManagerValidation {

    public static String position() {

        System.out.println("___________________________");
        System.out.println("1. Sales Manager");
        System.out.println("2. Cashier");

        Scanner scanner = new Scanner(System.in);
        String position = null;
        boolean t1 = true;
        while (t1) {
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    position = SALES_MANAGER;
                    t1 = false;
                    break;

                case 2:
                    position = CASHIER;
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
        System.out.println("1. Sales department");

        Scanner scanner = new Scanner(System.in);
        String department = null;
        boolean t = true;
        while (t) {
            int y = scanner.nextInt();
            if (y == 1) {
                department = SALES;
                t = false;
            } else {
                System.out.println(INVALID_NUMBER);
            }
        }
        return department;
    }

}

package shop.service.staff.menu;


import shop.exception.InvalidParametersException;

import java.util.Scanner;

import static shop.util.constants.Constants.INVALID_NUMBER;


public class StaffMenu {

   public static void staffMenu() throws InvalidParametersException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Staff Menu \n");
        System.out.println("Please choose menu type");
        System.out.println("________________________");
        System.out.println("1. Accountant Menu");
        System.out.println("2. Marketing Menu");
        System.out.println("3. Programmer Menu");
        System.out.println("4. Sales Manager Menu");
        System.out.println("5. If you want to exit press 0");

        boolean t = true;
        while (t) {
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    AccountingMenu.accountingMenu();
                    break;

                case 2:
                    MarketingMenu.marketingMenu();
                    break;

                case 3:
                    ProgrammingMenu.programmingMenu();
                    break;
                case 4:
                    SalesManagerMenu.salesMenu();

                case 0:
                    System.out.println("You are exiting from Staff Menu \n");
                    System.out.println("Welcome in General Menu \n");
                    System.out.println("Please choose menu type");
                    System.out.println("________________________");
                    System.out.println("1. Staff Menu");
                    System.out.println("2. Product Menu");
                    System.out.println("3. Customer Menu");
                    System.out.println("4. Shop Menu");
                    System.out.println("5. If you want to exit press 0");
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);

            }
        }

    }
}

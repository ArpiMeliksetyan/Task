package Task_5.service.menu;

import Task_5.model.exceptions.InvalidParametersException;

import java.util.Scanner;

import static Task_5.util.Constants.INVALID_NUMBER;

public class Menu {

    public static void main(String[] args) throws InvalidParametersException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Menu \n");
        System.out.println("Please choose menu type");
        System.out.println("________________________");
        System.out.println("1. Accountant Menu");
        System.out.println("2. Marketing Menu");
        System.out.println("3. Programmer Menu");
        System.out.println("4. If you want to exit press 0");

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

                case 0:
                    System.out.println("You are exiting from Menu");
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);

            }
        }

    }
}

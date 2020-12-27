package shop.service.staff.menu;


import shop.exception.InvalidParametersException;
import shop.model.staff.sales.SalesManager;
import shop.service.staff.implementation.SalesServiceImpl;

import java.io.IOException;
import java.util.Scanner;

import static shop.util.constants.Constants.INVALID_NUMBER;


public class SalesManagerMenu {

    static void salesMenu() throws InvalidParametersException {
        System.out.println("Welcome in Sales Manager Menu \n");
        System.out.println("______________________________________________________________________");
        System.out.println("1. Add Sales Manager information in file");
        System.out.println("2. Print all Sales Manager information");
        System.out.println("3. Print Sales Managers in position Sales Manager sorted by their salary");
        System.out.println("4. Print all cashiers full name");
        System.out.println("5. If you  want to exit from Sales Manager Menu please enter 0");


        Scanner scanner = new Scanner(System.in);
        SalesServiceImpl salesService = new SalesServiceImpl();

        System.out.println("\nPlease enter path name of Sales Manager information ");
        String path = scanner.nextLine();

        boolean t = true;

        while (t) {
            System.out.println("\nPlease enter action number");
            int number = scanner.nextInt();

            switch (number) {

                case 1:
                    SalesManager salesManager = salesService.createSalesManager();
                    try {
                        salesService.write(salesManager);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("You saved Sales Manager successfully");
                    break;

                case 2:

                    SalesManager[] salesManagers = new SalesManager[0];

                    try {
                        salesManagers = salesService.read(path);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    salesService.printAllSalesManagers(salesManagers);
                    break;

                case 3:

                    SalesManager[] salesManagers1 = new SalesManager[0];
                    try {
                        salesManagers1 = salesService.read(path);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    salesService.printSalesManagersSortedBySalary(salesManagers1);
                    break;

                case 4:
                    SalesManager[] salesManagers2 = new SalesManager[0];
                    try {
                        salesManagers2 = salesService.read(path);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    salesService.printAllCashiersFullName(salesManagers2);
                    break;


                case 0:
                    System.out.println("You are exiting from Sales Manager Menu");
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

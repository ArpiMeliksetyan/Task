package Task_5.service.menu;


import Task_5.model.exceptions.InvalidParametersException;
import Task_5.model.marketing.MarketingSpecialist;
import Task_5.service.implementation.MarketingServiceImpl;

import java.io.IOException;
import java.util.Scanner;

import static Task_5.util.Constants.INVALID_NUMBER;
import static Task_5.util.Constants.PATH_3;

class MarketingMenu {
    static void marketingMenu() throws InvalidParametersException {

        System.out.println("Welcome in Marketing Menu \n");
        System.out.println("______________________________________________________________________");
        System.out.println("1. Add marketing specialist information in file");
        System.out.println("2. Print all marketing specialists information");
        System.out.println("3. Print all marketing specialists information sorted by first name");
        System.out.println("4. Print commission information of marketing specialists");
        System.out.println("5. Print marketing specialist who have minimum work experience");
        System.out.println("6. If you  want to exit from Marketing Menu please enter 0");

        Scanner scanner = new Scanner(System.in);
        MarketingServiceImpl marketingService = new MarketingServiceImpl();
        String path = PATH_3;
        boolean t = true;


        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    MarketingSpecialist marketingSpecialist = marketingService.createMarketingSpecialist();
                    try {
                        marketingService.write1(marketingSpecialist);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("You saved marketing specialist successfully");
                    break;

                case 2:
                    try {
                        marketingService.printAll(marketingService.read(path));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    try {
                        marketingService.printAllSortedByFirstname(marketingService.read(path));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    try {
                        marketingService.comission(marketingService.read(path));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    try {
                        marketingService.minExperience(marketingService.read(path));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 0:
                    System.out.println("You are exiting from Marketing Menu");
                    System.out.println("Welcome in Menu \n");
                    System.out.println("Please choose menu type");
                    System.out.println("1. Accountant Menu");
                    System.out.println("2. Marketing Menu");
                    System.out.println("3. Programmer Menu");
                    System.out.println("4. If you want to exit press 0");
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
    }
}

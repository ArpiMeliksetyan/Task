package shop.service.staff.menu;



import shop.exception.InvalidParametersException;
import shop.model.staff.marketing.MarketingSpecialist;
import shop.service.staff.implementation.MarketingServiceImpl;

import java.io.IOException;
import java.util.Scanner;

import static shop.util.constants.Constants.INVALID_NUMBER;


class MarketingMenu {
    static void marketingMenu() throws InvalidParametersException {

        System.out.println("Welcome in Marketing Menu \n");
        System.out.println("______________________________________________________________________");
        System.out.println("1. Add marketing specialist information in file");
        System.out.println("2. Print all marketing specialists information");
        System.out.println("3. Print all marketing specialists information sorted by first name");
        System.out.println("4. Print commission information of marketing specialists");
        System.out.println("5. Print all marketing specialists who have minimum work experience");
        System.out.println("6. If you  want to exit from Marketing Menu please enter 0");

        Scanner scanner = new Scanner(System.in);
        MarketingServiceImpl marketingService = new MarketingServiceImpl();

        System.out.println("\nPlease enter path name of Marketing Specialists information ");
        String path = scanner.nextLine();

        boolean t = true;

        while (t) {

            System.out.println("\nPlease enter action number");
            int number = scanner.nextInt();

            switch (number) {

                case 1:
                    MarketingSpecialist marketingSpecialist = marketingService.createMarketingSpecialist();
                    try {
                        marketingService.write(marketingSpecialist);
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

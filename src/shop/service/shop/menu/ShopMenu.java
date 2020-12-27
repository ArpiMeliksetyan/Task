package shop.service.shop.menu;


import shop.model.shop.Shop;
import shop.service.shop.implementation.ShopServiceImpl;

import java.io.IOException;
import java.util.Scanner;

import static shop.util.constants.Constants.INVALID_NUMBER;

public class ShopMenu {

    public static void shopMenu() throws IOException {

        System.out.println("Welcome in Shop Menu \n");
        System.out.println("______________________________________________________________________");
        System.out.println("1. Show information  one of the two shops");
        System.out.println("2. If you  want to exit from Shop Menu please enter 0");


        Scanner scanner = new Scanner(System.in);
        ShopServiceImpl shopService = new ShopServiceImpl();

        boolean t = true;

        while (t) {
            System.out.println("\nPlease enter action number");
            int number = scanner.nextInt();

            switch (number) {

                case 1:
                    Shop shop = shopService.createShop();
                    shopService.printInfo(shop);
                    break;

                case 0:
                    System.out.println("You are exiting from Shop Menu \n");

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

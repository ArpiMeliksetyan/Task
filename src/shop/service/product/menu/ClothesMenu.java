package shop.service.product.menu;

import shop.exception.InvalidParametersException;
import shop.model.product.Clothes;
import shop.service.product.implementation.ClothsServiceImpl;

import java.io.IOException;
import java.util.Scanner;

import static shop.util.constants.Constants.INVALID_NUMBER;


public class ClothesMenu {

    static void clothesMenu() throws InvalidParametersException {

        System.out.println("Welcome in Clothes Menu \n");
        System.out.println("______________________________________________________________________");
        System.out.println("1. Add clothes information in file");
        System.out.println("2. Print all clothes information");
        System.out.println("3. Print cheapest cloths information");
        System.out.println("4. Print all clothes information sorted by price");
        System.out.println("5. Print all clothes information giving season name");
        System.out.println("6. Print all  clothes information grouped by country");
        System.out.println("7. If you  want to exit from Clothes Menu please enter 0");


        Scanner scanner = new Scanner(System.in);
        ClothsServiceImpl clothsService = new ClothsServiceImpl();

        System.out.println("\nPlease enter path name of Clothes information ");
        String path = scanner.nextLine();

        boolean t = true;

        while (t) {
            System.out.println("\nPlease enter action number");
            int number = scanner.nextInt();

            switch (number) {

                case 1:
                    Clothes clothes = clothsService.createClothes();

                    try {
                        clothsService.write(clothes);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    System.out.println("You saved cloth successfully");
                    break;

                case 2:

                    Clothes[] clothes1 = new Clothes[0];

                    try {
                        clothes1 = clothsService.read(path);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    clothsService.printAllClothes(clothes1);
                    break;

                case 3:

                    Clothes[] clothes2 = new Clothes[0];
                    try {
                        clothes2 = clothsService.read(path);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    clothsService.cheapestClothes(clothes2);
                    break;

                case 4:
                    Clothes[] clothes3 = new Clothes[0];
                    try {
                        clothes3 = clothsService.read(path);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    clothsService.clothesSortedByPriceAndNotReapetedBarCodes(clothes3);
                    break;

                case 5:
                    Clothes[] clothes4 = new Clothes[0];
                    try {
                        clothes4 = clothsService.read(path);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    clothsService.clothesBySeason(clothes4);
                    break;

                case 6:
                    Clothes[] clothes5 = new Clothes[0];
                    try {
                        clothes5 = clothsService.read(path);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    clothsService.clothesGroupedByCountry(clothes5);
                    break;

                case 0:
                    System.out.println("You are exiting from Clothes Menu \n");
                    System.out.println("Welcome in Products Menu \n");
                    System.out.println("Please choose menu type");
                    System.out.println("1. Clothes Menu");
                    System.out.println("2. Accessories Menu");
                    System.out.println("3. Shoes Menu");
                    System.out.println("4. If you want to exit press 0");
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }

        }
    }
}

package shop.service.product.menu;

import shop.exception.InvalidParametersException;
import shop.model.product.Shoes;
import shop.service.product.implementation.ShoesServiceImpl;

import java.io.IOException;
import java.util.Scanner;

import static shop.util.constants.Constants.INVALID_NUMBER;

public class ShoesMenu {

    static void shoesMenu() throws InvalidParametersException {

        System.out.println("Welcome in Shoes Menu \n");
        System.out.println("______________________________________________________________________");
        System.out.println("1. Add shoes information in file");
        System.out.println("2. Print all shoes information");
        System.out.println("3. Print all  shoes information grouped by brand");
        System.out.println("4. Print all shoes information giving type name");
        System.out.println("5. Print all shoes information that have ties");
        System.out.println("6. Print all  shoes information sorted by price");
        System.out.println("7. Print the expensive  shoes information");
        System.out.println("8. If you  want to exit from Shoes Menu please enter 0");


        Scanner scanner = new Scanner(System.in);
        ShoesServiceImpl shoesService = new ShoesServiceImpl();

        System.out.println("\nPlease enter path name of Shoes information ");
        String path = scanner.nextLine();

        boolean t = true;

        while (t) {
            System.out.println("\nPlease enter action number");
            int number = scanner.nextInt();

            switch (number) {

                case 1:
                    Shoes shoes = shoesService.createShoes();

                    try {
                        shoesService.write(shoes);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    System.out.println("You saved shoes successfully");
                    break;

                case 2:

                    Shoes[] shoes1 = new Shoes[0];

                    try {
                        shoes1 = shoesService.read(path);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    shoesService.printAllShoes(shoes1);
                    break;

                case 3:

                    Shoes[] shoes2 = new Shoes[0];
                    try {
                        shoes2 = shoesService.read(path);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    shoesService.shoesGroupedByBrand(shoes2);
                    break;

                case 4:
                    Shoes[] shoes3 = new Shoes[0];
                    try {
                        shoes3 = shoesService.read(path);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    shoesService.shoesByType(shoes3);
                    break;

                case 5:
                    Shoes[] shoes4 = new Shoes[0];
                    try {
                        shoes4 = shoesService.read(path);


                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    shoesService.isTieShoes(shoes4);
                    break;

                case 6:
                    Shoes[] shoes5 = new Shoes[0];
                    try {
                        shoes5 = shoesService.read(path);


                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    shoesService.shoesSortedByPrice(shoes5);
                    break;

                case 7:
                    Shoes[] shoes6 = new Shoes[0];
                    try {
                        shoes6 = shoesService.read(path);


                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    shoesService.expensiveShoes(shoes6);
                    break;

                case 0:
                    System.out.println("You are exiting from Shoes Menu \n");
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

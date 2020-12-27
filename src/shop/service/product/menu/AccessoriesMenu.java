package shop.service.product.menu;

import shop.exception.InvalidParametersException;
import shop.model.product.Accessories;
import shop.service.product.implementation.AccessoriesServiceImpl;

import java.io.IOException;
import java.util.Scanner;

import static shop.util.constants.Constants.INVALID_NUMBER;


public class AccessoriesMenu {

    static void accessoriesMenu() throws InvalidParametersException {

        System.out.println("Welcome in Accessories Menu \n");
        System.out.println("______________________________________________________________________");
        System.out.println("1. Add accessories information in file");
        System.out.println("2. Print all accessories information");
        System.out.println("3. Print all accessories information giving metal name");
        System.out.println("4. Print all accessories information which have diamond sorted by price");
        System.out.println("5. If you  want to exit from Accessories Menu please enter 0");



        Scanner scanner = new Scanner(System.in);
        AccessoriesServiceImpl accessoriesService = new AccessoriesServiceImpl();

        System.out.println("\nPlease enter path name of Accessories information ");
        String path = scanner.nextLine();

        boolean t = true;

        while (t) {
            System.out.println("\nPlease enter action number");
            int number = scanner.nextInt();

            switch (number) {

                case 1:
                    Accessories accessories = accessoriesService.createAccessories();

                    try {
                        accessoriesService.write(accessories);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    System.out.println("You saved accessories successfully");
                    break;

                case 2:
                    Accessories[] accessories1 = new Accessories[0];

                    try {
                        accessories1 = accessoriesService.read(path);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    accessoriesService.printAllAccessories(accessories1);
                    break;

                case 3:

                    Accessories[] accessories2 = new Accessories[0];
                    try {
                        accessories2 = accessoriesService.read(path);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    accessoriesService.accessoriesByMetal(accessories2);
                    break;

                case 4:
                    Accessories[] accessories3 = new Accessories[0];
                    try {
                        accessories3 = accessoriesService.read(path);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    accessoriesService.haveDiamondAndSortedByPrice(accessories3);
                    break;

                case 0:
                    System.out.println("You are exiting from Accessories Menu \n");
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

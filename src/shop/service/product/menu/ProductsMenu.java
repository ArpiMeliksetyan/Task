package shop.service.product.menu;

import shop.exception.InvalidParametersException;

import java.util.Scanner;

import static shop.util.constants.Constants.INVALID_NUMBER;

public class ProductsMenu {

   public static void productsMenu() throws InvalidParametersException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Products Menu \n");
        System.out.println("Please choose menu type");
        System.out.println("________________________");
        System.out.println("1. Clothes Menu");
        System.out.println("2. Accessories Menu");
        System.out.println("3. Shoes Menu");
        System.out.println("4. If you want to exit press 0");

        boolean t = true;
        while (t) {
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    ClothesMenu.clothesMenu();
                    break;

                case 2:
                    AccessoriesMenu.accessoriesMenu();
                    break;

                case 3:
                    ShoesMenu.shoesMenu();
                    break;

                case 0:
                    System.out.println("You are exiting from Products Menu \n");
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

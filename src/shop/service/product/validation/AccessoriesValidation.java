package shop.service.product.validation;

import shop.util.constants.Metals;

import java.util.Scanner;

import static shop.util.constants.Constants.INVALID_NUMBER;


public class AccessoriesValidation {

    public static boolean haveDiamond() {

        System.out.println("____________________________________");
        System.out.println("1. True");
        System.out.println("2. False");

        Scanner scanner = new Scanner(System.in);
        boolean haveDiamond = false;
        boolean t = true;
        while (t) {

            int y = scanner.nextInt();

            switch (y) {
                case 1:
                    haveDiamond = true;
                    t = false;
                    break;

                case 2:
                    haveDiamond = false;
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
        return haveDiamond;
    }


    public static String metal() {

        System.out.println("____________________________________");
        System.out.println("1. Silver");
        System.out.println("2. Gold");
        System.out.println("2. Bronze");
        Scanner scanner = new Scanner(System.in);

        boolean t = true;
        String metal = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    metal = Metals.SILVER.getMetal();
                    t = false;
                    break;

                case 2:
                    metal = Metals.GOLD.getMetal();
                    t = false;
                    break;

                case 3:
                    metal = Metals.BRONZE.getMetal();
                    t = false;
                    break;


                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
        return metal;

    }
}


package shop.service.product.validation;

import shop.util.constants.Types;

import java.util.Scanner;

import static shop.util.constants.Constants.INVALID_NUMBER;

public class ShoesValidation {

    public static boolean isTie() {

        System.out.println("____________________________________");
        System.out.println("1. True");
        System.out.println("2. False");

        Scanner scanner = new Scanner(System.in);
        boolean isTie = false;
        boolean t = true;
        while (t) {

            int y = scanner.nextInt();

            switch (y) {
                case 1:
                    isTie = true;
                    t = false;
                    break;

                case 2:
                    isTie = false;
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
        return isTie;
    }

    public static String type() {

        System.out.println("____________________________________");
        System.out.println("1. Classical");
        System.out.println("2. Sport");
        Scanner scanner = new Scanner(System.in);

        boolean t = true;
        String type = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    type = Types.CLASSICAL.getType();
                    t = false;
                    break;

                case 2:
                    type = Types.SPORT.getType();
                    t = false;
                    break;


                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
        return type;

    }
}

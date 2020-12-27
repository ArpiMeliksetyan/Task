package shop.service.shop.validation;

import shop.util.constants.Shops;

import java.util.Scanner;

import static shop.util.constants.Constants.INVALID_NUMBER;

public class ShopValidation {

    public static String shop() {

        System.out.println("____________________________________");
        System.out.println("1. Komitas Branch");
        System.out.println("2. Mashtoc Branch");

        Scanner scanner = new Scanner(System.in);
        String shop = null;
        boolean t = true;
        while (t) {
            int y = scanner.nextInt();
            switch (y) {
                case 1:
                    shop = Shops.KOMITAS.getName();
                    t = false;
                    break;

                case 2:
                    shop = Shops.MASHTOC.getName();
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
        return shop;

    }

}

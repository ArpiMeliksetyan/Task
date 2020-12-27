package shop.service.product.validation;

import shop.util.constants.Assortment;
import shop.util.constants.Materials;
import shop.util.constants.Seasons;

import java.util.Scanner;

import static shop.util.constants.Constants.INVALID_NUMBER;


public class ClothesValidation {

    public static String assortment() {

        System.out.println("____________________________________");
        System.out.println("1. Trouser");
        System.out.println("2. Skirt");
        System.out.println("3. T_Shirt");
        System.out.println("4. Shirt");
        System.out.println("5. Coat");
        System.out.println("6. Pullover");
        System.out.println("7. Dress");
        Scanner scanner = new Scanner(System.in);

        boolean t = true;
        String assortment = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    assortment = Assortment.TROUSER.getAssortment();
                    t = false;
                    break;

                case 2:
                    assortment = Assortment.SKIRT.getAssortment();
                    t = false;
                    break;
                case 3:
                    assortment = Assortment.T_SHIRT.getAssortment();
                    t = false;
                    break;

                case 4:
                    assortment = Assortment.SHIRT.getAssortment();
                    t = false;
                    break;
                case 5:
                    assortment = Assortment.COAT.getAssortment();
                    t = false;
                    break;

                case 6:
                    assortment = Assortment.PULLOVER.getAssortment();
                    t = false;
                    break;
                case 7:
                    assortment = Assortment.DRESS.getAssortment();
                    t = false;
                    break;



                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
        return assortment;

    }


    public static String material() {

        System.out.println("____________________________________");
        System.out.println("1. Cotton");
        System.out.println("2. Wool");
        System.out.println("3. Silk");
        System.out.println("4. Leather");
        System.out.println("5. Cellulose");
        System.out.println("6. Lycra");
        Scanner scanner = new Scanner(System.in);

        boolean t = true;
        String material = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    material = Materials.COTTON.getMaterial();
                    t = false;
                    break;

                case 2:
                    material = Materials.WOOL.getMaterial();
                    t = false;
                    break;
                case 3:
                    material = Materials.SILK.getMaterial();
                    t = false;
                    break;

                case 4:
                    material = Materials.LEATHER.getMaterial();
                    t = false;
                    break;
                case 5:
                    material = Materials.CELLULOSE.getMaterial();
                    t = false;
                    break;

                case 6:
                    material = Materials.LYCRA.getMaterial();
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
        return material;

    }

    public static String season() {

        System.out.println("____________________________________");
        System.out.println("1. Summer");
        System.out.println("2. Autumn");
        System.out.println("3. Winter");
        System.out.println("4. Spring");

        Scanner scanner = new Scanner(System.in);

        boolean t = true;
        String season = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    season = Seasons.SUMMER.getSeason();
                    t = false;
                    break;

                case 2:
                    season = Seasons.AUTUMN.getSeason();
                    t = false;
                    break;
                case 3:
                    season = Seasons.WINTER.getSeason();
                    t = false;
                    break;

                case 4:
                    season = Seasons.SPRING.getSeason();
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
        return season;

    }
}

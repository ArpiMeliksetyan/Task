package shop.service.product.validation;

import shop.exception.InvalidParametersException;
import shop.util.constants.Brands;
import shop.util.constants.Countries;
import shop.util.constants.Gender;

import java.util.Scanner;

import static shop.util.constants.Constants.*;


public class GeneralValidation {

    public static String barCode() throws InvalidParametersException {
        Scanner scanner = new Scanner(System.in);
        String barcode = scanner.nextLine();

        try {
            InvalidParametersException.check(barcode.length() != 9, INVALID_PARAMETER);
        } catch (InvalidParametersException e) {
            e.printStackTrace();
            throw new InvalidParametersException(INVALID_BARCODE_PARAMETER);

        }

        return barcode;
    }


    public static double price() throws InvalidParametersException {
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        try {
            InvalidParametersException.check(price <= 0, INVALID_PARAMETER);
        } catch (InvalidParametersException e) {
            e.printStackTrace();
            throw new InvalidParametersException(INVALID_PRICE_PARAMETER);

        }

        return price;
    }

    public static String gender() {

        System.out.println("____________________________________");
        System.out.println("1. Female");
        System.out.println("2. Male");
        Scanner scanner = new Scanner(System.in);

        boolean t = true;
        String gender = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    gender = Gender.F.getGender();
                    t = false;
                    break;

                case 2:
                    gender = Gender.M.getGender();
                    t = false;
                    break;


                default:
                    System.out.println(INVALID_NUMBER);
            }
        }


        return gender;

    }

    public static String country() {

        System.out.println("____________________________________");
        System.out.println("1. Armenia");
        System.out.println("2. Russia");
        System.out.println("3. United States of America");
        System.out.println("4. Canada");
        System.out.println("5. Italy");
        System.out.println("6. China");
        Scanner scanner = new Scanner(System.in);

        boolean t = true;
        String country = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    country = Countries.AM.getName();
                    t = false;
                    break;

                case 2:
                    country = Countries.RA.getName();
                    t = false;
                    break;
                case 3:
                    country = Countries.USA.getName();
                    t = false;
                    break;

                case 4:
                    country = Countries.CN.getName();
                    t = false;
                    break;
                case 5:
                    country = Countries.IT.getName();
                    t = false;
                    break;

                case 6:
                    country = Countries.CH.getName();
                    t = false;
                    break;


                default:
                    System.out.println(INVALID_NUMBER);
            }
        }


        return country;

    }

    public static String brand() {

        System.out.println("____________________________________");
        System.out.println("1. Ostin");
        System.out.println("2. Fun_Day");
        System.out.println("3. Armany");
        System.out.println("4. Adidas");
        System.out.println("5. Puma");
        System.out.println("6. Reeboke");
        System.out.println("7. Orsay");
        System.out.println("8. Zarina");
        System.out.println("9. Parfois");
        System.out.println("10. Bolsero");
        System.out.println("11. Aldo");
        System.out.println("12. Baldi");
        Scanner scanner = new Scanner(System.in);

        boolean t = true;
        String brand = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    brand = Brands.OSTIN.getBrand();
                    t = false;
                    break;

                case 2:
                    brand = Brands.FUN_DAY.getBrand();
                    t = false;
                    break;

                case 3:
                    brand = Brands.ARMANY.getBrand();
                    t = false;
                    break;

                case 4:
                    brand = Brands.ADIDAS.getBrand();
                    t = false;
                    break;

                case 5:
                    brand = Brands.PUMA.getBrand();
                    t = false;
                    break;

                case 6:
                    brand = Brands.REEBOKE.getBrand();
                    t = false;
                    break;

                case 7:
                    brand = Brands.ORSAY.getBrand();
                    t = false;
                    break;

                case 8:
                    brand = Brands.ZARINA.getBrand();
                    t = false;
                    break;
                case 9:
                    brand = Brands.PARFOIS.getBrand();
                    t = false;
                    break;

                case 10:
                    brand = Brands.BOLSERO.getBrand();
                    t = false;
                    break;
                case 11:
                    brand = Brands.ALDO.getBrand();
                    t = false;
                    break;

                case 12:
                    brand = Brands.BALDI.getBrand();
                    t = false;
                    break;


                default:
                    System.out.println(INVALID_NUMBER);
            }
        }


        return brand;

    }
}

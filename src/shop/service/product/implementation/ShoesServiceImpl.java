package shop.service.product.implementation;

import shop.exception.InvalidParametersException;
import shop.model.product.Shoes;
import shop.util.constants.Brands;
import shop.util.constants.Types;
import shop.service.product.validation.GeneralValidation;
import shop.service.product.ShoesService;
import shop.service.product.validation.ShoesValidation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static shop.util.constants.Constants.PATH_NAME;

public class ShoesServiceImpl implements ShoesService {

    public Shoes createShoes() throws InvalidParametersException {


        System.out.println("Please enter shoes 9 digit  barCode");
        Scanner scanner = new Scanner(System.in);
        String barCode = GeneralValidation.barCode();

        System.out.println("Please enter shoes price");
        double price = GeneralValidation.price();

        System.out.println("Please choose shoes gender");
        String gender = GeneralValidation.gender();

        System.out.println("Please enter shoes color");
        String color = scanner.nextLine();

        System.out.println("Please choose shoes country");
        String country = GeneralValidation.country();

        System.out.println("Please choose shoes brand");
        String brand = GeneralValidation.brand();

        System.out.println("Please choose shoes type");
        String type = ShoesValidation.type();

        System.out.println("Please choose 1 if shoes have tie, otherwise choose 2");
        boolean isTie = ShoesValidation.isTie();

        return new Shoes(barCode, price, gender, color, country, brand, type, isTie);

    }

    public void printInfo(Shoes shoes) {
        System.out.println(
                "barCode:" + shoes.getBarCode() +
                        ", price:" + shoes.getPrice() +
                        ", gender:" + shoes.getGender() +
                        ", color:" + shoes.getColor() +
                        ", country:" + shoes.getCountry() +
                        ", brand:" + shoes.getBrand() +
                        ", type:" + shoes.getType() +
                        ", isTie:" + shoes.isTie()
        );

    }


    public void printAllShoes(Shoes[] shoes) {
        for (Shoes shoes1 : shoes) {
            printInfo(shoes1);
        }
    }

    private void printListOfShoes(List<Shoes> shoes) {
        for (Shoes shoes1 : shoes) {
            printInfo(shoes1);
        }
    }

    private String infoShoes(Shoes shoes) {
        return "barCode:" + shoes.getBarCode() +
                ", price:" + shoes.getPrice() +
                ", gender:" + shoes.getGender() +
                ", color:" + shoes.getColor() +
                ", country:" + shoes.getCountry() +
                ", brand:" + shoes.getBrand() +
                ", type:" + shoes.getType() +
                ", isTie:" + shoes.isTie();
    }



    public void write(Shoes shoes) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(PATH_NAME);
        String path = scanner.nextLine();
        String s = infoShoes(shoes) + "\n";
        Files.write(Paths.get(path), s.getBytes(), StandardOpenOption.APPEND);
    }


    public Shoes[] read(String path) throws IOException {
        List<String> data = Files.readAllLines(Paths.get(path));
        Shoes[] shoes = new Shoes[data.size()];

        for (int i = 0; i < data.size(); i++) {
            String[] s = data.get(i).split(",");
            List<String> list1 = new LinkedList<>();
            for (String el : s) {
                list1.add(el.split(":")[1]);
            }
            shoes[i] = new Shoes(list1.get(0), Double.parseDouble(list1.get(1)), list1.get(2), list1.get(3), list1.get(4), list1.get(5), list1.get(6), Boolean.parseBoolean(list1.get(7)));
            list1.clear();
        }
        return shoes;

    }

    public void shoesGroupedByBrand(Shoes[] shoes) {
        Brands[] brands = Brands.values();
        for (Brands brands1 : brands) {

            switch (brands1) {
                case ALDO:
                    checkingBrand(Brands.ALDO, shoes);
                    break;
                case PUMA:
                    checkingBrand(Brands.PUMA, shoes);
                    break;
                case BALDI:
                    checkingBrand(Brands.BALDI, shoes);
                    break;
                case ORSAY:
                    checkingBrand(Brands.ORSAY, shoes);
                    break;
                case OSTIN:
                    checkingBrand(Brands.OSTIN, shoes);
                    break;
                case ADIDAS:
                    checkingBrand(Brands.ADIDAS, shoes);
                    break;
                case ARMANY:
                    checkingBrand(Brands.ARMANY, shoes);
                    break;
                case ZARINA:
                    checkingBrand(Brands.ZARINA, shoes);
                    break;
                case BOLSERO:
                    checkingBrand(Brands.BOLSERO, shoes);
                    break;
                case FUN_DAY:
                    checkingBrand(Brands.FUN_DAY, shoes);
                    break;
                case PARFOIS:
                    checkingBrand(Brands.PARFOIS, shoes);
                    break;
                case REEBOKE:
                    checkingBrand(Brands.REEBOKE, shoes);
                    break;


            }
        }

    }

    public void shoesByType(Shoes[] shoes) {
        System.out.println("Please write shoes type name and you will see all shoes of given type\nThere are 2 types: \n1.Classical \n2.Sport");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        boolean rightTyping = false;
        boolean haveType = false;
        Types[] types = Types.values();

        for (Types types1 : types) {
            if (type.equalsIgnoreCase(String.valueOf(types1))) {
                rightTyping = true;
                for (Shoes shoes1 : shoes) {
                    if (shoes1.getType().equalsIgnoreCase(type)) {
                        haveType = true;
                        printInfo(shoes1);
                    }
                }
            }
        }
        if(!rightTyping){
            System.out.println("You write wrong type name");
            shoesByType(shoes);
        } else if(!haveType){
            System.out.println("Sorry, at this moment we have not shoes in this type");
        }

    }

    public void isTieShoes(Shoes[] shoes) {
        for (Shoes shoe : shoes) {
            if (shoe.isTie()) {
                printInfo(shoe);
            }
        }
    }

    public void shoesSortedByPrice(Shoes[] shoes) {

        Shoes temp;
        boolean swapped;
        for (int i = 0; i < shoes.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < shoes.length - 1; j++) {
                if (shoes[j].getPrice() > shoes[j + 1].getPrice()) {
                    temp = shoes[j];
                    shoes[j] = shoes[j + 1];
                    shoes[j + 1] = temp;
                    swapped = true;

                }
            }
            if (!swapped) {
                break;
            }
        }
        for (Shoes shoes1 : shoes) {
            printInfo(shoes1);

        }
    }

    public void expensiveShoes(Shoes[] shoeses) {
        double maxPrice = shoeses[0].getPrice();
        Shoes shoes = shoeses[0];
        List<Shoes> shoes2 = new LinkedList<>();

        for (Shoes shoes1 : shoeses) {
            if (shoes1.getPrice() > maxPrice) {
                maxPrice = shoes1.getPrice();
                shoes = shoes1;
            }
        }

        for (Shoes shoes1 : shoeses) {
            if (shoes1.getPrice() == shoes.getPrice()) {
                shoes2.add(shoes1);
            }
        }
        printListOfShoes(shoes2);

    }

    private void checkingBrand(Brands brands, Shoes[] shoes) {

        List<Shoes> list = new LinkedList<>();
        for (Shoes shoes1 : shoes) {
            if (shoes1.getBrand().equalsIgnoreCase(String.valueOf(brands.getBrand()))) {
                list.add(shoes1);
            }
        }
        System.out.println("Shoes of brand: " + brands.getBrand());
        System.out.println("-----------------------------");
        printListOfShoes(list);
        System.out.println();

    }

}

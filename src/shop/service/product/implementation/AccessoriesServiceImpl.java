package shop.service.product.implementation;

import shop.exception.InvalidParametersException;
import shop.model.product.Accessories;
import shop.service.product.AccessoriesService;
import shop.util.constants.Metals;
import shop.service.product.validation.AccessoriesValidation;
import shop.service.product.validation.GeneralValidation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static shop.util.constants.Constants.PATH_NAME;

public class AccessoriesServiceImpl implements AccessoriesService {


    public Accessories createAccessories() throws InvalidParametersException {

        System.out.println("Please enter accessories  9 digit barCode");
        Scanner scanner = new Scanner(System.in);
        String barCode = GeneralValidation.barCode();

        System.out.println("Please enter accessories price");
        double price = GeneralValidation.price();

        System.out.println("Please choose accessories gender");
        String gender = GeneralValidation.gender();

        System.out.println("Please enter accessories color");
        String color = scanner.nextLine();

        System.out.println("Please choose accessories country");
        String country = GeneralValidation.country();

        System.out.println("Please choose accessories brand");
        String brand = GeneralValidation.brand();

        System.out.println("Please choose accessories metal");
        String metal = AccessoriesValidation.metal();

        System.out.println("Please choose 1 if accessories have diamond, otherwise choose 2");
        boolean haveDiamond = AccessoriesValidation.haveDiamond();

        return new Accessories(barCode, price, gender, color, country, brand, metal, haveDiamond);

    }

    public void printInfo(Accessories accessories) {
        System.out.println(
                "barCode:" + accessories.getBarCode() +
                        ", price:" + accessories.getPrice() +
                        ", gender:" + accessories.getGender() +
                        ", color:" + accessories.getColor() +
                        ", country:" + accessories.getCountry() +
                        ", brand:" + accessories.getBrand() +
                        ", metal:" + accessories.getMetal() +
                        ", haveDiamond:" + accessories.isHaveDiamond()
        );
    }

    public void printAllAccessories(Accessories[] accessories) {
        for (Accessories accessories1 : accessories) {
            printInfo(accessories1);
        }
    }

    private String infoAccessories(Accessories accessories) {
        return "barCode:" + accessories.getBarCode() +
                ", price:" + accessories.getPrice() +
                ", gender:" + accessories.getGender() +
                ", color:" + accessories.getColor() +
                ", country:" + accessories.getCountry() +
                ", brand:" + accessories.getBrand() +
                ", metal:" + accessories.getMetal() +
                ", haveDiamond:" + accessories.isHaveDiamond();
    }


    public void write(Accessories accessories) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(PATH_NAME);
        String path = scanner.nextLine();
        String s = infoAccessories(accessories) + "\n";
        Files.write(Paths.get(path), s.getBytes(), StandardOpenOption.APPEND);
    }


    public Accessories[] read(String path) throws IOException {
        List<String> data = Files.readAllLines(Paths.get(path));
        Accessories[] accessories = new Accessories[data.size()];


        for (int i = 0; i < data.size(); i++) {
            String[] s = data.get(i).split(",");
            List<String> list1 = new LinkedList<>();
            for (String el : s) {
                list1.add(el.split(":")[1]);
            }
            accessories[i] = new Accessories(list1.get(0), Double.parseDouble(list1.get(1)), list1.get(2), list1.get(3), list1.get(4), list1.get(5), list1.get(6), Boolean.parseBoolean(list1.get(7)));
            list1.clear();
        }
        return accessories;

    }


    public void accessoriesByMetal(Accessories[] accessories) {
        System.out.println("Please type metal name and you will see all accessories of given metal\nThere are 3 types: \n1.Gold \n2.Silver \n3.Bronzee");
        Scanner scanner = new Scanner(System.in);
        String metal = scanner.nextLine();
        boolean rightTyping = false;
        boolean haveMetal = false;
        Metals[] metals = Metals.values();

        for (Metals metals1 : metals) {
            if (metal.equalsIgnoreCase(String.valueOf(metals1))) {
                rightTyping = true;
                for (Accessories accessories1 : accessories) {
                    if (accessories1.getMetal().equalsIgnoreCase(metal)) {
                        haveMetal = true;
                        printInfo(accessories1);
                    }
                }
            }
        }
        if (!rightTyping) {
            System.out.println("You write wrong metal name");
            accessoriesByMetal(accessories);
        } else if (!haveMetal) {
            System.out.println("Sorry, now we have not accessories from this metal");
        }
    }


    public void haveDiamondAndSortedByPrice(Accessories[] accessories) {

        List<Accessories> list = new LinkedList<>();
        for (Accessories accessory : accessories) {
            if (accessory.isHaveDiamond()) {
                list.add(accessory);
            }
        }
        list.sort(new Comparator<Accessories>(){
            @Override
            public int compare(Accessories o1, Accessories o2) {
                return (int) (o1.getPrice()-o2.getPrice());
            }
        });

        for(Accessories list1 : list) {
            System.out.println(list1);
        }
    }
}

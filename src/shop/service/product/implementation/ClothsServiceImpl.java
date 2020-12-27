package shop.service.product.implementation;

import shop.exception.InvalidParametersException;
import shop.model.product.Clothes;
import shop.service.product.validation.ClothesValidation;
import shop.service.product.validation.GeneralValidation;
import shop.service.product.ClothesService;
import shop.util.constants.Countries;
import shop.util.constants.Seasons;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

import static shop.util.constants.Constants.PATH_NAME;

public class ClothsServiceImpl implements ClothesService {


    public Clothes createClothes() throws InvalidParametersException {

        System.out.println("Please enter clothes  9 digit barCode");
        Scanner scanner = new Scanner(System.in);
        String barCode = GeneralValidation.barCode();

        System.out.println("Please enter cloth price");
        double price = GeneralValidation.price();

        System.out.println("Please choose cloth gender");
        String gender = GeneralValidation.gender();

        System.out.println("Please enter cloth color");
        String color = scanner.nextLine();

        System.out.println("Please choose cloth country");
        String country = GeneralValidation.country();

        System.out.println("Please choose cloth brand");
        String brand = GeneralValidation.brand();

        System.out.println("Please choose cloth assortment");
        String assortment = ClothesValidation.assortment();

        System.out.println("Please choose cloth material");
        String material = ClothesValidation.material();

        System.out.println("Please choose cloth season");
        String season = ClothesValidation.season();

        return new Clothes(barCode, price, gender, color, country, brand, assortment, material, season);

    }

    public void printInfo(Clothes clothes) {
        System.out.println(
                "barCode:" + clothes.getBarCode() +
                        ", price:" + clothes.getPrice() +
                        ", gender:" + clothes.getGender() +
                        ", color:" + clothes.getColor() +
                        ", country:" + clothes.getCountry() +
                        ", brand:" + clothes.getBrand() +
                        ", assortment:" + clothes.getAssortment() +
                        ", material:" + clothes.getMaterial() +
                        ", season:" + clothes.getSeason()
        );
    }


    public void printAllClothes(Clothes[] clothes) {
        for (Clothes clothes1 : clothes) {
            printInfo(clothes1);
        }
    }

    private void printListOfClothes(List<Clothes> clothes) {
        for (Clothes clothes1 : clothes) {
            printInfo(clothes1);
        }
    }

    private String infoClothes(Clothes clothes) {
        return "barCode:" + clothes.getBarCode() +
                ", price:" + clothes.getPrice() +
                ", gender:" + clothes.getGender() +
                ", color:" + clothes.getColor() +
                ", country:" + clothes.getCountry() +
                ", brand:" + clothes.getBrand() +
                ", assortment:" + clothes.getAssortment() +
                ", material:" + clothes.getMaterial() +
                ", season:" + clothes.getSeason();
    }


    public void write(Clothes clothes) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(PATH_NAME);
        String path = scanner.nextLine();
        String s = infoClothes(clothes) + "\n";
        Files.write(Paths.get(path), s.getBytes(), StandardOpenOption.APPEND);
    }


    public Clothes[] read(String path) throws IOException {

        List<String> data = Files.readAllLines(Paths.get(path));
        Clothes[] clothes = new Clothes[data.size()];

        for (int i = 0; i < data.size(); i++) {
            String[] s = data.get(i).split(",");
            List<String> list = new LinkedList<>();
            for (String el : s) {
                list.add(el.split(":")[1]);
            }
            clothes[i] = new Clothes(list.get(0), Double.parseDouble(list.get(1)), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7), list.get(8));
        }
        return clothes;

    }

    public void cheapestClothes(Clothes[] clothes) {
        double minPrice = clothes[0].getPrice();
        Clothes cloth = clothes[0];
        List<Clothes> clothes1 = new LinkedList<>();

        for (Clothes cloth1 : clothes) {
            if (cloth1.getPrice() < minPrice) {
                minPrice = cloth1.getPrice();
                cloth = cloth1;
            }
        }

        for (Clothes clothe : clothes) {
            if (cloth.getPrice() == clothe.getPrice()) {
                clothes1.add(clothe);
            }
        }
        printListOfClothes(clothes1);

    }

    public void clothesSortedByPriceAndNotReapetedBarCodes(Clothes[] clothes) {

        Set<Clothes> set = new TreeSet<>(new Comparator<Clothes>() {
            @Override
            public int compare(Clothes o1, Clothes o2) {
                return o1.getBarCode().compareTo(o2.getBarCode());
            }
        });
        Collections.addAll(set, clothes);

        Iterator<Clothes> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public void clothesBySeason(Clothes[] clothes) {
        System.out.println("Please type season name and you will see all clothes of given season\nThere are 4 seasons: \n1.Summer \n2.Autumn \n3.Winter \n4.Spring");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        boolean rightTyping = false;
        boolean haveSeasonCollection = false;
        Seasons[] seasons = Seasons.values();

        for (Seasons seasons1 : seasons) {
            if (season.equalsIgnoreCase(seasons1.getSeason())) {
                rightTyping = true;
                for (Clothes clothe : clothes) {
                    if (clothe.getSeason().equalsIgnoreCase(season)) {
                        haveSeasonCollection = true;
                        printInfo(clothe);
                    }
                }
            }

        }
        if (!rightTyping) {
            System.out.println("You write wrong season name");
            clothesBySeason(clothes);
        } else if (!haveSeasonCollection) {
            System.out.println("Sorry, now we have not this season collection");
        }
    }


    public void clothesGroupedByCountry(Clothes[] clothes) {
        Countries[] countries = Countries.values();
        for (Countries countries1 : countries) {

            switch (countries1) {
                case AM:
                    checkingCountry(Countries.AM, clothes);
                    break;
                case CH:
                    checkingCountry(Countries.CH, clothes);
                    break;
                case CN:
                    checkingCountry(Countries.CN, clothes);
                    break;
                case IT:
                    checkingCountry(Countries.IT, clothes);
                    break;
                case RA:
                    checkingCountry(Countries.RA, clothes);
                    break;
                case USA:
                    checkingCountry(Countries.USA, clothes);
                    break;
            }
        }

    }

    private void checkingCountry(Countries countries, Clothes[] clothes) {

        List<Clothes> list = new LinkedList<>();
        for (Clothes clothe : clothes) {
            if (clothe.getCountry().equalsIgnoreCase(String.valueOf(countries.getName()))) {
                list.add(clothe);
            }
        }
        System.out.println("Clothes of country: " + countries.getName());
        System.out.println("-----------------------------");
        printListOfClothes(list);
        System.out.println();

    }
}





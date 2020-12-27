package shop.service.shop.implementation;

import shop.model.shop.Shop;
import shop.service.customer.implementation.CustomerServiceImpl;
import shop.service.product.implementation.AccessoriesServiceImpl;
import shop.service.product.implementation.ClothsServiceImpl;
import shop.service.product.implementation.ShoesServiceImpl;
import shop.service.shop.ShopSerivce;
import shop.service.staff.implementation.AccountingServiceImpl;
import shop.service.staff.implementation.MarketingServiceImpl;
import shop.service.staff.implementation.ProgrammerServiceImpl;
import shop.service.staff.implementation.SalesServiceImpl;
import shop.util.constants.Shops;

import java.io.IOException;
import java.util.Scanner;

import static shop.util.constants.Constants.INVALID_NUMBER;

public class ShopServiceImpl implements ShopSerivce {

    private ClothsServiceImpl clothsService = new ClothsServiceImpl();
    private ShoesServiceImpl shoesService = new ShoesServiceImpl();
    private AccessoriesServiceImpl accessoriesService = new AccessoriesServiceImpl();
    private ProgrammerServiceImpl programmerService = new ProgrammerServiceImpl();
    private MarketingServiceImpl marketingService = new MarketingServiceImpl();
    private AccountingServiceImpl accountingService = new AccountingServiceImpl();
    private SalesServiceImpl salesService = new SalesServiceImpl();
    private CustomerServiceImpl customerService = new CustomerServiceImpl();


    public Shop createShop() throws IOException {

        System.out.println("1. Komitas  Branch");
        System.out.println("2. Mashtoc  Branch");
        Scanner scanner = new Scanner(System.in);

        boolean t = true;
        Shop shop = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    String[] url = url();

                    shop = new Shop(Shops.KOMITAS.getName(), "010201030", customerService.read(url[0]), clothsService.read(url[1]), shoesService.read(url[2]), accessoriesService.read(url[3]), programmerService.read(url[4]), marketingService.read(url[5]), accountingService.read(url[6]), salesService.read(url[7]));
                    t = false;
                    break;

                case 2:
                    String[] url1 = url();
                    shop = new Shop(Shops.MASHTOC.getName(), "010506070", customerService.read(url1[0]), clothsService.read(url1[1]), shoesService.read(url1[2]), accessoriesService.read(url1[3]), programmerService.read(url1[4]), marketingService.read(url1[5]), accountingService.read(url1[6]), salesService.read(url1[7]));
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }
        }


        return shop;
    }

    public void printInfo(Shop shop) {

        System.out.println("address=" + shop.getAddress() +
                "phone=" + shop.getPhone());
        System.out.println("CustomerList");
        customerService.printAllCustomers(shop.getCustomerList());
        System.out.println("ClothesList");
        clothsService.printAllClothes(shop.getClothesList());
        System.out.println("ShoesList");
        shoesService.printAllShoes(shop.getShoesList());
        System.out.println("AccessoriesList");
        accessoriesService.printAllAccessories(shop.getAccessoriesList());
        System.out.println("Programmers");
        programmerService.printAllProgramers(shop.getProgrammers());
        System.out.println("MarketingSpecialists");
        marketingService.printAll(shop.getMarketingSpecialists());
        System.out.println("Accountants");
        accountingService.printAllAccountants(shop.getAccountants());
        System.out.println("SalesManagers");
        salesService.printAllSalesManagers(shop.getSalesManagers());

    }


    private String[] url() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Customer Info URL");
        String path = scanner.nextLine();
        System.out.println("Please enter Cloths Info URL");
        String path1 = scanner.nextLine();
        System.out.println("Please enter Shoes Info URL");
        String path2 = scanner.nextLine();
        System.out.println("Please enter Accessories Info URL");
        String path3 = scanner.nextLine();
        System.out.println("Please enter Programmers Info URL");
        String path4 = scanner.nextLine();
        System.out.println("Please enter Marketing Specialist Info URL");
        String path5 = scanner.nextLine();
        System.out.println("Please enter Accountants Info URL");
        String path6 = scanner.nextLine();
        System.out.println("Please enter SalesManagers Info URL");
        String path7 = scanner.nextLine();

        return new String[]{path, path1, path2, path3, path4, path5, path6, path7};
    }
}

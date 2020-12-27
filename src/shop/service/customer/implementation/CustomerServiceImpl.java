package shop.service.customer.implementation;

import shop.exception.InvalidParametersException;
import shop.model.customer.Customer;
import shop.service.customer.CustomerService;
import shop.service.customer.validation.GeneralValidation;
import shop.service.shop.validation.ShopValidation;
import shop.util.constants.Shops;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

import static shop.util.constants.Constants.PATH_NAME;


public class CustomerServiceImpl implements CustomerService {

    public Customer createCustomer() throws InvalidParametersException {

        System.out.println("Please enter your  9 digit id");
        Scanner scanner = new Scanner(System.in);
        String id = GeneralValidation.id();

        System.out.println("Please enter card 6 digit id");
        String cardId = GeneralValidation.cardId();

        System.out.println("Please enter customer firstName");
        String firstName = scanner.nextLine();

        System.out.println("Please enter customer lastName");
        String lastName = scanner.nextLine();

        System.out.println("Please enter customer email");
        String email = GeneralValidation.email();

        System.out.println("Please enter customer bonus");
        double bonus = GeneralValidation.bonus();

        System.out.println("Please choose branch number");
        String shop = ShopValidation.shop();

        return new Customer(id, cardId, firstName, lastName, email, bonus, shop);

    }


    public void printInfo(Customer customer) {
        System.out.println(
                "id:" + customer.getId() +
                        ", cardId:" + customer.getCardId() +
                        ", firstName:" + customer.getFirstName() +
                        ", lastName:" + customer.getLastName() +
                        ", email:" + customer.getEmail() +
                        ", bonus:" + customer.getBonus() +
                        ", shop:" + customer.getShop()
        );
    }


    public void printAllCustomers(Customer[] customer) {
        for (Customer customer1 : customer) {
            printInfo(customer1);
        }
    }

    public void printListOfCustomers(List<Customer> customer) {
        for (Customer customer1 : customer) {
            printInfo(customer1);
        }
    }

    private String infoCustomers(Customer customer) {
        return "id:" + customer.getId() +
                ", cardId:" + customer.getCardId() +
                ", firstName:" + customer.getFirstName() +
                ", lastName:" + customer.getLastName() +
                ", email:" + customer.getEmail() +
                ", bonus:" + customer.getBonus() +
                ", shop:" + customer.getShop();
    }


    public void write(Customer customer) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(PATH_NAME);
        String path = scanner.nextLine();
        String s = infoCustomers(customer) + "\n";
        Files.write(Paths.get(path), s.getBytes(), StandardOpenOption.APPEND);
    }


    public Customer[] read(String path) throws IOException {
        List<String> data = Files.readAllLines(Paths.get(path));
        Customer[] customer = new Customer[data.size()];

        for (int i = 0; i < data.size(); i++) {
            String[] s = data.get(i).split(",");
            List<String> list = new LinkedList<>();
            for (String el : s) {
                list.add(el.split(":")[1]);
            }
            String shop;

            if (list.get(6).equals(Shops.KOMITAS.getName())) {
                shop = Shops.KOMITAS.getName();
            } else {
                shop = Shops.MASHTOC.getName();
            }
            customer[i] = new Customer(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), Double.parseDouble(list.get(5)), shop);

        }
        return customer;
    }


    public void customersGroupedByBranch(Customer[] customers) {
        Shops[] shops = Shops.values();
        for (Shops shops1 : shops) {

            switch (shops1) {
                case KOMITAS:
                    checkingBranch(Shops.KOMITAS, customers);
                    break;
                case MASHTOC:
                    checkingBranch(Shops.MASHTOC, customers);
                    break;

            }
        }

    }

    public void customersSortedByFirstName(Customer[] customers) {

        List<Customer> customers1 = new LinkedList<>(Arrays.asList(customers));

        customers1.sort((new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        }));

        printListOfCustomers(customers1);

    }

    private void checkingBranch(Shops shops, Customer[] customers) {

        List<Customer> list = new LinkedList<>();
        for (Customer customer : customers) {
            if (customer.getShop().equals(String.valueOf(shops.getName()))) {
                list.add(customer);
            }
        }
        System.out.println(shops.getName());
        System.out.println("-----------------------------");
        printListOfCustomers(list);
        System.out.println();

    }

}




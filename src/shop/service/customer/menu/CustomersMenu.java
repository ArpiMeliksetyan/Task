package shop.service.customer.menu;

import shop.exception.InvalidParametersException;
import shop.model.customer.Customer;
import shop.service.customer.implementation.CustomerServiceImpl;

import java.io.IOException;
import java.util.Scanner;

import static shop.util.constants.Constants.INVALID_NUMBER;

public class CustomersMenu {

   public static void customerMenu() throws InvalidParametersException {
        System.out.println("Welcome in Customer Menu \n");
        System.out.println("______________________________________________________________________");
        System.out.println("1. Add customer information in file");
        System.out.println("2. Print all customers information ");
        System.out.println("3. Print all customers sorted by their firstName");
        System.out.println("4. Print all customers grouped by branch");
        System.out.println("5. If you  want to exit from Customer Menu please enter 0");


        Scanner scanner = new Scanner(System.in);
        CustomerServiceImpl customerService = new CustomerServiceImpl();

        System.out.println("\nPlease enter path name of Customer information ");
        String path = scanner.nextLine();

        boolean t = true;

        while (t) {
            System.out.println("\nPlease enter action number");
            int number = scanner.nextInt();

            switch (number) {

                case 1:
                    Customer customer = customerService.createCustomer();

                    try {
                        customerService.write(customer);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    System.out.println("You saved customer successfully");
                    break;

                case 2:

                    Customer[] customers = new Customer[0];

                    try {
                        customers = customerService.read(path);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    customerService.printAllCustomers(customers);
                    break;

                case 3:
                    Customer[] customers1 = new Customer[0];

                    try {
                        customers1 = customerService.read(path);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    customerService.customersSortedByFirstName(customers1);
                    break;

                case 4:
                    Customer[] customers2 = new Customer[0];
                    try {
                        customers2 = customerService.read(path);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    customerService.customersGroupedByBranch(customers2);
                    break;


                case 0:
                    System.out.println("You are exiting from Customer Menu \n");
                    System.out.println("Welcome in General Menu \n");
                    System.out.println("Please choose menu type");
                    System.out.println("________________________");
                    System.out.println("1. Staff Menu");
                    System.out.println("2. Product Menu");
                    System.out.println("3. Customer Menu");
                    System.out.println("4. Shop Menu");
                    System.out.println("5. If you want to exit press 0");
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }

        }
    }
}

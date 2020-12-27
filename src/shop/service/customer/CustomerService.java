package shop.service.customer;

import shop.exception.InvalidParametersException;
import shop.model.customer.Customer;

import java.io.IOException;
import java.util.List;

public interface CustomerService {
    Customer createCustomer() throws InvalidParametersException;

    void printInfo(Customer customer);

    void printAllCustomers(Customer[] customer);

    void printListOfCustomers(List<Customer> customer);

    void write(Customer customer) throws IOException;

    Customer[] read(String path) throws IOException;

    void customersGroupedByBranch(Customer[] customers);

    void customersSortedByFirstName(Customer[] customers);
}

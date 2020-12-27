package shop.service.staff;



import shop.exception.InvalidParametersException;
import shop.model.staff.sales.SalesManager;

import java.io.IOException;

public interface SalesService {
    SalesManager createSalesManager() throws InvalidParametersException;

    void printInfo(SalesManager salesManager);

    void write(SalesManager salesManager) throws IOException;

    SalesManager[] read(String path) throws IOException;

    void printAllSalesManagers(SalesManager[] salesManager);

    void printAllCashiersFullName(SalesManager[] salesManagers);

    void printSalesManagersSortedBySalary(SalesManager[] salesManagers);
}

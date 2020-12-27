package shop.service.staff.implementation;


import shop.exception.InvalidParametersException;
import shop.model.staff.sales.SalesManager;
import shop.service.staff.SalesService;
import shop.service.staff.validation.GeneralValidation;
import shop.service.staff.validation.SalesManagerValidation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

import static shop.util.constants.Constants.*;


public class SalesServiceImpl implements SalesService {

    public SalesManager createSalesManager() throws InvalidParametersException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your 9 character id");
        String id = GeneralValidation.id();

        System.out.println("Please enter your working hours");
        int hour = GeneralValidation.hour();

        System.out.println("Please enter years of your experience");
        int experience = GeneralValidation.experience();

        System.out.println("Please enter your per_Salary");
        double per_Salary = GeneralValidation.per_Salary();

        System.out.println("Please enter 1 if you are certified employee, otherwise enter 2");
        boolean isCertified = GeneralValidation.isCertified();

        System.out.println("Please enter 1 if you are full time employee, otherwise enter 2");
        boolean isFulltime = GeneralValidation.isFulltime();

        System.out.println("Please enter your first name");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name");
        String lastName = scanner.nextLine();

        System.out.println("Please choose your department number");
        String department = SalesManagerValidation.department();

        System.out.println("Please choose your position");
        String position = SalesManagerValidation.position();

        SalesManager salesManager = new SalesManager(id, hour, experience, per_Salary, isCertified, isFulltime, firstName, lastName, department, position);


        return salesManager;
    }


    public void printInfo(SalesManager salesManager) {

        System.out.println(
                "id=" + salesManager.getId() +
                        ", hours=" + salesManager.getHours() +
                        ", experience=" + salesManager.getExperience() +
                        ", per_Salary=" + salesManager.getPer_Salary() +
                        ", isCertified=" + salesManager.isCertifed() +
                        ", isFullTime=" + salesManager.isFullTime() +
                        ", firstName=" + salesManager.getFirtsName() +
                        ", LastName=" + salesManager.getLastName() +
                        ", departmentName=" + salesManager.getDepartmentName() +
                        ", position=" + salesManager.getPosition()
        );
    }

    private String infoSalesManager(SalesManager salesManager) {

        return salesManager.getId() + "," +
                salesManager.getHours() + "," +
                salesManager.getExperience() + "," +
                salesManager.getPer_Salary() + "," +
                salesManager.isCertifed() + "," +
                salesManager.isFullTime() + "," +
                salesManager.getFirtsName() + "," +
                salesManager.getLastName() + "," +
                salesManager.getDepartmentName() + "," +
                salesManager.getPosition();

    }

    public void write(SalesManager salesManager) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(PATH_NAME);
        String path = scanner.nextLine();
        String s = infoSalesManager(salesManager) + "\n";
        Files.write(Paths.get(path), s.getBytes(), StandardOpenOption.APPEND);

    }

    public SalesManager[] read(String path) throws IOException {
        String[] data = Files.readAllLines(Paths.get(path)).toArray(new String[0]);
        SalesManager[] salesManager = new SalesManager[data.length];

        for (int i = 0; i < data.length; i++) {

            String[] s = data[i].split(",");

            salesManager[i] = new SalesManager(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Double.parseDouble(s[3]), Boolean.parseBoolean(s[4]), Boolean.parseBoolean(s[5]), s[6], s[7], s[8], s[9]);
        }
        return salesManager;

    }

    public void printAllSalesManagers(SalesManager[] salesManager) {
        for (SalesManager salesManager1 : salesManager) {
            printInfo(salesManager1);
        }
    }

    public void printAllCashiersFullName(SalesManager[] salesManagers) {
        for (SalesManager salesManager : salesManagers) {
            if (salesManager.getPosition().equals(CASHIER)) {
                System.out.println(salesManager.getFirtsName() + " " + salesManager.getLastName());
            }
        }
    }

    public void printSalesManagersSortedBySalary(SalesManager[] salesManagers) {
        SalesManager temp;
        boolean swapped;

        for (int i = 0; i < salesManagers.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < salesManagers.length - 1; j++) {
                if (salesManagers[j].getPer_Salary() > salesManagers[j + 1].getPer_Salary()) {
                    temp = salesManagers[j];
                    salesManagers[j] = salesManagers[j + 1];
                    salesManagers[j + 1] = temp;
                    swapped = true;

                }
            }
            if (!swapped) {
                break;
            }
        }
        for (SalesManager salesManager : salesManagers) {
            if (salesManager.getPosition().equals(SALES_MANAGER)) {
                printInfo(salesManager);
            }
        }

    }

}

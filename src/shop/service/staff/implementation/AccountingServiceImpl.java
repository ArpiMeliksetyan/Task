package shop.service.staff.implementation;


import shop.exception.InvalidParametersException;
import shop.model.staff.Employees;
import shop.model.staff.Holidays;
import shop.model.staff.accountant.Accountant;
import shop.service.staff.AccountantService;
import shop.service.staff.validation.AccountingValidation;
import shop.service.staff.validation.GeneralValidation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Scanner;

import static shop.util.constants.Constants.PATH_NAME;

public class AccountingServiceImpl implements AccountantService{

    public Accountant createAccountant() throws InvalidParametersException {
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
        String department = AccountingValidation.department();

        System.out.println("Please choose your position");
        String position = AccountingValidation.position();

        System.out.println("Please choose 1 if you know tax code, otherwise choose 2");
        boolean knowledgeOfTaxCode = AccountingValidation.knoledgeOfTaxCode();

        return new Accountant(id, hour, experience, per_Salary, isCertified, isFulltime, firstName, lastName, department, position, knowledgeOfTaxCode);
    }


    public void printInfo(Accountant accountant) {

        System.out.println(
                "id=" + accountant.getId() +
                        ", hours=" + accountant.getHours() +
                        ", experience=" + accountant.getExperience() +
                        ", per_Salary=" + accountant.getPer_Salary() +
                        ", isCertified=" + accountant.isCertifed() +
                        ", isFullTime=" + accountant.isFullTime() +
                        ", firstName=" + accountant.getFirtsName() +
                        ", LastName=" + accountant.getLastName() +
                        ", departmentName=" + accountant.getDepartmentName() +
                        ", position=" + accountant.getPosition() +
                        ", knowledgeOfTaxCode=" + accountant.isKnowledgeOfTaxCode()
        );
    }

    private String infoAccountant(Accountant accountant) {

        return accountant.getId() + "," +
                accountant.getHours() + "," +
                accountant.getExperience() + "," +
                accountant.getPer_Salary() + "," +
                accountant.isCertifed() + "," +
                accountant.isFullTime() + "," +
                accountant.getFirtsName() + "," +
                accountant.getLastName() + "," +
                accountant.getDepartmentName() + "," +
                accountant.getPosition() + "," +
                accountant.isKnowledgeOfTaxCode();

    }


    public void write(Accountant accountant) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(PATH_NAME);
        String path = scanner.nextLine();
        String s = infoAccountant(accountant) + "\n";
        Files.write(Paths.get(path), s.getBytes(), StandardOpenOption.APPEND);

    }

    public Accountant[] read(String path) throws IOException {
        String[] data = Files.readAllLines(Paths.get(path)).toArray(new String[0]);
        Accountant[] accountants = new Accountant[data.length];

        for (int i = 0; i < data.length; i++) {

            String[] s = data[i].split(",");

            accountants[i] = new Accountant(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Double.parseDouble(s[3]), Boolean.parseBoolean(s[4]), Boolean.parseBoolean(s[5]), s[6], s[7], s[8], s[9], Boolean.parseBoolean(s[10]));
        }
        return accountants;

    }

    public void printAllAccountants(Accountant[] accountant) {
        for (Accountant accountant1 : accountant) {
            printInfo(accountant1);
        }
    }

    private HashMap<String, Double> checkingPerSalary(Accountant[] accountants) {

        HashMap<String, Double> map = new HashMap<>();

        for (Accountant accountant : accountants) {
            map.put(accountant.getId(), accountant.getPer_Salary());
        }
        return map;
    }


    public void perSalaryById(String path) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter id");
        String id = scanner.nextLine();
        HashMap<String, Double> map = checkingPerSalary(read(path));

        if (map.get(id) == null) {
            System.out.println("There are not such id, please try again");
        } else {
            System.out.println("Your per_Salary is: " + map.get(id));
        }
    }


    public void printAccountantNameKnowledgeOfTaxCode(Accountant[] accountants) {

        for (Accountant accountant : accountants) {
            if (accountant.isKnowledgeOfTaxCode()) {
                System.out.println(accountant.getFirtsName());
            }

        }
    }

    public void printAccountantsWorkingHoursBigger200(Accountant[] accountants) {
        for (Accountant accountant : accountants) {
            if (accountant.getHours() > 200) {
                printInfo(accountant);
            }

        }
    }

    public void printFinancialAccountantsFullName(Accountant[] accountants) {
        for (Accountant accountant : accountants) {
            if (accountant.getPosition().equals("Financial accountant")) {
                System.out.println(accountant.getFirtsName() + " " + accountant.getLastName());
            }
        }
    }

    public void printAccountantSortedByPerSalary(Accountant[] accountants) {
        Accountant temp;
        boolean swapped;
        for (int i = 0; i < accountants.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < accountants.length - 1; j++) {
                if (accountants[j].getPer_Salary() > accountants[j + 1].getPer_Salary()) {
                    temp = accountants[j];
                    accountants[j] = accountants[j + 1];
                    accountants[j + 1] = temp;
                    swapped = true;

                }
            }
            if (!swapped) {
                break;
            }
        }
        printAllAccountants(accountants);
    }




    public void printAccountantsFullNameSalaryBigger100000(Accountant[] accountants) {
        for (Accountant accountant : accountants) {
            if (accountant.calculateSalary() > 100000) {
                System.out.println(accountant.getFirtsName() + " " + accountant.getLastName());

            }
        }

    }

}

package Task_5.service.implementation;

import Task_5.model.accountant.Accountant;
import Task_5.model.exceptions.InvalidParametersException;
import Task_5.service.AccountantService;
import Task_5.service.validation.AccountingValidation;
import Task_5.service.validation.GeneralValidation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class AccountingServiceImpl implements AccountantService {

    public Accountant createAccountant() throws InvalidParametersException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your id (id should be 9 character)");
        String id = GeneralValidation.id();

        System.out.println("Please enter your working hours");
        int hour = GeneralValidation.hour();

        System.out.println("Please enter your experience");
        int experience = GeneralValidation.experience();

        System.out.println("Please enter your per_Salary");
        double per_Salary = GeneralValidation.per_Salary();

        System.out.println("Please enter true if you are certified employee, otherwise enter false");
        boolean isCertified = GeneralValidation.isCertified();

        System.out.println("Please enter true if you are full time employee, otherwise enter false");
        boolean isFulltime = GeneralValidation.isFulltime();

        System.out.println("Please enter your first name");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name");
        String lastName = scanner.nextLine();

        System.out.println("Please choose your department number");
        String department = AccountingValidation.department();

        System.out.println("Please choose your position");
        String position = AccountingValidation.position();

        System.out.println("Please choose true if you know tax code, otherwise choose false");
        boolean knowledgeOfTaxCode = AccountingValidation.knoledgeOfTaxCode();
        Accountant accountant = new Accountant(id, hour, experience, per_Salary, isCertified, isFulltime, firstName, lastName, department, position, knowledgeOfTaxCode);
        System.out.println(accountant);

        return accountant;
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

    public void write(Accountant[] accountants) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        new FileOutputStream(path);
        for (int i = 0; i < accountants.length; i++) {
            String s = infoAccountant(accountants[i]) + "\n";
            Files.write(Paths.get(path), s.getBytes(), StandardOpenOption.APPEND);
        }
    }

    public void write1(Accountant accountant) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter path name");
//        String path = scanner.nextLine();
        String path = "C:\\Users\\Arpushik\\Desktop\\A.txt";
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

    public void printAccountantNameKnowledgeOfTaxCode(Accountant[] accountants) {

        for (int i = 0; i < accountants.length; i++) {
            if (accountants[i].isKnowledgeOfTaxCode()) {
                System.out.println(accountants[i].getFirtsName());
            }

        }
    }

    public void printAccountantsWorkingHoursBigger200(Accountant[] accountants) {
        for (int i = 0; i < accountants.length; i++) {
            if (accountants[i].getHours() > 200) {
                printInfo(accountants[i]);
            }

        }
    }

    public void printFinancialAccountantsFullName(Accountant[] accountants) {
        for (int i = 0; i < accountants.length; i++) {
            if (accountants[i].getPosition().equals("Financial accountant")) {
                System.out.println(accountants[i].getFirtsName() + " " + accountants[i].getLastName());
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

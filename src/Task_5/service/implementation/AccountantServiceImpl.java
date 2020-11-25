package Task_5.service.implementation;

import Task_5.model.accountant.Accountant;
import Task_5.service.AccountantService;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class AccountantServiceImpl implements AccountantService {


    public void printInfo(Accountant accountant) {

        System.out.println(
                "id=" + accountant.getId() +
                        ", hours=" + accountant.getHours() +
                        ", experience=" + accountant.getExperience() +
                        ", per_Salary=" + accountant.getPer_Salary() +
                        ", isCertifed=" + accountant.isCertifed() +
                        ", isFullTime=" + accountant.isFullTime() +
                        ", firtsName=" + accountant.getFirtsName() +
                        ", LastName=" + accountant.getLastName() +
                        ", departmentName=" + accountant.getDepartmentName() +
                        ", position=" + accountant.getPosition() +
                        ", knowledgeOfTaxCode=" + accountant.isKnowledgeOfTaxCode()
        );
    }

    public String infoAccountant(Accountant accountant) {

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

    public Accountant[] read(String path) throws IOException {
        String[] data = Files.readAllLines(Paths.get(path)).toArray(new String[0]);
        Accountant[] accountants = new Accountant[data.length];

        for (int i = 0; i < data.length; i++) {

            String[] s = data[i].split(",");

            accountants[i] = new Accountant(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Double.parseDouble(s[3]), Boolean.parseBoolean(s[4]), Boolean.parseBoolean(s[5]), s[6], s[7], s[8], s[9], Boolean.parseBoolean(s[10]));
        }
        return accountants;

    }

    public void printAllAccountants(Accountant [] accountant) {
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

    public void printAccountantsFullName(Accountant[] accountants) {
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
        for (int i = 0; i < accountants.length; i++) {
            if (accountants[i].calculateSalary() > 100000) {
                System.out.println(accountants[i].getFirtsName() + " " + accountants[i].getLastName());

            }
        }

    }

}

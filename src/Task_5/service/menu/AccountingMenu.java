package Task_5.service.menu;

import Task_5.model.accountant.Accountant;
import Task_5.model.exceptions.InvalidParametersException;
import Task_5.service.implementation.AccountingServiceImpl;


import java.io.IOException;
import java.util.Scanner;

import static Task_5.util.Constants.INVALID_NUMBER;
import static Task_5.util.Constants.PATH_2;

 class AccountingMenu {


     static void accountingMenu() throws InvalidParametersException {

        System.out.println("Welcome in Accountant Menu \n");
        System.out.println("______________________________________________________________________");
        System.out.println("1. Add accountant information in file");
        System.out.println("2. Print all accountants information");
        System.out.println("3. Print accountant name who has knowledge of taxcode");
        System.out.println("4. Print all accountants information who worked more than 200 hours");
        System.out.println("5. Print all financial accountants full name");
        System.out.println("6. Print all  accountants information sorted by salary");
        System.out.println("7. Print all  accountants information whose salary more than 100.000");
        System.out.println("8. If you  want to exit from Accounting Menu please enter 0");

        Scanner scanner = new Scanner(System.in);
        AccountingServiceImpl accountantService = new AccountingServiceImpl();
        String path = PATH_2;
        boolean t = true;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    Accountant accountant = accountantService.createAccountant();
                    try {
                        accountantService.write1(accountant);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("You saved accountant successfully");
                    break;

                case 2:
                    Accountant[] accountants = new Accountant[0];
                    try {
                        accountants = accountantService.read(path);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    accountantService.printAllAccountants(accountants);
                    break;

                case 3:

                    Accountant[] accountants1 = new Accountant[0];
                    try {
                        accountants1 = accountantService.read(path);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    accountantService.printAccountantNameKnowledgeOfTaxCode(accountants1);
                    break;

                case 4:
                    Accountant[] accountants2 = new Accountant[0];
                    try {
                        accountants2 = accountantService.read(path);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    accountantService.printAccountantsWorkingHoursBigger200(accountants2);
                    break;

                case 5:
                    Accountant[] accountants3 = new Accountant[0];
                    try {
                        accountants3 = accountantService.read(path);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    accountantService.printFinancialAccountantsFullName(accountants3);
                    break;

                case 6:
                    Accountant[] accountants4 = new Accountant[0];
                    try {
                        accountants4 = accountantService.read(path);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    accountantService.printAccountantSortedByPerSalary(accountants4);
                    break;

                case 7:
                    Accountant[] accountants5 = new Accountant[0];
                    try {
                        accountants5 = accountantService.read(path);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    accountantService.printAccountantsFullNameSalaryBigger100000(accountants5);
                    break;

                case 0:
                    System.out.println("You are exiting from Accounting Menu");
                    System.out.println("Welcome in Menu \n");
                    System.out.println("Please choose menu type");
                    System.out.println("1. Accountant Menu");
                    System.out.println("2. Marketing Menu");
                    System.out.println("3. Programmer Menu");
                    System.out.println("4. If you want to exit press 0");
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }

        }
    }
}

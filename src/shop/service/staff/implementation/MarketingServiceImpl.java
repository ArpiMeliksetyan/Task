package shop.service.staff.implementation;


import shop.exception.InvalidParametersException;
import shop.model.staff.marketing.MarketingSpecialist;
import shop.model.staff.marketing.SEO;
import shop.model.staff.marketing.SMM;
import shop.service.staff.MarketingService;
import shop.service.staff.validation.GeneralValidation;
import shop.service.staff.validation.MarketingValidation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

import static shop.util.constants.Constants.*;

public class MarketingServiceImpl implements MarketingService {

    public MarketingSpecialist createMarketingSpecialist() throws InvalidParametersException {

        MarketingSpecialist marketingSpecialist = null;
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

        System.out.println("Please choose your department \n");
        String department = MarketingValidation.department();

        System.out.println("Choose your position");
        String position = MarketingValidation.position();

        switch (department) {
            case MARKETING_SEO:
                System.out.println("Please enter tools that you know");
                String tools = MarketingValidation.tools();
                marketingSpecialist = new SEO(id, hour, experience, per_Salary, isCertified, isFulltime, firstName, lastName, department, position, tools);

            case MARKETING_SMM:
                System.out.println("Please enter social platforms where you work");
                String socialPlatform = MarketingValidation.socialPlatform();
                marketingSpecialist = new SMM(id, hour, experience, per_Salary, isCertified, isFulltime, firstName, lastName, department, position, socialPlatform);
        }
        return marketingSpecialist;

    }


    public void printInfo(MarketingSpecialist marketingSpecialist) {

        String[] name = marketingSpecialist.getClass().getName().split("\\.");

        if (name[name.length - 1].equals("SEO")) {
            printInfoSEO((SEO) marketingSpecialist);

        } else {
            printInfoSMM((SMM) marketingSpecialist);
        }
    }

    private void printInfoSEO(SEO seo) {

        System.out.println(
                "hours=" + seo.getHours() +
                        ", experience=" + seo.getExperience() +
                        ", per_Salary=" + seo.getPer_Salary() +
                        ", isCertifed=" + seo.isCertifed() +
                        ", isFullTime=" + seo.isFullTime() +
                        ", id=" + seo.getId() +
                        ", firtsName=" + seo.getFirtsName() +
                        ", LastName=" + seo.getLastName() +
                        ", departmentName=" + seo.getDepartmentName() +
                        ", position=" + seo.getPosition() +
                        ", tools=" + seo.getTools());


    }

    private String infoSEO(SEO seo) {

        return seo.getId() + "," +
                seo.getHours() + "," +
                seo.getExperience() + "," +
                seo.getPer_Salary() + "," +
                seo.isCertifed() + "," +
                seo.isFullTime() + "," +
                seo.getFirtsName() + "," +
                seo.getLastName() + "," +
                seo.getDepartmentName() + "," +
                seo.getPosition() + "," +
                seo.getTools();


    }


    private String print(MarketingSpecialist marketingSpecialist) {
        String[] name = marketingSpecialist.getClass().getName().split("\\.");

        if (name[name.length - 1].equals("SEO")) {

            return infoSEO((SEO) marketingSpecialist);

        } else {
            return infoSMM((SMM) marketingSpecialist);
        }
    }


    private void printInfoSMM(SMM smm) {

        System.out.println(
                "hours=" + smm.getHours() +
                        ", experience=" + smm.getExperience() +
                        ", per_Salary=" + smm.getPer_Salary() +
                        ", isCertifed=" + smm.isCertifed() +
                        ", isFullTime=" + smm.isFullTime() +
                        ", id=" + smm.getId() +
                        ", firtsName=" + smm.getFirtsName() +
                        ", LastName=" + smm.getLastName() +
                        ", departmentName=" + smm.getDepartmentName() +
                        ", position=" + smm.getPosition() +
                        ", socialPlatform=" + smm.getSocialPlatform()
        );
    }

    private String infoSMM(SMM smm) {

        return smm.getId() + "," +
                smm.getHours() + "," +
                smm.getExperience() + "," +
                smm.getPer_Salary() + "," +
                smm.isCertifed() + "," +
                smm.isFullTime() + "," +
                smm.getFirtsName() + "," +
                smm.getLastName() + "," +
                smm.getDepartmentName() + "," +
                smm.getPosition() + "," +
                smm.getSocialPlatform();
    }

    public void printAll(MarketingSpecialist[] marketingSpecialists) {

        for (MarketingSpecialist marketingSpecialist : marketingSpecialists) {
            printInfo(marketingSpecialist);
        }
    }


    public void write(MarketingSpecialist marketingSpecialist) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(PATH_NAME);
        String path = scanner.nextLine();
        String s = print(marketingSpecialist) + "\n";
        Files.write(Paths.get(path), s.getBytes(), StandardOpenOption.APPEND);

    }

    public MarketingSpecialist[] read(String path) throws IOException {

        String[] data = Files.readAllLines(Paths.get(path)).toArray(new String[0]);
        MarketingSpecialist[] marketingSpecialists = new MarketingSpecialist[data.length];

        for (int i = 0; i < data.length; i++) {

            String[] s = data[i].split(",");

            if (s[8].equals("SEO department")) {
                marketingSpecialists[i] = new SEO(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Double.parseDouble(s[3]), Boolean.parseBoolean(s[4]), Boolean.parseBoolean(s[5]), s[6], s[7], s[8], s[9], s[10]);
            } else if (s[8].equals("SMM department")) {
                marketingSpecialists[i] = new SMM(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Double.parseDouble(s[3]), Boolean.parseBoolean(s[4]), Boolean.parseBoolean(s[5]), s[6], s[7], s[8], s[9], s[10]);
            }
        }
        return marketingSpecialists;

    }

    public void printAllSortedByFirstname(MarketingSpecialist[] marketingSpecialists) {
        MarketingSpecialist temp;

        for (int i = 0; i < marketingSpecialists.length; i++) {
            for (int j = i + 1; j < marketingSpecialists.length; j++) {
                if (marketingSpecialists[i].getFirtsName().compareTo(marketingSpecialists[j].getFirtsName()) > 0) {
                    temp = marketingSpecialists[i];
                    marketingSpecialists[i] = marketingSpecialists[j];
                    marketingSpecialists[j] = temp;
                }
            }
        }
        printAll(marketingSpecialists);
    }

    public void comission(MarketingSpecialist[] marketingSpecialists) {
        double comission;
        for (MarketingSpecialist marketingSpecialist : marketingSpecialists) {
            if (marketingSpecialist.getPer_Salary() < 4000) {
                comission = marketingSpecialist.getPer_Salary() * 1.5 * 21;
            } else if (marketingSpecialist.getPer_Salary() >= 4000 && marketingSpecialist.getPer_Salary() <= 7000) {
                comission = marketingSpecialist.getPer_Salary() * 2 * 21;
            } else {
                comission = marketingSpecialist.getPer_Salary() * 3 * 21;
            }
            StringJoiner stringJoiner = new StringJoiner(" ");
            stringJoiner.add(marketingSpecialist.getFirtsName()).add(marketingSpecialist.getLastName()).add("commission is:").add(String.valueOf(comission));
            System.out.println(stringJoiner);

        }

    }

    public void minExperience(MarketingSpecialist[] marketingSpecialists) {
        MarketingSpecialist marketingSpecialist = marketingSpecialists[0];
        int min = marketingSpecialists[0].getExperience();
        List<MarketingSpecialist> list = new LinkedList<>();

        for (MarketingSpecialist marketingSpecialist1 : marketingSpecialists) {
            if (marketingSpecialist1.getExperience() < min) {
                marketingSpecialist = marketingSpecialist1;
            }
        }

        for (MarketingSpecialist marketingSpecialist1 : marketingSpecialists) {
            if (marketingSpecialist1.getExperience() == marketingSpecialist.getExperience()) {
                list.add(marketingSpecialist1);
            }
        }
        for (MarketingSpecialist marketingSpecialist1 : list) {
            StringJoiner stringJoiner = new StringJoiner(" ")
                    .add(marketingSpecialist1.getFirtsName())
                    .add(marketingSpecialist1.getLastName())
                    .add("has less experience than others");
            System.out.println(stringJoiner);

        }

    }
}

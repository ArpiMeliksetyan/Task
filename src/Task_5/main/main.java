package Task_5.main;


import Task_5.model.accountant.Accountant;
import Task_5.model.marketing.MarketingSpecialist;
import Task_5.model.marketing.SEO;
import Task_5.model.marketing.SMM;
import Task_5.model.programmer.BackEnd;
import Task_5.model.programmer.FrontEnd;
import Task_5.model.programmer.Programmer;
import Task_5.model.programmer.QA;
import Task_5.service.implementation.AccountantServiceImpl;
import Task_5.service.implementation.MarketingServiceImpl;
import Task_5.service.implementation.ProgrammerServiceImpl;

import java.io.IOException;

import static Task_5.util.Constants.*;

public class main {


    public static void main(String[] args) throws IOException {

        Accountant accountant = new Accountant("456456456", 250, 10, 4600, true, true, "Ani", "Asryan", ACCOUNTING, FINANCIAL_ACCOUNTANT, true);
        Accountant accountant1 = new Accountant("645601777", 315, 7, 5100, true, false, "Anna", "Arakelyan", ACCOUNTING, ACCOUNTANT, false);
        Accountant accountant2 = new Accountant("123456789", 38, 10, 10000, true, true, "Arpi", "Meliksetyan", ACCOUNTING, CHIEF_ACCOUNTANT, true);
        Accountant[] accountants = {accountant, accountant1, accountant2};

        AccountantServiceImpl accountantService = new AccountantServiceImpl();

        accountantService.write(accountants);
        accountantService.printInfo(accountant);
        accountantService.printAllAccountants(accountants);
        accountantService.printAccountantNameKnowledgeOfTaxCode(accountants);
        accountantService.printAccountantsWorkingHoursBigger200(accountants);
        accountantService.printAccountantsFullName(accountants);
        accountantService.printAccountantsFullNameSalaryBigger100000(accountants);
        accountantService.printAccountantSortedByPerSalary(accountants);
        accountant.daysOfHoliday();
        accountant.salaryForHolidays();
        accountant.calculateSalary();
        accountant.calculateTaxes();
        accountant.netIncome();

        BackEnd backEnd = new BackEnd("010102023", 150, 5, 6500, true, true, "Karine", "Markosyan", PROGRAMMING_BACKEND, SOFTWARE_ENGINEER_LEVEL_2, JAVA_LANGUAGE, MID_LEVEL);
        BackEnd backEnd1 = new BackEnd("944554002", 250, 1, 7800, false, true, "Arpi", "Mkhitaryan", PROGRAMMING_BACKEND, SOFTWARE_ENGINEER_LEVEL_1, JS_LANGUAGE, JUNIOR_LEVEL);
        BackEnd backEnd2 = new BackEnd("900222444", 650, 11, 21000, true, true, "David", "Azatyan", PROGRAMMING_BACKEND, ARCHITECT_DEVELOPER, C_SHARP_LANGUAGE, SENIOR_LEVEL);

        FrontEnd frontEnd = new FrontEnd("997788559", 225, 4, 7150, true, false, "Anahit", "Beginyan", PROGRAMMING_FRONTEND, SOFTWARE_ENGINEER_LEVEL_3, JS_LANGUAGE, MID_LEVEL);
        FrontEnd frontEnd1 = new FrontEnd("656545452", 330, 1, 5400, false, false, "Asya", "Galstyan", PROGRAMMING_FRONTEND, SOFTWARE_ENGINEER_LEVEL_1, DART_LANGUAGE, JUNIOR_LEVEL);
        FrontEnd frontEnd2 = new FrontEnd("111999666", 222, 15, 35000, true, true, "Karen", "Aslanyan", PROGRAMMING_FRONTEND, TEAM_LEAD_PROGRAMMER, CSS_LANGUAGE, SENIOR_LEVEL);


        QA qa = new QA("393917175", 400, 1, 3900, false, true, "Ara", "Mkrtchyan", PROGRAMMING_QA, MANUAL_QA, PYTHON_LANGUAGE, JUNIOR_LEVEL);
        QA qa1 = new QA("456000456", 500, 9, 19000, true, true, "Artak", "Kamalyan", PROGRAMMING_QA,AUTOMATION_QA,  C_SHARP_LANGUAGE, SENIOR_LEVEL);
        QA qa2 = new QA("789123000", 300, 6, 15000, true, true, "David", "Darbinyan",PROGRAMMING_QA, AUTOMATION_QA, JAVA_LANGUAGE, MID_LEVEL);

        ProgrammerServiceImpl programmerService = new ProgrammerServiceImpl();
        Programmer[] programmers = {backEnd, backEnd1, backEnd2, frontEnd, frontEnd1, frontEnd2, qa, qa1, qa2};

        programmerService.printAllProgramers(programmers);
        programmerService.printJavaLanguage(programmers);
        programmerService.seniorLevelBackendProgrammer(programmers);
        programmerService.certifedBackendProgrammersSortedByExperience(programmers);
        programmerService.cSharpLanguage(programmers);
        programmerService.projectComplexity(programmers[3], 2, 14, 3);
        programmerService.printInfo(programmerService.MaxWorkingHour(programmers));


        SMM smm = new SMM("333000777", 168, 1, 3750, false, true, "Arev", "Sargsyan", MARKETING_SMM, JUNIOR_MARKETING_SPECIALIST, FACEBOOK_INSTAGRAM);
        SMM smm1 = new SMM("080808081", 140, 3, 4100, true, false, "Arsen", "Karapetyan", MARKETING_SMM, MID_MARKETING_SPECIALIST, TWITTER);
        SMM smm2 = new SMM("321123321", 210, 7, 7700, true, true, "Gayane", "Kocharyan", MARKETING_SMM, SENIOR_MARKETING_SPECIALIST, LINKEDIN);

        String[] tools = {"Google Analytics"};
        String[] tools1 = {"Google Analytics", "Yandex Metrica"};
        String[] tools2 = {"Google Analytics", "Yandex Metrica", "Adsense"};

        SEO seo = new SEO("000200001", 170, 2, 5100, true, true, "Hakob", "Hakobyan", MARKETING_SEO, JUNIOR_MARKETING_SPECIALIST, TOOL_1);
        SEO seo1 = new SEO("666278781", 120, 5, 8000, true, true, "Mariam", "Barseghyan", MARKETING_SEO, MID_MARKETING_SPECIALIST, TOOL_2);
        SEO seo2 = new SEO("656278981", 250, 6, 12000, true, true, "Polo", "Ghasabyan", MARKETING_SEO, SENIOR_MARKETING_SPECIALIST, TOOL_3);

        MarketingServiceImpl marketingService = new MarketingServiceImpl();
        MarketingSpecialist[] marketingSpecialists = {smm, smm1, smm2, seo, seo1, seo2};

        marketingService.printInfo(seo1);
        marketingService.printInfo(smm);
        marketingService.printAll(marketingSpecialists);
        marketingService.printAllSortedByFirstname(marketingSpecialists);
        marketingService.comission(marketingSpecialists);
        marketingService.minExperience(marketingSpecialists);


    }

}

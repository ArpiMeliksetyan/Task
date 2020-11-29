package Task_5.service;

import Task_5.model.accountant.Accountant;

public interface AccountantService {
    void printInfo(Accountant accountant);

    void printAllAccountants(Accountant accountant[]);

    void printAccountantNameKnowledgeOfTaxCode(Accountant[] accountants);

    void printAccountantsWorkingHoursBigger200(Accountant[] accountants);

    void printFinancialAccountantsFullName(Accountant[] accountants);

    void printAccountantSortedByPerSalary(Accountant[] accountants);

    void printAccountantsFullNameSalaryBigger100000 (Accountant[]accountants);

}

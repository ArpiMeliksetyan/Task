package shop.service.staff;



import shop.model.staff.accountant.Accountant;

import java.io.IOException;

public interface AccountantService {

    void printInfo(Accountant accountant);

    void write(Accountant accountant) throws IOException;

    Accountant[] read(String path) throws IOException;

    void printAllAccountants(Accountant accountant[]);

    void perSalaryById(String path) throws IOException;

    void printAccountantNameKnowledgeOfTaxCode(Accountant[] accountants);

    void printAccountantsWorkingHoursBigger200(Accountant[] accountants);

    void printFinancialAccountantsFullName(Accountant[] accountants);

    void printAccountantSortedByPerSalary(Accountant[] accountants);

    void printAccountantsFullNameSalaryBigger100000(Accountant[] accountants);

}

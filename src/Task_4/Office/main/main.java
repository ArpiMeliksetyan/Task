package Task_4.Office.main;


import Task_4.Office.model.*;

public class main {
    public static void main(String[] args) {

        Employees[] employees = {new Employees("455452879", 45, 4, 5000, false, true, "David", "Azatyan", "Programming", "TeamLead"),
                new Employees("123456789", 38, 10, 10000, true, true, "Arpi", "Meliksetyan", "Accounting", "Chief Accountant"),
                new Employees("789456123", 25, 1, 3200, false, false, "Ani", "Arshakyan", "Marketing", "Junior marketing specialist")};
        System.out.println(employees[1].getDepartmentName());

        Accountant accountant = new Accountant(employees[1],true);
        System.out.println(accountant.calculateSalary(employees[1]));
        System.out.println(accountant);
        System.out.println(accountant.calculateTaxes(employees[1]));
        System.out.println(accountant.netIncome(employees[1]));

        Programmer programmer = new Programmer(employees[0],"Java","Mid");

        FrontEnd frontEnd = new FrontEnd(programmer);
        System.out.println(frontEnd);

        MarketingSpecialist ma= new MarketingSpecialist(employees[2]);
        SMM smm = new SMM(ma,"facebook");
        System.out.println(smm);

    }

}

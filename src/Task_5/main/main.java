package Task_5.main;


import Task_5.model.*;

public class main {
    public static void main(String[] args) {

        Employees[] employees = {new Employees("455452879", 400, 4, 5000, false, true, "David", "Azatyan", "Programming", "TeamLead"),
                new Employees("123456789", 38, 10, 10000, true, true, "Arpi", "Meliksetyan", "Accounting", "Chief Accountant"),
                new Employees("789456123", 25, 1, 3200, false, false, "Ani", "Arshakyan", "Marketing", "Junior marketing specialist")};


        Accountant accountant = new Accountant(employees[1],true);

        MarketingSpecialist ma= new MarketingSpecialist(employees[2]);
        SMM smm = new SMM(ma,"facebook");
        Programmer programmer = new Programmer(employees[0],"Java","Mid");

        programmer.daysOfHoliday();
        programmer.salaryForHolidays();

        accountant.daysOfHoliday();
        accountant.salaryForHolidays();

        ma.daysOfHoliday();
        ma.salaryForHolidays();
        ma.dressCode();

        BackEnd backEnd = new BackEnd(programmer);
        backEnd.dressCode();
        programmer.typeOfEvent();


    }

}

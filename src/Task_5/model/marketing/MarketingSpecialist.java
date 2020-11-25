package Task_5.model.marketing;

import Task_5.model.DressCode;
import Task_5.model.Employees;
import Task_5.model.Event;

public abstract class MarketingSpecialist extends Employees implements Event, DressCode {

    public MarketingSpecialist(String id, int hours, int experience, double per_Salary, boolean isCertifed, boolean isFullTime, String firtsName, String lastName, String departmentName, String position) {
        super(id, hours, experience, per_Salary, isCertifed, isFullTime, firtsName, lastName, departmentName, position);
    }

    public void daysOfHoliday() {
        int days = this.getHours() / 38;
        System.out.println("Days of holiday are: " + days);
    }

    public void salaryForHolidays() {
        int days = this.getHours() / 35;
        double salary = days * this.getPer_Salary() * 1.2;
        System.out.println("Salary for holiday is: " + salary);

    }

    public void analyzingMarket() {
        System.out.println("Analyzing current market ... ");
    }


    public void targeting() {
        System.out.println("Finding right targets ... ");
    }

    public void creatingAds() {
        System.out.println("Use different ads tools to attract customer attention ... ");

    }

    @Override
    public void typeOfEvent() {
        System.out.println("Annually we organize exhibition of products");
    }

    @Override
    public void dressCode() {
        System.out.println("Our every day look is casual");
    }


}
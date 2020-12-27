package shop.model.staff.marketing;


import shop.model.staff.Employees;
import shop.model.staff.Holidays;

public abstract class MarketingSpecialist extends Employees implements Holidays {

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

}
package shop.model.staff.programmer;

import shop.model.staff.Employees;
import shop.model.staff.Holidays;

public abstract class Programmer extends Employees implements Holidays {

    private String language;
    private String level;


    public Programmer(String id, int hours, int experience, double per_Salary, boolean isCertifed, boolean isFullTime, String firtsName, String lastName, String departmentName, String position, String language, String level) {
        super(id, hours, experience, per_Salary, isCertifed, isFullTime, firtsName, lastName, departmentName, position);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }


    public void daysOfHoliday() {

        int days = this.getHours() / 40;
        System.out.println("Days of holiday are: " + days);
    }

    public void salaryForHolidays() {
        int days = this.getHours() / 40;
        double salary = days * this.getPer_Salary() * 2;
        System.out.println("Salary for holiday is: " + salary);

    }


}

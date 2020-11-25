package Task_5.model.programmer;

import Task_5.model.DressCode;
import Task_5.model.Employees;
import Task_5.model.Event;

public abstract class Programmer extends Employees implements Event, DressCode {

    private String language;
    private String level;


    public Programmer(String id, int hours, int experience, double per_Salary, boolean isCertifed, boolean isFullTime, String firtsName, String lastName, String departmentName, String position, String language, String level) {
        super(id, hours, experience, per_Salary, isCertifed, isFullTime, firtsName, lastName, departmentName, position);
        this.language = language;
        this.level = level;
    }


    public void typeOfEvent() {
        System.out.println("Annualy we organize Hachkathon");
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

    public int complexityOfCode(int rate, int days, int hour) {
        int complexity = (days * hour * rate) / 100;
        return complexity;
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

    public void writingCode() {
        System.out.println("Writing code ... ");
    }


    @Override
    public void dressCode() {
        System.out.println("The style of our dress code is free");
    }

}

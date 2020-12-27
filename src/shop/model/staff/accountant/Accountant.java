package shop.model.staff.accountant;

import shop.model.staff.Employees;
import shop.model.staff.Holidays;

public class Accountant extends Employees implements Holidays {

    private boolean knowledgeOfTaxCode;

    public Accountant(String id, int hours, int experience, double per_Salary, boolean isCertifed, boolean isFullTime, String firtsName, String lastName, String departmentName, String position, boolean knowledgeOfTaxCode) {
        super(id, hours, experience, per_Salary, isCertifed, isFullTime, firtsName, lastName, departmentName, position);
        this.knowledgeOfTaxCode = knowledgeOfTaxCode;
    }

    public void daysOfHoliday() {
        int hours = this.getHours();
        int days = hours / 35;
        System.out.println("Days of holiday are: " + days);
    }

    public void salaryForHolidays() {
        int days = this.getHours() / 35;
        double salary = days * this.getPer_Salary();
        System.out.println("Salary for holiday is: " + salary);

    }

    public double calculateSalary() {
        double s = this.getHours() * this.getPer_Salary();
        return s;
    }

    public boolean isKnowledgeOfTaxCode() {
        return knowledgeOfTaxCode;
    }

    public void setKnowledgeOfTaxCode(boolean knowledgeOfTaxCode) {
        this.knowledgeOfTaxCode = knowledgeOfTaxCode;
    }
}

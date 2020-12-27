package shop.model.staff.sales;

import shop.model.staff.Employees;

public class SalesManager extends Employees {

    public SalesManager(String id, int hours, int experience, double per_Salary, boolean isCertifed, boolean isFullTime, String firtsName, String lastName, String departmentName, String position) {
        super(id, hours, experience, per_Salary, isCertifed, isFullTime, firtsName, lastName, departmentName, position);
    }

}

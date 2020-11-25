package Task_5.model.marketing;

import Task_5.model.Gaming;
import Task_5.model.marketing.MarketingSpecialist;

import java.util.Arrays;

public class SEO extends MarketingSpecialist implements Gaming {

    private String tools;

    public SEO(String id, int hours, int experience, double per_Salary, boolean isCertifed, boolean isFullTime, String firtsName, String lastName, String departmentName, String position, String tools) {
        super(id, hours, experience, per_Salary, isCertifed, isFullTime, firtsName, lastName, departmentName, position);
        this.tools = tools;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public void analyzingMarket() {
        System.out.println("Analyzing current market with digital tools... ");
    }

    public void targeting() {
        System.out.println("Finding right targets in web platforms... ");
    }

    public void creatingAds() {
        System.out.println("Creating advertisement using Google Analytics");

    }

    @Override
    public void typeOfGame() {
        System.out.println("Our free time we play intellectual games");
    }

}

package Task_5.model.marketing;

import Task_5.model.marketing.MarketingSpecialist;

public class SMM extends MarketingSpecialist {

    private String socialPlatform;

    public SMM(String id, int hours, int experience, double per_Salary, boolean isCertifed, boolean isFullTime, String firtsName, String lastName, String departmentName, String position, String socialPlatform) {
        super(id, hours, experience, per_Salary, isCertifed, isFullTime, firtsName, lastName, departmentName, position);
        this.socialPlatform = socialPlatform;

    }

    public String getSocialPlatform() {
        return socialPlatform;
    }

    public void setSocialPlatform(String socialPlatform) {
        this.socialPlatform = socialPlatform;
    }

    public void analyzingMarket() {
        System.out.println("Analyzing current market in social media ... ");
    }

    public void targeting() {
        System.out.println("Finding right targets in social media platforms... ");
    }

    public void creatingAds() {
        System.out.println("Creating advertisement in Facebook and Instagram ... ");

    }



}

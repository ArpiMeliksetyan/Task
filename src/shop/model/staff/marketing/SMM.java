package shop.model.staff.marketing;


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

}

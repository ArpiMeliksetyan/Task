package Task_4.Office.model;

public class SMM extends MarketingSpecialist {

    private String socialPlatform;
    private MarketingSpecialist m;



    public SMM(MarketingSpecialist marketingSpecialist, String socialPlatform) {
        super(marketingSpecialist);
        m = marketingSpecialist;
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

    @Override
    public String toString() {
        return "SMM{" +
                "socialPlatform='" + socialPlatform + '\'' +
                ", m=" + m +
                '}';
    }
}

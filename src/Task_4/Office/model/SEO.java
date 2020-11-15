package Task_4.Office.model;

import java.util.Arrays;

public class SEO  extends MarketingSpecialist {

     private String [] tools;
     private MarketingSpecialist m;

    public SEO(MarketingSpecialist marketingSpecialist, String[] tools) {
        super(marketingSpecialist);
        m = marketingSpecialist;
        this.tools = tools;
    }

    public String[] getTools() {
        return tools;
    }

    public void setTools(String[] tools) {
        this.tools = tools;
    }

    public void analyzingMarket(){
        System.out.println("Analyzing current market with digital tools... ");
    }

    public void targeting() {
        System.out.println("Finding right targets in web platforms... ");
    }

    public void creatingAds() {
        System.out.println("Creating advertisement using Google Analytics");

    }

    @Override
    public String toString() {
        return "SEO{" +
                "tools=" + Arrays.toString(tools) +
                ", m=" + m +
                '}';
    }
}

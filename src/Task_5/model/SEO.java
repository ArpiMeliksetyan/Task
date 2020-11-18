package Task_5.model;

import java.util.Arrays;

public class SEO  extends MarketingSpecialist  implements Gaming{

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

    @Override
    public void typeOfGame() {
        System.out.println("Our free time we play intellectual games");
    }
}

package Task_4.Office.model;

public class MarketingSpecialist extends Employees {
    private Employees employees;

    public MarketingSpecialist(Employees e) {
        super();
        employees = e;
    }

    public void analyzingMarket() {
        System.out.println("Analyzing current market ... ");
    }


    public void targeting() {
        System.out.println("Finding right targets ... ");
    }

    public void creatingAds() {
        System.out.println("Use different ads tools to attract customer attention ... ");

    }

    @Override
    public String toString() {
        return "MarketingSpecialist{" +
                "employees=" + employees +
                '}';
    }
}

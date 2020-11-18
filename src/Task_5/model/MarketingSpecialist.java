package Task_5.model;

public class MarketingSpecialist extends Employees implements Event,DressCode{
    private Employees employees;

    public MarketingSpecialist(Employees e) {
        super();
        employees = e;
    }

    public void daysOfHoliday(){
        int days = employees.getHours() / 38;
        System.out.println("Days of holiday are: " + days);
    }

    public void salaryForHolidays() {
        int days = employees.getHours() / 35;
        double salary = days * employees.getPer_Salary() * 1.2 ;
        System.out.println("Salary for holiday is: " + salary);

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

    @Override
    public void typeOfEvent() {
        System.out.println("Annually we organize exhibition of products");
    }

    @Override
    public void dressCode() {
        System.out.println("Our every day look is casual");
    }
}

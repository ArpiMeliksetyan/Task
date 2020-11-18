package Task_5.model;

public class Programmer extends Employees implements Event, DressCode {

    private String language;
    private String level;
    private Employees employees;

    public Programmer(Employees e, String language, String level) {
        super();
        employees = e;
        this.language = language;
        this.level = level;
    }

    public Programmer() {

    }
    public void typeOfEvent() {
        System.out.println("Annualy we organize Hachkathon");
    }

    public void daysOfHoliday() {

        int days = employees.getHours() / 40;
        System.out.println("Days of holiday are: " + days);
    }

    public void salaryForHolidays() {
        int days = employees.getHours() / 40;
        double salary = days * employees.getPer_Salary() * 2;
        System.out.println("Salary for holiday is: " + salary);

    }



    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void writingCode() {
        System.out.println("Writing code ... ");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "language='" + language + '\'' +
                ", level='" + level + '\'' +
                ", employees=" + employees +
                '}';
    }

    @Override
    public void dressCode() {
        System.out.println("The style of our dress code is free");
    }
}

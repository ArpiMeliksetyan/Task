package Task_5.model;

public class Accountant extends Employees implements DressCode {

    private boolean knowledgeOfTaxCode;

    private Employees employees;

    public Accountant(Employees e, boolean knowledgeOfTaxCode) {
        super();
        this.employees = e;
        this.knowledgeOfTaxCode = knowledgeOfTaxCode;
    }

    public void daysOfHoliday(){
        int days = employees.getHours() / 35;
        System.out.println("Days of holiday are: " + days);
    }

    public void salaryForHolidays() {
        int days = employees.getHours() / 35;
        double salary = days * employees.getPer_Salary() ;
        System.out.println("Salary for holiday is: " + salary);

    }
    public boolean isKnowledgeOfTaxCode() {
        return knowledgeOfTaxCode;
    }

    public void setKnowledgeOfTaxCode(boolean knowledgeOfTaxCode) {
        this.knowledgeOfTaxCode = knowledgeOfTaxCode;
    }

    public double calculateSalary(Employees e) {
        double s = e.getHours() * e.getPer_Salary();
        return s;
    }

    public double calculateTaxes(Employees e) {
        double t = (calculateSalary(e) * 30) / 100;
        return t;
    }

    public double netIncome(Employees e) {
        double income = calculateSalary(e) - calculateTaxes(e);
        return income;
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "knowledgeOfTaxCode=" + knowledgeOfTaxCode +
                '}';
    }

    @Override
    public void dressCode() {
        System.out.println("Our dress code is official");
    }
}

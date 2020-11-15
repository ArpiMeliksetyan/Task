package Task_4.Office.model;

public class Accountant extends Employees {

    private boolean knowledgeOfTaxCode;

    private Employees employees;
    public Accountant(Employees e, boolean knowledgeOfTaxCode) {
        super();
        this.employees = e;
        this.knowledgeOfTaxCode = knowledgeOfTaxCode;
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
}

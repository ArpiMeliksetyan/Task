package shop.model.staff.marketing;


public class SEO extends MarketingSpecialist {

    private String tools;

    public SEO(String id, int hours, int experience, double per_Salary, boolean isCertifed, boolean isFullTime, String firtsName, String lastName, String departmentName, String position, String tools) {
        super(id, hours, experience, per_Salary, isCertifed, isFullTime, firtsName, lastName, departmentName, position);
        this.tools = tools;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

}

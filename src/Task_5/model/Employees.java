package Task_5.model;


public abstract class Employees implements Holidays {

    private int hours;
    private int experience;
    private double per_Salary;
    private boolean isCertifed;
    private boolean isFullTime;
    private String id;
    private String firtsName;
    private String LastName;
    private String departmentName;
    private String position;


    public void working() {
        System.out.println("I work as an" + position);
    }


    public Employees(String id, int hours, int experience, double per_Salary, boolean isCertifed, boolean isFullTime, String firtsName, String lastName, String departmentName, String position) {
        this.id = id;
        this.hours = hours;
        this.experience = experience;
        this.per_Salary = per_Salary;
        this.isCertifed = isCertifed;
        this.isFullTime = isFullTime;
        this.firtsName = firtsName;
        LastName = lastName;
        this.departmentName = departmentName;
        this.position = position;
    }

    public String getId() {
            return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getPer_Salary() {
        return per_Salary;
    }

    public void setPer_Salary(double per_Salary) {
        this.per_Salary = per_Salary;
    }

    public boolean isCertifed() {
        return isCertifed;
    }

    public void setCertifed(boolean certifed) {
        isCertifed = certifed;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "hours=" + hours +
                ", experience=" + experience +
                ", per_Salary=" + per_Salary +
                ", isCertifed=" + isCertifed +
                ", isFullTime=" + isFullTime +
                ", id='" + id + '\'' +
                ", firtsName='" + firtsName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public void daysOfHoliday() {
        System.out.println("I want to know my holiday days");
    }

    @Override
    public void salaryForHolidays() {
        System.out.println("Accountant should count the salary for holidays");

    }
}

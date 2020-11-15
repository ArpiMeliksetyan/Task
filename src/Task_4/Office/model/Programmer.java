package Task_4.Office.model;

public class Programmer extends Employees {

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
}

package Task_4.Office.model;

public class QA extends Programmer {

    private String type;
    private Programmer programmer;

    public QA(String type, Programmer programmer) {
        this.type = type;
        this.programmer = programmer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void writingCode() {
        System.out.println("Writing automated code ... ");
    }

    public void debugging() {
        System.out.println("Debug all codes");
    }

    @Override
    public String toString() {
        return "QA{" +
                "type='" + type + '\'' +
                ", programmer=" + programmer +
                '}';
    }
}

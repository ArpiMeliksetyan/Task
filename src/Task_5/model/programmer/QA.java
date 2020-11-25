package Task_5.model.programmer;

public class QA extends Programmer {



    public QA(String id, int hours, int experience, double per_Salary, boolean isCertifed, boolean isFullTime, String firtsName, String lastName, String departmentName, String position, String language, String level) {
        super(id, hours, experience, per_Salary, isCertifed, isFullTime, firtsName, lastName, departmentName, position, language, level);
    }


    public void writingCode() {
        System.out.println("Writing automated code ... ");
    }

    public void debugging() {
        System.out.println("Debug all codes");
    }


}

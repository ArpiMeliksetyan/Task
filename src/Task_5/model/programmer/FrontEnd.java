package Task_5.model.programmer;

import Task_5.model.Gaming;

public class FrontEnd extends Programmer implements Gaming {


    public FrontEnd(String id, int hours, int experience, double per_Salary, boolean isCertifed, boolean isFullTime, String firtsName, String lastName, String departmentName, String position, String language, String level) {
        super(id, hours, experience, per_Salary, isCertifed, isFullTime, firtsName, lastName, departmentName, position, language, level);
    }


    public void writingCode() {
        System.out.println("Writing code for frontend ... ");
    }

    public void creatingInterface() {
        System.out.println("Implement design features");
    }

    @Override
    public void typeOfGame() {
        System.out.println("Our teem's lovely game is Mario");
    }
}

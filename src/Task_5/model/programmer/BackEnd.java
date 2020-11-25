package Task_5.model.programmer;

import Task_5.model.Gaming;

public class BackEnd extends Programmer implements Gaming {



    public BackEnd(String id, int hours, int experience, double per_Salary, boolean isCertifed, boolean isFullTime, String firtsName, String lastName, String departmentName, String position, String language, String level) {
        super(id, hours, experience, per_Salary, isCertifed, isFullTime, firtsName, lastName, departmentName, position, language, level);
    }


    public void writingCode() {
        System.out.println("Writing code for backend ... ");
    }

    public String designFeatures() {
        return "Design and implement user-facing features end-to-end.";
    }



    @Override
    public void typeOfGame() {
        System.out.println("In our room we have Chess and Domino");
    }


}

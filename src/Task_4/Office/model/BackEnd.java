package Task_4.Office.model;

public class BackEnd extends Programmer {

private Programmer programmer;

    public BackEnd(Programmer programmer) {

        this.programmer = programmer;
    }

    public void writingCode() {
        System.out.println("Writing code for backend ... ");
    }

    public void designFeatures() {
        System.out.println("Design and implement user-facing features end-to-end.");
    }

    @Override
    public String toString() {
        return "BackEnd{" +
                "programmer=" + programmer +
                '}';
    }
}

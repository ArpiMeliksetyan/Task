package Task_4.Office.model;

public class FrontEnd extends Programmer {

    private Programmer programmer;

    public FrontEnd(Programmer p) {
        programmer = p;
    }

    public void writingCode() {
        System.out.println("Writing code for frontend ... ");
    }

    public void creatingInterface() {
        System.out.println("Implement design features");
    }

    @Override
    public String toString() {
        return "FrontEnd{" +
                "programmer=" + programmer +
                '}';
    }
}

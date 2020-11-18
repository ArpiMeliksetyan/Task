package Task_5.model;

public class FrontEnd extends Programmer implements Gaming {

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

    @Override
    public void typeOfGame() {
        System.out.println("Our teem's lovely game is Mario");
    }
}

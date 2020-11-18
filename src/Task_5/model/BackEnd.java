package Task_5.model;

public class BackEnd extends Programmer implements Gaming{

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

    @Override
    public void typeOfGame() {
        System.out.println("In our room we have Chess and Domino");
    }


}

package shop.model.product;

public class Shoes  extends Product {

    private String type;
    private boolean isTie;

    public Shoes(String barCode, double price, String gender, String color, String country, String brand, String type, boolean isTie) {
        super(barCode, price, gender, color, country, brand);
        this.type = type;
        this.isTie = isTie;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isTie() {
        return isTie;
    }

    public void setTie(boolean tie) {
        isTie = tie;
    }


}

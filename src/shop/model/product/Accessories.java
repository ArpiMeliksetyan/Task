package shop.model.product;

public class Accessories extends Product {

   private String metal;
   private boolean haveDiamond;

    public Accessories(String barCode, double price, String gender, String color, String country, String brand, String metal, boolean haveDimond) {
        super(barCode, price, gender, color, country, brand);
        this.metal = metal;
        this.haveDiamond = haveDimond;

    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public boolean isHaveDiamond() {
        return haveDiamond;
    }

    public void setHaveDiamond(boolean haveDiamond) {
        this.haveDiamond = haveDiamond;
    }

    @Override
    public String toString() {
        return (
                "barCode:" + super.getBarCode() +
                        ", price:" + super.getPrice() +
                        ", gender:" + super.getGender() +
                        ", color:" + super.getColor() +
                        ", country:" + super.getCountry() +
                        ", brand:" + super.getBrand() +
                        ", metal:" + getMetal() +
                        ", haveDiamond:" + isHaveDiamond()
        );
    }
}

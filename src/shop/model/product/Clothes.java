package shop.model.product;

public class Clothes extends Product {

    private String assortment;
    private String material;
    private String season;


    public Clothes(String barCode, double price, String gender, String color, String country, String brand, String assortment, String material, String season) {
        super(barCode, price, gender, color, country, brand);
        this.assortment = assortment;
        this.material = material;
        this.season = season;
    }

    public String getAssortment() {
        return assortment;
    }

    public void setAssortment(String assortment) {
        this.assortment = assortment;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
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
                        ", assortment:" + getAssortment() +
                        ", material:" + getMaterial() +
                        ", season:" + getSeason()
        );
    }
}

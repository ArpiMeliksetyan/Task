package shop.util.constants;

public enum Assortment {

    TROUSER("trouser"), SKIRT("skirt"), T_SHIRT("t_shirt"), SHIRT("shirt"), COAT("coat"), PULLOVER("pullover"), DRESS("dress");

    String assortment;

    Assortment(String assortment) {
        this.assortment = assortment;
    }

    public String getAssortment() {
        return assortment;
    }
}

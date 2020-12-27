package shop.util.constants;

public enum Materials {

    COTTON("cotton"), WOOL("wool"), SILK("silk"),
    LEATHER("leather"), CELLULOSE("cellulose"), LYCRA("lycra");

    String material;

    Materials(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}

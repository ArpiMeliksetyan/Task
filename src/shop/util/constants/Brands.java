package shop.util.constants;

public enum Brands {

    OSTIN("Ostin"), FUN_DAY("Fun-Day"), ARMANY("Armany"), ADIDAS("Adidas"), PUMA("Puma"), REEBOKE("Reeboke"), ORSAY("Orsay"),
    ZARINA("Zarina"), PARFOIS("Parfois"), BOLSERO("Bolsero"), ALDO("Aldo"), BALDI("Baldi");

    String brand;

    Brands(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

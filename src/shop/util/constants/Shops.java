package shop.util.constants;

public enum Shops {
    KOMITAS("Komitas Branch"), MASHTOC("Mashtoc Branch");

    String name;

    Shops(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

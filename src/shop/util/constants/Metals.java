package shop.util.constants;

public enum Metals {

    SILVER("silver"), GOLD("gold"), BRONZE("bronze");

    String metal;

    Metals(String metal) {
        this.metal = metal;
    }

    public String getMetal() {
        return metal;
    }
}

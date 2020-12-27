package shop.util.constants;

public enum Countries {
    AM("Armenia"), RA("Russia"), USA("United States of America"),
    CN("Canada"), IT("Italy"), CH("China");

    String name;

    Countries(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

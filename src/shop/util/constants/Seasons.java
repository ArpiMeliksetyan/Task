package shop.util.constants;

public enum Seasons {

    SUMMER("summer"), WINTER("winter"), SPRING("spring"), AUTUMN("autumn");

    String season;

    Seasons(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }
}

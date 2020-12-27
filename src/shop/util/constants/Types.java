package shop.util.constants;

public enum Types {

    CLASSICAL("classical"), SPORT("sport");

    String type;

    Types(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

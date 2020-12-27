package shop.model.customer;

public class Customer {

    private String id;
    private String cardId;
    private String firstName;
    private String lastName;
    private String email;
    private double bonus;
    private String shop;

    public Customer(String id, String cardId, String firstName, String lastName, String email, double bonus, String shop) {
        this.id = id;
        this.cardId = cardId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.bonus = bonus;
        this.shop = shop;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return
                "id:" + id +
                        ", cardId:" + cardId +
                        ", firstName:" + firstName +
                        ", lastName:" + lastName +
                        ", email:" + email +
                        ", bonus:" + bonus +
                        ", shop:" + shop;
    }
}

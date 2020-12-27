package shop.model.product;

import java.util.Objects;

public  abstract class Product {

    private String barCode;
    private double price;
    private String gender;
    private String color;
    private String country;
    private String brand;


    public Product(String barCode, double price, String gender, String color, String country,String brand) {
        this.barCode = barCode;
        this.price = price;
        this.gender = gender;
        this.color = color;
        this.country = country;
        this.brand = brand;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

}

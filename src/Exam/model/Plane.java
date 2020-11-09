package Exam.model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean isMilitary;
    private String typeOfEngine;
    private int weight;
    private int wingspan;
    private int topSpeed;
    private long seats;
    private double costOfPlane;

    public Plane(String model, String country, int year, int hours, boolean isMilitary, String typeOfEngine, int weight, int wingspan, int topSpeed, long seats, double costOfPlane) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.isMilitary = isMilitary;
        this.typeOfEngine = typeOfEngine;
        this.weight = weight;
        this.wingspan = wingspan;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.costOfPlane = costOfPlane;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!(model.isEmpty())) {
            this.model = model;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (!(country.isEmpty())) {
            this.model = model;
        }
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2020) {
            this.year = year;
        } else {
            System.out.println("Please enter valid year");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 10000) {
            this.hours = hours;
        }
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        if (typeOfEngine.length() > 0) {
            this.typeOfEngine = typeOfEngine;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 1000 && weight <= 10000) {
            this.weight = weight;
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan >= 10 && wingspan <= 45) {
            this.wingspan = wingspan;
        } else {
            System.out.println("There is no such wingspan");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed >= 0 && topSpeed <= 1000) {
            this.topSpeed = topSpeed;
        }
    }

    public long getSeats() {
        return seats;
    }

    public void setSeats(long seats) {
        if (seats >= 0) {
            this.seats = seats;
        } else{
            System.out.println("Please enter right seat number");
        }
    }

    public double getCostOfPlane() {
        return costOfPlane;
    }

    public void setCostOfPlane(double costOfPlane) {
        if (costOfPlane >= 0) {
            this.costOfPlane = costOfPlane;
        } else{
            System.out.println("Please try again, something went wrong");
        }
    }
}

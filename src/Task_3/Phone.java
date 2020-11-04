package Task_3;

public class Phone {
//   Phone Create logical structures

    private int year;
    private int weight;
    private double price;
    private String number;
    private String color;
    private String model;
    private String version;
    private String operationSystem;
    private String operationMemory;
    private String frontCamera;
    private String camera;
    private boolean microSD;
    private boolean dualSim;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNumber() {
            return number;
    }


    public void setNumber(String number) {

        if (number.length() == 9) {
            this.number = number;
        } else {
            System.out.println("Please enter valid number");
        }

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getOperationMemory() {
        return operationMemory;
    }

    public void setOperationMemory(String operationMemory) {
        this.operationMemory = operationMemory;
    }

    public String getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(String frontCamera) {
        this.frontCamera = frontCamera;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public boolean isMicroSD() {
        return microSD;
    }

    public void setMicroSD(boolean microSD) {
        this.microSD = microSD;
    }

    public boolean isDualSim() {
        return dualSim;
    }

    public void setDualSim(boolean dualSim) {
        this.dualSim = dualSim;
    }
}

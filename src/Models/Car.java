package Models;

public abstract class Car {

private String brand;
private String model;

private int powerEngine;
private int price;


    public String getCarAsString(String middle) {
    return this.brand+", "+this.model+", "+middle+", "+this.price+" euro";
    }

    public Car(String brand, String model, int powerEngine, int price) {
        this.brand = brand;
        this.model = model;
        this.powerEngine = powerEngine;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPowerEngine() {
        return powerEngine;
    }

    public void setPowerEngine(int powerEngine) {
        this.powerEngine = powerEngine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

package Models;

public class ElectricCar extends Car{

    private int capacityBat;

    public ElectricCar(String brand, String model, int powerEngine, int price, int capacityBat) {
        super(brand, model, powerEngine, price);
        this.capacityBat = capacityBat;
    }

    public int getCapacityBat() {
        return capacityBat;
    }

public String toString(){
    String middle= this.getPowerEngine()+"KW, "+this.capacityBat+"Ah";
    return "ELECTRIC_CAR "+getCarAsString(middle);
}

    public void setCapacityBat(int capacityBat) {
        this.capacityBat = capacityBat;
    }
}

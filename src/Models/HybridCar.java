package Models;

public class HybridCar extends Car{

    private int capacityBat;
    private float engineDis;

    public int getCapacityBat() {
        return capacityBat;
    }

    public void setCapacityBat(int capacityBat) {
        this.capacityBat = capacityBat;
    }

    public float getEngineDis() {
        return engineDis;
    }

    public void setEngineDis(float engineDis) {
        this.engineDis = engineDis;
    }

    public String toString(){
        String middle= this.engineDis+"L, "+this.getPowerEngine()+"KW, "+this.capacityBat+"Ah";
        return "HYBRID_CAR "+getCarAsString(middle);

    }

    public HybridCar(String brand, String model, int powerEngine, int price, int capacityBat, float engineDis) {
        super(brand, model, powerEngine, price);
        this.capacityBat = capacityBat;
        this.engineDis = engineDis;
    }
}

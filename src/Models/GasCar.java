package Models;

public class GasCar extends Car{

    private float engineDis;

    public GasCar(String brand, String model, int powerEngine, int price, float engineDis) {
        super(brand, model, powerEngine, price);
        this.engineDis = engineDis;
    }

    public String toString(){
        String middle= this.engineDis+"L, "+getPowerEngine()+"KW";
        return "GAS_CAR "+getCarAsString(middle);

    }

    public float getEngineDis() {
        return engineDis;
    }

    public void setEngineDis(float engineDis) {
        this.engineDis = engineDis;
    }
}

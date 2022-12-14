package transport;

public abstract class Transport {
    private double engineVolume;
    private final String brand;
    private final String model;
    public abstract void start();
    public abstract void stop();
    public abstract boolean service();
    public void transportInfo() {
        System.out.print("\n" + getBrand() + " " + getModel() +
                ". Объем двигателя: " + engineVolume +
                ".");
    }
    public abstract void printType();
    public String notNull(String s){
        if (s == null || s.isBlank() || s.isEmpty() ){
            s = "default";
        } else {
            s = s;
        }
        return s;
    }
public double notNull(double d){
    if (d <= 0) {
        d = 1.5;
    } else {
        d = d;
    }
    return d;
}
    public abstract void refill();

    public Transport(String brand, String model, String color, int year, String country, int maxSpeed, double fuelPercentage) {
        this("default","default",1.5);
    }

    public Transport(String brand, String model, double engineVolume) {
        this.brand = notNull(brand);
        this.model = notNull(model);
        this.engineVolume = notNull(engineVolume);
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

}

package transport;

public abstract class Transport {
    private double engineVolume;
    private final String brand;
    private final String model;
    public abstract void start();
    public abstract void stop();
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

        /*if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (maxSpeed <= 0){
            this.maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }
        if (fuelPercentage < 0){
            this.fuelPercentage = 0;
        } else if (fuelPercentage >100){
            this.fuelPercentage = 100.00;
        } else {
            this.fuelPercentage = fuelPercentage;
        }*/
    }

//    public double getFuelPercentage() {
//        return fuelPercentage;
//    }
//
//    public void setFuelPercentage(double fuelPercentage) {
//        this.fuelPercentage = fuelPercentage;
//    }

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

    /*public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }*/
}

package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private  String color;
    private final int year;
    private final String country;
    private int maxSpeed;
    protected double fuelPercentage;
    public void transportInfo() {
        System.out.print(getBrand() + " " + getModel() +
                ". Цвет: " + getColor() +
                ". Год производства: " + getYear() +
                ". Страна производства: " + getCountry() +
                ". Максимальная скорость: " + getMaxSpeed() + "км/ч. " +
                "Количество топлива в процентах: " + getFuelPercentage() + "%. ");
    }
    public abstract void refill();

    public Transport(String brand, String model, String color, int year, String country, int maxSpeed, double fuelPercentage) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (color == null || color.isBlank() || color.isEmpty()) {
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
        }
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        this.fuelPercentage = fuelPercentage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
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
    }
}

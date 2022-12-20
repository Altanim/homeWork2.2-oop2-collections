package transport;

import transport.driver.Driver;

import java.lang.reflect.Array;
import java.util.*;

public abstract class Transport {
    private double engineVolume;
    private final String brand;
    private final String model;
    public abstract void start();
    public abstract void stop();
    public abstract boolean service();
    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();
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
    public void addDriver(Driver<?>... drivers){
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>... mechanics){
       this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors){
        this.sponsors.addAll(Arrays.asList(sponsors));
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

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.getEngineVolume(),
                getEngineVolume()) == 0 && Objects.equals(getBrand(),
                transport.getBrand()) && Objects.equals(getModel(),
                transport.getModel()) && Objects.equals(getDrivers(),
                transport.getDrivers()) && Objects.equals(getMechanics(),
                transport.getMechanics()) && Objects.equals(getSponsors(),
                transport.getSponsors());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEngineVolume(), getBrand(), getModel(), getDrivers(), getMechanics(), getSponsors());
    }

    @Override
    public String toString() {
        return "\n Транспорт: " + brand +
                " " + model +
                " объем двигателя: " + engineVolume +
                "\n водители: " + drivers +
                "\n механики: " + mechanics +
                "\n спонсоры: " + sponsors;
    }

    public abstract void repair();
}

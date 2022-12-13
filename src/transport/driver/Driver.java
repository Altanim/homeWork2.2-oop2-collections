package transport.driver;

import transport.Transport;

public abstract class Driver<T extends Transport> {
    public final String name;
    private boolean driverLicense;
    private int exp;

    public void driverInfo(T transport){
        System.out.println("\nВодитель " +name+ " управляет " +transport.getBrand()+ " "
                +transport.getModel()+ " и будет учавствовать в заезде." );
    }
    public abstract void startDrive(T transport);
    public abstract void stopDrive(T transport);
    public abstract void refill(T transport);

    public Driver(String name, boolean driverLicense, int exp) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}

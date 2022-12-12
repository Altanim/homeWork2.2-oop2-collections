package transport.driver;

import transport.Car;
import transport.Truck;

public class DriverC extends Driver<Truck>{
    public DriverC(String name, boolean driverLicense, int exp) {
        super(name, driverLicense, exp);
    }
    public void race(Truck transport){
        driverInfo(transport);
        transport.start();
        transport.refill();
        transport.stop();
        System.out.println();
    }
    @Override
    public void startDrive(Truck transport) {
        transport.start();
    }

    @Override
    public void stopDrive(Truck transport) {
        transport.stop();
    }

    @Override
    public void refill(Truck transport) {
        transport.refill();
    }
}

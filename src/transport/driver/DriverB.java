package transport.driver;

import transport.Car;
import transport.Transport;

public class DriverB extends Driver<Car> {
    public DriverB(String name, boolean driverLicense, int exp) {
        super(name, driverLicense, exp);
    }
    public void race(Car transport){

        driverInfo(transport);
        transport.start();
        transport.refill();
        transport.stop();
        System.out.println();
    }
    @Override
    public void startDrive(Car transport) {
transport.start();
    }

    @Override
    public void stopDrive(Car transport) {
transport.stop();
    }

    @Override
    public void refill(Car transport) {
transport.refill();
    }
}

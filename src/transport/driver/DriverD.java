package transport.driver;

import transport.Bus;
import transport.Car;

public class DriverD extends Driver<Bus> {
    public DriverD(String name, boolean driverLicense, int exp) {
        super(name, driverLicense, exp);
    }
    public void race(Bus transport){
        driverInfo(transport);
        transport.start();
        transport.refill();
        transport.stop();
        System.out.println();
    }
    @Override
    public void startDrive(Bus transport) {
        transport.start();
    }

    @Override
    public void stopDrive(Bus transport) {
        transport.stop();
    }

    @Override
    public void refill(Bus transport) {
        transport.refill();
    }
}

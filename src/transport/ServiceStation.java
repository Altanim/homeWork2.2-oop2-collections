package transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> transports = new ArrayDeque<>();

    private void add(Transport transport) {
        transports.offer(transport);
    }

    public void addCar(Car car) {
        add(car);
    }

    public void addTruck(Truck truck) {
        add(truck);
    }

    public void service(){
        if (!transports.isEmpty()){
            Transport transport = transports.poll();
            boolean result = transport.service();
            if (!result){
                transport.repair();
            }
        }
    }
    private void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Транспортное средство " + transport.getBrand() + " " + transport.getModel() +
                        " не прошло диагностику");
            } else {
                System.out.println("Транспортное средство " + transport.getBrand() + " " + transport.getModel() +
                        " прошло диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void serviceCar(Car car) {
        try {
            if (!car.service()) {
                throw new RuntimeException("Автомобиль " + car.getBrand() + " " + car.getModel() +
                        " не прошел диагностику.");
            } else {
                System.out.println("Автомобиль " + car.getBrand() + " " + car.getModel() +
                        " прошел диагностику.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private void serviceTruck(Truck truck) {
        try {
            if (!truck.service()) {
                throw new RuntimeException("Грузовик " + truck.getBrand() + " " + truck.getModel() +
                        " не прошел диагностику.");
            } else {
                System.out.println("Грузовик " + truck.getBrand() + " " + truck.getModel() +
                        " прошел диагностику.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}
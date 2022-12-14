import transport.*;
//import transport.Train;
import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Лада", "Гранта", 1.7, BodyType.SEDAN);
        Car audi = new Car("Audi", "A8 50L TDI quattro", 3.0, BodyType.SEDAN);
        Car bmw = new Car("BMW", "Z8", 3.0, BodyType.SEDAN);
        Car kia = new Car("Kia", "Sportage 4", 2.4, BodyType.SEDAN);
        Car hundai = new Car("Hundai", "Avanta", 1.6, BodyType.COUPE);
        Bus paz1 = new Bus("Паз", "320405 - 04", 4.43,BusCapacity.SMALL);
        Bus liaz = new Bus("ЛиАЗ", "525662", 10.85,BusCapacity.LARGE);
        Bus kav = new Bus("КАВЗ", "4238", 6.7,BusCapacity.MEDIUM);
        Bus paz = new Bus("ПаЗ", "44-65", 5.3, BusCapacity.SMALL);
        Truck mercedes = new Truck("Mercedes", "Actros S", 15.6, TruckWeight.N2);
        Truck volvo = new Truck("Volvo", "VH", 13, TruckWeight.N1);
        Truck kamaz = new Truck("Камаз", "65116", 11.76, TruckWeight.N2);
        Truck hundaiTruck = new Truck("Hundai", "ST5", 13, TruckWeight.N3);

        DriverB sergey = new DriverB("Иванов Иван Михайлович", true, 10,'B');
        DriverC dmitry = new DriverC("Сергеев Дмитрий Андреевич", true, 7, 'C');
        DriverD petr = new DriverD("Петров Петр Космодемьянович", true, 15, 'd');
        service(lada,audi,bmw,kamaz,kav,kia,hundaiTruck,hundai,paz,paz1,liaz,volvo);
    }
    private static void serviceTransport(Transport transport){
        try {
            if(!transport.service()){
                throw new RuntimeException("Транспортное средство "+transport.getBrand()+" "+transport.getModel()+
                        " не прошло диагностику");
            } else {
                System.out.println("Транспортное средство "+transport.getBrand()+" "+transport.getModel()+
                        " прошло диагностику");
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
private static void service(Transport...transports){
        for (Transport transport : transports){
            serviceTransport(transport);
        }
}
    }



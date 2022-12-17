import transport.*;
//import transport.Train;
import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;
import java.time.LocalDate;
import java.util.*;

public class Main {
    private static final List<String> NAMES = List.of(
            "Екатерина Петрова",
            "Николай Андреев",
            "Наталья Назарова",
            "Семен Сухих",
            "Марина Сергеева",
            "Ольга Антоненко",
            "Петр Смирнов",
            "Владимир Муленко",
            "Анастасия Рыбина",
            "Никита Маланов"
    );
    private static Random RANDOM = new Random();
    private static final int SIZE = 5;
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();
        DriverB sergeyDriver = new DriverB("Иванов Сергей Михайлович", true, 10,'B');
        DriverB denisDriver = new DriverB("Белых Денис Александрович", true, 9,'B');
        DriverC dmitryDriver = new DriverC("Сергеев Дмитрий Андреевич", true, 7, 'C');
        DriverC aleksandrDriver = new DriverC("Карасев Александр Сергеевич", true, 8, 'C');
        DriverD petrDriver = new DriverD("Петров Петр Космодемьянович", true, 15, 'd');
        DriverD ruslanDriver = new DriverD("Вихлянцев Руслан Тимурович", true, 4, 'd');

        Mechanic<Car> andreyMech = new Mechanic<>("Андрей Петров", "BMotors");
        Mechanic<Car> sergeyMech = new Mechanic<>("Сергей Назаренко", "PST");
        Mechanic<Bus> stepanMech = new Mechanic<>("Степан Никифоров", "BMotors");
        Mechanic<Bus> nikolayMech = new Mechanic<>("Николай Таранов", "PST");
        Mechanic<Truck> dmitriyMech = new Mechanic<>("Дмитрий Сергеев", "BMotors");
        Mechanic<Truck> denisMech = new Mechanic<>("Денис Денисов", "PST");

        Sponsor bMotors = new Sponsor("BMotors",100000);
        Sponsor pst = new Sponsor("PST",120000);
        Sponsor redbull = new Sponsor("RedBull", 50000);
        Sponsor pepsi = new Sponsor("Pepsi", 70000);

        Car lada = new Car("Лада", "Гранта", 1.7, BodyType.SEDAN);
        lada.addSponsor(pepsi);
        lada.addDriver(sergeyDriver);
        lada.addMechanic(andreyMech);

        Car audi = new Car("Audi", "A8 50L TDI quattro", 3.0, BodyType.SEDAN);
        audi.addSponsor(redbull,pepsi);
        audi.addDriver(denisDriver);
        audi.addMechanic(sergeyMech);

        Car bmw = new Car("BMW", "Z8", 3.0, BodyType.SEDAN);
        Car kia = new Car("Kia", "Sportage 4", 2.4, BodyType.SEDAN);
        Car hundai = new Car("Hundai", "Avanta", 1.6, BodyType.COUPE);

        Bus paz1 = new Bus("Паз", "320405 - 04", 4.43,BusCapacity.SMALL);
        paz1.addDriver(petrDriver);
        paz1.addMechanic(nikolayMech);
        paz1.addSponsor(pst);

        Bus liaz = new Bus("ЛиАЗ", "525662", 10.85,BusCapacity.LARGE);
        liaz.addSponsor(pst);
        liaz.addDriver(ruslanDriver);
        liaz.addMechanic(stepanMech);

        Bus kav = new Bus("КАВЗ", "4238", 6.7,BusCapacity.MEDIUM);
        Bus paz = new Bus("ПаЗ", "44-65", 5.3, BusCapacity.SMALL);

        Truck mercedes = new Truck("Mercedes", "Actros S", 15.6, TruckWeight.N2);
        mercedes.addSponsor(pepsi,bMotors);
        mercedes.addDriver(dmitryDriver);
        mercedes.addMechanic(dmitriyMech);

        Truck volvo = new Truck("Volvo", "VH", 13, TruckWeight.N1);
        volvo.addSponsor(bMotors);
        volvo.addDriver(aleksandrDriver);
        volvo.addMechanic(denisMech);

        Truck kamaz = new Truck("Камаз", "65116", 11.76, TruckWeight.N2);
        Truck hundaiTruck = new Truck("Hundai", "ST5", 13, TruckWeight.N3);
        List<Transport> transports = List.of(lada,audi,bmw,kia,hundai,paz,paz1,liaz,kav,mercedes,volvo,kamaz,hundaiTruck);

        serviceStation.serviceCar(lada);
        System.out.println();
        printInfo(mercedes);
        denisDriver.race(kia);

        serviceStation.addCar(bmw);
        serviceStation.addCar(lada);
        serviceStation.addCar(audi);
        serviceStation.addTruck(volvo);
        serviceStation.addTruck(kamaz);
        serviceStation.service();
        serviceStation.service();
        serviceStation.service();
        serviceStation.service();
        serviceStation.service();


        // Задание 2
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        randomFill(queue1);
        randomFill(queue2);
        System.out.println("Очередь 1: " + queue1);
        System.out.println("Очередь 2: " + queue2);
        add("Иван Иванов", queue1,queue2);
        System.out.println("Очередь 1: " + queue1);
        System.out.println("Очередь 2: " + queue2);
        remove(queue1,queue2);
        System.out.println("Очередь 1: " + queue1);
        System.out.println("Очередь 2: " + queue2);
        // Задание 3
        example();

    }
    private static void printInfo(Transport transport){
        System.out.println(transport.getBrand() +" "+ transport.getModel());
        System.out.println("Водитель: " + transport.getDrivers());
        System.out.println("Механик: " + transport.getMechanics());
        System.out.println("Спонсоры: " + transport.getSponsors());
    }
    private static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, ((i + j)%2==1?"●":"◯"));
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    private static void add(String name, Queue<String> queue1, Queue<String> queue2){
        if(queue1.size() >= SIZE && queue2.size() >= SIZE){
            System.out.println("Позвать Галю");
            return;
        }
        if (queue1.size()< queue2.size() && queue1.size() != SIZE){
            queue1.offer(name);
        } else {
            queue2.offer(name);
        }
    }
    private static void remove(Queue<String> queue1, Queue<String> queue2){
        if (RANDOM.nextBoolean()){
            queue1.poll();
        }else {
            queue2.poll();
        }
    }
    private static void randomFill(Queue<String> queue){
        int size  = RANDOM.nextInt(SIZE + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));

        }

    }
}





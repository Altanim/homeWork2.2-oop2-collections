import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada",
                "Granta",
                1.7f,
                "желтый",
                2017,
                "Россия",
                "автомат",
                "седан",
                "a123bn123",
                5,
                true, new Car.Key(), new Car.Insurance(LocalDate.now(),10000, "387645634"));
        ladaGranta.carInfo();
        Car audiA8 = new Car("Audi",
                "A8 50 L TDI quattro",
                3.0f,
                "черный",
                2020,
                "Германия",
                "автомат",
                "седан",
                "c213bn432",
                6,
                true,
                new Car.Key(), new Car.Insurance(LocalDate.now(),15000, "846348754"));
        audiA8.carInfo();
        Car bmwZ8 = new Car("BMW",
                "Z8",
                3.0f,
                "черный",
                2021,
                "Германия",
                "автомат",
                "универсал",
                "v324ko123",
                6,
                false,
                new Car.Key(), new Car.Insurance(LocalDate.now(),20000, "243567435"));
        bmwZ8.carInfo();
        Car kiaSportage = new Car("Kia",
                "Sportage 4",
                2.4f,
                "красный",
                2018,
                "Южная Корея",
                "механика",
                "седан",
                "r534kk543",
                5,
                true,
                new Car.Key(),new Car.Insurance(LocalDate.now(),30000, "485467453"));
        kiaSportage.carInfo();
        Car hyundaiAvante = new Car("Hyundai",
                "Avante",
                1.6f,
                "оранжевый",
                2016,
                "Южная Корея",
                "автомат",
                "седан",
                "e353fd988",
                5,
                true,
                new Car.Key(),new Car.Insurance(LocalDate.now().plusDays(56),15000, "85865478"));
        hyundaiAvante.carInfo();
        System.out.println();
        System.out.println(kiaSportage);
    }
}
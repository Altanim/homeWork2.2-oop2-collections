import transport.Bus;
import transport.Car;
import transport.Train;
import transport.Transport;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Лада",
                "Гранта",
                1.7,
                "желтый",
                2015,
                "Россия",
                184,
                45.43,
                "автомат",
                "седан",
                "х123хв123",
                5,
                true,new Car.Key(),
                new Car.Insurance(LocalDate.now().minusDays(100),10000,null));

        Car audi = new Car("Audi",
                "A8 50L TDI quattro",
                3.0,
                "черный",
                2020,
                "Германия",
                250,
                68.45,
                "автомат",
                "седан",
                null,
                6,
                false,new Car.Key(),
                new Car.Insurance(LocalDate.now().minusDays(38),20000,null));

        Car bmw = new Car("BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия",
                250,
                89.45,
                "механика",
                "седан",
                null,
                5,
                true,
                new Car.Key(),
                new Car.Insurance(LocalDate.now().minusDays(200),20000,"634254654"));

        Car kia = new Car("Kia",
                "Sportage 4",
                2.4,
                "красный",
                2018,
                "Южная Корея",
                180,
                86.94,
                "автомат",
                null,
                null,
                5,
                true,
                new Car.Key(),
                new Car.Insurance(null,25000,"253655456"));

        Car hundai = new Car("Hundai",
                "Avanta",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея",
                200,
                45.85,
                "автомат",
                "универсал",
                "к123ор765",
                5,
                false,
                new Car.Key(),
                new Car.Insurance(LocalDate.now().minusDays(132), 10000, "183265849"));

        Train lastochka = new Train("Ласточка",
                "В-901",
                null,
                2011,
                "Россия",
                301,
                99.99,
                3500,
                0,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                11);
        Train leningrad = new Train("Ленинград",
                "D-125",
                null,
                2019,
                "Россия",
                270,
                78.89,
                1700,
                0,
                "Ленинградский вокзал",
                "Ленинград - Пассажирский",
                8);

        Bus paz1 = new Bus("Паз",
                "320405 - 04",
                null,
                2015,
                "Россия",
                120,
                56.85,
                1000,
                9.40,
                "Ленинградский автовокзал",
                "Московский автовокзал",
                41);
        Bus liaz = new Bus("ЛиАЗ",
                "525662",
                null,
                2016,
                "Россия",
                120,
                56,
                1435,
                6.22,
                "Автовокзал Красноярск",
                "Абакан ж/д вокзал",
                66);
        Bus kav = new Bus("КАВЗ",
                "4238",
                null,
                2014,
                "Россия",
                130,
                85.95,
                1541,
                9.10,
                "Сочи, центральный автовокзал",
                "Анапа автовокзал",
                44);
        lada.printInfo();
        leningrad.printInfo();
        liaz.printInfo();
       leningrad.refill();
       leningrad.refill();

    }
    }


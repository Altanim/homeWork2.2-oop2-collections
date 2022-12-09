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
                "автомат",
                "универсал",
                "к123ор765",
                5,
                false,
                new Car.Key(),
                new Car.Insurance(LocalDate.now().minusDays(132), 10000, "183265849"));
        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hundai);

        Train lastochka = new Train("Ласточка",
                "В-901",
                null,
                2011,
                "Россия",
                301,
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
                1700,
                0,
                "Ленинградский вокзал",
                "Ленинград - Пассажирский",
                8);
        printInfo(lastochka);
        printInfo(leningrad);

        Bus paz1 = new Bus("Паз",
                "320405 - 04",
                null,
                2015,
                "Россия",
                120,
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
                1541,
                9.10,
                "Сочи, центральный автовокзал",
                "Анапа автовокзал",
                44);
        printInfo(paz1);
        printInfo(liaz);
        printInfo(kav);
    }
    private static void printInfo(Car car) {
        System.out.println("\nАвтомобиль " + car.getBrand() + " " + car.getModel() +
                ". Объем двигателя: " + car.getEngineVolume() +
                ". Цвет: " + car.getColor() +
                ". Год производства: " + car.getYear() +
                ". Страна производства: " + car.getCountry() +
                ". Максимальная скорость: " + car.getMaxSpeed() +
                ". \nКоробка передач: " + car.getTransmission() +
                ". Регистрационный номер: " + car.getRegNum() +
                ". Количество сидений : " + car.getSeatsCount() +
                ". Pезина: " + (car.isTires() ? "летняя" : "зимняя")
                + ". \n" + (car.getKey().isKeylessAccess() ? "Без ключа." : "Ключ.")
                + (car.getKey().isRemoteRun() ? "Удаленный запуск." : "Обычный запуск.")+
                " Номер страховки " + car.getInsurance().getNumber() +
                ". Стоимость страховки " + car.getInsurance().getCost()+
                ". Срок действия страховки " + car.getInsurance().getExpireDate());
    }
    private static void printInfo(Train train) {
        System.out.println("\nПоезд " + train.getBrand() + " " + train.getModel() +
                ". Цвет: " + train.getColor() +
                ". Год производства: " + train.getYear() +
                ". Страна производства: " + train.getCountry() +
                ". Максимальная скорость: " + train.getMaxSpeed() +
                "км/ч. \nСтоимость билета: " + train.getTicketPrice() +
                "p. Время в пути: " + train.getTravelTime() +
                " часов. Станция отбытия: " + train.getStartStation() +
                ". Конечная остановка : " + train.getFinishStation() +
                ". \nВагонов в поезде : " + train.getAmountWagons());
    }
    private static void printInfo(Bus bus) {
        System.out.println("\nАвтобус " + bus.getBrand() + " " + bus.getModel() +
                ". Цвет: " + bus.getColor() +
                ". Год производства: " + bus.getYear() +
                ". Страна производства: " + bus.getCountry() +
                ". Максимальная скорость: " + bus.getMaxSpeed() +
                "км/ч. \nСтоимость билета: " + bus.getTicketPrice() +
                "p. Время в пути: " + bus.getTravelTime() +
                " часов. Станция отбытия: " + bus.getStartStation() +
                ". Конечная остановка : " + bus.getFinishStation() +
                ". \nМест в автобусе : " + bus.getAmountSeats());
    }
    }


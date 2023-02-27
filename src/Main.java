import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Лада",
                "Гранта",
                1.7,
                "желтый",
                2015,
                "Россия",
                "механика",
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
                "",
                "",
                "",
                6,
                false,new Car.Key(),
                new Car.Insurance(LocalDate.now().minusDays(38),20000,null));

        Car bmw = new Car("BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия",
                "",
                "",
                "",
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
                null,
                null,
                null,
                0,
                true,
                new Car.Key(),
                new Car.Insurance(null,25000,"253655456"));

        Car hundai = new Car("Hundai",
                "Avanta",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея",
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
    }

    private static void printInfo(Car car) {
        System.out.println("\n" + car.getBrand() + " " + car.getModel() +
                ". Объем двигателя: " + car.getEngineVolume() +
                ". Цвет: " + car.getColor() +
                ". Год производства: " + car.getYear() +
                ". Страна производства: " + car.getCountry() +
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

}
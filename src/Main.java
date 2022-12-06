public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car(null, "Granta", 1.7f,
                "желтый", 2017, "Россия");
        ladaGranta.carInfo();
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0f,
                "черный", 2020, "Германия");
        audiA8.carInfo();
        Car bmwZ8 = new Car("BMW", "Z8", 3.0f,
                "черный", 2021, "Германия");
        bmwZ8.carInfo();
        Car kiaSportage = new Car("Kia", "Sportage 4", 2.4f,
                "красный", 2018, "Южная Корея");
        kiaSportage.carInfo();
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6f,
                "оранжевый", 2016, "Южная Корея");
        hyundaiAvante.carInfo();
        System.out.println(kiaSportage);
    }
}
package transport;

public class Truck extends Transport implements Competing {
    public static final String[] PIT_STOPS = new String[] {"Остановка №1","Остановка №2","Остановка №3"};

    @Override
    public void start() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " стартовал!" );
    }

    @Override
    public void stop() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " остановился."+
                "\nВремя: " + bestLapTime() + "мин. Скорость: " +maximumSpeed()+ "км/ч." );
    }

    @Override
    public void refill() {
        System.out.println("Бак грузовика полностью запрвлен!");
    }
//
//    @Override
//    public void refill() {
//
//    }

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public void pitStop() {
        System.out.println("Пит-стоп пройден!");
    }

    @Override
    public double bestLapTime() {
        return (double) (100/(maximumSpeed()/10));
    }

    @Override
    public int maximumSpeed() {
        return (int) ( Math.random() * (120-100) ) + 120;
    }
}

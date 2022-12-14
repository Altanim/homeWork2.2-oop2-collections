package transport;

public class Bus extends Transport implements Competing {
    private BusCapacity busCapacity;
    public Bus(String brand, String model, double engineVolume, BusCapacity busCapacity) {
        super(brand, model, engineVolume);
        this.busCapacity = busCapacity;
    }

    public BusCapacity getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(BusCapacity busCapacity) {
        this.busCapacity = busCapacity;
    }

    @Override
    public void start() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " стартовал!" );
    }

    @Override
    public void stop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " остановился." +
                "\nВремя: " + bestLapTime() + "мин. Скорость: " +maximumSpeed()+ "км/ч.");
    }

    @Override
    public boolean service() {
        System.out.println("Автобус "+getBrand()+" "+getModel()+" в диагностике не нуждается.");
        return true;
    }

    @Override
    public void printType() {
        if(busCapacity == null){
            System.out.println("Данных по авто недостаточно.");
        } else {
            System.out.println("Вместимость от "+busCapacity.getFrom()+" человек до "+busCapacity.getTo()+"человек.");
        }
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
        return (int) ( Math.random() * (110-90) ) + 90;
    }

    @Override
    public void refill() {
            System.out.println("Бак автобуса полностью запрвлен!");

        }
    }


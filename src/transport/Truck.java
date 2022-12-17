package transport;

public class Truck extends Transport implements Competing {

    private TruckWeight truckWeight;
    public Truck(String brand, String model, double engineVolume, TruckWeight truckWeight) {
        super(brand, model, engineVolume);
        this.truckWeight = truckWeight;
    }

    public TruckWeight getTruckWeight() {
        return truckWeight;
    }

    public void setTruckWeight(TruckWeight truckWeight) {
        this.truckWeight = truckWeight;
    }

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
    public boolean service() {
        return Math.random() > 0.9;
    }

    @Override
    public void printType() {
        if(truckWeight == null){
            System.out.println("Данных по авто недостаточно.");
        } else {
            System.out.println("Грузоподъемность от "+truckWeight.getFrom()+"т. до " +truckWeight.getTo()+"т.");
        }
    }

    @Override
    public void refill() {
        System.out.println("Бак грузовика полностью запрвлен!");
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel()+ " отремонтирован.");
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

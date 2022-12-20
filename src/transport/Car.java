package transport;

import java.util.List;

public class Car extends Transport implements Competing{

    private BodyType bodyType;
    public Car(String brand,
               String model,
               double engineVolume,
               BodyType bodyType) {
        super(brand,model,engineVolume);
        this.bodyType = bodyType;
    }
    public void transportInfo() {
        System.out.print("\n" + getBrand() + " " + getModel() +
                ". Объем двигателя: " + getEngineVolume() +
                ". Тип кузова - " +bodyType + ". \n");
    }
    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void start() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " стартовал!" );
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " остановился. " +
                "\nВремя: " + bestLapTime() + "мин. Скорость: " +maximumSpeed()+ "км/ч.");
    }

    @Override
    public boolean service() {
        return Math.random() > 0.5;
    }

    @Override
    public void printType() {
        if(bodyType == null){
            System.out.println("Данных по авто недостаточно.");
        } else {
            System.out.println("Тип кузова: "+bodyType);
        }
    }

    @Override
    public void refill() {
        System.out.println("Бак автомобиля полностью запрвлен!");
    }

    @Override
    public void repair() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel()+ " отремонтирована.");
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
        return (int) ( Math.random() * (200-150) ) + 150;
    }

    }

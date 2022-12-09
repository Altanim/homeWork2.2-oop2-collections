package transport;

import java.security.Key;
import java.time.LocalDate;

public class Car extends Transport{
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String regNum;
    private final int seatsCount;
    private boolean tires;
    private Key key;
    private final Insurance insurance;
    public void printInfo() {
        System.out.println("\nАвтомобиль ");
        transportInfo();
        System.out.print(". Объем двигателя: " + getEngineVolume() +
                ". \nКоробка передач: " + getTransmission() +
                ". Регистрационный номер: " + getRegNum() +
                ". Количество сидений : " + getSeatsCount() +
                ". Pезина: " + (isTires() ? "летняя" : "зимняя")
                + ". \n" + (getKey().isKeylessAccess() ? "Без ключа." : "Ключ.")
                + (getKey().isRemoteRun() ? "Удаленный запуск." : "Обычный запуск.")+
                " Номер страховки " + getInsurance().getNumber() +
                ". Стоимость страховки " + getInsurance().getCost()+
                ". Срок действия страховки " + getInsurance().getExpireDate() + "\n");
    }


    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               int maxSpeed,
               double fuelPercentage,
               String transmission,
               String bodyType,
               String regNum,
               int seatsCount,
               boolean tires,
               Key key,
               Insurance insurance) {
        super(brand,model,color,year,country,maxSpeed,fuelPercentage);

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = "механик";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isBlank() || bodyType.isEmpty()) {
            this.bodyType = "sedan";
        } else {
            this.bodyType = bodyType;
        }
        if (regNum == null || regNum.isBlank() || regNum.isEmpty()) {
            this.regNum = "x000xx000";
        } else {
            this.regNum = regNum;
        }
        if (seatsCount <= 0) {
            this.seatsCount = 5;
        } else {
            this.seatsCount = seatsCount;
        }
        this.tires = tires;
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance(LocalDate.now().plusDays(365), 10000, "abc12345");
        } else {
            this.insurance = insurance;
        }
    }



    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }



    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "mech";
        } else {
            this.transmission = transmission;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        if (regNum == null) {
            this.regNum = "x000xx000";
        } else {
            this.regNum = regNum;
        }
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public boolean isTires() {
        return tires;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }



    public void changeTires() {
        tires = !tires;
    }

    public boolean isCorrectRegNum() {
        if (regNum.length() != 9) {
            return false;
        }
        char[] chars = regNum.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                Character.isDigit(chars[4]) && Character.isDigit(chars[5]) && Character.isDigit(chars[6]);
    }

    public Insurance getInsurance() {
        return insurance;
    }


    public void refill() {
        if (getFuelPercentage() < 100) {
            System.out.print("\nАвтомобиль заправлен не полностью, необходимо дозалить ");
            System.out.printf("%.2f", (100.00 - getFuelPercentage()));
            System.out.print("% бака бензином или дизельным топливом на заправке.");
            setFuelPercentage(100);
        } else {
            System.out.println("\nБак автомобиля полностью запрвлен!");

        }
    }

    public static class Key {
        private final boolean remoteRun;
        private final boolean keylessAccess;

        public Key(boolean remoteRun, boolean keylessAccess) {
            this.remoteRun = remoteRun;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "abc123456";
            } else {
                this.number = number;
            }
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())){
                System.out.println("Необходимо обновить страховку!");
            }
        }
        public void checkNumber(){
            if (number.length() != 9){
                System.out.println("Некорректный номер!");
            }
}
    }

}
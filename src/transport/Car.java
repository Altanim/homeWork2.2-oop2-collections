package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;
    private int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean tires;
    private Key key;
    private Insurance insurance;
    public Car(String brand,
               String model,
               float engineVolume,
               String color,
               int year,
               String country,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean tires,
               Key key,
               Insurance insurance) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.tires = tires;
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance(null,10000,null);
        } else {
            this.insurance = insurance;
        }
    }

    public void carInfo() {
        System.out.println("\nМарка автомобиля: " + getBrand() +
                ". Модель: " + getModel() +
                ". Объем двигателя: " + getEngineVolume() +
                ". Цвет: " + getColor() +
                ". \nГод производства: " + getYear() +
                ". Страна производства: " + getCountry() +
                ". Коробка передач: " + getTransmission() +
                ". Тип кузова: " + getBodyType() +
                ". \nРегистрационный номер: " + getRegistrationNumber() +
                ". Количество сидений: " + getNumberOfSeats() +
                ". \n" + (isTires() ? "Летняя" : "Зимняя") + " резина" +
                ". " + ((getKey().isKeylessAccess()) ? "Без ключа" : "С ключом") +
                ". " + ((getKey().isRemoteRunEngine()) ? "Удаленный запуск" : "Обычный запуск") +
                ". Номер страховки: " + insurance.getNumber()+
                ". Стоимость страховки: " + insurance.getCost()+
                ". Срок действия страховки: " + insurance.getExpireDate());
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
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

    public boolean isNumberCorrect() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) ||
                !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3])
                || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "transport.Car{"
                + "brand='" + brand + '\''
                + ", model=" + model
                + ", enginrVolume=" + engineVolume
                + ", color=" + color
                + ", year=" + year
                + ", \ncountry=" + country
                + ", transmission=" + transmission
                + ", bodyType=" + bodyType
                + ", registrationNumber=" + registrationNumber
                + ", numberOfSeats=" + numberOfSeats
                + ", tires=" + (isTires() ? "Летняя" : "Зимняя")
                + "}";
    }

    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean keylessAccess;

        public Key(boolean remoteRunEngine, boolean keylessAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
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
                this.number = "123456789";
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
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Необходимо оформить новую страховку!");
            }
        }
        public void checkNumber(){
            if(number.length()!=9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }
}


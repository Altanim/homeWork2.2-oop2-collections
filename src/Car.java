public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;
    Car(){
        this("default", "default", 1.5f, "default", 2000, "default");
    }
    Car(String brand, String model, float engineVolume, String color, int year, String country){
        this.brand = brand;
        this.model = model;
        if(engineVolume <= 0) {engineVolume = 1.5f;}
        else {
        this.engineVolume = engineVolume;}
        this.color = color;
        if(year <=0) {year = 2000;}
        else {
        this.year = year;}
        this.country = country;
    }
    void carInfo () {
        System.out.println("\nМарка автомобиля: " + getBrand() + ". Модель: " + getModel() + ". Объем двигателя: " +
                getEngineVolume() + ". \nЦвет: " + getColor() + ". Год производства: " + getYear() + ". Страна производства: " +
                getCountry() + ".");
    }
    public String getBrand(){
        if (brand == null) {
            brand = "default";
        }
        return brand;
    }
    public String getModel(){
        if (model == null) {
            model = "default";
        }
        return model;
    }
    public  String getColor(){
        if (color == null){
            color = "белый";
        }
        return color;
    }
    public String getCountry(){
        if(country == null){
            country = "default";
        }
        return country;
    }
    public int getYear(){
        if (year <= 0) {
            year = 2000;
        }
        return year;
    }
    public float getEngineVolume(){
        if (engineVolume <=0) {
            engineVolume = 1.5f;
        }
        return engineVolume;
    }
    @Override
    public String toString() {
        return "Car{"
                + "brand='" + brand + '\''
                + ", model=" + model
                + ", enginrVolume=" + engineVolume
                + ", color=" + color
                + ", year=" + year
                + ", country=" + country
                + '}';
    }
}


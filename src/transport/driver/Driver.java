package transport.driver;

import transport.Transport;

public abstract class Driver<T extends Transport>{
    public final String name;
    private boolean driverLicense;
    private int exp;
    private final char category;


    public void driverInfo(T transport){
        System.out.println("\nВодитель " +name+ " управляет " +transport.getBrand()+ " "
                +transport.getModel()+ " и будет учавствовать в заезде." );
    }
    public abstract void startDrive(T transport);
    public abstract void stopDrive(T transport);
    public abstract void refill(T transport);

    public Driver(String name, boolean driverLicense, int exp, char category) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.exp = exp;
        this.category = setCategory(category);
    }

    @Override
    public String toString() {
        return  name + ", стаж: " + exp +
                " лет, категория прав: " + category + ".";
    }

    public char getCategory() {
        return category;
    }

    public char setCategory(char category) {
        switch (category) {
            case 'B':
                char B = 'B';
                break;
            case 'C':
                char C = 'C';
                break;
            case 'D':
                char D = 'D';
                break;
            case 'b':
                char b = 'B';
                break;
            case 'c':
                char c = 'C';
                break;
            case 'd':
                char d = 'D';
                break;
            default:
                throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        return category;
    }

    public String getName() {
        return name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

}

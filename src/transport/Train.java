/*
package transport;

public class Train extends Transport {
    private int ticketPrice;
    private int travelTime;
    private String startStation;
    private String finishStation;
    private int amountWagons;

    public void printInfo() {
        System.out.println("\nПоезд ");
        transportInfo();
        System.out.print("\nСтоимость билета: " + getTicketPrice() +
                    "p. Время в пути: " + getTravelTime() +
                    " часов. Станция отбытия: " + getStartStation() +
                    ". Конечная остановка : " + getFinishStation() +
                    ". \nВагонов в поезде : " + getAmountWagons()+"\n");
        }

    public Train(String brand,
                 String model,
                 String color,
                 int year,
                 String country,
                 int maxSpeed,
                 double fuelPercentage,
                 int ticketPrice,
                 int travelTime,
                 String startStation,
                 String finishStation,
                 int amountWagons) {
        super(brand,model,color,year,country,maxSpeed,fuelPercentage);
        if (ticketPrice <= 0){
            this.ticketPrice = 100;
        } else {
            this.ticketPrice = ticketPrice;
        }
        if (travelTime <= 0){
            this.travelTime = 10;
        } else {
            this.travelTime = travelTime;
        }
        if (startStation == null || startStation.isBlank() || startStation.isEmpty()) {
            this.startStation = "default";
        } else {
            this.startStation = startStation;
        }
        if (finishStation == null || finishStation.isBlank() || finishStation.isEmpty()) {
            this.finishStation = "default";
        } else{
            this.finishStation = finishStation;
        }
        if (amountWagons <= 0){
            this.amountWagons = 1;
        } else {
            this.amountWagons = amountWagons;
        }
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getFinishStation() {
        return finishStation;
    }

    public void setFinishStation(String finishStation) {
        this.finishStation = finishStation;
    }

    public int getAmountWagons() {
        return amountWagons;
    }

    public void setAmountWagons(int amountWagons) {
        this.amountWagons = amountWagons;
    }
    @Override
    public void refill() {
        if (getFuelPercentage() < 100) {
            System.out.print("\nПоезд заправлен не полностью, необходимо дозалить ");
            System.out.printf("%.2f", (100.00 - getFuelPercentage()));
            System.out.print("% бака дизельным топливом.");
            setFuelPercentage(100);
        } else {
            System.out.println("\nПоезд полностью запрвлен!");

        }
    }

    }

*/

package transport;

public class Bus extends Transport {
    private int ticketPrice;
    private double travelTime;
    private String startStation;
    private String finishStation;
    private int amountSeats;

    public void printInfo() {
        System.out.println("\nАвтобус ");
        transportInfo();
        System.out.println("\nСтоимость билета: " + getTicketPrice() +
                    "p. Время в пути: " + getTravelTime() +
                    " часов. Станция отбытия: " + getStartStation() +
                    ". Конечная остановка : " + getFinishStation() +
                    ". \nМест в автобусе : " + getAmountSeats() + "\n");
        }

    public Bus(String brand,
               String model,
               String color,
               int year,
               String country,
               int maxSpeed,
               double fuelPercentage,
               int ticketPrice,
               double travelTime,
               String startStation,
               String finishStation,
               int amountSeats) {
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
        if (amountSeats <= 0){
            this.amountSeats = 50;
        } else {
            this.amountSeats = amountSeats;
        }
    }
    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public int getAmountSeats() {
        return amountSeats;
    }
    public void setAmountSeats(int amountSeats) {
        this.amountSeats = amountSeats;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getTravelTime() {
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

    @Override
    public void refill() {
        if (getFuelPercentage() < 100) {
            System.out.print("\nАвтобус заправлен не полностью, необходимо дозалить ");
            System.out.printf("%.2f", (100.00 - getFuelPercentage()));
            System.out.print("% бака бензином или дизельным топливом на заправке.");
            setFuelPercentage(100);
        } else {
            System.out.println("\nБак автобуса полностью запрвлен!");

        }
    }
}

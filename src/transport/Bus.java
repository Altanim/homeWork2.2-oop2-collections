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
        System.out.println("км/ч. \nСтоимость билета: " + getTicketPrice() +
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
               int ticketPrice,
               double travelTime,
               String startStation,
               String finishStation,
               int amountSeats) {
        super(brand,model,color,year,country,maxSpeed);

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
}

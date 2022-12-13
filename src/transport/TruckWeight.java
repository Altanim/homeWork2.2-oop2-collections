package transport;

public enum TruckWeight {
    N1(0, 3.5),
    N2(3.5,12.00),
    N3(12.00, 50.0);

    private final double from;
    private final double to;

    TruckWeight(double from, Double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }
}

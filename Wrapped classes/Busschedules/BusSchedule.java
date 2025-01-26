class BusSchedule {
    private String departureCity;
    private String arrivalCity;
    private String departureTime;
    private String arrivalTime;
    private double price;

    public BusSchedule(String departureCity, String arrivalCity, String departureTime, String arrivalTime, double price) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }

    public String getDepartureCity() { return departureCity; }
    public String getArrivalCity() { return arrivalCity; }
    public String getDepartureTime() { return departureTime; }
    public String getArrivalTime() { return arrivalTime; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return String.format("Bus from %s to %s | Departure: %s | Arrival: %s | Price: %.2f BGN",
                departureCity, arrivalCity, departureTime, arrivalTime, price);
    }
}

import java.util.*;
class BusCompany {
    private Map<String, BusRoute> routes;

    public BusCompany() {
        routes = new HashMap<>();
        initializeRoutes();
    }

    private void initializeRoutes() {
        addBus("Sofia", "Plovdiv", "08:00", "10:00", 15.50);
        addBus("Sofia", "Varna", "09:30", "14:30", 30.00);
        addBus("Plovdiv", "Varna", "11:00", "16:00", 25.00);
        addBus("Varna", "Sofia", "15:00", "20:00", 30.00);
    }

    public void addBus(String departureCity, String arrivalCity, String departureTime, String arrivalTime, double price) {
        String routeKey = departureCity + "-" + arrivalCity;
        routes.putIfAbsent(routeKey, new BusRoute());
        routes.get(routeKey).addSchedule(new BusSchedule(departureCity, arrivalCity, departureTime, arrivalTime, price));
    }

    public List<BusSchedule> getSchedules(String departureCity, String arrivalCity) {
        String routeKey = departureCity + "-" + arrivalCity;
        return routes.getOrDefault(routeKey, new BusRoute()).getSchedules();
    }
}

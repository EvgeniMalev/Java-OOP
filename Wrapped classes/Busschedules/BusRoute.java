import java.util.*;
class BusRoute {
    private List<BusSchedule> schedules;

    public BusRoute() {
        this.schedules = new ArrayList<>();
    }

    public void addSchedule(BusSchedule schedule) {
        schedules.add(schedule);
    }

    public List<BusSchedule> getSchedules() {
        return schedules;
    }
}

public class Main {
    public static void main(String[] args) {
        BusCompany company = new BusCompany();
        System.out.println("Bus schedules from Sofia to Plovdiv:");
        for (BusSchedule schedule : company.getSchedules("Sofia", "Plovdiv")) {
            System.out.println(schedule);
        }
    }
}

public class DieselCar extends Car {
    private double fuelConsumption; 

    public DieselCar(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    double consumption() {
        return fuelConsumption;
    }
}

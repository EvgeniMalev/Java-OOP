public class GasCar extends Car {
    private double fuelConsumption; 

    public GasCar(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    double consumption() {
        return fuelConsumption;
    }
}

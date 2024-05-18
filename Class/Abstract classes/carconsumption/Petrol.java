public class Petrol extends Car {
    private double fuelConsumption; 

    public PetrolCar(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    double consumption() {
        return fuelConsumption;
    }
}

public class HEV extends Car {
    private double fuelConsumption; 
    private double energyConsumption; 

    public HEVCar(double fuelConsumption, double energyConsumption) {
        this.fuelConsumption = fuelConsumption;
        this.energyConsumption = energyConsumption;
    }

    @Override
    double consumption() {
        return fuelConsumption + (energyConsumption * 0.1); 
    }
}

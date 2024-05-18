public class EV extends Car {
    private double energyConsumption; 

    public EVCar(double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    @Override
    double consumption() {
        return energyConsumption;
    }
}

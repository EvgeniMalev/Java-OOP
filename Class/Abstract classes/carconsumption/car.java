public abstract class Car {
    abstract double consumption();

    public void displayConsumption() {
        System.out.println("Consumption: " + consumption());
    }
}


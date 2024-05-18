public class Main {
    public static void main(String[] args) {
        
        Car petrolCar = new PetrolCar(8.5);      
        Car dieselCar = new DieselCar(6.0);      
        Car evCar = new EVCar(15.0);             
        Car hevCar = new HEVCar(4.0, 10.0);      

       
        System.out.print("Petrol Car ");
        petrolCar.displayConsumption();

        System.out.print("Diesel Car ");
        dieselCar.displayConsumption();

        System.out.print("EV Car ");
        evCar.displayConsumption();

        System.out.print("HEV Car ");
        hevCar.displayConsumption();
    }
}

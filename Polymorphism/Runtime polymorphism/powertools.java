class PowerComponent {

    public double calculateEfficiency() {
        System.out.println("Generic power component efficiency calculation.");
        return 0.0; 
    }
}


class Generator extends PowerComponent {
    @Override
    public double calculateEfficiency() {
        
        System.out.println("Calculating efficiency for Generator.");
        return 0.95; 
    }
}


class Transformer extends PowerComponent {
    @Override
    public double calculateEfficiency() {
        
        System.out.println("Calculating efficiency for Transformer.");
        return 0.98; 
    }
}


class Battery extends PowerComponent {
    @Override
    public double calculateEfficiency() {
        
        System.out.println("Calculating efficiency for Battery.");
        return 0.90; 
    }
}


public class PowerEngineering {
    public static void main(String[] args) {
       
        PowerComponent generator = new Generator();
        PowerComponent transformer = new Transformer();
        PowerComponent battery = new Battery();

        
        System.out.println("Generator Efficiency: " + generator.calculateEfficiency());
        System.out.println("Transformer Efficiency: " + transformer.calculateEfficiency());
        System.out.println("Battery Efficiency: " + battery.calculateEfficiency());
    }
}

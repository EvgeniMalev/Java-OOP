
package exoticvegetable;

ЕxoticVegetable.java

public class ExoticVegetable {
    private String countryOrigin;
    private String latinName;
    private int weight;

    public ExoticVegetable(String countryOrigin, String latinName, int weight) {
        this.countryOrigin = countryOrigin;
        this.latinName = latinName;
        this.weight = weight;
    }

    public void isGrowing() {
        System.out.println("The vegetable is growing...");
    }

    public void isPlanted() {
        System.out.println("The vegetable is planted...");
    }

    // Getter and setter methods (if needed) for countryOrigin, latinName, and weight
}

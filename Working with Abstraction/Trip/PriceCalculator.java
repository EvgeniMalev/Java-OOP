package trip;

public class PriceCalculator {
    public static double calculatePrice(double priceBusticket, double priceTrainticket, Train train) {
        double basePrice = priceTrainticket * priceBusticket * train.multiplier;
        return basePrice * 0.98;
    }
}

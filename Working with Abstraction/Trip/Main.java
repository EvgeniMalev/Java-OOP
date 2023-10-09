package trip;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        double priceBusticket = Double.parseDouble(input[0]);
        double priceTrainticket = Double.parseDouble(input[1]);
        Train train = Train.valueOf(input[2]);
        double finalPrice = PriceCalculator.calculatePrice(priceBusticket, priceTrainticket, train);

        System.out.printf("%.2f", finalPrice);
    }
}

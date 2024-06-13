import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Currency selection
        System.out.print("Enter the base currency (e.g., USD): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Amount input
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        try {
            // Fetch exchange rate
            double exchangeRate = CurrencyConverter.getExchangeRate(baseCurrency, targetCurrency);

            // Currency conversion
            double convertedAmount = amount * exchangeRate;

            // Display result
            System.out.printf("Converted Amount: %.2f %s%n", convertedAmount, targetCurrency);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
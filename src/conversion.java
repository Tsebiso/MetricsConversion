import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);

        
        System.out.print("Enter the unit you want to convert from (Feet, Pounds, Fahrenheit): ");
        String fromUnitInput = inputScanner.nextLine();

        System.out.print("Enter the unit you want to convert to (Meters, Kgs, Celsius): ");
        String toUnitInput = inputScanner.nextLine();

        System.out.print("Enter the quantity to be converted: ");
        double quantityToConvert = inputScanner.nextDouble();

        
        double resultConversion = convertUnits(fromUnitInput, toUnitInput, quantityToConvert);
        System.out.println("Result: " + resultConversion);

        
        inputScanner.close();
    }

    
    private static double convertUnits(String fromUnit, String toUnit, double quantity) {
        switch (fromUnit.toLowerCase()) {
            case "feet":
                return convertFeetToMeters(quantity);
            case "pounds":
                return convertPoundsToKgs(quantity);
            case "fahrenheit":
                return convertFahrenheitToCelsius(quantity);
            default:
                System.out.println("Invalid unit for conversion");
                return 0.0;
        }
    }

    private static double convertFeetToMeters(double feet) {
        
        return feet * 0.3048;
    }

    private static double convertPoundsToKgs(double pounds) {
        
        return pounds * 0.453592;
    }

    private static double convertFahrenheitToCelsius(double fahrenheit) {
        
        return (fahrenheit - 32) * 5 / 9;
    }
}
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //runConverter();
        tempConverter();
    }

    static double getMoney() {
        Scanner keyboard = new Scanner(System.in);
        double money;
        System.out.println("Enter sum of money to convert");
        money = keyboard.nextDouble();
        return money;
    }

    static double getRate() {
        Scanner keyboard = new Scanner(System.in);
        double rate;
        System.out.println("Enter exchange rate");
        rate = keyboard.nextDouble();
        return rate;
    }

    static double conversion(double moneyIn, double rateIn) {
        return moneyIn * rateIn;
    }

    static void displayResult(double convertedIn) {
        System.out.println("You get " + convertedIn + " for your money");
    }

    static void runConverter() {
        Scanner keyboard = new Scanner(System.in);
        char response;
        do {
            displayResult(conversion(getMoney(), getRate()));
            System.out.println("Do you want to convert another sum?");
            response = keyboard.next().charAt(0);
        } while (response == 'y' || response == 'Y');
    }

    static void tempConverter() {
        Scanner keyboard = new Scanner(System.in);
        char choice;
        do {

            System.out.println("Choose an option from below");
            System.out.println();
            System.out.println(" [1] Convert from C to F");
            System.out.println(" [2] Convert from F to C");
            System.out.println(" [3] Quit");
            choice = keyboard.next().charAt(0);
            switch (choice) {
                case '1' : celsiusToFahrenheit();
                break;

                case '2' :  fahrenheitToCelsius();
                break;

                case '3' : System.out.println("Have a nice day");
                break;

                default: System.out.println("Enter value between 1-3");
            }
        } while (choice != '3');
    }
    static void celsiusToFahrenheit() {
        Scanner keyboard = new Scanner(System.in);
        double tempCelsius;
        System.out.println("Enter temperature in Celsius");
        tempCelsius = keyboard.nextDouble();
        while (tempCelsius < -273.15) {
            System.out.println("That's below absolute zero! Try again");
            tempCelsius = keyboard.nextDouble();
        }
        double result = (tempCelsius * 9 / 5) + 32;
        System.out.println("The temperature in Fahrenheit is " + result);
    }

    static void fahrenheitToCelsius() {
        Scanner keyboard = new Scanner(System.in);
        double tempFahrenheit;
        System.out.println("Enter temperature in Fahrenheit");
        tempFahrenheit = keyboard.nextDouble();
        while (tempFahrenheit < -459.67) {
            System.out.println("That's below absolute zero! Try again");
            tempFahrenheit = keyboard.nextDouble();
        }
        double result = (5 * (tempFahrenheit -32)) / 9;
        System.out.println("The temperature in Celsius is " + result);
    }
}

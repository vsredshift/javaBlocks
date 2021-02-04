package MultiDimensionalArrays;

import java.util.Scanner;

public class MonthlyTemperatures {

    public static void monthlyTemperatures() {
        Scanner keyboard = new Scanner(System.in);
        char choice;

        double [][] temperature = new double [4][7]; // Creates a 4 x 7 2D-array
        // Menu
        do {
            System.out.println();
            System.out.println("[1] Enter Temperatures");
            System.out.println("[2] Display All");
            System.out.println("[3] Display One Week");
            System.out.println("[4] Display Day of the Week");
            System.out.println("[5] Exit");
            System.out.println("Enter choice [1-5]: ");
            choice = keyboard.next().charAt(0);
            System.out.println();

            switch (choice) {
                case '1':   enterTemps2(temperature);
                    break;
                case '2': displayAllTemps(temperature);
                    break;
                case '3': displayWeek(temperature);
                    break;
                case '4': displayDays(temperature);
                   break;
                case '5': System.out.println ("Goodbye");
                    break;
                default: System.out.println("ERROR: options 1-5 only!");
            }
        } while (choice != '5');
    }

// Additional Methods 2D Array

    static void enterTemps2(double[][] temperatureIn) {
        Scanner keyboard = new Scanner(System.in);
        // outer loop: week number
        for (int week=1; week <= temperatureIn.length; week++) {
            // inner loop: day number
            for (int day = 1; day <= temperatureIn[0].length; day++) {
                System.out.println("Enter temperature for week " + week + " and day " + day);
                temperatureIn[week-1][day-1] = keyboard.nextDouble();
            }
        }
    }

    static void displayAllTemps(double[][] temperatureIn) {
        System.out.println();
        System.out.println("*** TEMPERATURES ENTERED ***");
        for (int week=1; week <= temperatureIn.length; week++) {
            for (int day=1; day <= temperatureIn[0].length; day++) {
                System.out.println("week " + week + ", day " + day + ": " + temperatureIn[week-1][day-1]);
            }
        }
    }

    static void displayWeek(double[][] temperatureIn) {
        Scanner keyboard = new Scanner(System.in);
        int week;
        System.out.println("Enter desired week (1-4):");
        week = keyboard.nextInt();
        System.out.println();
        while (week < 1 || week > 4) {
            System.out.println("Enter a valid week! (1-4): ");
            week = keyboard.nextInt();
        }
        System.out.println();
        System.out.println("*** TEMPERATURES ENTERED FOR WEEK " + week + " ***");
        System.out.println();
        for (int day = 1; day <= temperatureIn[0].length; day++) {
            System.out.println("week " + week + ", day " + day + ": " +temperatureIn[week-1][day-1]);
        }
    }


    static void displayDays(double[][] temperatureIn) {
        Scanner keyboard = new Scanner(System.in);
        int day;
        System.out.println("Which day do you want? (1-7) ");
        day = keyboard.nextInt();
        System.out.println();
        System.out.println("Temperatures for day " + day + ": ");
        for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week + ", day " + day + ": " + temperatureIn[week-1][day-1]);
        }
    }

}

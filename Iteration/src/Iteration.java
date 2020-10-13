import java.util.Scanner;

public class Iteration {
    public static void main(String[] args) {
        //displayEven();
        //nestedLoops();
        //timesTable();
        //displayStars();
        //circles();
        vendingMachine();
    }

    public static void displayEven() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("*** Display even Numbers ***");
        System.out.println();
        System.out.println("Enter a number between 1 and 20");
        int num = keyboard.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println((i + " is odd"));
            }
        }
    }

    public static void nestedLoops() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int k = 1; k < 7; k++) {
            if (k < 3 || k > 4) {
                for (int m = 1; m < 4; m++) {
                    System.out.print("*");
                }
            } else {
                for (int m = 1; m < 8; m++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int q = 4; q > 0; q--) {
            for (int n = q; n > 0; n--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void timesTable() {
        // times table
        Scanner keyboard = new Scanner(System.in);
        char playAgain;
        do {
            System.out.println("Enter a number: ");
            int num = keyboard.nextInt();

            while (num <= 2) {
                System.out.println("Enter a number greater than 2");
                num = keyboard.nextInt();
            }

            for (int i = 1; i < 13; i++) {
                System.out.println(i + " x " + num + " = " + (i * num));
            }
            System.out.println("Try another number ? (y/n)");
            playAgain = keyboard.next().charAt(0);
        } while (playAgain == 'Y' || playAgain == 'y');
    }

    public static void displayStars() {
        int num;
        char response;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Size of square (between 2 and 20)?");
            num = keyboard.nextInt();

            while (num < 2 || num > 20) {
                System.out.println("Enter a number between 2 and 20");
                num = keyboard.nextInt();
            }

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("Try another square? (y/n) ");
            response = keyboard.next().charAt(0);
        } while (response == 'Y' || response == 'y');
    }
    public static void circles() {
        final double PI = 3.1416;
        double area, perimeter;
        double radius = 0;
        char choice;
        char reply;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Circle Problem ***");
        System.out.println("Set initial radius");
        radius = keyboard.nextDouble();

        do {
            while (radius <= 0 ) {
                System.out.println("Enter a valid, positive radius!");
                radius = keyboard.nextDouble();
            }
            area = Math.pow(radius, 2) * PI;
            perimeter = 2 * PI * radius;

            System.out.println("What do you want to do? ");
            System.out.println("[1] Set New Radius");
            System.out.println("[2] Display Radius");
            System.out.println("[3] Display Area");
            System.out.println("[4] Display Perimeter");
            System.out.println("[5] Quit");

            choice = keyboard.next().charAt(0);

            switch (choice) {
                case '1':
                    System.out.println("Enter new radius");
                    radius = keyboard.nextDouble();
                    break;

                case '2':
                    System.out.println("The radius is " + radius);
                    break;

                case '3':
                    System.out.println("The area is " + area);
                    break;

                case '4':
                    System.out.println("The circumference is " + perimeter);
                    break;

                case '5':
                    System.out.println("Goodbye");
                    break;

                default:
                    System.out.println("Enter a number between 1 and 5");
            }
            System.out.println();
        } while (choice != '5');
    }

    public static void vendingMachine() {
        Scanner keyboard = new Scanner(System.in);

        char choice;
        int gum, choc, pop, juice;
        gum = 0;
        choc = 0;
        pop = 0;
        juice = 0;

        do {
            System.out.println("What would you like? ");
            System.out.println("[1] Get Gum");
            System.out.println("[2] Get Chocolate");
            System.out.println("[3] Get Popcorn");
            System.out.println("[4] Get Juice");
            System.out.println("[5] Display total sold so far");
            System.out.println("[6] Quit");

            choice = keyboard.next().charAt(0);

            switch (choice) {
                case '1':
                    System.out.println("Here is your gum!");
                    gum ++;
                    break;
                case '2':
                    System.out.println("Here is your chocolate!");
                    choc++;
                    break;
                case '3':
                    System.out.println("Here is your popcorn!");
                    pop++;
                    break;
                case '4':
                    System.out.println("Here is your juice!");
                    juice++;
                    break;
                case '5':
                    System.out.println("The total sold so far is:");
                    System.out.println(gum + " items of gum sold");
                    System.out.println(choc + " items of chocolate sold");
                    System.out.println(pop + " items of popcorn sold");
                    System.out.println(juice + " items of juice sold");
                    break;
                case '6':
                    System.out.println("Thanks for your custom!");
                    break;
                default:
                    System.out.println("Not a valid input. Try again");
            } System.out.println();
        } while (choice != '6');
    }
}
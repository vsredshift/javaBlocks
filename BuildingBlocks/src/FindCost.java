import java.util.Scanner;
import java.lang.Math;


public class FindCost {
    public static void main(String[] args) {
        //findCost();
        //yearOfBirth();
        //simpleArithmetic();
        inputNumbers();
        //swapVariables();
        //rectangle();
        //converter();
        //calculatingBMI();
        //assigningTeams();
        //circles();
    }

    public static void findCost() {
        Scanner keyboard = new Scanner(System.in);
        double price, tax;
        System.out.println("*** Product Price Check ***");
        System.out.println("Enter initial price: ");
        price = keyboard.nextDouble();
        System.out.println("Enter tax rate: ");
        tax = keyboard.nextDouble();
        price = price * (1 + tax / 100);
        System.out.println("Cost after tax is: " + price);
    }

    public static void yearOfBirth() {
        // Self-Test Questions Chapter 2

        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Check your Year of Birth***");
        final int YEAR;
        YEAR = 2020;
        int age, bornIn;
        System.out.print("How old are you this year? ");
        age = keyboard.nextInt();
        bornIn = YEAR - age;
        System.out.println("I think you were born in " + bornIn);
    }

    public static void simpleArithmetic() {
        System.out.println("*** Arithmetic Problem ***");
        int x, y, z;
        x = 5;
        y = x + 2;
        x = 10;
        z = y * x;
        System.out.println(z);
    }

    public static void inputNumbers() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** More Arithmetic ***");
        int num1, num2;
        num2 = 6;
        System.out.print("Enter value ");
        num1 = keyboard.nextInt();
        num1 = num1 + 2;
        num2 = num1 / num2;
        System.out.println("result = " + num2);
    }

    public static void swapVariables() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Swapping Variables ***");
        // declare variables
        int x, y;

        // enter values
        System.out.print("Enter value for x ");
        x = keyboard.nextInt();
        System.out.print("Enter value for y ");
        y = keyboard.nextInt();

        // code attempting to swap two variables
        int new_x = y;
        y = x;
        x = new_x;

        //display results
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void rectangle() {
        // RECTANGLE
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Rectangle Problem ***");
        double side_a, side_b;
        System.out.println("Enter side a of rectangle: ");
        side_a = keyboard.nextDouble();
        System.out.println("Enter side b of rectangle: ");
        side_b = keyboard.nextDouble();
        double perimeter, area;
        perimeter = 2 * (side_b + side_a);
        area = side_b * side_a;
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }

    public static void converter() {
        // Converting kilos to pounds
        System.out.println("*** Converting kilos to lbs ***");
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a value in pounds: ");
        double weight = keyboard.nextDouble();
        weight = weight / 2.2;
        System.out.println("The value in kilos is: " + weight);
    }

    public static void calculatingBMI() {
        // Calculating BMI
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** BMI Calculator ***");
        System.out.println("Enter your weight in kilos: ");
        double weight = keyboard.nextDouble();
        System.out.println("Enter your height in centimetres: ");
        double height = keyboard.nextDouble();
        double BMI = weight / Math.pow(height / 100, 2);
        System.out.println("Your BMI is: " + BMI);
    }

    public static void assigningTeams() {
        // Assigning teams
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Assigning Teams ***");
        System.out.println("How many kids in the class? ");
        int total = keyboard.nextInt();
        System.out.print("How many kids in each team? ");
        int team = keyboard.nextInt();
        int num = total / team;
        int left = total % team;
        System.out.print("We have " + num + " teams, but " + left + " left without a team");
    }

    public static void circles() {
        // Circles
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Circle Problem ***");
        final double PI;
        PI = 3.1416;
        System.out.print("Enter the radius of the circle: ");
        double radius = keyboard.nextDouble();
        double area, circ;
        area = Math.pow(radius, 2) * PI;
        circ = 2 * PI * radius;
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circ);
    }

}

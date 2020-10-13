import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        //cinemaTicket();
        //testEquality();
        //guessNumbers();
        //displayResult();
        //calculatingBMI();
        //computerOrder();
        //timetable();
        bankAccount();
    }
    public static void cinemaTicket() {
        // Kids under 14 get half-priced ticket
        double price = 10.00;
        int age;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = keyboard.nextInt();
        if (age < 14) {
            price = price * 0.5;
        }
        System.out.print("Ticket Price: " + price);
    }
    public static void testEquality() {
        // Test if two inputted numbers are equal or which is larger
        int num1, num2;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter another number: ");
        num2 = keyboard.nextInt();
        if (num1 == num2) {
            System.out.print("NUMBERS ARE EQUAL");
        }
        else if (num1 > num2) {
            System.out.print("FIRST NUMBER BIGGER");
        }
        else {
            System.out.print("SECOND NUMBER BIGGER");
        }
    }
    public static void guessNumbers() {
        // test if user can add two chosen numbers
        int num1, num2, sum;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter another number: ");
        num2 = keyboard.nextInt();
        System.out.print("Guess the sum of the numbers: ");
        sum = keyboard.nextInt();
        if (sum == num1 + num2) {
            System.out.print("Well done! You know your addition");
        }
        else {
            System.out.println("Oh dear, better luck next time.");
            System.out.print("The correct answer was: " + (num1 + num2));
        }
    }
    public static void displayResult() {
        // see if student passed (with honours) or failed
        int result;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What mark did you get on the exam? ");
        result = keyboard.nextInt();
        if (result < 40) {
            System.out.println("I'm afraid you failed. Better luck next time!");
        }
        else if (result >= 40 && result < 70) {
            System.out.println("Well done! You passed!");
        }
        else {
            System.out.println("Congratulations. You passed with honors!");
        }
        System.out.println("Good luck on the rest of the exams!");
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
        if (BMI < 18.5) {
            System.out.println("You are underweight");
        }
        else if (BMI > 24.9) {
            System.out.println("You are overweight");
        }
        else {
            System.out.println("Your weight is good!");
        }
    }
    public static void computerOrder() {
        // Evaluate price depending on additional extras
        Scanner keyboard = new Scanner(System.in);
        double total = 375.99;
        // screen38 = 75.99;
        // screen43 = 99.99;
        // antivirus = 65.99;
        // printer = 125.00;

        System.out.println("Congratulations on your new computer.");
        System.out.println("Please select your screen size in cm: 38 or 43");
        double screen = keyboard.nextInt();
        if (screen == 38) {
            total = total + 75.99;
        }
        else {
            total = total + 99.99;
        }
        System.out.println("Do you want to purchase antivirus software? (y/n)");
        char virusAns = keyboard.next().charAt(0);
        if (virusAns == 'y') {
            total = total + 65.99;
        }
        System.out.println("Do you want a printer? (y/n)");
        char printer = keyboard.next().charAt(0);
        if (printer == 'y') {
            total = total + 125.00;
        }
        System.out.println("Total cost: " + total);
    }
    public static void timetable() {
        // check timetable depending on student's lab group
        char group;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Lab Times ***");
        System.out.println("Enter your group: ");
        group = keyboard.next().charAt(0);
        switch(group) {
            case 'A': case 'a': System.out.println("10.00 am"); break;
            case 'B': case 'b': System.out.println("11.00 am"); break;
            case 'C': case 'c': System.out.println("12.00 pm"); break;
            default: System.out.println("Not a valid group");
        }
    }
    public static void bankAccount() {
        // Evaluate how much interest a customer earns depending on initial funds and bank account type
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your balance:");
        double balance = keyboard.nextDouble();
        System.out.println("What type of account do you have");
        char accountType = keyboard.next().charAt(0);
        switch(accountType) {
            case 'a': case 'A':
            case 'c': case 'C':
                if (balance >= 250) {
                    System.out.println("You could earn " + (balance * 0.015) + " in interest");
                } else {System.out.println("You don't have enough funds");
                    break;}
                break;

            case 'b': case 'B':
                if (balance >= 1000) {
                    System.out.println("You could earn " + (balance * 0.02) + " in interest");
                } else {System.out.println("You don't have enough funds");
                        break;}
                break;

            case 'x': case 'X':
                if (balance >= 5000) {
                    System.out.println("You could earn " + (balance * 0.05) + " in interest");
                } else {System.out.println("You don't have enough funds");
                        break;}
                break;

            default: System.out.println("Not a valid account type!");
        }
    }
}

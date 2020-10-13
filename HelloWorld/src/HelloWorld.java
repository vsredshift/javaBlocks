/*
    This program demonstrates the usage of different comment formats.
    This top comment often describes the entire program, and is typically multiple lines.
    It is best practice to use a multiline style comment markers for a comment such as this.
 */

public class HelloWorld {
    public static void main(String[] args) {
        //method1();
        //profile();
        initials();
    }
    public static void method1() {
        System.out.println("Hello World"); // this is a string
        System.out.print("How are you today?");
    }
    public static void profile() {
        System.out.println("Martin O'Shaughnessy");
        System.out.println("Björkenäsvägen 81,");
        System.out.println("37591 Mörrum");
        System.out.println();
        System.out.println("Tel: 0769 18 59 26");
    }
    public static void initials() {
        System.out.println("*       *     * *      * * *   ");
        System.out.println("* *   * *   *     *   *        ");
        System.out.println("*   *   *   *     *    * * *   ");
        System.out.println("*       *   *     *         *   ");
        System.out.println("*       *     * *      * * *    ");
    }
}


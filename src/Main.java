import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Question 06
        /*
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();

        // Print the area
        System.out.println("The area is " + calculateArea(radius) + " square units.");
        System.out.println("The Circumference is " + calculateCircumference(radius) + " units.");
         */

        // Question 7
        /*
        double amount = getMoney();
        double rate = getRate();
        double target = convert(amount, rate);
        displayInfo(amount, rate, target);
         */

        // Question 8
        /*
        char again = 'n';
        do {
            double amount = getMoney();
            double rate = getRate();
            double target = convert(amount, rate);
            displayInfo(amount, rate, target);
            System.out.print("\nConvert another? ");
            again = input.next().charAt(0);
            System.out.println();
        }while (again != 'n');
         */
    }

    // question 6 methods
    public static double calculateArea(double radius){
        double area = Math.PI * Math.pow(radius, 2);
        return Math.round(area *100 ) / 100.0;   // rounded to two decimal places
    }

    public static double calculateCircumference(double radius){
        double circumferene = 2 * Math.PI * radius;
        return Math.round(circumferene *100 )/100.0;
    }

    // question 7 methods
    public static double getMoney(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter money to convert: ");
        double amount = input.nextDouble();
        return amount;
    }

    public static double getRate(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rate:  ");
        double rate = input.nextDouble();
        return rate;
    }

    public static double convert(double amount, double rate){
        double result = amount * rate;
        return result;
    }

    public static void displayInfo(double amount, double rate, double convertedAmount){
        System.out.println("Amount to convert " + amount);
        System.out.println("Rate: "+ rate);
        System.out.println("Converted amount is: "+ Math.round(convertedAmount *100) / 100.0);
    }
}
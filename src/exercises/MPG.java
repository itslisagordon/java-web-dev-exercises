package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles? ");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas? ");
        double gas = input.nextDouble();
        double mpg = miles / gas;
        System.out.println("Your MPG is: " + mpg);
    }
}

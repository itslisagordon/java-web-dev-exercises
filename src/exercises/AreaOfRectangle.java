package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter rectangle length: ");
        double length = input.nextDouble();
        System.out.println("Please enter rectangle width: ");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println("The area of your rectangle is: " + area);
    }
}

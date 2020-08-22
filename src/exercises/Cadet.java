package exercises;
import java.util.Scanner;

public class Cadet {
    public static void main(String[] args) {

        System.out.println("Are you a space cadet? yes or no");
        Scanner in = new Scanner(System.in);
        String response = in.next();

        switch (response) {
            case "yes":
                System.out.println("Greetings cadet.");
                break;
            case "no":
                System.out.println("Greetings normie.");
                break;
            default:
                System.out.println("Are you an alien?");
        }
    }
}

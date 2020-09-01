package exercises;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

//        int arr[] = {1, 1, 2, 3, 5, 8};
//        for (int i : arr) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String stringArr[] = str.split("\\.");
//        for (String sentence : stringArr) {
//            sentence += ".";
//        }
//        System.out.println(Arrays.toString(stringArr));

//        ArrayList<Integer> arr2= new ArrayList<Integer>();
//        arr2.add(1);
//        arr2.add(2);
//        arr2.add(3);
//        arr2.add(4);
//        arr2.add(4);
//        arr2.add(5);
//
//        System.out.println(arr2);
//        sumMethod(arr2);
//        forEach(arr2);

        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        stringToArrayList(myString);

    }

//    public static void sumMethod(ArrayList<Integer> entry) {
//        for (int i = 0; i < entry.size(); i++) {
//            if (entry.get(i) % 2 == 0) {
//                System.out.println(entry.get(i));
//            }
//        }
//    }
//
//    public static void forEach(ArrayList<Integer> myList) {
//        for (int i : myList) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//      }

    public static void letterCount(ArrayList<String> myList) {
        Scanner input = new Scanner(System.in);
        System.out.println("What word length? ");
        int response = input.nextInt();

        for (String word : myList) {
            if (word.length() == response) {
                System.out.println(word);
            }
        }
    }

    public static void stringToArrayList(String myString) {
        String str[] = myString.split(" ");

        List nl = new ArrayList();
        nl = Arrays.asList(str);
        for(Object s: nl) {
            System.out.println(s);
        }
    }


}

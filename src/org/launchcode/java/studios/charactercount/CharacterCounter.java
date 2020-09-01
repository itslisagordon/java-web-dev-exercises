package org.launchcode.java.studios.charactercount;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = input.nextLine();

//        String text = "";
//
//        try {
//            Scanner in = new Scanner(new File("content.txt"));
//            text = in.nextLine();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        text = text.toLowerCase();
        char[] charactersInString = text.toCharArray();
        HashMap<Character, Integer> counts = new HashMap<>();

        for(char c : charactersInString) {
            if (c >= 'a' && c <= 'z') {
                //seeing c for the first time
                if(!counts.containsKey(c)) {
                    counts.put(c, 1);
                } else { //we have already seen c
                    int seen = counts.get(c);
                    counts.put(c, seen + 1);
                }
            }
        }

        for(Map.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}

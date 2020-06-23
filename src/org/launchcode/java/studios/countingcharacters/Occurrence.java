package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = scanner.nextLine();
        HashMap <Character, Integer> characters = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            Character key = text.charAt(i);
            if ((key >= 'a' && key <= 'z') || (key >= 'A' && key <= 'Z')) {
                if (characters.containsKey(key)) {
                    Integer val = characters.get(key);
                    val ++;
                    characters.put(key, val);
                }
                else {
                    characters.put(key, 1);
                }
            }
        }
        characters.forEach((k, v) -> System.out.println((k + ": " + v)));
    }
}

package org.example.chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class CountingCharacters {
    public String count(String value) {
        return String.format("%s has %s characters.", value, value.length());
    }

    public static void main(String[] args) {
        CountingCharacters cc = new CountingCharacters();
        Scanner scanner = new Scanner(System.in);
        String value = null;
        do {
            System.out.println("What is the input string?");
            value = scanner.nextLine();
            if(value == null || value.isEmpty()) {
                System.out.println("You must enter something");
            }
        } while (value == null ||  value.isEmpty());

        System.out.println(cc.count(value));


    }

}

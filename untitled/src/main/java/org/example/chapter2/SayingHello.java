package org.example.chapter2;

import java.util.Scanner;

public class SayingHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println(String.format("Hello %s, nice to meet you!", name));
    }
}

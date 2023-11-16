package org.example.chapter2;

import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = sc.nextLine();
        System.out.print("Enter a verb: ");
        String verb = sc.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = sc.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = sc.nextLine();

        System.out.println(String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb));
    }
}

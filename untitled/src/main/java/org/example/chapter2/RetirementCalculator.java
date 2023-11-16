package org.example.chapter2;

import java.time.LocalDate;
import java.util.Scanner;

public class RetirementCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your current age? ");
        int currentAge = sc.nextInt();
        System.out.print("At what age wold you like to retire? ");
        int retirementAge = sc.nextInt();

        int yearsLeft = retirementAge - currentAge;
        if(yearsLeft < 0) {
            System.out.println("You can retire");
        } else {
            int currentYear = LocalDate.now().getYear();
            System.out.println("You have " +yearsLeft +" years left until you can retire");
            System.out.println("It's "+currentYear+", so you can retire in "+(currentYear + yearsLeft) + ".");
        }


    }
}

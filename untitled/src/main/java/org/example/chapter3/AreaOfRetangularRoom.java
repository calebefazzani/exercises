package org.example.chapter3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class AreaOfRetangularRoom {
    public static final double FEET_IN_METERS = 0.09290304;
    private int feetLength;
    private int feetWidth;

    AreaOfRetangularRoom(int feetLength, int feetWidth) {
        this.feetLength = feetLength;
        this.feetWidth = feetWidth;
    }

    int getArea() {
        return feetLength * feetWidth;
    }

    double getAreaInMeters() {
        return BigDecimal.valueOf(getArea() * FEET_IN_METERS)
                .setScale(3, RoundingMode.CEILING)
                .doubleValue();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        int feetLength = sc.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int feetWidth = sc.nextInt();

        AreaOfRetangularRoom calculator = new AreaOfRetangularRoom(feetLength, feetWidth);
        String format = String.format("The area is\n%s square feet\n%s square meters", calculator.getArea(), calculator.getAreaInMeters());
        System.out.println(format);
    }
}

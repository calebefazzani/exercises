package org.example.chapter3;

import java.util.Scanner;

public class PizzaParty {
    public static final int SLICES = 8;
    private int numPeople;
    private int numPizzas;

    PizzaParty(int numPeople, int numPizzas) {
        this.numPeople = numPeople;
        this.numPizzas = numPizzas;
    }

    private int getNumSlices() {
        return getNumPizzas() * SLICES;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public int getNumPizzas() {
        return numPizzas;
    }

    int getSlicesForPerson() {
        return getNumSlices() / getNumPeople();
    }

    int getLeftovers() {
        return getNumSlices() % getNumPeople();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people? ");
        int numPeople = sc.nextInt();
        System.out.print("How many pizzas do you have? ");
        int numPizzas = sc.nextInt();
        PizzaParty party = new PizzaParty(numPeople, numPizzas);

        String format = String.format("%s people with %s pizzas\nEach person gets %s pieces of pizza.\nThere are %s leftover pieces.", party.getNumPeople(), party.getNumPizzas(), party.getSlicesForPerson(), party.getLeftovers());
        System.out.println(format);
    }
}

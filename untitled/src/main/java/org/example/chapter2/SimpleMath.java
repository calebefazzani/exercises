package org.example.chapter2;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class SimpleMath {
    public static final String PLUS = "+";
    public static final String MINUS = "-";
    public static final String TIMES = "*";
    public static final String DIVIDE = "/";
    private static final Map<String, SimpleMathOperation> operations = new HashMap<String, SimpleMathOperation>() {{
        put(PLUS, Double::sum);
        put(MINUS, (num1, num2) -> num1 - num2);
        put(TIMES, (num1, num2) -> num1 * num2);
        put(DIVIDE, (num1, num2) -> num2 == 0 ? Double.POSITIVE_INFINITY : num1 / num2);
    }};
    private static String getValue(Double num1, Double num2, String operation) {
        return String.format("%s %s %s = %s", num1, operation, num2, operations.get(operation).calcule(num1, num2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the first number? ");
        double num1 = sc.nextDouble();
        System.out.print("What is the second number? ");
        double num2 = sc.nextDouble();
        System.out.println(getValue(num1, num2, PLUS));
        System.out.println(getValue(num1, num2, MINUS));
        System.out.println(getValue(num1, num2, TIMES));
        System.out.println(getValue(num1, num2, DIVIDE));
    }
}

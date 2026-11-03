package org.example;

import java.util.Scanner;

public class Main {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main cal = new Main();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double ans;

        switch (op) {
            case '+':
                ans = cal.add(a, b);
                break;

            case '-':
                ans = cal.subtract(a, b);
                break;

            case '*':
                ans = cal.multiply(a, b);
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                    sc.close();
                    return;
                }
                ans = cal.divide(a, b);
                break;

            default:
                System.out.println("Invalid operator");
                sc.close();
                return;
        }

        System.out.println("Result = " + ans);
        sc.close();
    }
}
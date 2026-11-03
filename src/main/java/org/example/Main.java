package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double ans = 0;

        switch(op) {
            case '+':
                ans = a + b;
                break;

            case '-':
                ans = a - b;
                break;

            case '*':
                ans = a * b;
                break;

            case '/':
                if(b == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                ans = a / b;
                break;

            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result = " + ans);

        sc.close();
    }
}



/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex05.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int a = myApp.getInputA();
        int b = myApp.getInputB();

        int add = addMath(a,b);
        int subtract = subtractMath(a,b);
        int multiply = multiplyMath(a,b);
        int divide = divideMath(a,b);

        myApp.output(a, b, add, subtract, multiply, divide);
    }

    private void output(int a, int b, int add, int subtract, int multiply, int divide) {
        System.out.print(a + " + " + b + " = " + add + "\n" + a + " - " + b + " = " + subtract + "\n" + a + " * " + b + " = " + multiply + "\n" + a + " / " + b + " = " + divide);
    }

    private static int divideMath(int a, int b) {
        return a / b;
    }

    private static int multiplyMath(int a, int b) {
        return a * b;
    }

    private static int addMath(int a, int b) {
        return a + b;
    }

    private static int subtractMath(int a, int b) {
        return a - b;
    }

    private int getInputA() {
        System.out.print("What is the first number? ");
        return Integer.parseInt(in.nextLine());
    }

    private int getInputB() {
        System.out.print("What is the second number? ");
        return Integer.parseInt(in.nextLine());
    }

}

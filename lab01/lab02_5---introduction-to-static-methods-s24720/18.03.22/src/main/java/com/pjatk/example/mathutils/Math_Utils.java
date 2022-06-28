package com.pjatk.example.mathutils;
import java.util.Scanner;
class Factorial {

    int MathUtils(int n)
    {
        return (n == 1 || n == 0) ? 1 : n * MathUtils(n - 1);
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj silnie:");
        int input = scanner.nextInt();

        Factorial obj = new Factorial();
        int num = input;
        System.out.println( "Silnia wynosi; " + obj.MathUtils(num));
    }
}


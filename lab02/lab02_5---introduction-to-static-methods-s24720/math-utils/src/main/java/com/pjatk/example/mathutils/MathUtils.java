package com.pjatk.example.mathutils;

import java.util.Scanner;

public class MathUtils {

    /*
        Funkcja oblicza n!
     */

    public static int factorial(int n){

        if(n == 0)
            return 1;
        int i = n, x = 1;
        while (n / i != n) {
            x = x * i;
            i--;
        }
        return x;
    }

    /*
        Funkcja oblicza n! (zastosować rekurencję)
     */
    public static int factorialRecursive(int n){
        if(n == 1)
            return 1;
        else
            return n * factorialRecursive(n-1);
    }


    /*
        Funkcja oblicza przyblożoną całkę oznaczoną od a do b dla wielomiany o podanych w tabeli współczunnikach
        (całka oznaczona to pole powierzchni pod wykresem wielomianu na przedziale [a,b])
     */
    public static double integralOfPolynomial(double[] coefficients,double a, double b){

    return 0;
    }

    /*
        Funkcja przedstawia nieskracalny ułamek w postaci a/b
        np. dla 9/12 zwróci "3/4"
                15/5 zwróci "3"
     */
    public static String simplifyFractionInString(int meter, int denominator){
        int x;
        x = __gcd(meter, denominator);
        meter = meter / x;
        denominator = denominator / x;

        return(meter + "/" + denominator);
    }
    static int __gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return __gcd(b, a % b);
    }

}

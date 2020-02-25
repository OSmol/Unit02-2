package com.epam.ld.javabasics30.unit02.skils.consolidation;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=0, maxDigit=0;
        System.out.print("Введите натуральное число: ");
        if (sc.hasNextLong()) {
            n = sc.nextLong();
        }
        if(n <= 0) {
            System.out.println("Число должно быть натуральным!");
        } else {
            do{
                long d = n % 10;
                if(maxDigit < d) {
                    maxDigit = d;
                }
            } while ((n=n/10) > 0);
            System.out.println("Наибольшая цифра: " + maxDigit);
        }
    }
}

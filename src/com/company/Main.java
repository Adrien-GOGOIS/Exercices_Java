package com.company;

public class Main {

    public static void main(String[] args) {
        // FIZZBUZZ
        for (int i = 1; i <= 100; i++) {
            if(i % 15 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }

        // MATH.ROUND

        float number = 23.58f;
        System.out.println(Math.round(number));

        // LENGTH

        int[] array = new int[5];
        String phrase = "Ceci est une phrase";
        System.out.println("La taille du tableau est de " + array.length);
        System.out.println("La longueur de la phrase est de " + phrase.length());

    }
}

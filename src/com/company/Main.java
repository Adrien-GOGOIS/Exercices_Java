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

        // LENGTH & TABLEAU

        long[] array = {10L, 5L, 8L};
        int[] array2 = new int[10];
        String phrase = "Ceci est une phrase";
        System.out.println("La taille du tableau est de " + array.length);
        System.out.println("La taille du tableau est de " + array2.length);
        System.out.println("La longueur de la phrase est de " + phrase.length());

        // EXERCICES SUR LES TABLEAUX

        int[] array3 = new int[5];
        array3[0] = 2;
        array3[1] = 8;
        array3[2] = 10;
        array3[3] = 7;
        array3[4] = 2;

        for (int i = 0; i < array3.length; i++) {
            System.out.println("Element " + i + ": " + array3[i]);
        }

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// Задание 1

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.print("\n");

        for (int u = 10; u > 0; u--) {
            System.out.print(u + " ");
        }

        System.out.print("\n");

    // Задание 2

        for (int everyFriday = 1; everyFriday < 31; everyFriday= everyFriday + 7 ) {
            System.out.print( " Сегодня пятница, " + everyFriday + "-е число. Необходимо подготовить отчет.");
        }

        System.out.print("\n");

    // Задание 3

        int past200Years = 1822;
        int next100Years = 2122;

        for (int comet = 0; comet <= next100Years; comet +=79) {
            if (comet >= past200Years && comet <= next100Years) {
                System.out.println(comet);
            }
        }
    }
}

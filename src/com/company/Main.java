package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        // Exercise 2

        System.out.println("Enter a temperature in Celsius: ");
        double Celcius = Scanner.nextDouble();

        double Fahrenheit = Celcius * 9 / 5 + 32;

        System.out.printf("%.1f C = %.1f F\n", Celcius, Fahrenheit);
        System.out.println("");

        // Exercise 3

        int sec, min, hour, secTotal;
        final int SEC_PER_HOUR = 60 * 60;
        final int SEC_PER_MIN = 60;

        System.out.println("Enter a number of seconds: ");
        secTotal = Scanner.nextInt();

        hour = (secTotal / SEC_PER_HOUR);
        min = (secTotal % SEC_PER_HOUR / SEC_PER_MIN);
        sec = (secTotal % SEC_PER_MIN);

        System.out.printf("%d seconds = %d hour, %d minutes and %d seconds.\n", secTotal, hour, min, sec);
        System.out.println("");

        // Exercise 4

        Random Random = new Random();
        int randomNumber = Random.nextInt(101);

        System.out.println("I'm thinking of a number between 1 and 100\n" +
                "(including both). Can you guess what it is?");
        System.out.println("Type a number: ");
        int yourNumber = (int) Scanner.nextInt();

        System.out.println("Your guess is: " + yourNumber);
        System.out.println("The number i was thinking of was: " + randomNumber);
        System.out.println("You were off by: " + Math.abs(yourNumber - randomNumber));

    }
}

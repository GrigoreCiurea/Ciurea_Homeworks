package org.example.homework_nr_2;
import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {
        // First exercise:
        System.out.println("First exercise:");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti luna: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Another month is doesn't exist!!! ");

        }
        System.out.println(" ");

        //Second exercise:
        System.out.println("Second exercise:");
        System.out.println(" ");

        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println(" ");

        //Third exercise:
        System.out.println("Third exercise:");
        System.out.println(" ");

        float j = 0;
        for (float k = 1; k <= 99; k += 2) {
            j = k / (k + 2) + j;

        }
        System.out.println(j);
        System.out.println(" ");
        // Fourth exercise:

        System.out.println("Fourth exercise:");
        System.out.println(" ");

        for (int l = 0; l != 10; l++) {
            for (int m = 0; m != l; m++)
                System.out.print("*");
            System.out.println();

        }

    }
}

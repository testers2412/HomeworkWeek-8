package questions11to15;
/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        int m, f = 0;
        m = number / 2;
        if (number == 0 || number == 1) {
            System.out.println(number + " is not a prime number");

        } else {
            for (int i = 2; i < m; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number");
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                System.out.println(number + " is a prime number");
            }

        }

    }


}

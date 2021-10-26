package questions6to10;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = sc.nextInt();
        int count = 0, result = 0, num, rem, num1;
        num = number;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        num1 = number;
        while (num1 != 0) {
            rem = num1 % 10;
            result += Math.pow(rem, count);
            num1 /= 10;
        }
        if (result == number) {
            System.out.println(number + " is a Armstrong number.");
        } else {
            System.out.println(number + " is not a Armstrong number.");
        }


    }

}

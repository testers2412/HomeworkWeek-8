package questions11to15;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Question15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter number of raw: ");
        int a= sc.nextInt();
        for(int i=0; i<a+1; i++){
            for(int j=0; j<i;j++){
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}

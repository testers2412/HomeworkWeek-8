package questions1to5;
/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=0, max=0;
        boolean isMin= false, isMax= false;
       while (true){
           System.out.println("Please enter the number: ");
           if(sc.hasNextInt()){
               int ip= sc.nextInt();
               if(ip>max || !isMax){
                   max=ip;
                   isMax=true;
               }
               if(ip<min || !isMin){
                   min=ip;
                   isMin=true;
               }
           }else{
               System.out.println("Minimum Number = " + min);
               System.out.println("Maximum Number = " + max);
               break;
           }
       }sc.close();



    }
}

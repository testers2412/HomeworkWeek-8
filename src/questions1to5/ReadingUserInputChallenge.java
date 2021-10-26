package questions1to5;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count= 1;
        int sum=0;
        while (count<=10){
            System.out.println("Enter number #"+count);
            boolean validNumber= sc.hasNextInt();
            if(validNumber){
                int num = sc.nextInt();
                sum+=num;
                count++;
            }else{
                System.out.println("Invalid input");
            }
            sc.nextLine();
        }
        System.out.println("Sum of all number= "+sum);
        sc.close();
    }

}

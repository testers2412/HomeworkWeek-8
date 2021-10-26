package questions1to5;
/**
 *3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

import java.util.Locale;
import java.util.Scanner;

public class CharAlphabetQ3 {
    public static boolean isItALetter(String l){ //one arg return type method
        if (l.charAt(0)>96 && l.charAt(0)<123){
            return true;
        } return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter an Alphabet: ");
        String al= sc.next().toLowerCase();
        sc.close();
        if(al.length()>1){
            System.out.println("Error,single character not entered.");

        }else if(!(isItALetter(al))){
            System.out.println("Error. letter not entered. Enter a letter.");
        }else if(al.equals("a") || al.equals("i") || al.equals("e") || al.equals("O") || al.equals("u")){
            System.out.println("Letter is a vowel ");
        }else{
            System.out.println("Letter is a constance");
        }



    }




}

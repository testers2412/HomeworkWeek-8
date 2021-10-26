package questions6to10;

// Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class Question9 {
    public static void main(String[] args) {
        int count = 8, num1 = 1, num2 = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print(num1+" ");
            int sum= num1+num2;
            num1= num2;
            num2= sum;
        }
    }
}

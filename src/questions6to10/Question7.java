package questions6to10;

/**
 * First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * Example input/output
 * * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
 * gives us 0+0 and the sum is 0.
 * * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
 * gives us 5+5 and the sum is 10.
 * * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */
public class Question7 {
    public static void sumFirstAndLastDigit(int number) {

        int firstDigit, lastDigit, count;
        lastDigit = number % 10;
        count = 0;
        int num;
        num = number;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        int divs = (int) Math.pow(10, count - 1);

        if (number == 0) {
            System.out.println("0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.");
        } else if (number > 0 && count > 1) {

            firstDigit = number / divs;
            System.out.println((firstDigit + lastDigit) + ", the first digit is " + firstDigit + " and the last is " + lastDigit + " which gives us " + firstDigit + "+" + lastDigit + " and the sum is " + (firstDigit + lastDigit) + ".");
            if (number > 0 && count == 1) {
                System.out.println((number + number) + ", the first and last digit is " + number + " since we only have 1 digit, which gives us " + number + "+" + number + " and the sum is " + (number + number) + ".");
            }

        } else if (number < 0) {
            number = -1;
            System.out.println(number + ", since the parameter is negative and needs to be positive");
        }


    }

    public static void main(String[] args) {
        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);
    }

}

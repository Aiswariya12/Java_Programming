/*
 * =====================================================================
 * Problem Statement: Write a Java program to check whether a given integer 
 * is a Neon Number. (A Neon Number is a number where the sum of digits of 
 * the square of the number is equal to the number itself.)
 * 
 * Example:
 * Input: num = 9
 * Output: true
 * Explanation: 9^2 = 81 -> 8 + 1 = 9.
 * =====================================================================
 */

package numberprograms;

public class NeonNumber {
	
	public static void main(String[] args) {
        int num = 9;

        NeonNumber obj = new NeonNumber();
        boolean result = obj.isNeonNumber(num);

        System.out.println("Input: " + num);
        System.out.println("Output: " + result);
    }
	
	public boolean isNeonNumber(int num) {
        if (num < 0) {
            return false; 
        }

        long square = (long) num * num;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10; 
            square /= 10;               
        }

        return sumOfDigits == num;
    }

}

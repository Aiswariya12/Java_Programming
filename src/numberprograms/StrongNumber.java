/*
 * =====================================================================
 * Problem Statement: Write a Java program to check whether a given number 
 * is a Strong Number. (A Strong Number is a special number whose sum of 
 * the factorial of its digits is equal to the original number.)
 * 
 * Example:
 * Input: num = 145
 * Output: true
 * Explanation: 1! + 4! + 5! = 1 + 24 + 120 = 145
 * =====================================================================
 */

package numberprograms;

public class StrongNumber {
	public static void main(String[] args) {
        int num = 145;

        StrongNumber obj = new StrongNumber();
        boolean result = obj.isStrongNumber(num);

        System.out.println("Input: " + num);
        System.out.println("Output: " + result);
    }

	public boolean isStrongNumber(int num) {
        if (num <= 0) {
            return false; // Strong numbers are positive integers
        }

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;      // Extract the last digit
            sum += factorial(digit);   // Add factorial of the digit to sum
            num /= 10;                 // Remove the last digit
        }

        return sum == original;
    }
     
	private int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }
	
}

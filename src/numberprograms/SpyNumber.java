/*
 * =====================================================================
 * Problem Statement: Write a Java program to check whether a given integer 
 * is a Spy Number. (A Spy Number is a positive integer where the sum of 
 * its digits is equal to the product of its digits.)
 * 
 * Example:
 * Input: num = 1124
 * Output: true
 * Explanation: Sum of digits = 1 + 1 + 2 + 4 = 8; Product = 1 * 1 * 2 * 4 = 8.
 * =====================================================================
 */

package numberprograms;

public class SpyNumber {
	
	public static void main(String[] args) {
        int num = 1124;

        SpyNumber obj = new SpyNumber();
        boolean result = obj.isSpyNumber(num);

        System.out.println("Input: " + num);
        System.out.println("Output: " + result);
    }
	
	public boolean isSpyNumber(int num) {
        if (num <= 0) {
            return false;
        }

        int sum = 0;
        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;        
            product *= digit;     
            num /= 10;            
        }

        return sum == product;
    }

}

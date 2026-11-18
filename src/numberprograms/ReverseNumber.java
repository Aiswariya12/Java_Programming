/*
 * =====================================================================
 * Problem Statement: Write a Java program to reverse the digits of a 
 * given integer.
 * 
 * Example:
 * Input: n = 12345
 * Output: 54321
 * =====================================================================
 */

package numberprograms;

public class ReverseNumber {

	public static void main(String[] args) {
        int n = 12345;

        ReverseNumber obj = new ReverseNumber();
        int result = obj.reverse(n);

        System.out.println("Input: " + n);
        System.out.println("Output: " + result);
	}
	
	public int reverse(int num) {
        int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10;             
            reversed = reversed * 10 + digit; 
            num /= 10;                        
        }
        
        return reversed;
    }
}

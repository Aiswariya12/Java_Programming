/*
 * =====================================================================
 * Problem Statement: Given an integer x, return true if x is a 
 * palindrome, and false otherwise. (A palindrome number reads the same 
 * backward as forward.)
 * 
 * Example:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * =====================================================================
 */

package numberprograms;

public class PalindromeNumber {
	
	public static void main(String[] args) {
        int num = 121;

        PalindromeNumber obj = new PalindromeNumber();
        boolean result = obj.isPalindrome(num);

        System.out.println("Input: " + num);
        System.out.println("Output: " + result);
    }
   
	public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; 
        }

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;               
            reversed = reversed * 10 + digit;
            x /= 10;                         
        }

        return original == reversed;
    }
}

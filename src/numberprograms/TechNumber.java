/*
 * =====================================================================
 * Problem Statement: Write a Java program to check whether a given integer 
 * is a Tech Number. (A Tech Number has an even number of digits, and when 
 * split into two equal halves, the square of the sum of those halves is 
 * equal to the original number.)
 * 
 * Example:
 * Input: num = 2025
 * Output: true
 * Explanation: 2025 has 4 digits -> 20 and 25. (20 + 25)^2 = 45^2 = 2025.
 * =====================================================================
 */

package numberprograms;

public class TechNumber {
	
	public static void main(String[] args) {
        int num = 2025;

        TechNumber obj = new TechNumber();
        boolean result = obj.isTechNumber(num);

        System.out.println("Input: " + num);
        System.out.println("Output: " + result);
    }

	public boolean isTechNumber(int num) {
        if (num <= 0) {
            return false;
        }

       
        int digits = 0;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        
        if (digits % 2 != 0) {
            return false;
        }

        int divisor = (int) Math.pow(10, digits / 2);
        int firstHalf = num / divisor;
        int secondHalf = num % divisor;

        int sumOfHalves = firstHalf + secondHalf;
        return (sumOfHalves * sumOfHalves) == num;
    }
}

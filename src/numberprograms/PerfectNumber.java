/*
 * =====================================================================
 * Problem Statement: Given an integer n, return true if n is a perfect 
 * number, otherwise return false. (A perfect number is a positive integer 
 * that is equal to the sum of its positive divisors, excluding the number 
 * itself.)
 * 
 * Example:
 * Input: num = 28
 * Output: true
 * Explanation: 28 = 1 + 2 + 4 + 7 + 14
 * =====================================================================
 */

package numberprograms;

public class PerfectNumber {
	public static void main(String[] args) {
		int num = 28;

        PerfectNumber obj = new PerfectNumber();
        boolean result = obj.checkPerfectNumber(num);

        System.out.println("Input: " + num);
        System.out.println("Output: " + result);
    }
	
	public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false; 
        }

        int sum = 1; 

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i; 
                }
            }
        }

        return sum == num;
    }
}



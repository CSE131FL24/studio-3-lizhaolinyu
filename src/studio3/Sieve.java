package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a number n to find all prime numbers up to n: ");
        int n = scanner.nextInt();

        // Call the method to find and print primes
        findPrimesUpTo1(n);

        scanner.close();
    }
	public static void findPrimesUpTo1(int n) {
        if (n < 2) {
            System.out.println("There are no prime numbers less than 2.");
            return;
        }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

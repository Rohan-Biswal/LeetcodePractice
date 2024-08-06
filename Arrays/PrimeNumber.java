package LeetcodePractice.Arrays;

import java.util.Scanner;

public class PrimeNumber {
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        boolean[] isPrime = new boolean[n];
        for (int i = 3; i < n; i += 2) {
            isPrime[i] = true;
        }
        isPrime[2] = true; 
        for (int i = 3; i * i < n; i += 2) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += 2 * i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        System.out.println("The total count of prime number till "+num+" is-"+countPrimes(num));
    }
}

package ex02;

import java.util.Scanner;

public class Program {

    private static int returnSqrt(int x) {
        long left = 0;
        long right = x;

        while (left < right) {
            long mid = left + ((right - left) / 2);

            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return (int) (left - 1);
    }

    private static boolean isPrime(int nbr) {
        int sqrt1;

        if (nbr == 2)
            return true;
        if ((nbr % 2 == 0))
            return false;
        sqrt1 = returnSqrt(nbr);
        int i = 3;
        while (i <= sqrt1) {
            if (nbr % i == 0) {
                return false;
            }
            i += 2;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nbr, sum;

        int counter = 0;

        nbr = sc.nextInt();
        while (nbr != 42)
        {
            if (nbr > 0) {
                sum = 0;
                while (nbr != 0) {
                    sum += nbr % 10;
                    nbr /= 10;
                }
                if (isPrime(sum)) {
                    counter++;
                }
            }
            nbr = sc.nextInt();
        }
        System.out.println("Count of coffee-request - " + counter);
    }
}

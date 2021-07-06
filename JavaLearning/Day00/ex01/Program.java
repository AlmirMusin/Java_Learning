package ex01;

import java.util.Scanner;

public class Program {

    private static int counter = 2;

    private static int mySqrt(int x) {
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

    public static void main(String[] args) {
        int sqrt1;

        Scanner sc = new Scanner(System.in);

        int nbr = sc.nextInt();

        if (nbr <= 1) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        if (nbr == 2) {
            System.out.println("true 1");
            return ;
        }
        if (nbr % 2 == 0) {
            System.out.println("false 1");
            return ;
        }

        sqrt1 = mySqrt(nbr);
        int i = 3;
        while (i <= sqrt1)
        {
            counter++;
            if (nbr % i == 0) {
                System.out.print("false " + counter);
                return ;
            }
            i += 2;
        }
        System.out.print("true " + counter);
    }
}

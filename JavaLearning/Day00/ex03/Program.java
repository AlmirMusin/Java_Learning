package ex03;

import java.util.Scanner;

public class Program {
    private static final Scanner sc = new Scanner(System.in);

    private static void print(long res) {
        int i = 1;

        int current;

        while (res != 0) {
            System.out.print("Week " + i + " ");
            current = (int) (res % 10);
            res /= 10;
            for (; current != 0; current--) {
                System.out.print("=");
            }
            System.out.println(">");
            i++;
        }
    }

    private static int getMinGrade() {
        int minGrade = 10;

        int grade;

        for (int j = 0; j < 5; j++) {
            grade = sc.nextInt();
            if (grade < 1 || grade > 9) {
                System.out.println("IllegalArgument");
                System.exit(-1);
            }
            if (grade < minGrade)
                minGrade = grade;
        }
        return minGrade;
    }

    public static void main(String[] args) {

        String line = sc.nextLine();

        long res = 0;

        int minGrade;

        int i = 1;

        int factor = 1;

        int week = 0;

        while (!line.equals("42")) {
            if (!line.equals("Week " + i)) {
                System.out.println("IllegalArgument");
                System.exit(-1);
            }

            minGrade = getMinGrade();
            res += (long) minGrade * factor;
            factor *= 10;
            i++;
            line = sc.nextLine();

            week++;
            if (week == 18)
                break;
            line = sc.nextLine();
        }
        print(res);
    }
}

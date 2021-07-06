package ex04;

import java.util.Scanner;

public class Program {
    private static final int LEN = 64535;

    private static int findMax(int[] mass) {
        int max = 0;

        for (int i = 0; i < LEN; i++) {
            if (mass[i] > mass[max]) {
                max = i;
            }
        }
        return(max);
    }

    private static void print(int[][] res) {
        int level = 10;

        int maxCol = res[0][0];

        if (maxCol == 0)
            return ;

        for (int j = 0; j < 11; j++) {
            for (int i = 0; i < 10; i++) {
                if (res[i][0] != 0) {
                    if (res[i][0] * 10 / maxCol == level) {
                        System.out.print(res[i][0] + "\t");
                    }
                    if (res[i][0] * 10 / maxCol > level) {
                        System.out.print("#\t");
                    }
                }
            }
            System.out.println();
            level--;
        }

        for (int i = 0; i < 10; i++) {
            if (res[i][0] != 0) {
                if ((char)res[i][1] == '\t') {
                    System.out.print("vt\t");
                } else if ((char)res[i][1] == ' ') {
                    System.out.print("sp\t");
                } else {
                    System.out.print((char)res[i][1] + "\t");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max;

        int[] mass = new int[LEN];

        int[][] res = new int[10][2];

        char[] line = sc.nextLine().toCharArray();

        for (char c : line) {
            mass[c]++;
        }

        for (int i = 0; i < 10; i++) {
            max = findMax(mass);
            res[i][0] = mass[max];
            res[i][1] = max;
            mass[max] = 0;
        }
        print(res);
    }
}

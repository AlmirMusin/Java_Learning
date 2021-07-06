package ex00;

public class Program {
    public static void main(String[] args) {
        int sum = 0;
        int number = 111111;

        sum += number % 10;
        number /= 10;

        sum += number % 10;
        number /= 10;

        sum += number % 10;
        number /= 10;

        sum += number % 10;
        number /= 10;

        sum += number % 10;
        number /= 10;

        sum += number % 10;
        System.out.println(sum);
    }
}

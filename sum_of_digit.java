import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the digit");
        n = s.nextInt();
        while (n > 0) {
            int d = n % 10;
            sum += d;
            n = n / 10;
        }
        System.out.println(sum);
    }
}

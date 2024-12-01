import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        int n, r;

        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        n = s.nextInt();
        int temp = n;
        while ((n > 0)) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;

        }
        if (temp == sum) {
            System.out.println("number is armstrong number");
        } else {
            System.out.println("number is not armstrong number");
        }

    }
}

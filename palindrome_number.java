import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        int n;
        int temp;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        n = s.nextInt();
        temp = n;
        while (n > 0) {

            int digit = n % 10;
            sum = sum * 10 + digit;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("number is palindrome number");

        } else {
            System.out.println("number is not palindrome number");
        }
    }
}

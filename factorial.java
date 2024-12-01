import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n, fact = 1, i;
        Scanner s = new Scanner(System.in);
        System.out.println(" enter the number");
        n = s.nextInt();
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}

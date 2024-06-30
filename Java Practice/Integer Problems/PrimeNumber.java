
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int y = 0;
        if (num <= 1) {
            System.out.println("Not a prime number");
        } else if (num == 2) {
            System.out.println("prime number");
        } else {
            int i = 2;
            while (num > i) {
                if (num % i == 0) {
                    y = 1;
                    break;
                } else {
                    y = 0;
                }
                i += 1;
            }
            if (y == 1) {
                System.out.println("not prime number");
            } else {
                System.out.println("prime number");
            }

        }
    }
}

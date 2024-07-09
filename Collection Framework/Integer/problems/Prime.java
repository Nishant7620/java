
import java.util.Scanner;

public class Prime {

    public String PrimNumber(int n) {
        int y = 0;
        if (n <= 1) {
            return "not prime";
        } else if (n == 2) {
            
            return "prime number";
        } else {
            int i = 2;
            while (i < n) {
                if (n % i == 0) {
                    y = 1;
                    break;
                } else {
                    y = 0;
                }
                i++;
            }
            if (y == 1) {
                return "not prime number";
            } else {
                return "prime number";
            }
        }
    }

   

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Prime prime = new Prime();
        System.out.println(prime.PrimNumber(num));

    }
}

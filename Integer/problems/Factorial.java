
import java.util.Scanner;

public class Factorial {

    public int factorial(int num) {     
        int fact = 1;                           //int i = 1;
        for(int i = 1;i <=num;i++){          
            fact = fact * i;                 //while (i <= num) {
        }                                    //  fact = fact * i;
                                            //i++; // Increment i                    
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Factorial fact = new Factorial();
        System.out.println(fact.factorial(num));
    }
}

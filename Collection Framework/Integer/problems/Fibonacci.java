
import java.util.Scanner;

public class Fibonacci{

    public void fibonacci(int num){
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        System.out.print(n1+",");
        System.out.print(n2+",");
        int i = 0;
        while(num>1){

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            num = num - 1;
            System.out.print(n3+",");
        }
       
    }

    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        int num = sc.nextInt();
        Fibonacci obj = new Fibonacci();
        obj.fibonacci(num);

    }
}
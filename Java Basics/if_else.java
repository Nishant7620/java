import java.util.Scanner;
public class if_else{
    public static void main(String[] args){

        int num1 = 10;
        int num2 = 20;
        int num3 = 8;

        if (num1 >num2 && num1>num3){
            System.out.println("number " + num1 + " is greater");
        }
        else if (num2> num1 && num2>num3){
            System.out.println("number "+ num2 + " is greater");
        }
        else {
            System.out.println("number " + num3 +" is greater");
        }

        //pen = 10 and notebook = 20
        int pen = 10;
        int notebook = 20;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter cash you have:");
        int cash = sc.nextInt();

        if (cash<10){
            System.out.println("you have less money");
        }
        else if (cash>=10 && cash<50){
            System.out.println("you can buy 1 thing");
        }
        else {
            System.out.println("you can by both things");
        }
        

        
        

    }
}

import java.util.Scanner;
public class input{
    public static void main(String[] args){
        // How to take input
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = obj.nextInt();
        System.out.println(age);

        //---------------------------------------------------------------------------------

        Scanner obj1 = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = obj1.nextLine();
        System.out.println(name);

        System.out.println("enter your salary: ");
        double salary = obj.nextDouble();
        System.out.println(salary);
    }
}
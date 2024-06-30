import java.util.Scanner;
public  class while_loop{
    public static void main(String[] args){
        // while loop

        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }


       // do while loop
       
    //    int j = 1;
    //    do {
    //     System.out.println(j);
    //     j++;
    //    }while(j<=100); 

       // taking input from user 
       Scanner sc = new Scanner(System.in);      
       int num = 0;
       do {
        System.out.println("enter a number:");
        num = sc.nextInt();
        System.out.print("here is your number:");
        System.out.println(num);
       }while(num>=0);

       System.out.println("The end");
    }
}
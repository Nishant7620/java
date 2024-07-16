public class Prime{
    public static void  main(String[] args){
        int num = 5;
        int y = 0;
        if(num <=1){
            System.out.println("not prime");
        }else if (num == 2){
            System.out.println("prime");
        }
        else {
            int i = 2;
            while(i<num){
                if(num % i == 0){
                    y = 1;
                    break;
                }
                else{
                    y = 0;
                }
                i++;
            }
            if(y==0){
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }
        }
    }
}
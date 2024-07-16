public class SumOfDigit{
    public static void main(String[] args){
        int num = 123;
        int sum = 0;

        if(num<10){
            System.out.println(num);
        }
        else {
            while(num>0){
                int digit = num % 10;
                sum = sum + digit;
                num = (int)Math.floor(num / 10);
            }
            System.out.println(sum);
        }
    }
}
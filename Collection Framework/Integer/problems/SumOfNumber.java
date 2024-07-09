

public class SumOfNumber{

    public int sumOfNumber(int num){
        int sum = 0;
        
        if (num < 10){
            return num;
        }else {
            int i = 0;
            while(num>0){
                int digit = num % 10;
                sum = sum + digit;
                num = (int)Math.floor(num / 10);
            }
            return sum;
        }

    }
    public static void main(String[] args){
        SumOfNumber obj = new SumOfNumber();
        System.out.println(obj.sumOfNumber(123));
    }
}
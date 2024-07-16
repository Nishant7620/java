public class Palindrome {
    public static void main(String[] args) {
        int num = 123;
        String reverse = "";
        if(num < 10){
            System.out.println(num);

        }
        else {
            while (num>0){
            int digit = num % 10;
            reverse = reverse + String.valueOf(digit);
            num = (int)Math.floor(num/10);    

            }
            System.out.println((Integer.parseInt(reverse)));        
        }
    }
}
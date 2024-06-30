
public class ArmstrongNumber {

    public static void main(String[] args) {

        int num = 153;
        String strnumber = String.valueOf(num);
        int len = strnumber.length();

        int exppo = (int) Math.exp(len);
        // System.out.println(exppo);
        int sum = 0;

        if (num < 10) {
            System.out.println("Armstrong number");

        } else {
            int i = 0;
            while (num > i) {
                int digit = num % 10;
                sum = sum + digit + exppo;
                num = (int) Math.floor(num / 10);

            }
            System.out.println(sum);
        }

    }
}

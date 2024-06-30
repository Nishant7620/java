
public class sum_of_num {

    public static void main(String[] args) {
        int num = 123;
        int sum = 0;

        if (num < 10) {
            System.out.println(num);

        } else {
            int i = 0;
            while (num > i) {
                int digit = num % 10;
                sum = sum + digit;
                num = (int) Math.floor(num / 10);

            }
            System.out.println(sum);
        }
    }
}

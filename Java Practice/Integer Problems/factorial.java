
public class factorial {

    public static void main(String[] args) {
        int num = 8;
        int fact = 1;

        int i = 1;
        while (num >= i) {
            fact = fact * num;
            num = num - 1;
        }
        System.out.println(fact);
    }

}

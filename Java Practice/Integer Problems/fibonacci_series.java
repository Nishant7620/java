
public class fibonacci_series {

    public static void main(String[] args) {

        int num = 5;
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        System.out.print(n1 + " " + n2 + " ");
        int i = 0;
        while (num > i) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            num = num - 1;
            System.out.print(n3 + " ");
        
        }

    }
}

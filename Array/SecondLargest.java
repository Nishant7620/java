
import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 40, 20, 21, 50, 21, 40, 22};
        Arrays.sort(myArray);
        int max_element = 0;
        int second_max = 0;
        for (int element : myArray) {
            if (element > max_element) {
                second_max = element;
                max_element = element;
            } else if (element > second_max) {
                second_max = element;
            }

        }
        System.out.println (second_max);
    }

   

}


import java.util.Arrays;

public  class array {
    public static void main(String[] args){

        // Array

        int[] marks = new int[3];

        marks[0] = 91;
        marks[1] = 80;
        marks[2] = 92;

        // System.out.println(marks[1]);

        int[] numbers = {10, 8, 11, 12, 9};

        Arrays.sort(numbers);
        System.out.println(numbers[0]);

        // 2D array

        int[][] final_marks = {{88,90},{87,96}};

        System.out.println(final_marks[0][1]);
        System.out.println(final_marks[1][0]);

    }
}
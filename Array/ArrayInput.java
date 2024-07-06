
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        System.out.println("Enter a size of Array: ");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int marks[] = new int[size];

        // taking input
        for (int i = 0; i < marks.length; i++) {
            System.out.println("enter a element: ");
            marks[i] = sc.nextInt();

        }

        // Showing output
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

    }
}

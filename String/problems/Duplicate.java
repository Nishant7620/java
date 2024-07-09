
import java.util.Stack;
// Removing duplicates from string

public class Duplicate {

    public static void main(String[] args) {
        String str1 = "Hello";
        String Unique = "";
        Stack<Character> duplicate = new Stack<Character>();

        for (int i = 0; i < str1.length(); i++) {
            if (!duplicate.contains(str1.charAt(i))) {
                duplicate.push(str1.charAt(i));
            }
        }

        for (char c : duplicate) {

            Unique = Unique + c;
        }
        System.out.print(Unique);

    }
}



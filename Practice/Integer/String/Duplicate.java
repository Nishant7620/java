
import java.util.Stack;

public class Duplicate{
    public static void main(String[] args){
        String str = "Hello";
        String unique = "";
       Stack<Character> stack = new Stack<>();
       for (int i = 0;i<str.length();i++){
        if(!stack.contains(str.charAt(i))){
            stack.push(str.charAt(i));
        }
    
       }
       for (char c: stack){
            unique = unique + c;
       }
       System.out.println(unique);
}
    }
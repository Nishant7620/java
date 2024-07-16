
public class Palindrome {

    public static void main(String[] args) {
        String str = "Hello";
        String new_str = str.toLowerCase();
        String reverse = "";
        for (int i = 0; i < new_str.length(); i++) {
            reverse = new_str.charAt(i) + reverse;
        }
        System.out.println(reverse);
    }
}

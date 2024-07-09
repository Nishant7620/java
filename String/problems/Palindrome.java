
class Check {

    public String palindrome(String str) {
        String check = str;
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i) + temp;
        }
        if (check.equals(temp)) {
            return temp;
        } else {
            return "not palindrome";
        }
    }

}

public class Palindrome {

    public static void main(String[] args) {
        Check check = new Check();
        System.out.println(check.palindrome("madam"));
    }
}

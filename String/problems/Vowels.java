
class Check {

    public String check(String str) {
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (char vovwel : vowels) {
                if (ch == vovwel) {
                    count += 1;
                    break;  
                }
            }
        }
        return "Number of vowels " + count;

    }
}

public class Vowels {

    public static void main(String[] args) {
        Check check = new Check();
        System.out.println(check.check("Hello"));

    }
}


public class StringMethods {

    public static void main(String[] args) {
        //length()

        String str = "Hello World";
        System.out.println(str.length());

        //toLowerCase()
        System.out.println(str.toLowerCase());
        //toUpperCase()
        System.out.println(str.toUpperCase());

        //substring()

        System.out.println(str.substring(2,5));

        //concatenation

        String str1 = "Nish";
        String str2 = "ant";

        System.out.println(str1 + str2);
        System.out.println(str1.concat(str2));

        //equals
        System.out.println(str1.equals(str2));

        //contains
        System.out.println(str1.contains("N "));

        //indexOf()
        System.out.println(str1.indexOf("i"));

        //charAt()
        System.out.println(str1.charAt(2));

    }
}


public class StringMethods {

    public static void main(String[] args) {
        // String methods

        // charAt()
        String my_string = "Hello World";
        char c = my_string.charAt(4);
        System.out.println(c);

//----------------------------------------------------------------------------------------------------
        // compareTo
        String str1 = "Hello";
        String str2 = "World";
        int result = str1.compareTo(str2);
        System.out.println(result);

//-----------------------------------------------------------------------------------------------------
        // concat()
        String str11 = "Hello";
        String str22 = "world";

        System.out.println(str11.concat(str22));
//-----------------------------------------------------------------------------------------------------
        // contains()
        String string = "Nishant";

        System.out.println(string.contains("N")); // returns true if contains else false
//------------------------------------------------------------------------------------------------------
        //equals

        String s1 = "Hello";
        String s2 = "Tello";

        boolean reslt = s1.equals(s2); // Returns true or false
        System.out.println(reslt);

//-------------------------------------------------------------------------------------------------------  
        //equalsIgnoreCase()  
        String st1 = "Nishant";
        String st2 = "nishant";
        String st3 = "Hello";
        System.out.println(st1.equalsIgnoreCase(st2));
        System.out.println(st2.equalsIgnoreCase(st3));

//-------------------------------------------------------------------------------------------------------
        // length()
        String str = "Nishant";
        System.out.println(str.length());
//------------------------------------------------------------------------------------------------------
        // replace()
        String st = "hello";
        // String new_str = st.replace('h', 't');
        System.out.println(st.replace('h', 't'));
//-------------------------------------------------------------------------------------------------------
        //split()

        String my_st = "Nishant";

        String[] parts = my_st.split("h");
        System.out.println(parts[0]);

//------------------------------------------------------------------------------------------------------
        //substring()
        String s = "HelloWorld";
        String sub = s.substring(5, 10);
        System.out.println(sub);
//------------------------------------------------------------------------------------------------------
        //toUpperCase()
        String my_str = "Nishant";
        System.out.println(my_str.toUpperCase());
        System.out.println(my_str.toLowerCase());

//--------------------------------------------------------------------------------------------------------
        //trim()
        String strr = "    Hello     ";
        String trim = strr.trim();
        System.out.println(trim);
//-------------------------------------------------------------------------------------------------------
        //valueOf()
        String strValue = String.valueOf(123);
        System.out.println(strValue);

//--------------------------------------------------------------------------------------------------------
        //startsWith()
        String stt = "Hello";
        System.out.println(stt.startsWith("H"));

    }
}

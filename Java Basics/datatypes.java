
public  class datatypes{
    public static void main(String[] args){
        //primitive types 

        byte age = 30;
        int number = 123456789;
        long phone = 12345678910L;
        float pi = 3.14F;
        char character = 'a';
        double salary = 100000.0;
        boolean isLoggedIn = true;

        // System.out.println(character + " " + age + " " + phone);


        // non-primitive types

        // String, Array, Interface, Classes

        //String and their methods
        String name = "Nishant";
        System.out.println(name.length());
        System.out.println(name.charAt(1));

        //concatenate
        String str1 = "hello";
        String str2 = "world";
        System.out.println(str1 + " " + str2);

        // replace
        String name1 = "Hello";
        String new_name = name1.replace('H', 'T');
        System.out.println(new_name);
        
        //substring
        String name2 = "Nishant and Manish";
        System.out.println(name2.substring(0,7));



    }
}
public class Vowels{
    public static void main(String[] args){
        String str = "Hello";
        int count = 0;
        char[] vowels = {'a','e','i','o','u'};

        for(int i = 0;i<str.length();i++){
           char ch= str.charAt(i);

           for(char c: vowels){
                if(ch==c){
                    count = count + 1;
                }
           }

        }
        System.out.println(count);
        

    }
}
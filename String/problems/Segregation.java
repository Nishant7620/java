
public class Segregation{
    public static void main(String[] args){
        String my_String = "Hello123";
        StringBuilder digits = new StringBuilder();
        for(int i = 0; i<my_String.length();i++){
            char c = my_String.charAt(i);
            if(Character.isDigit(c)){
                digits.append(c);
            }
            
        }
        System.out.println(digits);
        

        
    } 
}

class Check{

    public boolean  check(String str){
            return str.matches(".*\\d.*");
                
            }
 }
   
public class StringCheck{
    public static void main(String[] args){
        Check check = new Check();
        System.out.println(check.check("hello123"));
    }
}
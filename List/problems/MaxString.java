import java.util.ArrayList;
import java.util.List;
public class MaxString{
    public static void main(String[] args){

    List<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("World");
    list.add("Nishant");
    
    int maxlength = 0;
    String maxstring = "";
    for(String str: list){
        if (str.length()>maxlength){
            maxlength = str.length();
            maxstring = str;
        }
    }
    System.out.println(maxstring);

    }
}
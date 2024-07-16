
import java.util.ArrayList;
import java.util.List;

public class MaxString {

    public static void main(String[] args) {
        int max_length = 0;
        String max_string = "";
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("world");
        list.add("Nishant");
        list.add("holla");

        for (String item : list) {
            if (item.length() > max_length) {
                max_length = item.length();
                max_string = item;

              
                

            }
           

        }
        System.out.println(max_string);
        
    }
}

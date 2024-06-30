public class break_continue{
    public static void main(String[] args){
        // break

        // int i = 1;
        // while(true){
        //     // System.out.println(i);
        //     i++;
        //     if(i==6){
        //         break;
        //     }
        // }


        // continue

        int j = 1;
        while(true){

            if (j==3){
                j++;
                continue;

            }
            System.out.println(j);
            j++;
            if (j==6){
                break;
            }
        }
    }
}
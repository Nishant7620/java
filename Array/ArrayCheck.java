public class ArrayCheck{
    public static boolean contains(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] my_array = {1,2,3,2,4,5,6,3};
        int[] empty = new int[0];

        for (int i: my_array){
            if(contains(empty,i)){
                System.out.println(my_array[i]);
            }
        }

    }
   
}

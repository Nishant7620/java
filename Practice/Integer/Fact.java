class Factorial{
    public int factorial(int num){
        int fact = 1;
        int i = 0;
        while(i<num){
            fact = fact* num;
            num= num-1;
        }

        return fact;
    }
}

public class Fact{
    public static void main(String[] args){
        Factorial fact = new Factorial();
        System.out.println(fact.factorial(5));
    }
}
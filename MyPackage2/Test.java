
public class Test {

    public static void main(String[] args) {

        Employee engineer = new Employee("Shivam", 992090647);        // parameterize constructor
        Employee engineer2 = new Employee();
        engineer.mySalary();
        System.out.println(engineer.getname());
        System.out.println(engineer.getphone());
        engineer2.setname("Manish");
        System.out.println(engineer2.getname());
        System.out.println(engineer2.getphone());
    }
}

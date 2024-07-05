
class Employee {

    private String name;
    private int id;
    private int age;

    public Employee() {
        name = "default name";
        age = 18;
    }

    public Employee(String name, int phone) {       //constructor
        this.name = name;
        this.age = phone;
    }

    //Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for age
    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }

    }

}

public class Encapsulation {

    public static void main(String[] args) {
        Employee sc = new Employee("Nishant", 24);
        System.out.println(sc.getName());
        System.out.println(sc.getAge());

    }
}


class Employee {

    private int id = 1;
    private String name;            // Data Members
    private int phone = 762075023;
    private int salary = 20000;
    private int incentive = 200;

    public Employee() {               // constructor       
        name = "Nishant";
        phone = 22222;
    }

    Employee(String empname, int phoneNo) {      //constructor
        phone = phoneNo;
        name = empname;
    }

    //getter and setter
    int getphone() {
        return phone;
    }

    String getname() {
        return name;
    }

    void mySalary() {
        //System.out.println(salary + incentive);         //Member functions
    }

    void setname(String name) {
        this.name = name;
    }

    void setphone(int phone) {
        this.phone = phone;

    }
}

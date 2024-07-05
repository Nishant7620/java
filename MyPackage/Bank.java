
// we are achieving abstraction concept
public abstract class Bank {

    String name;
    int id;                         // we are able to declare Data Members in abstact class


    void display(){             // we are able to create normal method with body

    }

    abstract void readData();

    abstract void writeData();   // we are able to delcare abstract methods but we are not able to declare body 
                                //of method or can't implement logic in abstract class
}

class Admin extends Bank {

    void readData() {
        System.out.println("admin can read");
    }

    void writeData(){
        System.out.println("admin can write data");
    }
}


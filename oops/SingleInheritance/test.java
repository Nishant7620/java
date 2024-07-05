
public class test {

    public static void main(String[] args) {
        // creating Parent class object as parent 
        Parent parent = new Parent();

        // creating Child class object as child
        Child child = new Child();

        // Accessing Parent properties using parent object
        parent.parent_property();
        //parent.child_property(); we cannot access child property using parent object

        // Accessing Child properties using child object
        child.child_property();
        child.parent_property();  // we can asscess parent property using child object

    }
}

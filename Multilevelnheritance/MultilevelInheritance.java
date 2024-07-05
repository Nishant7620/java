
class Parent {

    public void parent_property() {
        System.out.println("parents property");
    }

}

class Child extends Parent {

    public void child_property() {
        System.out.println("child property");
    }
}

class GrandChild extends Child {

    public void grand_child_property() {
        System.out.println("grand child property");
    }

}

public class MultilevelInheritance {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        GrandChild grandchild = new GrandChild();

        // Accessing properties
        parent.parent_property();
        child.child_property();
        grandchild.grand_child_property();
        // grand child can access both parent and child properties
        grandchild.child_property();
        grandchild.parent_property();
    }
}

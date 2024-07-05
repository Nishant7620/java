
class Parent {

    public void parent_property() {
        System.out.println("parents property");
    }

}

class Brother extends Parent {

    public void brother_property() {
        System.out.println("brothers property");
    }
}

class Sister extends Parent {

    public void sister_property() {
        System.out.println("sisters property");
    }
}

public class Hierarchical {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Brother brother = new Brother();
        Sister sister = new Sister();

        parent.parent_property();
        brother.brother_property();
        sister.sister_property();

        // both can access parent property
        brother.parent_property();
        sister.parent_property();
        // both cannot access each other property
        //brother.sister_property();
        //sister.brother_property();

        ;

    }
}

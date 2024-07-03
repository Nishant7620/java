
class Pen {

    String color;
    String type;

    public void write() {
        System.out.println("writing something");

    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printName() {
        System.out.println(this.type);
    }

}

public class Oops {

    public static void main(String[] args) {
        Pen pen1 = new Pen();

        pen1.color = "blue";
        pen1.type = "ball";
        pen1.printColor();
        pen1.printName();
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "gel";
        pen2.printColor();
        pen2.printName();
    }
}

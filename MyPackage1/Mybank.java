
// we are acheiving abstacting using interface
interface Mybank {

    void write();           // in interface everything is abstract so we need not used keyword abstact
    void read();
    //declares only

}

class Axisread implements Mybank {

    @Override
    public void read() {
        System.out.println("Axis can read data");
    }

    @Override
    public void write() {
        System.out.println("Axis can write data");

    }
}

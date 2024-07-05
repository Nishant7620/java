
class Animal {

    public void make_sound() {
        System.out.println("Animals can make sound");
    }

}

class Dog extends Animal {
    @Override
    public void make_sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void make_sound() {
        System.out.println("Cat Mew");
    }

}

public class test2 {

    public static void main(String args[]) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.make_sound();
        cat.make_sound();
    }
}

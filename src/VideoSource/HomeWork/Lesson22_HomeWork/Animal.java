package VideoSource.HomeWork.Lesson22_HomeWork;

public class Animal {
    int eyes;//?????????? ????

    Animal() {
        System.out.println("I'm animal");
    }

    void eat() {
        System.out.println("Animal eat");
    }

    void drink() {
        System.out.println("Animal drinks");
    }

}

class Pet extends Animal {
    int tail = 1;
    int paw = 4;
    String name;
    Pet() {
        eyes = 2;
        System.out.println("I'm pet");
    }

    void run() {
        System.out.println("Pet runs");
    }

    void jamp() {
        System.out.println("Pet jamps");
    }

}

class Dog extends Pet {


    Dog(String name) {
        this.name = name;
        System.out.println("I'm dog and my name is: " + name);
    }

    void play() {
        System.out.println("Dogs plays");
    }
}

class Cat extends Pet {
    private String name;

    Cat(String name) {
        this.name = name;
        System.out.println("I'm cat and my name is: " + name);
    }

    void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Test_Animal {
    public static void main(String[] args) {
        Dog d1 = new Dog("Ralf");
        System.out.println(d1.paw);
        Cat c1 = new Cat("Murzik");
        c1.sleep();
    }
}
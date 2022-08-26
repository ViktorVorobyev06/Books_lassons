package VideoSource.HomeWork.Lesson24;

import javax.lang.model.element.AnnotationMirror;
import java.util.SortedMap;

abstract public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }


    abstract void eat();

    abstract void sleep();

}

abstract class Fish extends Animal {

    Fish(String name) {
        super(name);
    this.name=name;
    }

    @Override
    void sleep() {
        System.out.println("It's always interesting to watch the fish sleep");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Spek {

    Bird(String name) {
        super(name);
        this.name=name;
    }

    @Override
    public void spek() {
        System.out.println(name + "sings");
    }

    abstract void fly();

}

abstract class Mammal extends Animal implements Spek {

    Mammal(String name) {
        super(name);
        this.name=name;
    }

    abstract void run();
}

interface Spek {
    default void spek() {
        System.out.println("Someddy speaks");
    }
}

class Mechenosec extends Fish {

    Mechenosec(String name) {
        super(name);
        this.name=name;
    }

    @Override
    void swim() {
        System.out.println("Mechenosec krasivaya riba,kotoraya bistro plavaet");
    }

    @Override
    public void eat() {
        System.out.println("Mechenosec ne xishnaya riba,i ona est abichniy ribiy korm!");
    }
}

class Pingvind extends Bird {


    Pingvind(String name) {
        super(name);
        this.name=name;
    }

    @Override
    public void spek() {
        System.out.println("Pingvini ne umeyut pet kak solovyi!");
    }

    @Override
    public void eat() {
        System.out.println("Pingvin lyubit est ribu!");
    }

    @Override
    void sleep() {
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }

    @Override
    public void fly() {
        System.out.println("Pingvini ne umeyut letat!");
    }
}

class Lev extends Mammal {

    Lev(String name) {
        super(name);
        this.name=name;
    }

    @Override
    public void eat() {
        System.out.println("Lev kak lyuboy xishnik, lyubit myaso!");
    }

    @Override
    public void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit!");
    }

    @Override
    public void run() {
        System.out.println("Lev-eto ne samaya bistraya loshka!");
    }
}

class Test {
    public static void main(String[] args) {
        Mechenosec mechenosec=new Mechenosec("Mech");
        System.out.println(mechenosec.name);
        mechenosec.swim ();
        mechenosec.eat();
        mechenosec.sleep();
        System.out.println("---------------------------------------------");
        Spek pingvind=new Pingvind("Pin");
        pingvind.spek();
        System.out.println("---------------------------------------------");

        Animal lev=new Lev("Kosh");
        System.out.println(lev.name);
        lev.eat();
        lev.sleep();
        System.out.println("---------------------------------------------");

        Mammal lev2=new Lev("Kosh2");
        System.out.println(lev2.name);
        lev2.eat();
        lev2.run();
        lev2.spek();
        lev2.sleep(); 
        System.out.println("---------------------------------------------");


    }
}




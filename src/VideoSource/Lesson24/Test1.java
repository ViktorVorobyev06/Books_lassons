package VideoSource.Lesson24;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {

    }
}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Eat");
    }

    void sleep() {
        System.out.println("Sleep");
    }
}

class Teacher extends Employee implements Help_able{
    int colichestvouchenikov;

    public void pomosh(){
        System.out.println("Uchitel okazivaet pomosh");
    }
    public void tushitPojar(){
        System.out.println("Uchitel tushit pojar");
    }

    void uchit() {
        System.out.println("uchit");
    }
}

class Driver extends Employee implements Help_able,Swim_able {
    String markaMashini;

    public void pomosh(){
        System.out.println("Driver okazivaet pomosh");
    }
    public void tushitPojar(){
        System.out.println("Driver tushit pojar");
    }
    public void swim(){
        System.out.println("Driver plavaet");
    }

    void drive() {
        System.out.println("Drive");
    }
}
interface Help_able{
    void pomosh();
    void tushitPojar();
}
interface Swim_able{
    void swim();
}
interface t1{
    default void as(){}
     void sa();   
}
class t2 implements t1{
    public void as(){
        System.out.println("as");
    }
    public void sa(){
        System.out.println("sa");
    }
}
class t3 extends t2{

}

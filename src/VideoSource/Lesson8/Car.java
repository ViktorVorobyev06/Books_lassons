package VideoSource.Lesson8;

public class Car {
    String color="Blue";
    String engine="V6";
}
class Human{
    String name="Ivan";
    Car c= new Car();

    public static void main(String[] args) {
        final Human h1= new Human();
        h1.c=new Car();
        h1.c=new Car();
        h1.c.engine="V8";
    }

}

package VideoSource.HomeWork;
class Car{
    String color;
    String engine;
    int kolDoor;
    Car(String color,String engine,int kolDoor){
        this.color=color;
        this.engine=engine;
        this.kolDoor=kolDoor;
    }
}
class CarTest{
    static void kolDoorNew(Car c1,int kolDoorNew){
        c1.kolDoor=kolDoorNew;
    }
    static void zamena(Car c1,Car c2){
        String c3;
        c3=c1.color;
        c1.color=c2.color;
        c2.color=c3;
    }
}
public class Lesson11_HomeWork {
    public static void main(String[] args) {
        Car c1=new Car("red","V8",2);
        Car c2= new Car("blue","V8",4);

        CarTest.zamena(c1,c2);
        System.out.println(c1.color);
        System.out.println(c2.color);

        CarTest.kolDoorNew(c1,3);
        CarTest.kolDoorNew(c2,2);
        System.out.println(c1.kolDoor);
        System.out.println(c2.kolDoor);


    }
}

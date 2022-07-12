package VideoSource.Lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;
    void ShowInfo(){
        System.out.println("Name:"+name+"\nColor mashini: "+car.color+"\nBalans bankovskogo shcheta: "+bA.balance);
    }

}

class Car3{
    Car3(String c,String e){
        color=c;
        engine=e;
    }
    String color;
    String engine;
}
class BankAccount{
    BankAccount(int id2,double balance2){
        id=id2;
        balance=balance2;
    }
    int id;
    double balance;
}
class HumanTest{
    public static void main(String[] args) {
        Human h=new Human();
        h.name="David";
        h.car=new Car3("red","V6");
        h.bA=new BankAccount(18,200.5);
        h.ShowInfo();
    }
}
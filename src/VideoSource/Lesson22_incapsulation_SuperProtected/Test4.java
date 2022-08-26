package VideoSource.Lesson22_incapsulation_SuperProtected;
//? Java ??? ????????????? ????????????(???? ????? ?? ????? ????????? ????????? ???????)
public class Test4 {
}
class Human2 {
    Human2(String n){
        this(n,null);
        System.out.println("Hello3");
    }
    Human2(String f,String l){
        firstName=f;
        lastName=l;
        System.out.println("Hello4");
    }
    protected String firstName;
    protected String lastName;
}
class Student2 extends Human2{
    Student2(){
        this(5);
        System.out.println("Hello1");
    }
    Student2(int i){
        super("Petya");
        System.out.println("Hello2");
    }
    public static void main(String[] args) {
        Student2 s=new Student2();
        System.out.println(s);
    }
}

package VideoSource.Lesson22_incapsulation_SuperProtected;

public class Human3 {
    String firstName;
    String lastName;

    Human3(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
class Student4 extends Human3{
    int course;

    Student4(String name,String surname,int course){
        super(name,surname);
        this.course=course;
    }

    public static void main(String[] args) {
        Student4 s=new Student4("Ivan","Ivanov",3);
    }
}

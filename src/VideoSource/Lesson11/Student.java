package VideoSource.Lesson11;

public class Student {
    String name;
    int cource;
    double grade;

    Student(String name, int cource, double grade) {
        this.name = name;
        this.cource = cource;
        this.grade = grade;
    }

    public static void swap(Student s1,Student s2){
        Student s3=s1;
        s1=s2;
        s2=s3;

    }
    public static void changeName(Student s1){
        s1.name="Vasiliy";
    }
    public static void main(String[] args) {
        Student s1=new Student("Ivan",3,9.5);
        Student s2 = new Student("Petr",1,5.3);
swap(s1,s2);
        System.out.println(s1.name);
        System.out.println(s2.name);
      changeName(s2);
        System.out.println(s2.name);

    }
}

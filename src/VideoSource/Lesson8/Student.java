package VideoSource.Lesson8;

public class Student {
    String name;
    int course;
    static int count;//class variable
    int a = 10;

    public Student(String name2, int course2) {

        count++;
        name = name2;
        course = course2;
        System.out.println("Student № " + count + " создан");
    }

    public static void showCount() {
        System.out.println("Studentov sozdano" + count);
    }

    public void showInfo() {
        System.out.println("Welcom to the Student class!!!!");
    }

    void abc() {
        a++;
    }

    static void abcd() {
        //a++; не получится потому что метод static(можно использовать только статические переменые либо создать обьект в методе)
//        Student st=new Student("Ivan",2);
//        st.a=10;
    }

}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 4);
        Student st2 = new Student("Petr", 3);
        Student st3 = new Student("Masha", 2);


    }
}

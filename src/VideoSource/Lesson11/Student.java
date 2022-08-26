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

    static void sravnenToOneIf(Student st1,Student st2){
        if (st1.name.equals(st2.name)&st1.cource== st2.cource){
            System.out.println("Studenti ravni");
        }
        else System.out.println("Studenti ne ravni");
    }
    static void sravnenNeskolIf(Student st1,Student st2){
        if(st1.name.equals(st2.name)){
            if (st1.cource== st2.cource){
                if (st1.grade== st2.grade){
                    System.out.println("U studentov vse polya ravni");
                }
                else {
                    System.out.println("Ne raven po grade");
                }
            }
            else {
                System.out.println("Ne raven po cource");
            }
        }
        else {
            System.out.println("Ne raven po name");
        }

    }

//    static void sravnenNeskolIf(Student st1,Student st2){
//        if (st1.name.equals(st2.name)){
//            System.out.println("Ravni po name");
//        }
//        else {
//            System.out.println("Ne ravni po name");
//        }
//        if (st1.cource== st2.cource){
//            System.out.println("Ravni po cource");
//        }
//        else {
//            System.out.println("Ne ravni po cource");
//        }
//
//        if (st1.grade== st2.grade){
//            System.out.println("Ravni po grade");
//        }
//        else {
//            System.out.println("Ne ravni po grade");
//        }



 //   }
//    public static void swap(Student s1,Student s2){
//        Student s3=s1;
//        s1=s2;
//        s2=s3;
//
//    }
    public static void changeName(Student s1){
        s1.name="Vasiliy";
    }
    public static void main(String[] args) {
        Student s1= new Student("Ivan.M",3,2.5);
        Student s2 = new Student("Ivan",3,9.5);
        sravnenNeskolIf(s1,s2);
//        sravnenToOneIf(s1,s2);








//swap(s1,s2);
//        System.out.println(s1.name);
//        System.out.println(s2.name);
//      changeName(s2);
//        System.out.println(s2.name);

    }
}

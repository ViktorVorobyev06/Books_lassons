package VideoSource.Lesson23;

public class Test4 {
    void abc(Animal a){
        System.out.println("A");
    }
    void abc(Mouse m){
        System.out.println("M");
    }

    public static void main(String[] args) {
//        Test4 t = new Test4();
//        Animal an = new Mouse();
//        t.abc(an);



        Animal an=new Animal();
        an.getName();
        Mouse  ms=new Mouse();
        ms.getName();

        Animal an1=new Mouse();
        an1.getName();



    }
}



class Animal{
    void getName(){
        System.out.println("Animal");
    }
}
class Mouse extends Animal{
 @Override
      void getName(){
        System.out.println("Mouse");
    }
}

package VideoSource.Lesson23;

public class Test7 {
    public static void main(String[] args) {
    /*    A c1 = new C();
        c1.abc(new B());
    */
    B10 b10=new B10();
        System.out.println(b10.s2);
    }
}
class A{

    void abc (A a){
        System.out.println("A");
    }
}
class B extends A{

    void abc(B b1){
        System.out.println("B");
    }
}
class C extends B{
    void abc(B b2){
        System.out.println("C");
    }
}
class A10{
    String s1="privet";
    static double p=3.14;
    int summa(int...i){
        int result=0;
        for(int a:i){
            result+=a;
        }
        return result;
    }
    static void abc(){
        System.out.println("static method");
    }
}
class B10 extends A10{
    String s2=super.s1+", drug!";
    //String s1=super.s1+" ,drug!!!";//тоже самое потому что переменная Hidde при такой записи обязательно писать super
//super не льзя использовать со статическими методами и переменными
    double p=super.p;//мы можем назначить значение потому что с помощью обьекта мы можем обратиться в статической переменной
    int summa(int...i){
        int result=super.summa(i);
                System.out.println("summa: "+result);
        super.abc();//так же можем обратится из не статического метода к из чайлд класса к статическому методу родительского класса
        return result;
    }
}

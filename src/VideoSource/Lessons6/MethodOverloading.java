package VideoSource.Lessons6;

public class MethodOverloading {
    void show(int i1) {
        System.out.println(i1);
    }

    void show(boolean i1) {
        System.out.println(i1);
    }

    void show(String i1) {
        System.out.println(i1);
    }

    void show(String s, int a) {
        System.out.println("String: " + s + " int:" + a);
    }

    void show(int a, String s) {
        System.out.println("Какой хороший день!!!");
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        int a = 500;
        boolean b = true;
        String s1;
        mo.show(a);
        mo.show(b);
        mo.show("Hi");
        mo.show(10,"Privet");
    }
}

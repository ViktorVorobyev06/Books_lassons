package VideoSource.HomeWork;

class Lesson8_Work {
    final static double pi = 3.14;

    double ploshad_kruga(double r) {
        double ploshadkruga = pi * r * r;
        return ploshadkruga;
    }

    static double dlina_ok(double r) {
        double dlina_okruzh = 2 * pi * r;
        return dlina_okruzh;
    }

    void showInfo(double r) {
        System.out.println("Радиус окружности равен: "+r);
        System.out.println("Площадь круга: "+ploshad_kruga(r));
        System.out.println("Длина окружности: "+dlina_ok(r));
    }

    static int proiz(int a, int b) {
        System.out.println("Произведение двух чисел: " + a * b);
        return a * b;
    }

    static void delen(double a, double b) {
        System.out.println("Частное: " + a / b);
        System.out.println("Остаток: " + a % b);
    }
}

public class Lesson8_HomeWork {
    public static void main(String[] args) {
        // Lesson8_Work.proiz(12,4);
        // Lesson8_Work.delen(12,5);

        Lesson8_Work pl = new Lesson8_Work();
        System.out.println(pl.ploshad_kruga(10));
        System.out.println(Lesson8_Work.dlina_ok(10));
        System.out.println("----------------------------------------------------");
        pl.showInfo(10);
    }
}

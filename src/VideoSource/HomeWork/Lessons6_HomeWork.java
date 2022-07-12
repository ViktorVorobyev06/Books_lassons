package VideoSource.HomeWork;

class Student6 {
    int biletId;
    String FirstName;
    String LastName;
    int YersOfStudy;
    double SredOcenMat;
    double SredOcenEkonom;
    double SredOcenForeginLang;

    Student6(int biletId, String FirsName, String LastName, int YersOfStudy, double SredOcenMat, double SredOcenEkonom, double SredOcenForeginLang) {
        this.biletId = biletId;
        this.FirstName = FirsName;
        this.LastName = LastName;
        this.YersOfStudy = YersOfStudy;
        this.SredOcenMat = SredOcenMat;
        this.SredOcenEkonom = SredOcenEkonom;
        this.SredOcenForeginLang = SredOcenForeginLang;
    }

    Student6(int biletId, String FirstName, String LastName, int YersOfStudy) {
        this(biletId, FirstName, LastName, YersOfStudy, 0.0, 0.0, 0.0);
    }

    Student6() {
        System.out.println("No Paramentr!");
    }
}

public class Lessons6_HomeWork {
    public static void main(String[] args) {
        Student6 st1 = new Student6(1, "Ivan", "Ivanov", 2000, 4.5, 4.4, 3.5);
        System.out.println(st1.biletId + " " + st1.FirstName + " " + st1.LastName + " " + st1.YersOfStudy + " " + st1.SredOcenMat + " " + st1.SredOcenEkonom + " " + st1.SredOcenForeginLang);
        Student6 st2 = new Student6(2, "Artem", "Savankov", 2000);
        System.out.println(st2.biletId + " " + st2.FirstName + " " + st2.LastName + " " + st2.YersOfStudy);
        Student6 st3 = new Student6();
        System.out.println(st3);
    }
}

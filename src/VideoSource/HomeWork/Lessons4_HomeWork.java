package VideoSource.HomeWork;

class Student{
    int biletId;
    String FirstName;
    String LastName;
    int YersOfStudy;
    double SredOcenMat;
    double SredOcenEkonom;
    double SredOcenForeginLang;
    double SredArefOcen(double Mat,double Ekonom,double ForeginLang){
        double sredAref;
        return sredAref=Mat+Ekonom+ForeginLang/3.0;
    }
}
public class Lessons4_HomeWork {
    double SredArefOcen2(Student st){
        double sredOcenka=(st.SredOcenMat+st.SredOcenEkonom+ st.SredOcenForeginLang)/3;
        System.out.println("Srednyaa ocenka studenta: "+st.FirstName+st.LastName+": "+sredOcenka);
        return sredOcenka;
    }
    public static void main(String[] args) {
        Student st1=new Student();
        Student st2=new Student();
        Student st3=new Student();

        st1.biletId=1;
        st1.FirstName="Ivan";
        st1.LastName="Ivanov";
        st1.YersOfStudy=2000;
        st1.SredOcenMat=3.5;
        st1.SredOcenEkonom=5.0;
        st1.SredOcenForeginLang=4.5;
        double sredOcenkaSt1=st1.SredArefOcen(st1.SredOcenMat,st1.SredOcenEkonom,st1.SredOcenForeginLang);

        st2.biletId=2;
        st2.FirstName="Evgeniy";
        st2.LastName="Smirnov";
        st2.YersOfStudy=1993;
        st2.SredOcenMat=4.5;
        st2.SredOcenEkonom=3.0;
        st2.SredOcenForeginLang=5.0;
        double sredOcenkaSt2=st2.SredArefOcen(st2.SredOcenMat,st2.SredOcenEkonom,st2.SredOcenForeginLang);

        st3.biletId=3;
        st3.FirstName="Vladimir";
        st3.LastName="Sidorov";
        st3.YersOfStudy=1997;
        st3.SredOcenMat=5.0;
        st3.SredOcenEkonom=3.4;
        st3.SredOcenForeginLang=2.5;
        double sredOcenkaSt3=st3.SredArefOcen(st3.SredOcenMat,st3.SredOcenEkonom,st3.SredOcenForeginLang);
/*
        System.out.println("Студент с номером билета "+st1.biletId+"\nИмя:"+st1.FirstName+"\nФамилия:"+st1.LastName+"\nГод обучения:"+
                st1.YersOfStudy+"\nСредняя оценка по математике:"+st1.SredOcenMat+"\nСредняя оценка по экономике:"+st1.SredOcenEkonom+
                "\nСредняя оценка по иностранным языкам:"+st1.SredOcenMat);
        System.out.println("Средняя оценка по всем придметам:"+sredOcenkaSt1 );


        System.out.println("Студент с номером билета "+st2.biletId+"\nИмя:"+st2.FirstName+"\nФамилия:"+st2.LastName+"\nГод обучения:"+
                st2.YersOfStudy+"\nСредняя оценка по математике:"+st2.SredOcenMat+"\nСредняя оценка по экономике:"+st2.SredOcenEkonom+
                "\nСредняя оценка по иностранным языкам:"+st2.SredOcenMat);
        System.out.println("Средняя оценка по всем придметам:"+sredOcenkaSt2);


        System.out.println("Студент с номером билета "+st3.biletId+"\nИмя:"+st3.FirstName+"\nФамилия:"+st3.LastName+"\nГод обучения:"+
                st3.YersOfStudy+"\nСредняя оценка по математике:"+st3.SredOcenMat+"\nСредняя оценка по экономике:"+st3.SredOcenEkonom+
                "\nСредняя оценка по иностранным языкам:"+st3.SredOcenMat);
        System.out.println("Средняя оценка по всем придметам:"+sredOcenkaSt3);*/

        Lessons4_HomeWork student=new Lessons4_HomeWork();
        student.SredArefOcen2(st1);
        student.SredArefOcen2(st2);
        student.SredArefOcen2(st3);
    }
}

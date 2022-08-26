package VideoSource.HomeWork.Lesson14_HomeWork;

import java.util.HashMap;

public class Time_Work {
    static void time() {

        /*for (int hour = 0; hour < 6; hour++) {

            for (int minuts = 0; minuts < 60; minuts++) {
                if (hour > 1 && minuts % 10 == 0) {
                    break;
                }
                for (int secund = 0; secund < 60; secund++) {
                    if (secund * hour > minuts) {
                        continue;
                    }
                    System.out.println(hour + ":" + minuts + ":" + secund);
                }
            }
        }*/

        int hour = 0;
        OUTER:
        while (hour < 6) {
            int minuts = -1;
            MIDDLE:
            do {
                minuts++;
                if (hour > 1 && minuts % 10 == 0) {
                    break OUTER;
                }
                int second = 0;
                INNER:
                while (second < 60) {
                    if (second * hour > minuts) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minuts + ":" + second);
                    second++;
                }
            }while (minuts < 59);
            hour++;
        }


        /*for (int hour=0;hour<23;hour++){
            int minuts=0;
            do {
                int second=0;
                while (second<60){
                    System.out.println(hour + ":" + minuts + ":" + second);
                    second++;
                }
                minuts++;
            }while (minuts<60);
        }*/
    }
}

class Time {
    public static void main(String[] args) {
//        Time_Work.time();
        String s1="privet";
        String s2="privet";

        String s3=new String("privet");
        String s4=new String("privet");


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

    }
}

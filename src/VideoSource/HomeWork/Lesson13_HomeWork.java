package VideoSource.HomeWork;

import java.sql.Time;

//Данная программа является простым тестом
// так как я не знал и мне было лень
// искать количество дней в месяце 2015 года
class Month {
    void viborM(int a) {
        /*switch (a) {//Старый Switch
            case 2:
                System.out.println("28");
                break;
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            default:
                System.out.println("Net takogo Mes");
        }*/
        switch (a) {//Новый Switch
            case 2 -> System.out.println("28");
            case 1,3,4,5,6,7,8,9,11,12->System.out.println("30");
            case 10 -> System.out.println("31");

            default -> System.out.println("Net takogo Mes");
        }



    }
}

public class Lesson13_HomeWork {
    static void abc(){
        System.out.println("Update - UP");
    }
    static void abc2(){
        System.out.println("Update - UP#2");
    }
    public static void main(String[] args) throws Exception {
        /*Month m = new Month();
        m.viborM(1);*/

//         for (int i=2;i<=30;i++){//i+=2
//             if(i%2==0){
//                 System.out.println(i);
//             }
//         }

//        int i=0,j=0;
//         for (;i<=23;i++) {//i+=2
//
//             for (; j <= 59; j++) {//i+=2
//                 Thread.sleep(60_000);
//                 System.out.println(i + ":" + j);
//             }
//         }
        double x = 5;
        double y = x / 3;
        System.out.println(y);
    }
}

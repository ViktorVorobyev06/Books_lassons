package Books.StringDemo;

import java.io.IOException;

public class String_Demo {
    public static void main(String[] args) throws IOException {
        /*String str1="Java - лидер среди лидеров";
        String str2=str1;

        String str3="Java - лидер среди лидеров";
        String str4="Java - лидер среди лидеров";

        if (str1==str2){
            System.out.println("Указывают");
        }

        if (str1.equals(str2)){
            System.out.println("Одно и тоже");
        }
*/
        /*for (int i=0;i<str1.length();i++){
            System.out.println(' '+str1.charAt(i));
        }*/
//        String str1[] = new String[]{"Эта","строка", "является", "тестом."};
//        for (String s:str1) {
//            System.out.print(s+" ");
//        }
        /*String str1="Java - the best forever";
        String strFormat=str1.substring(7,23);
        System.out.println(strFormat);*/
   String numbers[][]=new String[][]{
           {"Mary","555-555"},
           {"Ivan","444-444"}
   };
   int i;
   if (args.length!=1) System.out.println("Использование: Java Phone<имя>");
else {
    for (i=0;i<numbers.length;i++){
        if (numbers[i][0].equals(args[0])){
            System.out.println(numbers[i][0]+": "+numbers[i][1]);
            break;
        }
    }
    if (i==numbers.length)
        System.out.println("Имя не найдено");
   }
    }
}

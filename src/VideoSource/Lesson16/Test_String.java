package VideoSource.Lesson16;

public class Test_String {
    public static void main(String[] args) {
        String s1 = new String("Hellos");

        int a = s1.length();
        System.out.println(a);

        char c1 = s1.charAt(3);
        System.out.println(c1);

        int iO = s1.indexOf('l');
        System.out.println(iO);

        int iO1=s1.indexOf('s',2);
        System.out.println(iO1);

        boolean b1=s1.startsWith("e",2);
        System.out.println(b1);

        boolean b2=s1.endsWith("o");
        System.out.println(b2);

        String s2=s1.substring(3,5);
        System.out.println(s2);

        String s3="    sasdas   sadasww       ";
        System.out.println(s3.trim());

        int a1=2;
        int b3=3;
        String s4=a1+""+b3;
        System.out.println(s4);
    }
}

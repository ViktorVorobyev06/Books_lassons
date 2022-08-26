package VideoSource.HomeWork.Lesson16_HomeWork;

public class Class_Mail {
    public void email(String mail) {
        int a=0;
        int b=0;
        int c = 0;
        while (c < mail.length() - 1) {

            a = mail.indexOf('@', c);
            b = mail.indexOf('.', c);
            c = mail.indexOf(';', c + 1);
            System.out.println(mail.substring(a+1,b));
        }
    }


}

class Test {
    public static void main(String[] args) {
        Class_Mail cm = new Class_Mail();
        cm.email("ya@yahoo.com;  on@mail.ru;  ona@gmail.com;");
    }
}
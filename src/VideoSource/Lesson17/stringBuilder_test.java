package VideoSource.Lesson17;

public class stringBuilder_test {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("good day!!");
StringBuilder sb2=new StringBuilder(50 );

        System.out.println(sb1.insert(sb1.length(),55));
        System.out.println(sb1.delete(10,sb1.length()));
        System.out.println(sb1.deleteCharAt(9));
        //System.out.println(sb1.reverse());
        System.out.println(sb1.replace(5,8,"nigth"));
        System.out.println(sb1.capacity());

        System.out.println(sb2.capacity());

    }
}

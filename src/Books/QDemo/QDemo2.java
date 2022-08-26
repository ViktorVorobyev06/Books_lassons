package Books.QDemo;

public class QDemo2 {
    private char q[];
    private int putloc, getloc;
    

    QDemo2(int size) {
        q = new char[size+1];
        putloc = getloc = 0;
    }

    QDemo2(QDemo2 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        for (int i = getloc + 1; i <= putloc; i++) {
            q[i] = ob.q[i];
        }
    }

    QDemo2(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];
        for (int i = 0; i < a.length; i++) put(a[i]);
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.println("- ??????? ?????????");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println("- ??????? ?????");
            return (char) 0;
        }
        return q[getloc++];
    }
}
class QDemo2Work{
    public static void main(String[] args) {
        QDemo2 q1=new QDemo2(10);
        char name[]={'T','o','m'};
        QDemo2 q2=new QDemo2(name);

        char ch;
        int i;

        for (i=0;i<10;i++){
            q1.put((char)('A'+i));
        }

        QDemo2 q3=new QDemo2(q1);

        System.out.print("Soderzhimoe q1: ");
        for (i=0;i<10;i++){
            ch=q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Soderzhimoe q2: ");
        for (i=0;i<3;i++){
            ch=q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Soderzhimoe q3: ");
        for (i=0;i<10;i++){
            ch=q3.get();
            System.out.print(ch);
        }

    }
}
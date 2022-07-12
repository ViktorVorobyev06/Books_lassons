package Books.QDemo;
class QueueDouble{
    Double q[];
    int putloc,getloc;
    QueueDouble(int size){
        q=new Double[size];
        putloc=getloc=0;
    }
    void put(double dq){
        if(putloc==q.length){
            System.out.println("- Очередь заполнена");
            return;
        }
        q[putloc++]=dq;
    }
    double get(){
        if(getloc==putloc){
            System.out.println("- Очередь пуста");
            return 0;
        }
        return q[getloc++];
    }

}
public class QDemoDouble {
    public static void main(String[] args) {
        QueueInt bigQ=new QueueInt(100);
        double dq;
        for (int i=0;i<26;i++){
            bigQ.put(i);
        }
        for (int i=0;i<26;i++) {
            dq=bigQ.get();
            if(dq!=0)System.out.print(" "+dq);
        }
    }
}

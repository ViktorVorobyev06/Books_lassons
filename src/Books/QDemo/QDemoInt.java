package Books.QDemo;
class QueueInt{
    int q[];
    int putloc,getloc;
    QueueInt(int size){
        q=new int[size];
        putloc=getloc=0;
    }
    void put(int iq){
        if(putloc==q.length){
            System.out.println("- Очередь заполнена");
            return;
        }
        q[putloc++]=iq;
    }
    int get(){
        if(getloc==putloc){
            System.out.println("- Очередь пуста");
            return 0;
        }
        return q[getloc++];
    }

}
public class QDemoInt {
    public static void main(String[] args) {
        QueueInt bigQ=new QueueInt(100);
        int iq;
        for (int i=0;i<26;i++){
            bigQ.put(i);
        }
        for (int i=0;i<26;i++) {
            iq=bigQ.get();
            if(iq!=0)System.out.print(" "+iq);
        }
    }
}

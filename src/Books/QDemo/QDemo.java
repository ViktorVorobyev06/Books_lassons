package Books.QDemo;

class Queue{
    char q[];
    int putloc,getloc;
    Queue(int size){
        q=new char[size];
        putloc=getloc=0;
    }
    void put(char ch){
        if(putloc==q.length){
            System.out.println("- Очередь заполнена");
            return;
        }
        q[putloc++]=ch;
    }
    char get(){
        if(getloc==putloc){
            System.out.println("- Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }

}

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ=new Queue(100);
        char ch;
        for (int i=0;i<26;i++){
            bigQ.put((char)('A'+i));
        }
        for (int i=0;i<26;i++) {
            ch=bigQ.get();
            if(ch!=(char) 0)System.out.print(ch);
        }
    }
}

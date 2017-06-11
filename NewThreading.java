public class NewThreading implements Runnable{
public void run(){
System.out.println("Used runnable interface to run the thread");
}
public static void main(String[] args){
NewThreading nw=new NewThreading();
Thread t=new Thread(nw);
t.start();
}
}

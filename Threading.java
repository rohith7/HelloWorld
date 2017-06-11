public class Threading extends Thread{

public void run(){
System.out.println("thread is running....");
}
public static void main(String args[]){
Threading m1=new Threading ();
m1.start();

}}

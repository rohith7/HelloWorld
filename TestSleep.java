public class TestSleep extends Thread{
public void run(){
for(int i=0;i<5;i++){
try{
Thread.sleep(500);
}
catch(InterruptedException e){
System.out.println(e);
}
System.out.println(i);
}
}
public static void main(String[] args){
TestSleep t1=new TestSleep();
TestSleep t2=new TestSleep();
TestSleep t3=new TestSleep();
t1.start();
try{
t1.join();
}
catch(InterruptedException e ){
System.out.println(e);
}
t2.start();
t3.start();

System.out.println("The name of thread 1: "+t1.getName());

System.out.println("The name of thread 2: "+t2.getName());
t1.setName("Rohith Thread");
System.out.println("The name of thread 1: "+t1.getName());


}
} 
public class Multithread extends Thread {
    public void run(){
        for(int j=1;j<5;j++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(j);
        }
        }
        public static void main(String[] args) {
            Multithread t1=new Multithread();
            Multithread2 t2=new Multithread2();
            t1.start();
            t2.start();
        }
    }
class Multithread2 extends Thread{
    public void run(){
        for(int i=5;i<10;i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
//javac Multithread.java
//java Multithread

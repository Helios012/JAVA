class Threadpri extends Thread{
    public void run(){
        System.out.println("running thread is:"+Thread.currentThread().getName());
        System.out.println("Running Thread priority:"+Thread.currentThread().getPriority());
    }

public static void main(String args[]){
    Threadpri m1=new Threadpri();
    Threadpri m2=new Threadpri();
    m1.setPriority(Thread.MIN_PRIORITY);
    m2.setPriority(Thread.MAX_PRIORITY);
    m1.start();
    m2.start();
}
}
//javac Threadpri.java
//java Threadpri

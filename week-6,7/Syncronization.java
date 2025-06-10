class Synchronization {
    synchronized void disp(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                
            }
        }
    }
}
class SyncThread extends Thread {
    Synchronization s;
    SyncThread(Synchronization s) {
        this.s = s;
    }
    public void run() {
        s.disp(5);
    }
    public static void main(String[] args) {
        Synchronization s1 = new Synchronization();
        SyncThread t1 = new SyncThread(s1);
        SyncThread t2 = new SyncThread(s1);
        t1.start();
        t2.start();
    }
}
//javac Syncronization.java
//java SyncThread

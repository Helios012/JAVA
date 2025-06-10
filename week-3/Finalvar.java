class bike1{
    final int speed=60;
    void run(){
        speed=100;
    }
}
class Finalvar {
    public static void main(String[] args) {
        bike1 b=new bike1();
        b.run();
    }
}
//javac Finalvar.java
//output will be error

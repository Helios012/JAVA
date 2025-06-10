class bike1{
    final void run(){
        System.out.println("Hello");
    }
}
class Finalmethod extends bike1 {
    void run(){
        System.out.println("HI");
    }
    public static void main(String[] args) {
        bike1 b=new bike1();
        b.run();
    }
}
//javac Finalmethod.java
//output will be error

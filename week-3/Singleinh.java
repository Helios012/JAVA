class A{
    public void methodA(){
    System.out.println("Base class");
}}
class Singleinh extends A{
        public void methodB(){
        System.out.println("Inheritaed class");
    }
    public static void main(String[] args) {
        Singleinh obj=new Singleinh();
        obj.methodA();
        obj.methodB();
    }
}
//javac Singleinh.java
//java Singleinh

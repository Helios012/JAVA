class A{
    public void methodA(){
        System.out.println("Base class A");
    }
}
class B extends A{
    public void methodB(){
        System.out.println("Class B");
    }
}
class Multilevelinh extends B {
    public void methodZ(){
        System.out.println("Class Z");
    }
    public static void main(String[] args) {
        Multilevelinh obj=new Multilevelinh();
        obj.methodA();
        obj.methodB();
        obj.methodZ();
    }
}
//javac Multilevelinh.java
//java Multilevelinh


class parent{
    public void methodP(){
        System.out.println("Parent");
    }
}
class A extends parent{
    public void methodA(){
        System.out.println("Child1");
    }
}
class B extends parent{
    public void methodB(){
        System.out.println("Child2");
    }
    public static void main(String[] args) {
        B obj=new B();
        obj.methodP();
        obj.methodB();
        A obj1=new A();
        obj1.methodP();
        obj1.methodA();
    }
}

//javac Hierinh.java
//java Hierinh

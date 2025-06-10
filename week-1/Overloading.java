//method and constructor overloading
class student{
    int id;
    String name;
    public student(){
        System.out.println("Default constructor");
    }
    public student(int i,String n){
        id=i;
        name=n;
        System.out.println("Name:"+name+" RollNo:"+id);
    }
    public void teacher(){
        System.out.println("Method overloading");
    }
    public void teacher(int i,int j){
        int a,b;
        a=i;
        b=j;
        System.out.println(a+b);
    }
}

public class Overloading {
    public static void main(String[] args) {
        student s=new student();
        student s2=new student(101,"Angela");
        s.teacher();
        s2.teacher(10,20);
    }
}
//javac Overloading.java
//java Overloading

//illustrate class and obj
class Student{
    int rollno;
    String name;
    void insert(int r,String n){
        rollno=r;
        name=n;
    }
    void display(){
        System.out.println("Name:"+name+" RollNo:"+rollno);
    }
}

public class Studata {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student();
        s1.insert(101,"Ravi");
        s2.insert(102,"Raju");
        s1.display();
        s2.display();
    }
}
//javac Student.java
//java Student

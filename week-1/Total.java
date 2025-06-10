//static data member
public class Total {
    public static void total(int a ,int b){
        int tot=a+b;
        int avg=tot/2;
        System.out.println("Sum:"+tot);
        System.out.println("Average:"+avg);
    }
    public static void main(String[] args) {
        total(10,20);
    }
}
//compile javac Total.java
//run java Total.java

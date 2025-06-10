//command line argument
public class Sum {
    public  void Sum1(int a,int b){
        int tot=a+b;
        int avg=tot/2;
        System.out.println("Sum:"+tot);
        System.out.println("Average:"+avg);
    }
    public static void main(String[] args) {
        int x,y;
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        Sum s=new Sum();
        s.Sum1(x,y);
    }
}
//compile javac Sum.java
//run java Sum 10 20

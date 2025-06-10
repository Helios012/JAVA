
import java.util.*;

public class Exceptiondemo {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter two elements:");
        
        try{
            a=inp.nextInt();
            b=inp.nextInt();
            System.out.println("I am in try block");
            c=a/b;
            System.out.println("Division:"+c);
        }
        catch(InputMismatchException e){
            System.out.println("I am in ctach block1");
            System.out.println("check input");
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("I am in catch block 2");
            System.out.println("Division by zero not possible");
            System.out.println(e);
        }
        System.out.println("End of arithmetic exception");

    }
}
//javac Exceptiondemo.java
//java Exceptiondemo
/*
output-1
Enter two elements:
5 5
I am in try block
Division:1
End of arithmetic exception
--------------
output-2
Enter two elements:
1 0
I am in try block
I am in catch block 2
Division by zero not possible
End of arithmetic exception
---------------
output-3
Enter two elements:
w 2
I am in ctach block1
check input
java.util.InputMismatchException
End of arithmetic exception
*/

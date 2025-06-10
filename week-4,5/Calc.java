import Calculator.DoubleCal;
public class Calc {
    public static void main(String[] args) {
        DoubleCal c=new DoubleCal();
        double r;
        r=c.add(10.0,20.0);
        System.out.println("SUM:"+r);
        r=c.sub(100.0,20.0);
        System.out.println("SUB:"+r);
        r=c.mul(10.0,20.0);
        System.out.println("MUL:"+r);
        r=c.div(100.0,20.0);
        System.out.println("DIV:"+r);
    }
}
//javac Calc.java
//java Calc

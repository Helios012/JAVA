import java.util.StringTokenizer;
public class StringTok {
    public static void main(String[] args) {
        StringTokenizer s1=new StringTokenizer("Welcome To VJIT");
        while(s1.hasMoreTokens()){
            System.out.println(s1.nextToken());
        }
        StringTokenizer s2=new StringTokenizer("Hello;IT",";");
        while(s2.hasMoreTokens()){
            System.out.println(s2.nextToken());
        }
    }
}
//javac StringTok.java
//java StringTok

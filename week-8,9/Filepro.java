import java.io.*;
public class Filepro{
public static void main(String args[]){
    File inFile=new File("input.dat");
    File outFile=new File("output.dat");
    FileReader ins=null;
    FileWriter out=null;
    try{
        ins=new FileReader(inFile);
        out=new FileWriter(outFile);
        int ch;
        while((ch=ins.read())!=-1){
            out.write(ch);
        }
    }
    catch(IOException e){
        System.exit(-1);
    }
    finally{
        try{
            ins.close();
            out.close();
        }
        catch(IOException e){
        }
    }
}
}
//javac Filepro.java
//java Filepro

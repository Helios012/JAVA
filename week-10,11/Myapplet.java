import java.applet.Applet;
import java.awt.Graphics;
public class Myapplet extends Applet{
    public void init(){
        System.out.println("Applet initialized");
    }
    public void start(){
        System.out.println("Applet execution started");
    }
    public void stop(){
        System.out.println("Applet execution stopped");
    }
    public void paint(Graphics g){
        System.out.println("Painting...");
    }
    public void destroy(){
        System.out.println("Applet destroyed");
    }
    
}
//compile-->javac --release 8 Myapplet.java

/*
seperate html file
<html>
  <body>
    <applet code="Myapplet.class" width="500" height="500"></applet>
  </body>
</html>
 */
//run-->appletviewer Myapplet.html

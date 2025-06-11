import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Eventapplet extends Applet implements ActionListener {
    Button b;
    TextField tf;
    String s;
    public void init(){
        tf=new TextField();
        tf.setBounds(30,40,150,20);
        b=new Button("Click");
        b.setBounds(80,150,60,50);
        add(b);
        add(tf);
        b.addActionListener(this);
        setLayout(null);
    }
    public void paint(Graphics g){
        s=getParameter("MSG");
    }
    public void actionPerformed(ActionEvent e){
        tf.setText(s);
    }
}
//compile javac -source 8 -target 8 Eventapplet.java

/*
<html>
    <body>
        <applet code="Eventapplet.class" width="300" height="300">
            <param name="MSG" value="WELCOME">
        </applet>
    </body>
</html>
 */
//run appletviewer Eventapplet.html

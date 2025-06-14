import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseListenerexample extends JFrame implements MouseListener {
    Label l=new Label();
    MouseListenerexample(){
        l.setBounds(20,50,100,20);
        add(l);
        addMouseListener(this);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        l.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e){
        l.setText("Mouse Entered");
    }
    public void mousePressed(MouseEvent e){
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e){
        l.setText("Mouse Released");
    }
    public void mouseExited(MouseEvent e){
        l.setText("Mouse Exited");
    }
    public static void main(String[] args) {
        new MouseListenerexample();
    }
}

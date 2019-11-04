import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class MouseMotionListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyMouseListener extends MouseAdapter implements MouseListener,MouseMotionListener
{
    JLabel jl;
    public void mousePressed(MouseEvent e){
        jl.setText("mousePressed("+e.getX()+ "," + e.getY()+")");
    }

    public void mouseReleased(MouseEvent e){
        jl.setText("mouseReleased("+e.getX()+ "," + e.getY()+")");
    }

    public void mouseEntred(MouseEvent e){
        MyMouseFrame mp = new MyMouseFrame();
        mp.setBackground(Color.CYAN);
    }

}

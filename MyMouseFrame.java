import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 여기에 MyMouseFrame 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyMouseFrame extends JFrame
{
    MyPanel mp = new MyPanel();
    MyMouseListener ml;
    JLabel jl;
    public MyMouseFrame(){
        this.setTitle("MouseListener and MouseMotionListener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        ml = new MyMouseListener();
        this.addMouseListener(ml);
        this.addMouseMotionListener(ml);
        this.add(mp);
    }
    public class MyPanel extends JPanel{
        public MyPanel(){
            this.setLayout(new FlowLayout());
            jl = new JLabel("mouse("+ getX() +","+ getY() +")");
            this.add(jl);
            this.setBackground(Color.YELLOW);
            this.add(ml); 
        }
    }
}

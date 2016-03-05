package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by admin on 3/4/16.
 */
public class MainMenu extends JPanel implements ActionListener, MouseListener, KeyListener {

    public MainMenu()
    {
        super();
        setBackground(Color.black);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        System.out.println(e.getX());
        System.out.println(e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.orange);
        g.fillRect(2,2,getWidth() - 4, 100);

        g.setColor(Color.white);
        g.setFont(new Font("Arial Black", 0, 36));
        g.drawString("Ping Pong", (getWidth() / 2) - (g.getFont().getSize() * 5 / 2), 55);
    }

}

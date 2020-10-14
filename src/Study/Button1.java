package Study;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;

public class Button1 {

    public static void main(String[] args) {
        Button1 gui = new Button1();
        gui.go();
    }

    /*public void go(){
        JFrame frame = new JFrame();
        JButton button = new JButton("click This");
        Font bigFont = new Font("serif", Font.BOLD, 28);
        button.setFont(bigFont);
        //JButton button = new JButton("There is no spoon....");
        //JButton button = new JButton("click me");
        frame.getContentPane().add(BorderLayout.NORTH, button);
        //frame.getContentPane().add(BorderLayout.NORTH, button);
        //frame.getContentPane().add(BorderLayout.EAST, button);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }*/

    public void go(){
        JFrame frame = new JFrame();

        JButton east = new JButton("동쪽");
        JButton west = new JButton("서쪽");
        JButton south = new JButton("남쪽");
        JButton north = new JButton("북쪽");
        JButton center = new JButton("중앙");

        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

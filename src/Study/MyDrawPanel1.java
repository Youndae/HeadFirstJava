package Study;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel1 extends JPanel {

    public void paintComponent(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        g.setColor(Color.green);
        /*g.fillOval(x, y, 40, 40);*/

    }
}

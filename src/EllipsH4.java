import java.awt.*;
import java.applet.*;

public class EllipsH4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(50, 50, 130, 80, 1000, -1000);

    }
}

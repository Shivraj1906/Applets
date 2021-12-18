import java.applet.Applet;
import java.awt.Graphics;
import java.awt.SystemColor;

public class Test extends Applet {

    final int height = 500;
    final int width = 500;

    final int radius = 100;

    final double perimeter = 2  * 3.14 * radius;

    int info[] = {10, 30, 15, 5, 20, 5, 15};

    java.awt.Color colors[] = {
        SystemColor.BLUE,
        SystemColor.CYAN,
        SystemColor.GRAY,
        SystemColor.GREEN,
        SystemColor.LIGHT_GRAY,
        SystemColor.MAGENTA,
        SystemColor.ORANGE,
        SystemColor.PINK,
        SystemColor.RED,
        SystemColor.YELLOW
    };

    int startAngle = 0;

    public void paint(Graphics g) {

        g.fillRect(0, 0, width, height);

        for(int i = 0; i < info.length; i++) {

            g.setColor(colors[i]);

            double arcLength = (perimeter * info[i]) / 100;

            double rad = arcLength / radius;

            int angle = (int) Math.ceil(Math.toDegrees(rad));

            g.fillArc(5, 5, radius * 2, radius * 2, startAngle, angle);

            startAngle += angle;
        }
    }
}
//<applet code="Test" height=500 width=500></applet>

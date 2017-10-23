package lab1;

import java.awt.*;

public class CustomFigure {
    private int radius;
    private int xCenter;
    private int yCenter;

    private int x1, y1;
    private int x2, y2;
    private int x3, y3;

    public CustomFigure (int r, int x, int y) {
        this.radius = r;
        this.xCenter = x;
        this.yCenter = y;

        this.x1 = x;
        this.y1 = radius + yCenter;

        this.y2 = (int) Math.round(yCenter - radius * 0.4);
        this.y3 = this.y2;
        this.x2 = (int) (Math.sqrt(Math.pow(radius, 2) - Math.pow(y2 - yCenter, 2)) + xCenter);
        this.x3 = (int) (-Math.sqrt(Math.pow(radius, 2) - Math.pow(y2 - yCenter, 2)) + xCenter);
    }


    public void doDrawing(Graphics2D g2d) {
        int x = xCenter - radius;
        int y = yCenter - radius;
        g2d.drawOval(x, y, radius * 2 , radius * 2);
        g2d.drawLine(x1, y1, x2, y2);
        g2d.drawLine(x2, y2, x3, y3);
        g2d.drawLine(x1, y1, x3, y3);
    }
}

package com.kaftanatiy.labs.graphModeling.lab2;

import com.kaftanatiy.labs.graphModeling.utils.CustomFigure;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class CustomCardioida implements CustomFigure {
    private final int A = 2;
    private final int B = 2;
    private final int N = 2;

    private int pointCount = 500;

    private int radius;
    private int diffX;
    private int diffY;

    public CustomCardioida(int r, int x, int y) {
        radius = r/2;
        diffX = x;
        diffY = y;
    }

    public void doDrawing(Graphics2D g2d) {
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        GeneralPath figure = new GeneralPath();

        figure.moveTo(diffX, diffY);

        double step = N*Math.PI / pointCount;

        for (double fi = 0; fi < N*Math.PI;fi+=step) {
            int x = (int) (A * radius * Math.cos(fi) - radius * Math.cos(B * fi)) + diffX;
            int y = (int) (A * radius * Math.sin(fi) - radius * Math.sin(B * fi)) + diffY;

            figure.lineTo(x, y);
        }

        figure.closePath();

        g2d.fill(figure);
    }
}

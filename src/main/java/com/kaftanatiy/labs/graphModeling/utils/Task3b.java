package com.kaftanatiy.labs.graphModeling.utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public abstract class Task3b extends JPanel implements ActionListener {
    private int startRadius = 2;
    private double step = 1;
    private int maxRadius = 5;
    private int minRadius = 1;

    private int xCenter = 350;
    private int yCenter = 350;

    private int ornamentRadius = 50;

    private int count = 50;
    private double angle = 2 * Math.PI / 20;

    private final int DELAY = 50;
    private Timer timer;

    private List<CustomFigure> customFigures;

    public Task3b() {
        init();
        initTimer();
    }

    private void initTimer() {

        timer = new Timer(DELAY, this);
        timer.start();
    }

    private void init() {
        customFigures = new ArrayList<CustomFigure>();
        ornamentRadius = 50;

        double currentAngle = 0;
        int figureRadius = startRadius;
        for(int i = 0; i < count; i++) {
            int x = (int) (xCenter + ornamentRadius * Math.cos(currentAngle));
            int y = (int) (yCenter + ornamentRadius * Math.sin(currentAngle));
            customFigures.add(getFigure(figureRadius, x, y));

            ornamentRadius += 5;
            if(i%4 == 0) {
                figureRadius += 2;
            }
            currentAngle += angle;
        }

        if(startRadius == maxRadius || startRadius == minRadius) {
            step = -step;
        }
        startRadius += step;
    }

    protected abstract CustomFigure getFigure(int r, int x, int y);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        init();
        for (CustomFigure figure : customFigures) {
            figure.doDrawing((Graphics2D) g);
        }
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}

package com.kaftanatiy.labs.graphModeling.utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Task3 extends JPanel implements ActionListener{
    protected CustomFigure customFigure;
    private int figureRadius = 70;
    private int step = 1;

    private final int DELAY = 50;
    private Timer timer;

    public Task3() {
        initFigure(figureRadius, 350, 350);
        initTimer();
    }

    protected abstract void initFigure(int r, int x, int y);


    private void initTimer() {

        timer = new Timer(DELAY, this);
        timer.start();
    }

    public Timer getTimer() {

        return timer;
    }

    private void doDrawing(Graphics2D g2d) {
        figureRadius = figureRadius + step;
        if(figureRadius == 100) {
            step = -step;
        } else if (figureRadius == 70) {
            step = -step;
        }

        initFigure(figureRadius, 350, 350);
        customFigure.doDrawing(g2d);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing((Graphics2D) g);
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}

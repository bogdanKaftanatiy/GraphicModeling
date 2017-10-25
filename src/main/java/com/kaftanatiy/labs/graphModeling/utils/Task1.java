package com.kaftanatiy.labs.graphModeling.utils;

import javax.swing.*;
import java.awt.*;

public abstract class Task1 extends JPanel {
    protected CustomFigure customFigure;

    public Task1() {
        initFigure();
    }

    protected abstract void initFigure();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        customFigure.doDrawing((Graphics2D) g);
    }
}
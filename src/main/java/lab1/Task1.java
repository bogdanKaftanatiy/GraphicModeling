package lab1;

import javax.swing.*;
import java.awt.*;

public class Task1 extends JPanel {
    private CustomFigure customFigure;

    public Task1() {
        customFigure = new CustomFigure(100, 350, 350);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        customFigure.doDrawing((Graphics2D) g);
    }
}

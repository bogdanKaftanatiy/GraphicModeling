package lab1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Task2 extends JPanel{
    private int figureRadius = 2;
    private double step;
    private int xCenter = 350;
    private int yCenter = 350;
    private int ornamentRadius = 50;
    private int count = 50;

    private List<CustomFigure> customFigures;

    public Task2() {
        initFiguresList();
    }

    private void initFiguresList() {
        customFigures = new ArrayList<CustomFigure>();

        step = 2 * Math.PI / count;
        int i = 0;
        for (double fi = 0; fi < 3 * Math.PI; fi+=step) {
            int x = (int) (xCenter + ornamentRadius * Math.cos(fi));
            int y = (int) (yCenter + ornamentRadius * Math.sin(fi));
            customFigures.add(new CustomFigure(figureRadius, x, y));
            ornamentRadius += 4;
            if(i%4 == 0) {
                figureRadius += 1;
            }
            i++;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (CustomFigure figure : customFigures) {
            figure.doDrawing((Graphics2D) g);
        }
    }

}

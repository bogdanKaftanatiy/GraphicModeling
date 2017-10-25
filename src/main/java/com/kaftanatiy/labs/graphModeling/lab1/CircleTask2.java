package com.kaftanatiy.labs.graphModeling.lab1;

import com.kaftanatiy.labs.graphModeling.utils.CustomFigure;
import com.kaftanatiy.labs.graphModeling.utils.Task2;

public class CircleTask2 extends Task2 {
    protected CustomFigure getFigure(int radius, int x, int y) {
        return new CustomCircle(radius, x, y);
    }
}

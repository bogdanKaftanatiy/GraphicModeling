package com.kaftanatiy.labs.graphModeling.lab2;

import com.kaftanatiy.labs.graphModeling.utils.CustomFigure;
import com.kaftanatiy.labs.graphModeling.utils.Task2;

public class CardioidaTask2 extends Task2 {
    protected CustomFigure getFigure(int radius, int x, int y) {
        return new CustomCardioida(radius, x, y);
    }
}

package com.kaftanatiy.labs.graphModeling.lab2;

import com.kaftanatiy.labs.graphModeling.utils.CustomFigure;
import com.kaftanatiy.labs.graphModeling.utils.Task3b;

public class CardioidaTask3b extends Task3b {
    protected CustomFigure getFigure(int r, int x, int y) {
        return new CustomCardioida(r, x, y);
    }
}

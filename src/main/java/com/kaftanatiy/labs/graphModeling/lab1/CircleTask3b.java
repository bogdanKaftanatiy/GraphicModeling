package com.kaftanatiy.labs.graphModeling.lab1;

import com.kaftanatiy.labs.graphModeling.utils.CustomFigure;
import com.kaftanatiy.labs.graphModeling.utils.Task3b;

public class CircleTask3b extends Task3b {
    protected CustomFigure getFigure(int r, int x, int y) {
        return new CustomCircle(r, x, y);
    }
}

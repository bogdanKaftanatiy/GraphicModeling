package com.kaftanatiy.labs.graphModeling;

import com.kaftanatiy.labs.graphModeling.lab2.*;
import com.kaftanatiy.labs.graphModeling.utils.Lab;

import javax.swing.*;
import java.awt.*;

public class Lab2 extends Lab {
    protected String getFrameTitle() {
        return "Lab2";
    }

    protected JPanel getTask() {
        return new CardioidaTask3b();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Lab frame = new Lab2();
                frame.setVisible(true);
            }
        });
    }
}

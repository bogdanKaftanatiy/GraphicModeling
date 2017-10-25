package com.kaftanatiy.labs.graphModeling;

import com.kaftanatiy.labs.graphModeling.lab1.*;
import com.kaftanatiy.labs.graphModeling.utils.Lab;

import javax.swing.*;
import java.awt.*;

public class Lab1 extends Lab{
    protected String getFrameTitle() {
        return "Lab1";
    }

    protected JPanel getTask() {
        return new CircleTask3b();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Lab frame = new Lab1();
                frame.setVisible(true);
            }
        });
    }
}

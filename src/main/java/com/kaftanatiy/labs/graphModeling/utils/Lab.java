package com.kaftanatiy.labs.graphModeling.utils;

import javax.swing.*;

public abstract class Lab extends JFrame {
    public Lab() {
        initUI();
    }

    private void initUI() {
        this.add(getTask());

        this.setTitle(getFrameTitle());
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    protected abstract String getFrameTitle();

    protected abstract JPanel getTask();
}

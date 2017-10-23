package lab1;

import javax.swing.*;
import java.awt.*;

public class Lab1 extends JFrame{
    public Lab1() {
        initUI();
    }

    private void initUI() {
        this.add(new Task2());

        this.setTitle("Lab1");
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Lab1 frame = new Lab1();
                frame.setVisible(true);
            }
        });
    }
}

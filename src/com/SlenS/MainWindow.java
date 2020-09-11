package com.SlenS;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        DrawPanel dPanel = new DrawPanel();
        setContentPane(dPanel);

    }
}

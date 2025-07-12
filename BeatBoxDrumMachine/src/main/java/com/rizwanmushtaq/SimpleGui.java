package com.rizwanmushtaq;

import javax.swing.*;

public class SimpleGui {
  public static void main(String[] args) {
    SimpleGui gui = new SimpleGui();
    gui.createAndShowGui();
  }

  private void createAndShowGui() {
    JFrame frame = new JFrame("Simple GUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel("Hello, World!");
    frame.getContentPane().add(label, "North");
    JButton button = new JButton("Click Me");
    button.addActionListener(e -> System.out.println("Button clicked!"));
    frame.getContentPane().add(button, "South");
    frame.setSize(300, 200);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
  }
}

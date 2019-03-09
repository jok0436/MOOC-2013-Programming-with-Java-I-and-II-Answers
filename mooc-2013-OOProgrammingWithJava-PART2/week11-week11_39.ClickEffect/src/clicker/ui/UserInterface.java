package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Calculator calculator;

    public UserInterface(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BorderLayout layout = new BorderLayout();
        container.setLayout(layout);
        JButton buttonGo = new JButton("Click!");
        JLabel labelOutput = new JLabel("0");
        ClickListener listener = new ClickListener(calculator, labelOutput);
        buttonGo.addActionListener(listener);
        container.add(buttonGo, BorderLayout.SOUTH);
        container.add(labelOutput, BorderLayout.NORTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}

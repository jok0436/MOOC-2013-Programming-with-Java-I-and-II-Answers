
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        JTextField fieldOutput = new JTextField("0");
        fieldOutput.setEnabled(false);
        JTextField fieldInput = new JTextField();
        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonZ = new JButton("Z");
        buttonZ.setEnabled(false);
        ButtonListenerPlus plus = new ButtonListenerPlus(fieldInput, fieldOutput, buttonZ);
        ButtonListenerMinus minus = new ButtonListenerMinus(fieldInput, fieldOutput, buttonZ);
        ButtonListenerZero zero = new ButtonListenerZero(fieldInput, fieldOutput, buttonZ);
        buttonPlus.addActionListener(plus);
        buttonMinus.addActionListener(minus);
        buttonZ.addActionListener(zero);
        MenuPanel panelBottom = new MenuPanel(buttonPlus, buttonMinus, buttonZ);
        container.add(fieldOutput);
        container.add(fieldInput);
        container.add(panelBottom);
    }

    public JFrame getFrame() {
        return frame;
    }
}

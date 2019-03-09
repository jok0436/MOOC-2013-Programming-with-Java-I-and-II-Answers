
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class ButtonListenerZero implements ActionListener {

    private JTextField input;
    private JTextField output;
    private JButton buttonZ;

    public ButtonListenerZero(JTextField input, JTextField output, JButton buttonZ) {
        this.input = input;
        this.output = output;
        this.buttonZ = buttonZ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        input.setText("");
        output.setText("0");
        buttonZ.setEnabled(false);
    }
}

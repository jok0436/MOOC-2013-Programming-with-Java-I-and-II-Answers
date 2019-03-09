
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
public class ButtonListenerMinus implements ActionListener {

    private JTextField input;
    private JTextField output;
    private JButton buttonZ;

    public ButtonListenerMinus(JTextField input, JTextField output, JButton buttonZ) {
        this.input = input;
        this.output = output;
        this.buttonZ = buttonZ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (checkValidity()) {
            int currentOutputField = Integer.parseInt(output.getText());
            int currentInputField = Integer.parseInt(input.getText());
            output.setText("" + (currentOutputField - currentInputField));
            checkValue();
            input.setText("");
        }
    }

    public boolean checkValidity() {
        try {

            Integer.parseInt(output.getText());
            Integer.parseInt(input.getText());
            return true;
        } catch (Exception e) {
            input.setText("");
            return false;
        }
    }

    public void checkValue() {
        if (output.getText().equals("0")) {
            buttonZ.setEnabled(false);
        } else {
            buttonZ.setEnabled(true);
        }
    }
}

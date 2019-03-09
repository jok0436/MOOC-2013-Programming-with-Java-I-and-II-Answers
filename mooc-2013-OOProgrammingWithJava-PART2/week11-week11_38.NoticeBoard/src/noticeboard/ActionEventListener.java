/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author josia
 */
public class ActionEventListener implements ActionListener {

    private JTextField origin;
    private JLabel destination;

    public ActionEventListener(JTextField origin, JLabel destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
//        if (this.destination.getText().equals("")) {
        this.destination.setText(this.origin.getText());
        this.origin.setText("");
//        } else if (this.origin.getText().equals("")) {
//            this.origin.setText(this.destination.getText());
//            this.destination.setText("");
    }
}

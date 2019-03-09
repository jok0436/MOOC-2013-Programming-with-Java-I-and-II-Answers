
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {

    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonZ;

    public MenuPanel(JButton buttonPlus, JButton buttonMinus, JButton buttonZ) {
        super(new GridLayout(1, 3));
        this.buttonPlus = buttonPlus;
        this.buttonMinus = buttonMinus;
        this.buttonZ = buttonZ;
        createComponents();
    }

    private void createComponents() {
        add(buttonPlus);
        add(buttonMinus);
        add(buttonZ);
    }
}

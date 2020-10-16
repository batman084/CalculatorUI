import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcUI {
    private JPanel panel1;
    private JButton Num0;
    private JButton Decimal;
    private JButton Num2;
    private JButton Num1;
    private JButton Num8;
    private JButton Num7;
    private JButton Num9;

    private JButton Num3;
    private JButton Equals;
    private JButton Add;
    private JButton Multiply;
    private JButton Divide;

    private JTextArea TextArea;
    private JButton Num4;
    private JButton Num5;
    private JButton Num6;
    private JButton button4;
    private JButton Clear;

    public CalcUI() {
        Num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame("CalcUI");
        frame.setVisible(true);

    }
}

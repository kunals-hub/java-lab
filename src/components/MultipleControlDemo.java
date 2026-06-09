package components;

import java.awt.*;
import javax.swing.*;

public class MultipleControlDemo extends JFrame {
    private JLabel lbl;
    private JTextField txt;
    private JCheckBox chk;

    private JComboBox<String> cbo;
    private JButton btn;

    public MultipleControlDemo() {
        setLayout(new FlowLayout());
        lbl = new JLabel("Application");
        txt = new JTextField(15);
        chk = new JCheckBox("Opt1");

        String[] programs = { "BE Computer", "BCA", "BBA", "BE Civil" };
        cbo = new JComboBox<>(programs);
        btn = new JButton("Ok");

        add(lbl);
        add(txt);
        add(chk);
        add(cbo);
        add(btn);

        setTitle("Multiple controls");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 350);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MultipleControlDemo();
    }
}

package sudoku;

import javax.swing.*;

public class mainSudoku extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;

    public mainSudoku() {
        setTitle("Sudoku");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new mainSudoku();
    }
}

package sudoku;

import javax.swing.*;

public class mainSudoku extends JFrame {

    private JTextField textField_0_0;
    private JTextField textField_0_1;
    private JTextField textField_0_2;
    private JButton endButton;
    private JPanel jpanelMain;
    private JTextField textField_1_0;
    private JTextField textField_1_1;
    private JTextField textField_1_2;
    private JTextField textField_2_0;
    private JTextField textField_2_1;
    private JTextField textField_2_2;
    private JTextField textField_3_0;
    private JTextField textField_3_1;
    private JTextField textField_3_2;
    private JTextField textField_4_0;
    private JTextField textField_4_1;
    private JTextField textField_4_2;
    private JTextField textField_5_0;
    private JTextField textField_5_1;
    private JTextField textField_5_2;
    private JTextField textField_0_3;
    private JTextField textField_0_4;
    private JTextField textField_0_5;
    private JTextField textField_1_3;
    private JTextField textField_1_4;
    private JTextField textField_1_5;
    private JTextField textField_2_3;
    private JTextField textField_2_4;
    private JTextField textField_2_5;

    public mainSudoku() {

        setContentPane(jpanelMain);

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

package sudoku;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.Border;

public class Sudoku extends javax.swing.JFrame {

    JFrame f = new JFrame();
    JButton button = new JButton("End");
    JPanel panel = new JPanel();


    public Sudoku() {
        screenMethod();
        for (int rows = 0; rows < 6; rows++) {
            JSeparator separator = new JSeparator();
            separator.setForeground(Color.BLACK);
            separator.setBackground(Color.BLACK);
            separator.setPreferredSize(new java.awt.Dimension(600, 1));
            panel.add(separator);
            if (rows == 3) {
                JSeparator separator2 = new JSeparator();
                separator2.setForeground(Color.BLACK);
                separator2.setBackground(Color.BLACK);
                separator2.setPreferredSize(new java.awt.Dimension(600, 10));
                panel.add(separator2);
            }
            for (int columns = 0; columns < 6; columns++) {
                if (columns == 2) {
                    JSeparator separator2 = new JSeparator();
                    separator2.setForeground(Color.BLACK);
                    separator2.setBackground(Color.BLACK);
                    separator2.setPreferredSize(new java.awt.Dimension(1, 100));
                    separator2.setOrientation(SwingConstants.VERTICAL);
                    panel.add(separator2);
                }
                JTextField textField = new JTextField();
                textField.setPreferredSize(new Dimension(90, 50));
                panel.add(textField);
            }
        }
        JSeparator separator = new JSeparator();
        separator.setForeground(Color.BLACK);
        separator.setBackground(Color.BLACK);
        separator.setPreferredSize(new java.awt.Dimension(700, 150));
        panel.add(separator);
        panel.add(button);
    }

    private void screenMethod() {
        GraphicsConfiguration config = f.getGraphicsConfiguration();
        Rectangle bounds = config.getBounds();
        Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(config);
        int x = bounds.x + bounds.width - insets.right - f.getWidth();
        int y = bounds.y + bounds.height - insets.top - f.getHeight(); // I just do that copying the int x and changing the values
        f.setLocation(x / 3, y / 3 - 100);
        ImageIcon img = new ImageIcon("imagesAndText/sudokuIcon.png");
        f.setIconImage(img.getImage());
        f.setTitle("Sudoku");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on exit
        f.setSize(600, 650);
        f.add(panel);
    }

    public static void main(String[] args) {
        Sudoku susuSudoku = new Sudoku();
        susuSudoku.f.setVisible(true);
    }
}
import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;

public class Calculator {
    public static void main(String[] args) {
        Core();
    }

    public static void Core() {
        JFrame Win = new JFrame();

        JPanel Con = new JPanel(new BorderLayout());
        JPanel Up = new JPanel();
        JPanel Down = new JPanel(new GridLayout(5, 4, 2, 2));

        Color PitchBlack = new Color(28, 28, 28);
        Color Gray = new Color(212, 212, 210);
        Color Orange = new Color(255, 149, 0);

        JTextField Res = new JTextField(22);
        Up.add(Res);

        JButton B1;

        String[] First = { "AC", "log", "%", "/" };
        String[] Sec = { "7", "8", "9", "x" };
        String[] Third = { "4", "5", "6", "-" };
        String[] Fourth = { "1", "2", "3", "+" };
        String[] Fifth = { "0", "+/-", ".", "=" };

        for (int i = 0; i < First.length; i++) {
            B1 = new JButton("" + First[i]);
            B1.setBorderPainted(false);
            B1.setBackground(Gray);
            B1.setForeground(PitchBlack);
            Down.add(B1);
            if (First[i] == "/") {
                B1.setForeground(Gray);
                B1.setBackground(Orange);
            }
        }

        for (int i = 0; i < Sec.length; i++) {
            B1 = new JButton("" + Sec[i]);
            B1.setBorderPainted(false);
            B1.setBackground(PitchBlack);
            B1.setForeground(Gray);
            Down.add(B1);
            if (Sec[i] == "x") {
                B1.setBackground(Orange);
            }
        }

        for (int i = 0; i < Third.length; i++) {
            B1 = new JButton("" + Third[i]);
            B1.setBorderPainted(false);
            B1.setBackground(PitchBlack);
            B1.setForeground(Gray);
            Down.add(B1);
            if (Third[i] == "-") {
                B1.setBackground(Orange);
            }
        }

        for (int i = 0; i < Fourth.length; i++) {
            B1 = new JButton("" + Fourth[i]);
            B1.setBorderPainted(false);
            B1.setBackground(PitchBlack);
            B1.setForeground(Gray);
            Down.add(B1);
            if (Fourth[i] == "+") {
                B1.setBackground(Orange);
            }
        }

        for (int i = 0; i < Fifth.length; i++) {
            B1 = new JButton("" + Fifth[i]);
            B1.setBorderPainted(false);
            B1.setBackground(PitchBlack);
            B1.setForeground(Gray);
            Down.add(B1);
            if (Fifth[i] == "=") {
                B1.setBackground(Orange);
            }
        }

        Con.add(Up, BorderLayout.NORTH);
        Con.add(Down, BorderLayout.SOUTH);

        Win.add(Con);

        Win.setBounds(510, 100, 316, 250);
        Win.setLayout(new FlowLayout());
        Win.setVisible(true);
    }
}
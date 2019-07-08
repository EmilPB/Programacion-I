import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Chess {

    public static void Core() {
        JFrame Win = new JFrame();
        Color PitchBlack = new Color(28, 28, 28);

        JPanel chessBoard = new JPanel();
        JLayeredPane layeredPane;
        layeredPane = new JLayeredPane();
        layeredPane.add(chessBoard, JLayeredPane.DEFAULT_LAYER);
        chessBoard.setLayout(new GridLayout(8, 8));
        chessBoard.setPreferredSize(new Dimension(500, 500));
        chessBoard.setBounds(0, 0, 500, 500);

        for (int i = 0; i < 64; i++) {
            JPanel square = new JPanel(new BorderLayout());
            chessBoard.add(square);

            int row = (i / 8) % 2;
            if (row == 0)
                square.setBackground(i % 2 == 0 ? PitchBlack : Color.white);
            else
                square.setBackground(i % 2 == 0 ? Color.white : PitchBlack);
        }

        Win.add(chessBoard);
        Win.setLayout(new GridLayout());
        Win.setTitle("Chess GUI");
        Win.setBounds(330, 10, 600, 600);
        Win.setVisible(true);
    }

    public static void main(String[] args) {
        Core();
    }
}

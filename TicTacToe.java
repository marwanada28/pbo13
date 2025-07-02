import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements ActionListener {
    JButton[][] tombol = new JButton[3][3];
    boolean giliranX = true;

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setLayout(new GridLayout(3, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tombol[i][j] = new JButton("");
                tombol[i][j].setFont(new Font("Arial", Font.BOLD, 40));
                tombol[i][j].addActionListener(this);
                add(tombol[i][j]);
            }
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (btn.getText().equals("")) {
            if (giliranX) {
                btn.setText("X");
            } else {
                btn.setText("O");
            }
            giliranX = !giliranX;
        }
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MinhaInterface extends JFrame {

  public MinhaInterface() {

    setTitle("APP");
    setSize(800, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel painel1 = new JPanel();
    painel1.setLayout(new BoxLayout(painel1, BoxLayout.Y_AXIS));

    JPanel painel2 = new JPanel();
    painel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 150));

    JPanel painel3 = new JPanel();
    painel3.setLayout(new BoxLayout(painel3, BoxLayout.Y_AXIS));

    JLabel titulo = new JLabel("APP BETA V0.1");
    JLabel devTitulo = new JLabel("APP DEV J");
    JLabel tituloAPP = new JLabel("NIHONGO DESU");
    tituloAPP.setFont(new Font("Arial", Font.BOLD, 20));

    titulo.setAlignmentX(CENTER_ALIGNMENT);
    devTitulo.setAlignmentX(CENTER_ALIGNMENT);
    tituloAPP.setAlignmentX(CENTER_ALIGNMENT);

    painel3.add(Box.createVerticalStrut(20));
    painel3.add(tituloAPP);

    painel1.add(titulo);
    painel1.add(Box.createVerticalStrut(10));
    painel1.add(devTitulo);
    painel1.add(Box.createVerticalStrut(30));

    add(painel1, BorderLayout.SOUTH);
    add(painel3, BorderLayout.NORTH);
    add(painel2, BorderLayout.CENTER);

    JButton hiraganaButton = new JButton("HIRAGANA");
    hiraganaButton.setAlignmentX(BOTTOM_ALIGNMENT);
    hiraganaButton.setFont(new Font("Arial", Font.BOLD, 30));

    JButton katakanaButton = new JButton("KATAKANA");
    katakanaButton.setAlignmentX(BOTTOM_ALIGNMENT);
    katakanaButton.setFont(new Font("Arial", Font.BOLD, 30));

    painel2.add(hiraganaButton);
    painel2.add(Box.createHorizontalStrut(20));
    painel2.add(katakanaButton);

    JPanel painelHiragana = new JPanel();
    JLabel hiraganaTexto = new JLabel("Hiragana");

    hiraganaButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        dispose();
        JFrame novaJanela = new JFrame("Hiragana");
        novaJanela.setSize(800, 500);
        novaJanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        novaJanela.setLocationRelativeTo(null);
        novaJanela.setVisible(true);
      }
    });

    setLocationRelativeTo(null);
    setVisible(true);
  }
}

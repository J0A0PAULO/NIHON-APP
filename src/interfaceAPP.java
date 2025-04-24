import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class interfaceAPP extends JFrame {

  public interfaceAPP() {
    setTitle("APP");
    setSize(800, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLocationRelativeTo(null);

    JPanel painelIncialHome = criarPainelInicial();
    JPanel painelHiragana = CriarPainelHiragana();
    JPanel painelKatakana = CriarPainelKatakana();

    getContentPane().add(painelIncialHome);

    setVisible(true);
  }

  public JPanel criarPainelInicial() {

    JPanel painel = new JPanel();

    painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
    painel.add(Box.createVerticalStrut(100));

    JLabel versaoPrograma = new JLabel("APP Versão 1.0");
    versaoPrograma.setFont(new Font("Arial", Font.ITALIC, 30));
    versaoPrograma.setAlignmentX(CENTER_ALIGNMENT);

    JButton botaoHiragana = new JButton("ひらがな");
    botaoHiragana.setAlignmentX(CENTER_ALIGNMENT);

    botaoHiragana.setFont(new Font("Noto Sans JP", Font.BOLD, 30));
    botaoHiragana.setPreferredSize(new Dimension(300, 100));
    botaoHiragana.setMaximumSize(new Dimension(300, 100));

    botaoHiragana.addMouseListener(new java.awt.event.MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {

      }
    });

    JButton botaoKatakana = new JButton("カタカナ");
    botaoKatakana.setAlignmentX(CENTER_ALIGNMENT);

    botaoKatakana.setFont(new Font("Noto Sans JP", Font.BOLD, 30));
    botaoKatakana.setPreferredSize(new Dimension(300, 100));
    botaoKatakana.setMaximumSize(new Dimension(300, 100));

    painel.add(versaoPrograma);
    painel.add(Box.createVerticalStrut(30));
    painel.add(botaoHiragana);
    painel.add(Box.createVerticalStrut(20));
    painel.add(botaoKatakana);

    return painel;

  }

  public JPanel CriarPainelHiragana() {

    JPanel painel = new JPanel();

    return painel;
  }

  public JPanel CriarPainelKatakana() {

    JPanel painel = new JPanel();

    return painel;
  }

  public static void main(String[] args) {
    new interfaceAPP();
  }

}

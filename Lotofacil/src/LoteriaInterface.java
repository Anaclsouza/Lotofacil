import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LoteriaInterface extends JFrame {
    private JLabel titleLabel;
    private JButton option1Button;
    private JButton option2Button;
    private JButton option3Button;
    private JTextArea resultArea;

    public LoteriaInterface() {
        setTitle("Lotofácil");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);

        titleLabel = new JLabel("*******MENU APOSTAS****");
        titleLabel.setBounds(100, 10, 200, 25);
        panel.add(titleLabel);

        option1Button = new JButton("Opção 1: Apostar de 0 a 100");
        option1Button.setBounds(50, 50, 300, 25);
        panel.add(option1Button);

        option2Button = new JButton("Opção 2: Apostar de A a Z");
        option2Button.setBounds(50, 90, 300, 25);
        panel.add(option2Button);

        option3Button = new JButton("Opção 3: Apostar em par ou ímpar");
        option3Button.setBounds(50, 130, 300, 25);
        panel.add(option3Button);

        resultArea = new JTextArea();
        resultArea.setBounds(50, 170, 300, 100);
        resultArea.setEditable(false);
        panel.add(resultArea);

        option1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numeroSecreto = new Random().nextInt(101);

                String userInput = JOptionPane.showInputDialog("Digite um número de 0 a 100:");
                int chute = Integer.parseInt(userInput);

                if (chute == numeroSecreto) {
                    resultArea.setText("Você acertou e ganhou: R$1000!");
                } else {
                    resultArea.setText("Que pena! O número sorteado foi: " + numeroSecreto);
                }
            }
        });

        option2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char letraPremiada = 'A';

                String userInput = JOptionPane.showInputDialog("Digite uma letra de A a Z:");
                char letra = userInput.toUpperCase().charAt(0);

                if (letra == letraPremiada) {
                    resultArea.setText("Você ganhou R$500,00 reais");
                } else {
                    resultArea.setText("Que pena! A letra sorteada foi: " + letraPremiada);
                }
            }
        });

        option3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = JOptionPane.showInputDialog("Digite um número:");
                int numeroChute = Integer.parseInt(userInput);

                if (numeroChute % 2 == 0) {
                    resultArea.setText("Você ganhou R$100,00 reais.");
                } else {
                    resultArea.setText("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoteriaInterface();
    }
}

